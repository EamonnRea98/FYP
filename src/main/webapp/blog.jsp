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
     <h2>Would you like to see your opinions published</h2>

                <p>Do you feel like you know your stuff when it comes to all things GAA? Do you have something to say and want people to hear it?.</p>

                <p>Send us in your blog posts on whatever topic you feel passionate about and we'll .</p>

                <label for="blog_type"><b>Blog type:</b></label>
                <select name="blog_type" id="blog_type">
                    <option>Hurling</option>
                    <option>Football</option>
                </select>        

                <br/>
                <br/>

                <%--All details to be inserted into SQL table for blog posts--%> 
                <label for="blog_title"><b>Post title:</b></label>
                <input type="text" name="blog_title" placeholder="Post Title"/>

                <br/>
                <br/>

                <div id="textareastuff">
                    <label for="blog_content"><b>Your blog</b></label>
                    <textarea placeholder="Blog Content" name="blog_content" cols="50" rows="10"></textarea>
                </div>

                <br/>

        <h2>Welcome To GAA Life</h2>
        <p>Home to GAA News and Chat for lovers of Hurling and Football</p>
        <form action="main.html">

<textarea id="w3review" name="w3review" rows="10" cols="50">
  Submit your posts here and the best will be published on our site
  </textarea>
  <br><br>
  <input type="submit" value="Submit">
</form>
    </body>
</html>

