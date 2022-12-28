<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />

    <link rel="stylesheet" type=" text/css" href="/css/login.css" />
    <title>Admin Page</title>
  </head>
  <body>
    <div class="form">
      <p>Login</p>

      <form:form modelAttribute="admin" action="admin" method="post">
      
        <form:input path="Id" placeholder="Enter your Id" type="id" />
        <form:input  path="adminkey" placeholder="Enter you AdminKey" type="adminkey" />
        <form:input path="isAdmin" placeholder="admin boolean" type="isadmin" />
        <form:button type="submit">login</form:button>
        
      </form:form>
     
    </div>
  </body>
</html>
