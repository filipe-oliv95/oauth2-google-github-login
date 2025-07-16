**🌍 This README is also available in [Portuguese](./README.pt-BR.md).**

---

# 🔐 Spring Boot Boilerplate with OAuth2 Login (Google & GitHub)

This is a **Spring Boot 3 + OAuth2 boilerplate** that integrates authentication with Google and GitHub, ready to run with **Docker**.

Perfect for applications that need login via external providers without building a custom authentication system.

---

## 📌 What is OAuth2?

OAuth2 is an **authorization protocol** that allows applications to access user data stored by providers like Google or GitHub, **without needing to store passwords**.

It handles login securely using tokens and redirects.

---

## 🚀 What is this boilerplate for?

This project serves as a starting point for any Spring Boot application that needs:

- Login with Google or GitHub
- Security via Spring Security
- Quick startup using Docker
- Easy extension for other providers (Facebook, LinkedIn, etc.)

---

## ✅ Benefits of using this project

- 🔒 Built-in security with OAuth2 + Spring Security
- 🐳 Easy to run using Docker
- 📦 Modern structure with Java 21 and Spring Boot 3
- 👨‍💻 Simple to extend to persist user data in a database

---

## ⚙️ Prerequisites

- [Docker installed](https://docs.docker.com/get-docker/)
- [Google Cloud](https://console.cloud.google.com/) and [GitHub](https://github.com) accounts

> ⚠️ You must create OAuth2 credentials with each provider.
> Follow the step-by-step guide here:
> 📄 [`docs/setting-up-providers.en.md`](docs/setting-up-providers.en.md)

---

## 📦 Installation & Usage

### 1. Clone the project:

```bash
git clone https://github.com/filipe-oliv95/oauth2-google-github-login.git
cd oauth2-google-github-login
```

### 2. Create a .env file in the project root with your credentials:

```dotenv
GOOGLE_CLIENT_ID=your-google-client-id
GOOGLE_CLIENT_SECRET=your-google-client-secret
GITHUB_CLIENT_ID=your-github-client-id
GITHUB_CLIENT_SECRET=your-github-client-secret
```

> ❗ If you **don't have these credentials** yet, follow the guide:
> [`docs/setting-up-providers.en.md`](docs/setting-up-providers.en.md)

### 3. Start the application using Docker Compose:

```bash
docker-compose up --build
```

### 4. Access the application:

Open your browser and go to:

```
http://localhost:8080
```

After logging in with Google or GitHub, the **authenticated user data will be printed in the Docker console**.

---

## ✅ Conclusion

This boilerplate provides a solid foundation for projects requiring Google or GitHub login with Spring Boot. It's easy to use, secure by default, and simple to expand. Perfect for starting a modern and well-structured application with production-ready authentication.