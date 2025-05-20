# 🛒 Java OOP Assignment: Online Shop Domain Model

## 🎯 Goal

Design a simplified **domain model** for an online shopping platform using:
- `abstract classes` for shared logic and base types
- `interfaces` to model capabilities
- `polymorphism` to write flexible and reusable code

This is **not a UI or database task** — your focus is on writing clean object-oriented logic that models real behavior in a backend system.

---

## 🧠 Scenario

You're modeling a backend for an online shop. It supports different kinds of users (e.g., guests vs registered) and different kinds of orders (e.g., standard purchases, subscriptions).

Some actions apply to some objects — others don't. Your job is to design the model so it's flexible, logical, and doesn't duplicate code.

---

## ✅ Your Assignment

Implement the following in your own design:

### 1. Users

All users share common fields (like email), but only **registered users** can manage their orders. **Guests** have limited capabilities.

Use:
- An abstract base class for shared user logic
- Subclasses for specific user types
- Interfaces as needed for extra capabilities

_Your user-related design should reflect the real-life difference between what guests and registered users can do._

---

### 2. Orders

There are different types of orders:
- One-time product purchases
- Ongoing subscriptions

All orders have common data like order ID, status, and total.
But subscriptions have different lifecycle rules (e.g., pausing, resuming), and standard orders may be canceled or tracked.

Use:
- An abstract base class for orders
- Subclasses for different order types
- Interfaces to capture additional behaviors (e.g., cancellable, trackable — but only where it makes sense)

---

### 3. Polymorphism in Action

Create a service class that works with **all orders** or **all users** generically — without knowing their exact type.

For example:
- A method that receives a list of orders and prints summaries
- A method that performs an action only if the object supports a certain behavior (use `instanceof` or interface checks)

---

## 🧪 Sample Interactions (for insipration)

- A registered user cancels an order.
- A guest browses and places a one-time order but can’t manage it afterward.
- A subscription order is processed monthly and can be paused/resumed.
- A generic `OrderService` method processes all order types the same way.

---

## 📌 Requirements

- Use **at least one abstract class** and **at least two interfaces**.
- Demonstrate **polymorphism** via interface usage or abstract class references.
- Avoid duplicating logic. Use inheritance or delegation wisely.
- Use realistic naming and behavior — think like a developer working on a real system.

---

## 💡 Tips

- Think about real-world systems — what kind of functionality belongs to which type of object?
- Not every class has to implement every interface.
- Favor clarity and logic over quantity.

---

Let me know if you'd like a starter interface or abstract class to kick things off.
