# ☕ Coffee Ordering Application

## 📘 Project Overview

**Coffee Ordering Application** is a simple Android Studio project developed as part of the university subject **SWT32042 – Practical for Mobile Application Development**.

This application demonstrates the fundamentals of Android app development using **Java** and **XML**, focusing on **activity navigation**, **UI design**, and **user interaction**.

The app presents a series of interactive screens for ordering coffee — from a welcoming home page to different steps in the ordering process.

---

## 🎯 Learning Objectives

This project was created to:

* Understand how multiple **activities** work together in Android apps
* Implement **Intent-based navigation** between screens
* Design responsive UIs using **ConstraintLayout**
* Manage app resources such as **layouts**, **drawables**, and **strings.xml**
* Practice Gradle project setup and configuration in Android Studio

---

## ⚡ Key Features

### 🏠 1. Welcome Page

* Beautifully designed layout with background gradients and an image
* “Next” button to navigate to the next activity (using **Intent**)

### ☕ 2. Multi-Screen Navigation

* Multiple screens implemented as separate **Activities** (MainActivity2 … MainActivity15)
* Each activity represents a unique page, such as menu, order details, and checkout steps
* Navigation controlled through button clicks

### 🎨 3. Modern UI Design

* Designed using **ConstraintLayout** for flexibility
* Uses custom **backgrounds**, **images**, and **buttons**
* Built with **Material Design** components

### 🔗 4. Activity Management

* Activities declared in **AndroidManifest.xml**
* Launcher activity: `MainActivity`
* Properly exported and organized navigation flow

---

## 🛠️ Tools and Technologies

| 🧰 Tool / Technology    | ⚙️ Description                                  |
| ----------------------- | ----------------------------------------------- |
| **Android Studio**      | Integrated Development Environment for Android  |
| **Java**                | Programming language for app logic              |
| **XML**                 | Used for designing layouts and UI components    |
| **Gradle (Kotlin DSL)** | Build automation tool for project setup         |
| **AndroidX Libraries**  | Used for modern UI components and compatibility |
| **ConstraintLayout**    | Responsive UI layout management                 |

---

## 🧩 Project Structure

| 📁 File / Directory   | 🧭 Purpose                                                      |
| --------------------- | --------------------------------------------------------------- |
| `MainActivity.java`   | Launcher activity controlling the home screen and navigation    |
| `activity_main.xml`   | Layout for the main screen including text and navigation button |
| `AndroidManifest.xml` | Declares all app components and activities                      |
| `strings.xml`         | Stores app-wide string resources                                |
| `build.gradle.kts`    | Build configuration and dependencies                            |
| `drawable/`           | Background images and graphic assets                            |

---

## ⚙️ How to Build and Run

### 🧑‍💻 Using Android Studio

1. Open the project folder in **Android Studio**.
2. Allow Gradle to sync automatically.
3. Select a virtual or physical device.
4. Click **Run ▶** to launch the app.

### 💻 Using Command Line

1. Open a terminal in the project root.
2. Run the Gradle wrapper commands:

   ```bash
   ./gradlew assembleDebug
   ./gradlew installDebug
Launch the app on a connected Android device or emulator.

⚠️ Make sure **Android SDK 36** and **Java 11** are installed before running.

---

## 🧱 App Flow

* **MainActivity (Launcher)** → Displays welcome screen  
* **Next Button Click** → Navigates to **MainActivity2**  
* **Subsequent Activities (MainActivity3–15)** → Represent different pages or order steps  
* Flow likely continues through coffee selection, customization, order summary, and checkout

---

## 🖼️ Application Screenshots

| 📱 First Page | 🧾 Registration | 🔑 Login | 🏠 Home |
| --- | --- | --- | --- |
| <img width="577" height="1040" alt="image1" src="https://github.com/Subhagaya-Git/Coffee-Ordering-Application/blob/1c10dbba2c460c161bb1f7b1cf7438e86c4db68a/Coffee%20Ordering%20Application/images/1.jpeg" /> | <img width="480" height="980" alt="image2" src="https://github.com/Subhagaya-Git/Coffee-Ordering-Application/blob/760390bd7b5dc233177b35ef1367f36b45d7ae3d/Coffee%20Ordering%20Application/images/2.jpeg" /> | <img width="560" height="1020" alt="image3" src="https://github.com/Subhagaya-Git/Coffee-Ordering-Application/blob/760390bd7b5dc233177b35ef1367f36b45d7ae3d/Coffee%20Ordering%20Application/images/9.jpeg" /> | <img width="550" height="1000" alt="image4" src="https://github.com/Subhagaya-Git/Coffee-Ordering-Application/blob/760390bd7b5dc233177b35ef1367f36b45d7ae3d/Coffee%20Ordering%20Application/images/3.jpeg" /> |

| ☕ Choose Coffee | 🧾 Order Summary | 💳 Payment | 👤 Profile Page |
| --- | --- | --- | --- |
| <img width="580" height="1080" alt="image5" src="https://github.com/Subhagaya-Git/Coffee-Ordering-Application/blob/760390bd7b5dc233177b35ef1367f36b45d7ae3d/Coffee%20Ordering%20Application/images/4.jpeg" /> | <img width="580" height="900" alt="image6" src="https://github.com/Subhagaya-Git/Coffee-Ordering-Application/blob/760390bd7b5dc233177b35ef1367f36b45d7ae3d/Coffee%20Ordering%20Application/images/5.jpeg" /> | <img width="577" height="1040" alt="image7" src="https://github.com/Subhagaya-Git/Coffee-Ordering-Application/blob/760390bd7b5dc233177b35ef1367f36b45d7ae3d/Coffee%20Ordering%20Application/images/6.jpeg" /> | <img width="577" height="1040" alt="image8" src="https://github.com/Subhagaya-Git/Coffee-Ordering-Application/blob/760390bd7b5dc233177b35ef1367f36b45d7ae3d/Coffee%20Ordering%20Application/images/8.jpeg" /> |

> 📸 All screenshots captured directly from the Android emulator and mobile device testing.

---

## 💡 Suggestions for Improvement

* Move hardcoded text to **strings.xml** for localization support  
* Replace activity names like `MainActivity2`, `MainActivity3` with descriptive ones (e.g., `MenuActivity`, `OrderActivity`)  
* Use **Fragments** or **Navigation Component** for smoother transitions  
* Add **contentDescription** for images to improve accessibility  
* Use **themes/styles.xml** for consistent design and colors  
* Clean up unused imports and code comments  
* Add **input validation** if user inputs are later implemented

---

## 👨‍💻 Developer Information

**Name:** Tharushi Yapa  
**University:** South Eastern University of Sri Lanka  
**Faculty:** Faculty of Technology  
**Subject Code:** SWT32042 – Practical for Mobile Application Development

---

## 📄 License

Proprietary – Permission Required

---

## 🧾 Note

This Android application was developed as a **learning-based mobile app project** to demonstrate basic Android programming concepts such as:

* Activity-based navigation  
* UI design with XML  
* Event handling using Intents  

It serves as a **foundation project** for understanding mobile app structure, Gradle setup, and Android UI principles.  
Not intended for commercial deployment.

---

⭐ *End of Document* ⭐
