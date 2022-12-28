<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="/css/Home.css" />
    


    <title>Main menu</title>
  </head>
  <body>
    
        
        <ul class="nav">
          <li id="settings">
              <a href="#"><img src="" /></a>
          </li>
          
          <li>
              <a href="/signOut">Log Out</a>
             
          </li>
          <li id="search">
              <form action="" method="get">
                  
                  
                  
                  <input type="text" name="search_text" id="search_text"placeholder="Search"/>
                  <input type="button" name="search_button" id="search_button">
                  
              </form>
              
              

  			

          </li>
          <li id="options">
              <a>Main Menu</a>
              <ul class="subnav">
                 
                  
                  
                
                  
                  
                  
                  
                  
                  
                  
                  
                  
              </ul>
          </li>
      </ul>
      	
       
        <c:choose>
            		<c:when test="${ admin.getIsAdmin()== true}">
                
                 <button><a href="/report">report</a></button>
                  <button><a href="/report">add car</a></button>
                
            </c:when>    
            
        </c:choose> 


   
       
        
      
  </body>
</html>
