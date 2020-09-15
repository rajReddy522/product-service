# product-service
Sample Crud operations on Product services

Below Technologies are being used
1. SpringBoot
2. Spring data Jpa H2 as InMemory 
3. Java 8

Flow ->
Product -> Indicates model class
ProductRepository -> Responsible to set the data in Inmemory DB
ProductServiceController -> contains all endpoints wrt CURD 
ProductServiceImpl -> service layer for buisness logic

INPUT

http://localhost:8081/addProduct : POST
RequestBody -> 
[{
  "name": "MOBILE",
  "description" : "SAMSUNG Galaxy J8",
  "brand" : "Samsung",
  "price" : "19999"
}]

http://localhost:8081/products  : GET
Response -> 
[{
  "name": "MOBILE",
  "description" : "SAMSUNG Galaxy J8",
  "brand" : "Samsung",
  "price" : "19999"
}]

http://localhost:8081/product/1 : GET
ResponseBody -> 
{
  "name": "MOBILE",
  "description" : "SAMSUNG Galaxy J8",
  "brand" : "Samsung",
  "price" : "19999"
}


http://localhost:8081/product/delete/1 : DELETE


