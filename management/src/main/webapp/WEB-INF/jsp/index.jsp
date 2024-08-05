<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
  <!DOCTYPE html>
  <html>

  <head>
    <meta charset="ISO-8859-1" />
    <title>Attendance Management</title>
    <link rel="stylesheet" href="/css/index.css" />
    <script src="/js/index.js"></script>
  </head>

  <body>
    <header>
      <h1>Attendance Management System</h1>
      <nav>
        <ul>
          <li><a href="http://localhost:8080/stud/home">Home</a></li>
          <li><a href="#" onclick="loadDoc('GET', '/stud/student', 'content',null)">ADD Student</a></li>
          <li><a href="#" onclick="loadDoc('GET', '/stud/getStudList', 'content',null)">Student Details</a></li>
        </ul>
      </nav>
    </header>
    <section id="content">
      <div id="main-div">
        <h1>Welcome to the Attendance Management System</h1>
      </div>
    </section>
    <footer>
      <div id="footer">
      <div><span>Get to Know Us</span></div>
        <span>About Us</span>
        <span>Careers</span>
        <span>Careers</span>
        <span>Careers</span>
      </div>
      <div id="footer">
      <div><span>Connect with Us</span></div>
        <span>Facebook</span>
        <span>Twitter</span>
        <span>Instagram</span>
        <span>YouTube</span>
      </div>
    </footer>
  </body>

  </html>