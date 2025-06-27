**🌍 Este README também está disponível em [English](./README.md).**

---

# 🔐 Boilerplate Spring Boot com Login via OAuth2 (Google e GitHub)

Este é um **boilerplate com Spring Boot 3 + OAuth2** que integra autenticação com Google e GitHub, pronto para rodar em **Docker**.

Ideal para aplicações que precisam de login com provedores externos sem lidar com criação de sistema de autenticação próprio.

---

## 📌 O que é OAuth2?

OAuth2 é um **protocolo de autorização** que permite que aplicativos acessem informações de usuários armazenadas por provedores como Google ou GitHub, **sem precisar armazenar senhas**.  
Ele realiza o login de forma segura, usando tokens e redirecionamentos.

---

## 🚀 Para que serve este boilerplate?

Este projeto serve como ponto de partida para qualquer aplicação Spring Boot que precise de:

- Login com Google ou GitHub
- Segurança com Spring Security
- Inicialização rápida via Docker
- Extensível para outros provedores (Facebook, LinkedIn, etc)

---

## ✅ Vantagens de usar este projeto

- 🔒 Segurança pronta com OAuth2 + Spring Security
- 🐳 Execução simples via Docker
- 📦 Estrutura moderna com Java 21 e Spring Boot 3
- 👨‍💻 Fácil de estender para salvar os dados do usuário no banco

---

## ⚙️ Pré-requisitos

- [Docker instalado](https://docs.docker.com/get-docker/)
- Conta no [Google Cloud Console](https://console.cloud.google.com/) e [GitHub](https://github.com)

> ⚠️ É necessário criar as credenciais OAuth2 nos provedores.  
> Veja o guia passo a passo aqui:  
> 📄 [`docs/setting-up-providers.pt-BR.md`](docs/setting-up-providers.pt-BR.md)

---

## 📦 Instalação e uso

### 1. Clone o projeto

```bash
git clone https://github.com/filipe-oliv95/oauth2-google-github-login.git
cd oauth2-google-github-login
```

### 2. Construa a imagem Docker
```bash
docker build -t oauth2-google-github-login .
```

### 3. Execute o container
```bash
docker run -p 8080:8080 \
  -e GOOGLE_CLIENT_ID=seu-client-id-google \
  -e GOOGLE_CLIENT_SECRET=seu-secret-google \
  -e GITHUB_CLIENT_ID=seu-client-id-github \
  -e GITHUB_CLIENT_SECRET=seu-secret-github \
  oauth2-google-github-login
```
> ❗ Se ainda **não tem essas chaves**, siga o guia:
> [`docs/setting-up-providers.pt-BR.md`](docs/setting-up-providers.pt-BR.md)

---

### 4. Acesse a aplicação

Abra no navegador:

```
http://localhost:8080
```

Ao realizar login com Google ou GitHub, os **dados do usuário autenticado serão impressos no console** do Docker.

---

## ✅ Conclusão

Esse boilerplate é uma base sólida para projetos que precisam de login via Google ou GitHub com Spring Boot.
Simples de usar, seguro por padrão, e fácil de expandir.
Ideal para quem quer começar um projeto moderno e bem estruturado, com autenticação pronta para produção.