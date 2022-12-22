<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />

    <link rel="stylesheet" type=" text/css" href="/css/login.css" />
    <title>Product Information</title>
  </head>
  <body>
    <div class="form">
      <p>Product</p>

      <form:form modelAttribute="Product" action="productLogging" method="post">
      
        <form:input path="manufacturer" placeholder="Manufacturer" type="text" />
        
        <%-- <form:input  path="purchased" placeholder="Purchased" type="purchased" /> --%>
        
        <form:input path="mileage" placeholder="Mileage" type="mileage" />
        
        <form:input  path="price" placeholder="Price" type="price" />
        
        <form:input path="model" placeholder="Model" type="model" />
        
        <%-- <form:input  path="build" placeholder="Build" type="build" /> --%>
        
        <form:input  path="description" placeholder="Description" type="description" />
        
        <form:input  path="images" placeholder="Images" type="images" />
        
        
        <form:button type="submit">Submit</form:button>
       
      </form:form>
     
    </div>
  </body>
</html>
