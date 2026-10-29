# 🔍 Consulta de Utilizador - API do GitHub

Este é um projeto desenvolvido em Java com o objetivo de consultar dados de utilizadores através da API pública do GitHub. O foco principal da aplicação é demonstrar o consumo de APIs REST e a implementação de regras de negócio utilizando tratamento de exceções personalizadas.

## 🚀 Funcionalidades

- Leitura de dados de entrada via terminal.
- Integração com a API pública do GitHub (`https://api.github.com/users/{username}`).
- Tratamento específico para utilizadores não encontrados (HTTP 404), lançando a exceção personalizada `ErroConsultaGitHubException`.
- Exibição de mensagens de erro amigáveis para o utilizador final, evitando a quebra abrupta do sistema.

## 🛠️ Tecnologias Utilizadas

- **Java (11+)**: Linguagem principal do projeto.
- **java.net.http.HttpClient**: Biblioteca nativa do Java utilizada para realizar as requisições HTTP, dispensando a necessidade de dependências externas.
- **Programação Orientada a Objetos (POO)**: Estruturação do código e criação de exceções.

## ⚙️ Como Executar o Projeto

1. Certifica-te de que tens o **Java Development Kit (JDK) 11** (ou superior) instalado na tua máquina.
2. Faça o clone deste repositório:
   ```bash
   git clone [https://github.com/teu-usuario/consulta-github-via-API.git](https://github.com/teu-usuario/consulta-github-via-API.git)
