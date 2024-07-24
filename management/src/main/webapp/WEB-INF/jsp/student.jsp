<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>ADD Student</title>
    <link rel="stylesheet" href="/css/index.css" />
    <script src="/js/index.js"></script>
</head>
<body>
    <section>
        <div class="box">
            <form>
                <table class="tablecss">
                    <h1>ADD Student</h1>
                    <tr>
                        <td>First Name :</td>
                        <td><input type="text" name="firstName" id="firstName" placeholder="Enter your First name" autocomplete="off" /></td>
                    </tr>
                    <tr>
                        <td>Last Name :</td>
                        <td><input type="text" name="lastName" id="lastName" placeholder="Enter your Last name" autocomplete="off" /></td>
                    </tr>
                    <tr>
                        <td>Email Id :</td>
                        <td><input type="text" name="emailId" id="emailId" placeholder="Enter your Email" autocomplete="off" /></td>
                    </tr>
                    <tr>
                        <td>Roll NO :</td>
                        <td><input type="text" name="rollNo" id="rollNo" placeholder="Enter your Roll No" autocomplete="off" /></td>
                    </tr>
                    <tr>
                        <td colspan="5">
                            <button type="submit" value="submit" onclick="return onSaveData(event)">Submit</button>
                            <button type="reset" value="reset">Reset</button>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </section>
</body>
</html>
