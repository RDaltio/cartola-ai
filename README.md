# ⚽ Cartola AI Optimizer

O **Cartola AI Optimizer** é uma solução de backend robusta projetada para resolver o problema de otimização de escalações no fantasy game Cartola FC. A API processa dados de atletas e clubes para sugerir a melhor formação possível respeitando restrições de orçamento (cartoletas) e táticas.

## 🛠️ Stack Tecnológica
* **Linguagem:** Java 21
* **Framework:** Spring Boot 4.0.3
* **Banco de Dados:** PostgreSQL 15 (Dockerizado)
* **Cache:** Redis 7 (Spring Data Redis)
* **Integração:** OpenFeign para consumo de APIs externas (Globo/Cartola)
* **Migrations:** Flyway para versionamento de esquema
* **Produtividade:** Lombok e Spring Boot DevTools

## 🏗️ Infraestrutura e Execução
O projeto foi concebido seguindo as premissas de **Externalized Configuration** e isolamento de ambiente.

1.  **Requisitos:** Docker Desktop e Java 21 instalados.
2.  **Infra:** Execute `docker compose up -d` para subir as instâncias de Postgres e Redis.
3.  **Segurança:** Credenciais sensíveis são gerenciadas via variáveis de ambiente e arquivo `.env` (ignorado pelo Git).
4.  **Acesso Local:** A API está configurada para rodar na porta `8080`, com o banco de dados acessível via porta `5433` (para evitar conflitos com serviços locais).

---
Desenvolvido por **Rafael Daltio** como parte do ecossistema de otimização esportiva.
