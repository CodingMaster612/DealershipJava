<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />

    <link rel="stylesheet" type=" text/css" href="/css/login.css" />
    <title>Login Page</title>
  </head>
  <body>
    <div class="form">
      <p>Login</p>

      <form:form modelAttribute="user" action="signIn" method="post">
      
        <form:input path="username" placeholder="Username" type="text" />
        <form:input  path="password" placeholder="Password" type="password" />
        <form:input  path="isAdmin" placeholder="admin boolean" type="isadmin" />
         <form:input  path="storage" placeholder="Storage" type="user" />
        
        <form:button type="submit">login</form:button>
        <p class="message">
          Not registered?
          <a href="/signUp"
            >Create an account</a
          >
        </p>
      </form:form>
     
    </div>
  </body>
</html>
