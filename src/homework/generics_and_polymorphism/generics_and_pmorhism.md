# 🦁 Zoo Animal Tracking System – Java OOP Assignment

## Objective

Design and implement the backend class structure for an **online Zoo Animal Tracking System**.  
You will practice **abstract classes**, **interfaces**, **polymorphism**, and **generics** in Java, using a real-world context.

---

## Scenario

You are building the digital foundation for a zoo’s animal records. Your system should track essential information about each animal, support animal-specific data, and allow for easy extension as the zoo grows.

---

## Tasks

### 1. Abstract Class: `Animal`

Create an **abstract class** called `Animal` with the following:

- **Fields:**
    - `id` (`String`) – Unique identifier
    - `name` (`String`) – Animal’s name (e.g. "Leo")
    - `species` (`String`) – Animal’s species (e.g. "Lion")
    - `age` (`int`) – Age in years
    - `dateOfArrival` (`LocalDate`) – Date the animal arrived at the zoo

- **Constructor:** 

- **Abstract method:**
    - `void recordDailyActivity(String activity)`  
      Records daily animal-specific activities (feeding, enrichment, checkup, etc.)

- **Concrete method:**
    - `String getInfo()`  
      Returns a summary of the animal’s data in a readable format

---

### 2. Interfaces

Define two interfaces:

- `Feedable`
    - Method: `void feed(String food, double amountKg)`

- `Checkable`
    - Method: `void performCheckup(String notes)`

---

### 3. Animal Subclasses

Create at least **three subclasses** of `Animal`.  
Each should represent a real animal species found in a zoo (e.g. `Lion`, `Elephant`, `Penguin`).

- Each subclass must:
    - Implement all abstract methods
    - Implement at least **one interface** (some animals may implement both)
    - Add at least **one unique field** (e.g. `isAlpha` for Lion, `tuskLength` for Elephant, `swimmingAbility` for Penguin)
    - Override `getInfo()` to include unique fields

---

### 4. Generic Animal Registry

Create a **generic class** called `AnimalRegistry<T extends Animal>` that will:

- Store a list of animals of type `T`
- Provide methods to:
    - `addAnimal(T animal)`
    - `removeAnimalById(String id)`
    - `findAnimalById(String id): T`
    - `listAllAnimals(): List<T>`

---

### 5. Demonstration (Main Method)

Write a `main` method to:

- Create instances of your animal classes and register them in an `AnimalRegistry`
- Demonstrate polymorphism by calling interface methods on different animal types
- Print out information for all registered animals

---

## Requirements

- Follow **Java OOP best practices**
- Use **abstract classes**, **interfaces**, **generics**, and **polymorphism**
- Make sure to include comments in your code
- Organize your classes into appropriate packages

---

## Optional Enhancements

- Add more animal types or interfaces (e.g., `Enrichable`)
- Allow searching by species or arrival date
- Track medical or feeding history per animal

---

**Have fun and be creative—think like a software engineer building a real system!**
