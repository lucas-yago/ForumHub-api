# ForumHub-api

# Fórum Hub - Alura Challenge

![Status](https://img.shields.io/badge/status-concluído-brightgreen) ![Java](https://img.shields.io/badge/java-17-yellow) ![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.5.4-green) ![Licença](https://img.shields.io/badge/licença-MIT-blue)  

## 📖 Sobre o Projeto

O **Fórum Hub** é uma API REST desenvolvida no *Alura Challenge Back-End (Oracle Next Education)*.  
A aplicação implementa o back-end de um fórum de discussão, permitindo operações de **CRUD de tópicos**, com autenticação e autorização baseadas em **JWT**.  

O projeto contempla práticas essenciais de desenvolvimento com **Java** e **Spring**, como criação de APIs RESTful, validações, segurança e persistência de dados.  

---

## ✨ Funcionalidades

- **Autenticação e Autorização** com **JWT**.  
- **CRUD de Tópicos**: criação, listagem, atualização e exclusão.  
- **Validações de Regras de Negócio**, como prevenção de tópicos duplicados.  
- **Persistência de Dados** com Spring Data JPA e Hibernate.  

---

## 🛠️ Tecnologias

- **Java 17**  
- **Spring Boot 3**  
- **Spring Security**  
- **JPA / Hibernate**  
- **Maven**  
- **Lombok**  
- **MySQL**  
- **JWT**  

---

## 🚀 Como Executar

### Pré-requisitos
- Java 17+  
- Maven 4.0+  
- Git  
- Cliente de API (Postman ou Insomnia)  

### Passos
1. Clone o repositório:  
   ```bash
   git clone https://github.com/lucas-yago/ForumHub-api.git
   cd ForumHub-api
   ```
2. Configure o banco de dados em `application.properties` (usuário, senha e URL).  
3. Execute o projeto:  
   ```bash
   mvn spring-boot:run
   ```
4. A aplicação estará disponível em: **http://localhost:8080**  

---

## 📄 Endpoints

| Método | Endpoint        | Descrição                         | Autenticação | Exemplo de Corpo (JSON) |
|--------|----------------|-----------------------------------|--------------|--------------------------|
| POST   | `/login`        | Autentica usuário e retorna token | Não          | `{ "email": "...", "senha": "..." }` |
| GET    | `/topicos`      | Lista todos os tópicos            | Sim          | N/A |
| GET    | `/topicos/{id}` | Busca um tópico por ID            | Sim          | N/A |
| POST   | `/topicos`      | Cria um novo tópico               | Sim          | `{"titulo": "...", "mensagem": "...","idAutor": 1, "idCurso": 1}` |
| PUT    | `/topicos/{id}` | Atualiza um tópico                | Sim          | `{ "titulo": "...", "mensagem": "..."}` |
| DELETE | `/topicos/{id}` | Exclui um tópico                  | Sim          | N/A |

---

## 📜 Licença

Projeto licenciado sob a **MIT License**. Consulte o arquivo [LICENSE](LICENSE) para mais informações.

