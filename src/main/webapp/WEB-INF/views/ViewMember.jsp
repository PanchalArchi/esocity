<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
{
  box-sizing: border-box;
  margin: 0;
  padding: 0;
}

body {
  font-family: Arial, sans-serif;
  background-color: #f0f0f0;
}

/* Header Styles */

header {
  background-color: #333;
  color: #fff;
  padding: 20px;
  text-align: center;
}

header h1 {
  font-size: 36px;
  margin-bottom: 10px;
}

/* Member Information Styles */

member-info {
  max-width: 800px;
  margin: 40px auto;
  padding: 20px;
  background-color: #fff;
  border: 1px solid #ddd;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

member-info h2 {
  font-size: 24px;
  margin-bottom: 10px;
}

member-info p {
  margin-bottom: 20px;
}

member-info label {
  font-weight: bold;
  margin-bottom: 5px;
}

member-info span {
  font-size: 18px;
  color: #666;
}

/* Member Details Table Styles */

member-details-table {
  width: 100%;
  border-collapse: collapse;
  margin-bottom: 20px;
}

member-details-table th, .member-details-table td {
  border: 1px solid #ddd;
  padding: 10px;
  text-align: left;
}

member-details-table th {
  background-color: #f0f0f0;
}

/* Buttons Styles */

buttons {
  text-align: center;
  margin-top: 20px;
}

buttons button {
  width: 150px;
  height: 40px;
  background-color: #333;
  color: #fff;
  padding: 10px;
  border: none;
  border-radius: 5px;
  cursor: pointer;
  margin: 0 10px;
}

buttons button:hover {
  background-color: #555;
}
</style>

</head>
<body>
<h2>View Member</h2>
 <table border="1">
 
 	<tr>
 		<th>MemberName<th>
 		<th>Age<th>
 		<th>ProfilePhoto<th>
 		<th>HouseId<th>
 	</tr>

<%-- 
MemberName : ${member.memberName }<br>
Age :  ${member.age }<br>
Profile :  ${member.profilePhoto }<br>
House Id:  ${member.houseId }<br> --%>

	<tr>
		<td>${member.memberName }<td>
		<td>${member.age }<td>
		<td>${member.profilePhoto }<td>
		<td>${member.houseId }<td>
	</tr>

 </table>
</body>
</html>