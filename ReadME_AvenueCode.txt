http://localhost:8080/CatalogManagement/rest/ProductService/product/addProduct


http://localhost:8080/productorder-0.0.1-SNAPSHOT/rest/CatalogService/category

http://localhost:8080/productorder-0.0.1-SNAPSHOT/rest/ProductService/product/addProduct

Content-Type : application/json


 {
        	'productId': '234',
        	'productName': 'Tops',
        	'productDesc': 'Tops for Boys',
        	'productPrice':10.19,
        	'productQuantity':100
}


{
        	'productId': 123,
        	'orderId': 1,
            'customerId' : 1,
        	'orderQuantity': 5,
			'orderTotal': 100.50
		}


Rest URL : http://localhost:8080/productorder-0.0.1-SNAPSHOT/rest/ProductService/product/addProduct

Request :  {
        	'productId': '345',
        	'productName': 'Skirts',
        	'productDesc': 'Skirts for Girls',
        	'productPrice':20.27,
        	'productQuantity':100
}

Rest URL : http://localhost:8080/productorder-0.0.1-SNAPSHOT/rest/ProductService/order/addOrder

{
        	'productId': '234',
        	'orderId': '2',
            'customerId' : '2',
        	'orderQuantity': '2',
			'orderTotal': '2'
		}

http://localhost:8080/productorder-0.0.1-SNAPSHOT/rest/ProductService/order/getOrder/2

{
    "orderdetails": {
        "orderId": 2,
        "productId": 234,
        "orderQuantity": 2,
        "orderTotal": 2,
        "customerId": 2
    }
}

http://localhost:8080/productorder-0.0.1-SNAPSHOT/rest/ProductService/product/getProduct/123

{
    "productdetails": {
        "productId": 123,
        "productDesc": "Shirts for Boys",
        "productName": "Shirts",
        "productQuantity": 10,
        "productPrice": 10.99
    }
}





http://localhost:8080/productorder-0.0.1-SNAPSHOT/rest/ProductService/order/updateOrder/2
Input : 

{
        "orderId": 2,
        "productId": 234,
        "orderQuantity": 333,
        "orderTotal": 333,
        "customerId": 2
    }


  
  http://localhost:8080/productorder-0.0.1-SNAPSHOT/rest/ProductService/order/removeOrder/3