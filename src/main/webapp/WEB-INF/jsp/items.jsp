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
            
            
            <c:forEach var="car" items="${allCars}">
                
                
                <div class="list-item">
                    
                    <div>${car.getId()}</div>
                    
                    <div>${car.getDescription()}</div>
                    <div>${car.getManufacturer()}</div>
                    <div>${car.getModel()}</div>
                    <div>${car.getPrice()}</div>
                   	
                    <img src="${car.getImages()}" />
                   
                  	<c:choose>
            		<c:when test="${car.getTime()== 120}">
                
                   <button  class="buy-button"><a class="button-link" href="/bid">Bid</a></button>
                
            </c:when> 
            
            <c:when test="${car.getTime() != 120}">
                	 
     				
     				
     				<button class="buy-button"><a class="button-link" href="/buyProduct/${user.getId()}/${product.getId()}">Buy</a></button>
               
            </c:when>  
            
                 
            
        </c:choose>
         </div>
<!--                
 -->                
            </c:forEach>
            
            
        </div>
    </div>
</body>

</html>