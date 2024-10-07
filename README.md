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

## Stock
### Cria um novo estoque

<details>
    <summary><code>POST</code> <code><b>/stocks</b></code> <code>(Cria um novo estoque)</code></summary>

    ##### Parametros
> | name      |  type     | data type               | description                                                           |
> |-----------|-----------|-------------------------|-----------------------------------------------------------------------|
> | Body      |  required | object (JSON)   | stock obj |

> ##### Example cURL

> ```java
>  curl -X 'POST' 'http://localhost:8080/stocks' -H 'accept: application/json' -H 'Content-Type: application/json' -d '{"productId": "i9jo9gh764g6543", "quantityPresent": "9", "quantityMinimous": "6", "quantityMaximous": "18", "dateCreation": 024-01-01", "dateVality": "2024-06-01", "localPresent": "em algum lugar", "statusProduct": true
}'
> ```
</details>

## Stock
### Acessa um estoque pelo id do produto estocado

<details>
    <summary><code>GET</code> <code><b>/stocks/{productId}</b></code> <code>(Acessa um estoque pelo id do produto estocado)</code></summary>

##### Parametros
> | name      |  type     | data type               | description                                                           |
> |-----------|-----------|-------------------------|-----------------------------------------------------------------------|
> | productId      |  required | id   | productId |


##### Example cURL

> ```java
>  curl -X 'GET' 'http://localhost:8080/stocks/i9jo9gh764g6543'
> ```
</details>

_____________________________________________________________

### Acessa todos os estoques

<details>
    <summary><code>GET</code> <code><b>/stocks</b></code> <code>(Acessa todos os estoques)</code></summary>

##### Parametros
> none
 
##### Example cURL
> ```java
>  curl -X 'POST' 'http://localhost:8080/stocks'
> ```
</details>

______________________________________________________________________________________

### atualiza algum dado de algum estoque pelo id do produto

<details>
    <summary><code>PUT</code> <code><b>/stocks/{productId}</b></code> <code>(atualiza os dados de algum estoque atraves do id do produto estocado)</code></summary>

##### Parametro
> | name      |  type     | data type               | description                                                           |
> |-----------|-----------|-------------------------|-----------------------------------------------------------------------|
> | id      |  required | string | productId |
> | Body      |  required | object(json) | stock obj |

##### Example cURL

> ```java
> curl -X 'PUT' 'http://localhost:8080/stocks/i9jo9gh764g6543' -H 'accept: application/json' -H 'Content-Type: application/json' -d '{"quantityPresent": "10", "quantityMinimous": "7", "quantityMaximous": "19", "dateCreation": 024-01-01", "dateVality": "2024-06-01", "localPresent": "em algum lugar", "statusProduct": true
> ```
</details>
