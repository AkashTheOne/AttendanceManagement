<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
  <!DOCTYPE html>
  <html>

  <head>
    <meta charset="ISO-8859-1" />
    <title>Insert title here</title>
    <link rel="stylesheet" href="/css/index.css" />
    <script src="/js/index.js"></script>
  </head>

  <body>
    <header>
      <h1>Student Management System</h1>
      <nav>
        <ul>
          <li><a href="http://localhost:8080/stud/home">Home</a></li>
          <li><a href="#" onclick="loadDoc('GET', '/stud/student', 'content')">ADD Student</a></li>
          <li><a href="#" onclick="loadDoc('GET', '/stud/getStudList', 'content')">Student Details</a></li>
        </ul>
      </nav>
    </header>
    <section id="content">
      <div style="text-align: center; padding-top: 10%;">
        <h1>Welcome to the Attendance Management System</h1>
      </div>
    </section>
    <footer>
      <div id="footer">
        <span>Student Management</span>
        <span>Student Managements</span>
        <span>Student Management</span>
        <span>Student Management</span>
      </div>
      <div id="footer">
        <span>Student Management</span>
        <span>Student Management</span>
        <span>Student Management</span>
        <span>Student Management</span>
      </div>
      <div id="footer">
        <span>Student Management</span>
        <span>Student Management</span>
        <span>Student Management</span>
        <span>Student Management</span>
      </div>
      <div id="footer">
        <span>Student Management</span>
        <span>Student Management</span>
        <span>Student Management</span>
        <span>Student Management</span>
      </div>
    </footer>
  </body>

  </html>