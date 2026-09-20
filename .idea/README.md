Markdown
# Outfit Factory (Assignment 2 - Abstract Factory & Factory Method)

## Project Overview
This project implements the **Abstract Factory** and **Factory Method** design patterns in Java to generate coordinated clothing outfits (tops and bottoms) for different style families (Casual and Formal).

---

## Clean Code Principles Applied

### 1. Meaningful & Intention-Revealing Names
Class and method names explicitly convey their functional role in the domain.

* **Before (Bad):**
```java
public interface Factory {
    Object get1();
}
After (OutfitFactory.java):

Java
public interface OutfitFactory {
    Top createTop();
    Bottom createBottom();
}
2. Dependency Inversion Principle (DIP)
The client code works through abstract interfaces (OutfitFactory, Top, Bottom) rather than tight coupling to concrete classes.

Before (Bad):

Java
CasualTop top = new CasualTop(); // Tightly coupled
After (Main.java):

Java
OutfitFactory factory = new CasualOutfitFactory();
Top top = factory.createTop();
3. Single Responsibility Principle (SRP)
Each factory class is exclusively responsible for instantiating its designated product family.

Example (CasualOutfitFactory.java):

Java
public class CasualOutfitFactory implements OutfitFactory {
    @Override
    public Top createTop() {
        return new CasualTop();
    }

    @Override
    public Bottom createBottom() {
        return new CasualBottom();
    }
}
4. Small, Focused Classes
Every product class focuses on a single implementation detail of a specific clothing item.

Example (CasualTop.java):

Java
public class CasualTop implements Top {
    @Override
    public void wearTop() {
        System.out.println("Top: White T-Shirt");
    }
}
5. Open/Closed Principle (OCP)
New outfit families (e.g., SportOutfitFactory) can be introduced without modifying existing factory interfaces or client logic.