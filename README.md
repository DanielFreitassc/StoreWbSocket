## Crud básico de produtos utilando mappers e dtos.


## POST
```yml
/products
```
## Payload
```yml
{
  "name":"Produto tal tal",
  "price":200
}
```
## Resultado esperado
> Response 201 Created 
```yml
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
```yml
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
```yml
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
```yml
{
  "name":"Produto atualizado",
  "price":201
}

```
## Resultado esperado
> Response 200 OK 
```yml
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
```yml
{
  "id": 1, 
  "name":"Produto atualizado",
  "price":201
}
