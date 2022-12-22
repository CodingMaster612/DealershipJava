<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />

    <link rel="stylesheet" type=" text/css" href="/css/signUp.css" />
    <title>Sign up Page</title>
  </head>
  <body>
    <div class="form">
      <p>Sign up</p>

      <form:form modelAttribute="user" action="signUp" method="post">
        <form:input path="username" placeholder="Username" type="text" />
        <form:input  path="password" placeholder="Password" type="password" />
        <form:button type="submit" href="">Sign up</form:button>
        <p class="message">
          Already have an Account?<a
            href="/"
            >Login here</a
          >
        </p>
      </form:form>
      
    </div>
  </body>
</html>
