# Notification System Exam

## Overview

This exam assesses your understanding of key object-oriented programming (OOP) concepts in Java, such as inheritance, polymorphism, abstraction, and proper method overriding. You will work with a simple notification system that supports multiple channels: Email, SMS, and Push notifications. Your implementation will be verified through a set of predefined JUnit tests.

## Project Structure

The project is organized as follows:

- **Notification (Abstract Class):**

  - Located in `org.example.Notification`
  - Provides common properties (recipient and message) and methods (e.g., `displayInfo()`)
  - Declares an abstract method `send()` that must be overridden by subclasses.

- **EmailNotification:**

  - Extends `Notification`
  - Implements the `send()` method to simulate sending an email

- **SMSNotification:**

  - Extends `Notification`
  - Implements the `send()` method to simulate sending an SMS

- **PushNotification:**

  - Extends `Notification`
  - Implements the `send()` method and includes an additional field (device token) for push notifications

- **NotificationService:**

  - Contains a method `sendNotification(Notification notification)`
  - Demonstrates polymorphism by invoking the appropriate `send()` method based on the runtime type of the `Notification` object

- **NotificationServiceTest (JUnit Tests):**
  - Provides tests to validate that each type of notification sends correctly
  - **Do not modify these tests.** Your code should pass them as provided.

## Your Tasks

1. **Review and Understand the Base Class:**

   - Examine the `Notification` abstract class.
   - Understand the purpose of the concrete methods (like `displayInfo()`) versus the abstract method `send()`.
   - **Hint:** Think about why this class is abstract and how its design enforces that subclasses provide their own sending logic.

2. **Implement Concrete Notification Classes:**

   - Ensure that `EmailNotification`, `SMSNotification`, and `PushNotification` extend `Notification` correctly.
   - Each of these classes must provide its own implementation of the `send()` method.
   - **Note:** The implementations should simulate sending notifications (e.g., printing messages to the console) as described in the code comments.

3. **Polymorphism in Action:**

   - The `NotificationService` class is designed to work with any subclass of `Notification` by utilizing polymorphism.
   - Verify that when you call `sendNotification(Notification notification)`, the correct implementation of `send()` is executed, along with the shared `displayInfo()` method.

4. **Testing Your Implementation:**

   - Run the provided JUnit tests in `NotificationServiceTest` to ensure your implementations meet the expected behaviors.
   - **Important:** You are not allowed to modify the test cases. Your solution must pass all tests as they validate the behavior of each notification channel.

5. **Code Quality and Readability:**
   - Maintain proper Java naming conventions and encapsulation.
   - Document any non-trivial logic with inline comments for clarity.
   - Do not change the existing package structure (`org.example`).

## Constraints

- **Package Structure:** Keep all classes in the `org.example` package.
- **Test Integrity:** Do not alter the JUnit tests; your implementation must satisfy them.
- **OOP Principles:** Focus on properly applying inheritance and polymorphism. The goal is to ensure that your code is modular, reusable, and testable.
- **Simulation Only:** The methods simulating sending notifications should only print messages to the console—no actual email/SMS/push service should be contacted.

## Running the Project

1. **Compilation:**

   - Ensure all Java files compile without errors.

2. **Testing:**

   - Run `NotificationServiceTest` using your preferred IDE or build tool (e.g., Maven, Gradle).
   - All tests should pass, confirming that your code behaves as expected.

3. **Execution:**
   - The `NotificationService.main()` method provides a simple demonstration of the notification flow.
   - Run this method to observe the console output and verify the behavior of each notification channel.

## Tips

- **Understand the Provided Code:** Carefully study the abstract class and its concrete implementations to understand how they work together.
- **Think Polymorphically:** Remember that `NotificationService` should treat all notifications uniformly, relying on the overridden `send()` method for specific behavior.
- **Follow the Code Flow:** Trace how data is passed from the service layer through to the concrete classes to simulate sending notifications.
- **Ask Questions:** If you find yourself stuck, focus on one class at a time and review your understanding of its role.
