<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
<title>changepassword</title>
<style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, sans-serif;
        }

        body {
            min-height: 100vh;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            background-color: #f0f2f5;
            padding: 2rem;
        }

        h2 {
            color: #1a202c;
            margin-bottom: 2rem;
            font-size: 2rem;
            font-weight: 600;
            text-align: center;
        }

        form {
            background: white;
            padding: 2.5rem;
            border-radius: 10px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 440px;
        }

        .form-group {
            margin-bottom: 1.5rem;
        }

        label {
            display: block;
            margin-bottom: 0.5rem;
            color: #4a5568;
            font-size: 0.95rem;
            font-weight: 500;
        }

        input {
            width: 100%;
            padding: 0.75rem;
            border: 1px solid #e2e8f0;
            border-radius: 6px;
            font-size: 1rem;
            transition: all 0.3s ease;
        }

        input:focus {
            outline: none;
            border-color: #4299e1;
            box-shadow: 0 0 0 3px rgba(66, 153, 225, 0.15);
        }

        input[type="submit"] {
            background-color: #4299e1;
            color: white;
            padding: 0.75rem 1.5rem;
            border: none;
            border-radius: 6px;
            font-size: 1rem;
            font-weight: 500;
            cursor: pointer;
            width: 100%;
            margin-top: 1rem;
            transition: background-color 0.2s ease;
        }

        input[type="submit"]:hover {
            background-color: #3182ce;
        }

        @media (max-width: 480px) {
            body {
                padding: 1rem;
            }

            form {
                padding: 1.5rem;
            }

            h2 {
                font-size: 1.75rem;
            }
        }
    </style>
</head>
<body>

	<form action="updatepassword" method="post">
	 
		Email: <input type="text" name="email"/><br><br> 
		
		OTP: <input type="text" name="otp"/><br><br> 
		
		New Password: <input type="password" name="password"/><br><br> 
		Confirm Password: <input type="password" name="changePassword"/><br><br> 
	
		<input type="submit" value="Update Password"/>
	
	</form>
</body>
</html>