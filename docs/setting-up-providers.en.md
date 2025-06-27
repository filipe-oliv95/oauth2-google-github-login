## ☁️ Setting Up OAuth2 Providers

---

### Google

### Prerequisites

- A Google account
- Access to the [Google Console](https://console.cloud.google.com/)
- A project already created

### Step-by-step

1. Go to the [Google Cloud Console](https://console.cloud.google.com/).
2. Create a new project or select an existing one.
3. Navigate to **APIs & Services > Credentials**.
4. Click **Create Credentials > OAuth Client ID**:
    - Application type: `Web Application`
    - Authorized redirect URIs: `http://localhost:8080/login/oauth2/code/google`
5. Copy the generated **Client ID** and **Client Secret**.

---

### GitHub

### Prerequisites

- A [GitHub account](https://github.com/)

### Step-by-step

1. Go to **Settings** > **Developer Settings** > **OAuth Apps**.
2. Click **New OAuth App**:
    - Homepage URL: `http://localhost:8080`
    - Authorization callback URL: `http://localhost:8080/login/oauth2/code/github`
3. Copy the generated **Client ID** and **Client Secret**.
