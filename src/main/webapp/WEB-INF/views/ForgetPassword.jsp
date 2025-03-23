<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forgetpassword</title>
<style>
body {
    font-family: Arial, sans-serif;
    background-color: #7d2ae8;
    margin: 0;
    padding: 20px;
    display: flex;
    justify-content: center;
    align-items: center;
    min-height: 100vh;
}

form {
    background-color: white;
    padding: 30px;
    border-radius: 8px;
    box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
    width: 100%;
    max-width: 400px;
}

/* Title styling */
title {
    font-size: 24px;
    color: #333;
    margin-bottom: 20px;
    text-align: center;
    display: block;
}

/* Input container */
div {
    margin-bottom: 20px;
}

/* Label styling */
label {
    display: block;
    margin-bottom: 8px;
    color: #555;
    font-weight: 500;
}

/* Input field styling */
input[type="email"] {
    width: 100%;
    padding: 12px;
    border: 1px solid #ddd;
    border-radius: 4px;
    font-size: 16px;
    transition: border-color 0.3s;
    box-sizing: border-box;
}

input[type="email"]:focus {
    border-color: #4a90e2;
    outline: none;
    box-shadow: 0 0 0 2px rgba(74, 144, 226, 0.2);
}

/* Button styling */
button[type="submit"] {
    background-color: #4a90e2;
    color: white;
    padding: 12px 24px;
    border: none;
    border-radius: 4px;
    font-size: 16px;
    cursor: pointer;
    width: 100%;
    transition: background-color 0.3s;
}

button[type="submit"]:hover {
    background-color: #357abd;
}

/* Login link styling */
a[href="login"] {
    display: block;
    text-align: center;
    margin-top: 20px;
    color: #4a90e2;
    text-decoration: none;
    font-size: 14px;
}

a[href="login"]:hover {
    text-decoration: underline;
}
</style>
</head>
<body>

	<form action="sendOtp" method ="post">

        <div>
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>
        </div>
        


        <div>
            <input type="submit" value="help me!"/>
        </div>
        <a href="login">Login</a>
    </form>
    
</body>
</html>