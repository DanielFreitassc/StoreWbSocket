## Crud básico de produtos utilando mappers e dtos.


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
```json
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
```json
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
