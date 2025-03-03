
# OrderMS
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![MongoDB](https://img.shields.io/badge/-MongoDB-13aa52?style=for-the-badge&logo=mongodb&logoColor=white)
![RabbitMQ](https://img.shields.io/static/v1?message=RabbitMQ&logo=rabbitmq&label=&color=FF6600&logoColor=white&labelColor=&style=for-the-badge)
[![Licence](https://img.shields.io/github/license/Ileriayo/markdown-badges?style=for-the-badge)](./LICENSE)

O microserviço 'order-ms' processa pedidos recebidos a partir de mensagens na fila do RabbitMQ. Ele se comunica com a API para receber requisições e armazena os dados processados no banco de dados.

## Arquitetura
![img.png](img.png)!

## Documentação API

#### List Orders

```http
  GET customers/{customerId}/orders
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `customerId` | `Long` | **Required** customerId |

#### Response

```code
{
  "summary": {
    "totalOnOrders": 120
  },
  "data": [
    {
      "orderId": 1001,
      "customerId": 1,
      "total": 120
    }
  ],
  "pagination": {
    "page": 0,
    "pageSize": 10,
    "totalElements": 1,
    "totalPages": 1
  }
}
```


## Instalação

Clone o projeto

```bash
  git clone https://github.com/Lucas-barreto1/order-ms.git
```

Entre no diretorio 'local' e rode o docker

```bash
  cd ./local
  docker compose up
```
