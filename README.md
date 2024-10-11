## Crud básico de produtos utilizando mappers e dtos.


## POST
```yml
/products
```
## Payload
```json
{
  "name":"Produto tal tal",
  "price":200
}
```
## Resultado esperado
> Response 201 Created 
```json
{
  "name":"Produto tal tal",
  "price":200
}
```
---

## GET
```yml
/products
```

## Resultado esperado
> Response 200 OK 
```json
{
  "id": 1, 
  "name":"Produto tal tal",
  "price":200
}
```

---

## GET
```yml
/products/{id}
```


## Resultado esperado
> Response 200 OK 
```json
{
  "id": 1, 
  "name":"Produto tal tal",
  "price":200
}
```

---


## PUT
```yml
/products/{id}
```
## Payload
```json
{
  "name":"Produto atualizado",
  "price":201
}

```
## Resultado esperado
> Response 200 OK 
```json
{
  "id": 1, 
  "name":"Produto atualizado",
  "price":201
}
```

---

## DELETE
```yml
/products/{id}
```

## Resultado esperado
> Response 200 OK 
```json
{
  "id": 1, 
  "name":"Produto atualizado",
  "price":201
}
