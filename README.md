# Java Custom List Implementations

This Java project demonstrates various custom list behaviors using inheritance, sorting logic, and exception handling.

## 🚀 Features

### 🟩 `SimpleList`
- Basic list container with add/get operations

### 🟪 `TwoElementList`
- Can only hold up to 2 elements
- Overwrites or blocks after max

### 🔼 `KeepSortedList`
- Maintains sorted order on insertion

### 🧮 `EvensOnly`
- Accepts only even numbers
- Throws `OddException` on invalid input

## ⚠️ Custom Exception
- `OddException` used by `EvensOnly` to enforce input rules

## 🧪 Tests
Each list class has a matching `Test*.java` file for validation.

## 📦 Run Instructions
```bash
javac src/*.java test/*.java
java test.TestEvensOnly
java test.TestTwoElementList
