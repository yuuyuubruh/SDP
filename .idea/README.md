```markdown
# Outfit Builder (Assignment #1 — Builder Pattern)

## Project Overview
This project implements the Builder design pattern in Java to construct clothing outfits. 
An outfit includes a top, bottom, shoes, and an optional accessory. The Builder pattern makes it easy to assemble an outfit step-by-step, validate mandatory items, and use a Director for ready-made presets.

---

## Clean Code Principles Applied

### 1. Meaningful Names
Names of variables and methods are clear and intention-revealing without extra comments.

* **Before (Bad):**
```java
public OutfitBuilder setT(String t) {
    this.t = t;
    return this;
}

```

* **After (`OutfitBuilder.java`):**

```java
public OutfitBuilder setTop(String top) {
    this.top = top;
    return this;
}

```

---

### 2. Single Responsibility Principle (SRP)

Each class focuses on a single task:

* `Outfit`: Product class that only stores outfit data.
* `OutfitBuilder`: Handles step-by-step construction and validation.
* `OutfitDirector`: Manages predefined templates (casual, sport, formal).

* **Example (`OutfitDirector.java`):**

```java
public Outfit createCasualOutfit() {
    return new OutfitBuilder()
            .setTop("White T-Shirt")
            .setBottom("Blue Jeans")
            .setShoes("White Sneakers")
            .setAccessory("Black Bag")
            .build();
}

```

---

### 3. Validated Construction

The `build()` method checks that essential items (top, bottom, shoes) are provided before creating the object, preventing broken or incomplete states.

* **Before (Bad):**

```java
public Outfit build() {
    return new Outfit(top, bottom, shoes, accessory); // allows incomplete object
}

```

* **After (`OutfitBuilder.java`):**

```java
public Outfit build() {
    if (top == null || bottom == null || shoes == null) {
        throw new IllegalStateException("Outfit must have top, bottom and shoes");
    }
    return new Outfit(top, bottom, shoes, accessory);
}

```

---

### 4. Fluent API / Method Chaining

Setter methods in the builder return `this`, making the construction syntax clean and easy to read.

* **Example (`Main.java`):**

```java
Outfit custom = new OutfitBuilder()
        .setTop("Black Hoodie")
        .setBottom("Grey Cargo Pants")
        .setShoes("Black Sneakers")
        .setAccessory("Silver Necklace")
        .build();

```

---

### 5. Encapsulation & Immutability

All fields in `Outfit` are `private`, and there are no setters after creation. Once built, the outfit cannot be modified unexpectedly.

* **Example (`Outfit.java`):**

```java
public class Outfit {
    private String top;
    private String bottom;
    private String shoes;
    private String accessory;

    public Outfit(String top, String bottom, String shoes, String accessory) {
        this.top = top;
        this.bottom = bottom;
        this.shoes = shoes;
        this.accessory = accessory;
    }
}
