# TheStepTester
Documentation for Step Tracker App
App Purpose
The Step Tracker App is designed to help users track their daily steps, monitor their physical activity, and analyze their progress over the course of a week. The app allows users to input and store data about their steps during different parts of the day (morning and afternoon), along with any additional notes related to their activities. The app calculates the average number of steps per day and provides the user with the ability to view the day with the highest number of steps walked. The app also features a detailed view that displays the entered data in a structured format.

Key Features
Users can enter daily step counts for both morning and afternoon, along with activity notes.
The app stores data for each day of the week (Monday to Sunday).
A "Clear All" button is provided to reset the inputs, allowing users to re-enter data as needed.
A "Submit" button directs users to a detailed screen that displays the entered data and performs basic calculations, such as determining the day with the highest number of steps.
The app calculates and displays the average number of steps taken each day.
App Explanation
1.	Splash Screen (MainActivity)
The Splash Screen is the first screen the user sees when they open the app. It serves as a brief introduction to the app, displaying the app's logo, name, and other introductory information. After a few seconds, the splash screen transitions to the Main Screen, where the user can start entering their data.

    2.   Main Screen (MainScreenActivity)
On the Main Screen, users can input the following information for each day of the week:

Morning Steps: Number of steps taken in the morning.
Afternoon Steps: Number of steps taken in the afternoon.
Activity Notes: A text field for users to enter any additional notes related to their activities.
Additionally, there are two important buttons:

Clear All Button: Clears all input fields to allow the user to re-enter data.
Go to Detailed View Button: Navigates to the Detailed Screen, where the entered data is displayed.

    3. Detailed Screen (DetailedScreenActivity)
On the Detailed Screen, the app displays the data entered for the day, including:

Morning Steps
Afternoon Steps
Activity Notes
The detailed screen also performs basic calculations:

It displays the day with the highest number of steps.
It calculates the average number of steps taken across all days of the week.
GitHub Repository Link
The source code for this app is hosted on GitHub. You can find the full code, along with instructions for running the app, by visiting the following link:
GitHub Repository: https://github.com/Katlegoee/TheStepTester/edit/main/README.md

Conclusion
The Step Tracker App is a simple yet effective tool for individuals looking to track their daily physical activity. The app allows for easy data entry, provides useful insights into the user's activity level, and encourages healthy habits by making it easy to track progress over time.

Example of How the App Looks:
Splash Screen:When the user first opens the app, the Splash Screen is displayed. It shows the app's logo and name a start button to the Main Screen. The splash screen provides an introduction to the app and serves as a brief loading screen.
Main Screen: Contains input fields for morning and afternoon steps, as well as activity notes, and buttons to clear or submit data.
Detailed Screen: Displays entered data for the day, as well as the highest step day and the average steps taken.

