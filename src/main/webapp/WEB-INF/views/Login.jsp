<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>

    <h2>Login</h2>

    <form action="savelogininfo" method="post">
        <div>
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required>
        </div>

        <div>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>
        </div>

        <div>
            <button type="submit">Login</button>
        </div>
        <div>
            <p>Don't have an account? <a href="signup">signup</a></p>
            <p>Don't remember password <a href="forgetpassword">ForgetPassword?</a></p> 
        </div>
    </form>

</body>
</html>