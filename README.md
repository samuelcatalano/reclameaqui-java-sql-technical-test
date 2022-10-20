# Reclame Aqui!
Technical Code of Reclame Aqui!:

### How to compile application?
`mvn clean install`

### How to run the tests?
`mvn test`

### How to run the application?
`mvn spring-boot:run`

### APIs:

* POST: http://localhost:8080/reclameaqui/create/
* POST: https://reclameaqui-java-sql.herokuapp.com/reclameaqui/create/
> JSON Body example

```javascript{
  "id": 9,
  "title": "Não recebi o dinheiro",
  "description": "Não recebi o dinheiro da venda na empresa XPTO",
  "company": {
    "id": 1,
    "name": "XPTO"
  },
  "city": {
    "id": 1,
    "name": "São Paulo",
    "state": "SP"
  }
}
```
> Return all complaints and the quantity
* GET: http://localhost:8080/reclameaqui/allComplaints/
* GET: https://reclameaqui-java-sql.herokuapp.com/reclameaqui/allComplaints/

> Return all complaints by title and the quantity
* GET: http://localhost:8080/reclameaqui/allByTitle/Dinheiro
* GET: https://reclameaqui-java-sql.herokuapp.com/reclameaqui/allByTitle/Dinheiro

> Return all complaints by description and the quantity
* GET: http://localhost:8080/reclameaqui/allByDescription/Recebi
* GET: https://reclameaqui-java-sql.herokuapp.com/reclameaqui/allByDescription/Recebi

> Return all complaints by city and the quantity
* GET: http://localhost:8080/reclameaqui/allByCity/Curitiba
* GET: https://reclameaqui-java-sql.herokuapp.com/reclameaqui/allByCity/Curitiba

> Return all complaints by state and the quantity
* GET: http://localhost:8080/reclameaqui/allByState/SP
* GET: https://reclameaqui-java-sql.herokuapp.com/reclameaqui/allByState/SP

> Return all complaints by state and the quantity
* GET: http://localhost:8080/reclameaqui/allByCompany/XPTO
* GET: https://reclameaqui-java-sql.herokuapp.com/allByCompany/XPTO

### Output:
```javascript{
{  
   "numberOfComplaints":8,
   "complaints":[  
      {  
         "id":1,
         "title":"Não recebi o dinheiro",
         "description":"Não recebi o dinheiro da venda na empresa XPTO",
         "company":{  
            "id":1,
            "name":"XPTO"
         },
         "city":{  
            "id":1,
            "name":"São Paulo",
            "state":"SP"
         }
      },
      {  
         "id":2,
         "title":"Não recebi!!!",
         "description":"Não recebi o dinheiro da compra pela empresa XPTO",
         "company":{  
            "id":1,
            "name":"XPTO"
         },
         "city":{  
            "id":1,
            "name":"São Paulo",
            "state":"SP"
         }
      },
      {  
         "id":3,
         "title":"Cade meu $$$?",
         "description":"XPTO, cade meu dinheiro???",
         "company":{  
            "id":1,
            "name":"XPTO"
         },
         "city":{  
            "id":1,
            "name":"São Paulo",
            "state":"SP"
         }
      },
      {  
         "id":4,
         "title":"Não recebi o dinheiro",
         "description":"Não recebi o dinheiro da venda na empresa WWZG",
         "company":{  
            "id":2,
            "name":"WWZG"
         },
         "city":{  
            "id":1,
            "name":"São Paulo",
            "state":"SP"
         }
      },
      {  
         "id":5,
         "title":"Não recebi!!!",
         "description":"Não recebi o dinheiro da compra pela empresa WWZG",
         "company":{  
            "id":2,
            "name":"WWZG"
         },
         "city":{  
            "id":2,
            "name":"Rio de Janeiro",
            "state":"RJ"
         }
      },
      {  
         "id":6,
         "title":"Empresa não é séria",
         "description":"Essa empresa ABCD não é séria",
         "company":{  
            "id":3,
            "name":"ABCD"
         },
         "city":{  
            "id":3,
            "name":"Belo Horizonte",
            "state":"BH"
         }
      },
      {  
         "id":7,
         "title":"A RZOP é mentirosa",
         "description":"Essa empresa é uma farsa",
         "company":{  
            "id":4,
            "name":"RZOP"
         },
         "city":{  
            "id":4,
            "name":"Curitiba",
            "state":"PR"
         }
      },
      {  
         "id":8,
         "title":"A RZOP é uma farsa",
         "description":"Essa empresa é uma mentirosa!!!!",
         "company":{  
            "id":1,
            "name":"XPTO"
         },
         "city":{  
            "id":4,
            "name":"Curitiba",
            "state":"PR"
         }
      }
   ]
}
```
