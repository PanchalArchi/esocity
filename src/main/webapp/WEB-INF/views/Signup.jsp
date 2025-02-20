<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>signup</title>
</head>
<body>

    <h2>Create an Account</h2>

    <form action="saveuser" method ="post"> 
        <div>
            <label for="fullname">FirstName:</label>
            <input type="text" id="firstName" name="firstName" required>
        </div>
        
        <div>
            <label for="fullname">LastName:</label>
            <input type="text" id="lastName" name="lastName" required>
        </div>

        <div>
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>
        </div>

        <div>
            <label for="username">UserName</label>
            <input type="text" id="username" name="username" required>
        </div>
        
        <div>
   			BornYear : <input type="text" name="bornYear"/><br><br>     
        </div>
 		
 		<div>
 		 	Gender : Male<input type="radio" name="gender" value="male">
 		 			 FeMale<input type="radio" name="gender" value="female">
 		</div>
        <div>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>
        </div>

        <div>
            <label for="confirm-password">Confirm Password:</label>
            <input type="password" id="confirm-password" name="confirm-password" required>
        </div>

        <div>
            <button type="submit">Sign Up</button>
        </div>
        <a href="login">Login</a>
    </form>

</body>
</html>