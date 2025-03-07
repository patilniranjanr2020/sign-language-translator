# 📝 LOG BOOK 

# Abstract

The **Real-Time Sign Language Translator App** aims to bridge the communication gap between individuals who use sign language and non-sign language users. The app utilizes a smartphone camera to capture gestures in real-time, translating them into text or speech. 

### Key Features:
- **Supports Multiple Sign Languages**: ASL, BSL, and Indian Sign Language.
- **Speech-to-Sign Conversion**: Converts spoken words into sign language animations.
- **Multilingual Translation**: Supports multiple languages for enhanced communication.
- **Offline Support**: Works in low-connectivity areas.
- **Custom Gesture Mapping**: Allows users to personalize gestures.

### Technologies Used:
- **Frontend**: Kotlin (Android development)
- **Gesture Recognition**: MediaPipe for hand tracking and TensorFlow Lite for real-time processing.
- **Backend & Data Handling**: Firebase for authentication and real-time database.
- **Natural Language Processing (NLP) & Speech Processing**: Text-to-speech APIs for multilingual capabilities.

### Accessibility & Use Cases:
- **Real-Time Video Call Integration**: Enables seamless sign language communication during video calls.
- **Inclusive Design**: Tailored for individuals with hearing or speech impairments.
- **Practical Applications**: Useful in education, healthcare, and personal communication.

This app ensures an **inclusive and user-friendly solution** to empower effective communication between sign language and non-sign language users.


# 📖 Chapter 1: Introduction  

## 1.1 Overview  
The **Real-Time Sign Language Translator App** is designed to bridge the communication gap between sign language users and non-sign language speakers. It utilizes **AI** and **computer vision** to recognize sign language gestures and translate them into **text** or **speech** in real time. Additionally, it converts spoken language into sign animations, enabling seamless communication.  

## 1.2 Problem Statement  
Communication barriers exist between individuals who rely on sign language and those unfamiliar with it. Traditional methods like **interpreters** are not always available, making real-time communication difficult. This app aims to provide an **automated, accessible, and efficient** solution.  

## 1.3 Objectives  
- Develop an application that translates **sign language into text and speech**.  
- Enable **speech-to-sign conversion** for two-way communication.  
- Support multiple sign languages, including **ASL, BSL, and Indian Sign Language**.  
- Integrate **AI-based hand tracking** and **gesture recognition** for accuracy.  
- Ensure accessibility with **offline support** and **real-time video call integration**.  

## 1.4 Scope  
The app is designed for various fields:  
- **Education**: Helps students and teachers communicate.  
- **Healthcare**: Assists doctors in interacting with hearing-impaired patients.  
- **Personal Communication**: Facilitates everyday conversations.  
- **Customer Service**: Provides businesses with an accessible communication tool.  

## 1.5 Technologies Used  
- **Kotlin** → Android development  
- **MediaPipe** → Hand tracking and gesture recognition  
- **TensorFlow Lite** → Machine learning-based sign recognition  
- **Firebase** → Authentication and real-time database  
- **NLP & Text-to-Speech APIs** → Multilingual support  

---

# 📚 Chapter 2: Literature Survey  

## 2.1 Introduction  
A literature survey helps in understanding existing research and technologies related to **sign language recognition**. This chapter reviews previous works, methodologies, and advancements in **gesture recognition and AI-based translation**.  

## 2.2 Existing Systems  

### 2.2.1 Traditional Methods  
- **Sign Language Interpreters**: Require human interpreters, which may not always be available.  
- **Text-Based Communication**: Involves typing or writing, which can be time-consuming.  
- **Pre-Recorded Sign Language Videos**: Limited flexibility and lack of real-time interaction.  

### 2.2.2 AI-Based Approaches  
- **Glove-Based Systems**: Use sensor-equipped gloves but lack scalability.  
- **Computer Vision-Based Systems**: Utilize cameras and deep learning for sign language recognition.  
- **Speech-to-Sign Conversion**: Converts spoken language into animated sign gestures.  

## 2.3 Related Work  
Research studies have explored **machine learning and deep learning** for sign language recognition. Some key contributions include:  

- **Hand Gesture Recognition Using CNNs**: CNN and RNN models show high accuracy.  
- **MediaPipe-Based Sign Recognition**: Google's MediaPipe enhances real-time hand tracking.  
- **Transformer-Based NLP for Sign Language**: NLP models improve speech-to-sign translation.  
- **Edge AI for Offline Recognition**: Enables sign language processing without an internet connection.  

## 2.4 Research Gaps  
While existing solutions offer advancements, they have limitations:  
- **Limited Sign Language Support**: Many focus on ASL but lack support for BSL and ISL.  
- **Lack of Real-Time Video Integration**: Most do not support live video calls with translation.  
- **Offline Functionality**: Many AI-based apps require an internet connection.  

## 2.5 Summary  
This literature survey highlights the progress in **sign language translation** and the need for a **real-time, multilingual, and accessible** solution. The proposed **Real-Time Sign Language Translator App** aims to address these limitations by integrating **computer vision, NLP, and Edge AI** for a more inclusive platform.  
