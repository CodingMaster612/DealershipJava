<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />

    <link rel="stylesheet" type=" text/css" href="/css/login.css" />
  </head>
  <body>
    <div class="form">
      <p>Add Bid</p>

      <form:form modelAttribute="bid" action="bid" method="post">
      
        <form:input path="id" placeholder="Id" type="id" />
        
       
        
        <form:input path="bid" placeholder="Bid" type="bid" />
        
        
        
        
        <form:button type="submit">Submit</form:button>
       
      </form:form>
     
    </div>
  </body>
</html>