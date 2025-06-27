## ☁️ Configurando os provedores

---

### Google

### Pré-requisitos

- Conta no Google
- Acesso ao [Google Console](https://console.cloud.google.com/)
- Um projeto criado

### Passo a passo

1. Vá para [Google Cloud Console](https://console.cloud.google.com/).
2. Crie um projeto ou selecione um existente.
3. Navegue até **APIs e Serviços > Credenciais**.
4. Clique em **Criar credencial > ID do Cliente OAuth**:
    - Tipo de app: `Aplicativo Web`
    - URIs de redirecionamento autorizados: `http://localhost:8080/login/oauth2/code/google`
5. Copie o **Client ID** e o **Client Secret** gerados.

---

### GitHub

### Pré-requisitos

- Conta no [GitHub](https://github.com/)

### Passo a passo

1. Vá em **Settings** > **Developer Settings** > **OAuth Apps**.
2. Clique em **New OAuth App**:
    - Home page URL: `http://localhost:8080`
    - Authorization callback URL: `http://localhost:8080/login/oauth2/code/github`
3. Copie o **Client ID** e o **Client Secret** gerados.