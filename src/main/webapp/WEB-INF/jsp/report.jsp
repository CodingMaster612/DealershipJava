<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"

	pageEncoding="UTF-8"%>
<html>
<head>
	
    
    <link rel="stylesheet" href="/css/items.css">
</head>
<body class="flex-col">
	<div class="flex-row header">
       
        <c:choose>
            <c:when test="${loggedInCar != null}">
                
                
            </c:when>    
            
        </c:choose>
    </div>
	<div class="flex-row main-content">
        <div class="flex-row center full-width">
            
            
            <c:forEach var="product" items="${purchasedProduct}">
                
                
                <div class="list-item">
                    
                    
                   	
                    <img src="${product.getImages()}" />
                   
                  	
            
                 
            
       
         </div>
<!--                
 -->                
            </c:forEach>
            
            
        </div>
    </div>
</body>

</html>