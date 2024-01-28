# AMMA - Antenatal Maternal Monitoring and Assistance App

**Happy Motherhood 😊**

## Overview
AMMA (Antenatal Maternal Monitoring and Assistance) is a mobile application designed for pregnant women, addressing their slight memory loss by providing reminders. In case a reminder is dismissed, the app sends an email to the husband and mother of the pregnant woman for follow-up. The app is designed to support 21 languages in India, making it accessible to even less educated women. It aims to support expectant mothers during their pregnancy journey, offering various features for monitoring and assistance to ensure a healthy and happy pregnancy experience.

## Technologies Used
- Programming Language: Java
- Development Environment: Android Studio
- Build Tool: Gradle 8.2.1
- Database:
  - Firebase for userID creation
  - Firestore for user collection creation
- Communication:
  - SMTP for sending emails
- Language Translation:
  - Google Translate for translating large amounts of text into different languages

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
   - The reminder rings with Ok and Dismiss buttons; if dismissed, an email is sent to the husband and mother for follow-up.
2. **Communication:**
   - SMTP integration for sending important emails, especially if the pregnant woman dismisses the reminder.
3. **Multiple Language Support:**
   - Google Translate integration for language translation services, supporting 21 Indian languages.
4. **User Registration:**
   - Firebase is used for user authentication, creating unique userIDs for pregnant women, and collecting email IDs for communication.
5. **Monitoring:**
   - Firestore is utilized to store and manage user-specific data related to pregnancy monitoring, ensuring data security.

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
   - Google Translate ensures content accessibility in multiple languages.

## How to Build
To build and run the application, follow these steps:
1. Open the project in Android Studio.
2. Ensure that the required dependencies are properly configured, especially Firebase and Google Translate.
3. Connect the project to a Firebase project and configure the necessary API keys.
4. Build the project using Gradle.
5. Run the application on an Android emulator or a physical device.

## How to Use App (with Screenshots)
1. When the app is opened, it will show a splash screen like below:

![Splash Screen](AMMA Screenshots/splash_screen.png)

2. Select language:

![Select Language](AMMA Screenshots/select_language.png)

3. The supported 21 Indian languages are:

![Language Support 1](AMMA Screenshots/language_support_1.png)
![Language Support 2](AMMA Screenshots/language_support_2.png)

4. When a language is selected, it gives a toast message, and the login page is opened. If a new user clicks register:

![After Selection](AMMA Screenshots/after_selection.png)

5. When the pregnant woman clicks register:

![Register 1](AMMA Screenshots/register_1.png)

6. When the pregnant woman tries to click register button without entering details, she gets a toast message "Enter email":

![Register 2](AMMA Screenshots/register_2.png)

7. Creating an account by providing details and pressing the register button gives a toast message as "Account created":

![Register 3](AMMA Screenshots/register_3.png)

8. Reminder page to select date, time, set reminder name:

![Reminder 1](AMMA Screenshots/reminder_1.png)
![Reminder 2](AMMA Screenshots/reminder_2.png)

9. Setting a reminder by clicking set reminder then it will give a toast message as "Reminder set".

10. At set time, the reminder gets activated with a toast message "Reminder activated" and screen having two buttons Ok and Dismiss.

11. If the pregnant woman takes required medicine or some reminder and clicks Ok then it gives a toast message as "You responded to reminder".

12. Again setting a new reminder, and if pregnant woman clicks Dismiss reminder, then app gives toast message as "You dismissed the reminder".

13. A mail to husband and mother and pregnant woman is sent as pregnant woman dismissed the reminder. Please do follow up.

14. Mental health content trimester-wise:

![Mental Health](AMMA Screenshots/mental_health.png)

15. Food, Music, Meditation, Yoga:

![F, M, Y, M](AMMA Screenshots/f_m_y_m.png)

16. Food text translated using Google translate API:

![Food](AMMA Screenshots/food.png)

17. Music section:

![Music](AMMA Screenshots/music.png)

18. Playing video on Youtube:

![Music YT](AMMA Screenshots/music_yt.png)

19. Meditation videos:

![Meditation](AMMA Screenshots/meditation.png)

20. Yoga videos:

![Yoga](AMMA Screenshots/yoga.png)

21. Profile section with registered user mail, husband mail, and mother mail:

![Profile](AMMA Screenshots/profile.png)

22. Pressed logout button and tried to log in with wrong credentials giving toast message "Login failed".

23. Login by correct credentials of the user giving toast message "Login successful".