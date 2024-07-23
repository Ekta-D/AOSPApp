# CarRentalNotification

## Description
A simple notification system for a car rental company to alert when a car exceeds the set speed limit.

## Structure
- `model`: Contains data classes for `Car` and `Rental`.
- `service`: Interface and implementation for speed monitoring.
- `communication`: Interfaces and implementations for communication channels (Firebase and AWS SNS).
- `utils`: Utility functions.

## How to Run
1. **Firebase Setup**:
    - Add the `google-services.json` file to your project.
    - Configure Firebase in your project.

2. **AWS Setup**:
    - Configure AWS credentials and set the appropriate region.
    - Replace the SNS topic ARN with your own.

3. **Build and Run**:
    - Open the project in an IDE like IntelliJ IDEA.
    - Build the project using Gradle.
    - Run the `main` function to test the functionality.

4. **Testing**:
    - Modify the `communicationChannel` variable in `main` to switch between Firebase and AWS SNS.
