# AMMA - Antenatal Maternal Monitoring and Assistance App

**Happy Motherhood 😊**

## Overview
AMMA (Antenatal Maternal Monitoring and Assistance) is a mobile application designed for pregnant woman as they suffer from slight memory loss so they can use this app to set reminders.If they dismissed the reminder the app sends mail to the husband and mother of pregnant woman to let them do follow up.The app is designed to support 21 languages in India so even the less educated woman can use the app.There is no specific app designed for mental health of pregnant woman so it is added in this android app.It supports expectant mothers during their pregnancy journey. The app provides various features to monitor and assist pregnant women, ensuring a healthy and happy pregnancy experience.

## Technologies Used
- Programming Language: Java
- Development Environment: Android Studio
- Build Tool: Gradle 8.2.1
- Database:
  - Firebase for userID creation
  - Firestore for user collection creation
- Communication:
  - SMTP for sending emails
- Language Translation API:
  - Google Translate API for translating large amounts of text into different languages

## Dependencies
- For database (firebase and firestore):
  - `implementation("com.google.firebase:firebase-auth:22.3.1")`
  - `implementation("com.google.firebase:firebase-firestore:24.10.1")`
- For SMTP:
  - `implementation("com.sun.mail:android-mail:1.6.6")`
  - `implementation("com.sun.mail:android-activation:1.6.7")`
- For Google translate:
  - `implementation("com.google.cloud:google-cloud-translate:1.27.0")`
- For YouTube videos integration:
  - `implementation("com.pierfrancescosoffritti.androidyoutubeplayer:core:12.1.0")`

## Features
1. **Reminder:**
   - The reminder rings with Ok and Dismiss buttons; if dismissed, an email is sent to the husband and mother for follow up.
2. **Communication:**
   - SMTP integration for sending important emails, especially if the pregnant woman dismisses the reminder.
3. **Multiple Language Support:**
   - Google Translate is integrated to provide language translation services, ensuring content accessibility in multiple languages so that even less educated woman can easily use the app.The app supports 21 Indian languages.
4. **User Registration:**
   - Firebase is used for user authentication and to create unique userIDs for pregnant woman and she adds her husband and mother mail ids which are used to send email if pregnant woman dismisses the email.
5. **Monitoring:**
   - The app utilizes Firestore to store and manage user-specific data related to pregnancy monitoring.Which is handled by Google so the data is safe and secure.

## Usage Instructions
1. **Internet Connection:**
   - A stable internet connection is required for real-time monitoring, communication, and language translation services.
2. **User Registration:**
   - Users need to register using their email IDs, with Firebase handling the authentication process.
3. **Monitoring Features:**
   - The app provides monitoring features to track various aspects of the pregnancy journey, including reminders.
4. **Communication Services:**
   - Husband and mother of pregnant women will receive emails if the pregnant woman dismisses the reminder.
5. **Language Translation:**
   - Google Translate ensures that content is available in multiple languages, enhancing user accessibility and easy to use for less educated woman.

## How to Build
To build and run the application, follow these steps:
1. Open the project in Android Studio.
2. Ensure that the required dependencies are properly configured, especially Firebase and Google Translate.
3. Connect the project to a Firebase project and configure the necessary API keys.
4. Build the project using Gradle.
5. Run the application on an Android emulator or a physical device.

## How to Use App (with Screenshots)
1. When the app is opened, it will show a splash screen like below:

![Alt text](<AMMA Screenshots/1SplashScreen.jpg>)

2. Select language:

![Alt text](<AMMA Screenshots/2 Select Language.jpg>)

3. The supported 21 Indian languages are:

![Alt text](<AMMA Screenshots/3 Language support 1.jpg>)
![Alt text](<AMMA Screenshots/4Language support 2.jpg>)

4. When a language is selected, it gives a toast message, and the login page is opened. If a new user clicks register:

![Alt text](<AMMA Screenshots/5After Selection.jpg>)

5. When the pregnant woman clicks register:

![Alt text](<AMMA Screenshots/6Register1.jpg>)

6. When the pregnant woman tries to click register button without entering details, she gets a toast message "Enter email":

![Alt text](<AMMA Screenshots/7Register2.jpg>)

7. Creating an account by providing details and pressing the register button gives a toast message as "Account created":

![Alt text](<AMMA Screenshots/8Register3.jpg>)

8. Reminder page to select date, time, set reminder name:

![Alt text](<AMMA Screenshots/9Reminder1.jpg>)
![Alt text](<AMMA Screenshots/10Reminder 2.jpg>)

9. Setting a reminder by clicking set reminder then it will give a toast message as "Reminder set".
![Alt text](<AMMA Screenshots/11 Reminder Set.jpg>)

10. At set time, the reminder gets activated with a toast message "Reminder activated" and screen having two buttons Ok and Dismiss.
![Alt text](<AMMA Screenshots/12Reminder Activated.jpg>)

11. If the pregnant woman takes required medicine or some reminder and clicks Ok then it gives a toast message as "You responded to reminder".
![Alt text](<AMMA Screenshots/13 OK.jpg>)

12. Again setting a new reminder, and if pregnant woman clicks Dismiss reminder, then app gives toast message as "You dismissed the reminder".
![Alt text](<AMMA Screenshots/14 Reminder.jpg>)
![Alt text](<AMMA Screenshots/15 Reminder Activated.jpg>)

13. A mail to husband and mother and pregnant woman is sent as pregnant woman dismissed the reminder. Please do follow up.
![Alt text](<AMMA Screenshots/17 Husband.jpg>)
![Alt text](<AMMA Screenshots/18 Mother.jpg>)

14. Mental health content trimester-wise:

![Alt text](<AMMA Screenshots/19 Mental Health.jpg>)

15. Food, Music, Meditation, Yoga:

![Alt text](<AMMA Screenshots/20 F,M,Y,M.jpg>)

16. Food text translated using Google translate API:

![Alt text](<AMMA Screenshots/21Food.jpg>)

17. Music section:

![Alt text](<AMMA Screenshots/22Music.jpg>)

18. Playing video on Youtube:

![Alt text](<AMMA Screenshots/23Music YT.jpg>)

19. Meditation videos:

![Alt text](<AMMA Screenshots/24Meditation.jpg>)

20. Yoga videos:

![Alt text](<AMMA Screenshots/25Yoga.jpg>)

21. Profile section with registered user mail, husband mail, and mother mail:

![Alt text](<AMMA Screenshots/26 Profile.jpg>)

22. Pressed logout button and tried to log in with wrong credentials giving toast message "Login failed".

![Alt text](<AMMA Screenshots/27Invalid user.jpg>)

23. Login by correct credentials of the user giving toast message "Login successful".

![Alt text](<AMMA Screenshots/28Valid user.jpg>)
