<%-- 
    Document   : blog
    Created on : 25 Mar 2021, 19:38:35
    Author     : yomte
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>GAALife</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    </head>
    <body>
          <style>
body {margin: 0;}

ul.topnav {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

ul.topnav li {float: left;}

ul.topnav li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

ul.topnav li a:hover:not(.active) {background-color: #111;}

ul.topnav li a.active {background-color: #4CAF50;}

ul.topnav li.right {float: right;}

@media screen and (max-width: 600px) {
  ul.topnav li.right, 
  ul.topnav li {float: none;}
}
</style>

<body>

<ul class="topnav">
  <li><a class="active" href="main.html">Home</a></li>
  <li><a href="Shop.html">Shop</a></li>
  <li><a href="forum.html">Forum</a></li>
  <li><a href="blog.html">Write for Us</a></li>
  <li><a href="BlogSubmitted.html">Our Users Opinions</a></li>
  <li class="right"><a href="contact.html">Contact Us</a></li>
</ul>

        <h2>Welcome To GAA Life</h2>
        <p>Home to GAA Streaming,News and Chat for lovers of Hurling and Football</p>
        <form action="main.html">

<textarea id="w3review" name="w3review" rows="10" cols="50">
  Submit your posts here and the best will be published on our site
  </textarea>
  <br><br>
  <input type="submit" value="Submit">
</form>
    </body>
</html>

