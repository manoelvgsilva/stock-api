# stock-api

api para registrar estoque de produto em um sistema ecommerce contendo as 
seguintes rotas GET, POST E UPDATE

# Pré requisitos

Java 17
Maven 3.6
Docker
Mongo
Kafka

# Instalação

1. Clone o repositório:
   ```zsh
   git clone https://github.com/manoelvgsilva/stock-api.git
   ```

2. Navegue até o diretório do projeto:
   ```zsh
   cd stock-api
   ```

3. Instale as dependências:
   ```zsh
   mvn install
   ```

4. Para rodar em Docker:
   ```zsh
   docker-compose up -d
   ```

5. Inicie a aplicação:
   ```zsh
   mvn spring-boot:run
   ```

### Endpoints principais:

- `GET /stocks`: Retorna a lista de estoque para o administrador do sistema.
- `POST /stocks`: Cria um novo estoque.
- `GET /stocks/{productId}`: Retorna um estoque especifico atraves do id do 
  produto de estoque.
- `PUT /stocks/{productId}`: Faz atualização de informações de um estoque.

#### Exemplo de requisição para criar um estoque:
```zsh
curl -X POST http://localhost:8080/stocks
-H "Content-Type: application/json" \
-d '{
    "productId": "i9jo9gh764g6543",
    "quantityPresent": "9",
    "quantityMinimous": "6",
    "quantityMaximous": "18",
    "dateCreation": "2024-01-01",
    "dateVality": "2024-06-01",
    "localPresent": "em algum lugar",
    "statusProduct": true
}'
