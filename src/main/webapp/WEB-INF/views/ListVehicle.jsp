<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Vehicle</title>
<style>
body {
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 20px;
    background-color: #f0f2f5;
}

/* Heading styles */
h2 {
    color: #1e3a5f;
    font-size: 28px;
    margin-bottom: 30px;
    padding-bottom: 10px;
    border-bottom: 3px solid #2c5282;
    width: fit-content;
}

/* Table container */
.table-container {
    background-color: white;
    border-radius: 8px;
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
    overflow: hidden;
    margin-top: 20px;
}

/* Table styles */
table {
    width: 100%;
    border-collapse: collapse;
    border: none;
}

/* Table header styles */
th {
    background-color: #2c5282;
    color: white;
    padding: 16px;
    text-align: left;
    font-weight: 600;
    font-size: 14px;
    text-transform: uppercase;
    letter-spacing: 0.5px;
}

/* Table cell styles */
td {
    padding: 14px 16px;
    border-bottom: 1px solid #e2e8f0;
    color: #2d3748;
}

/* Parking code column specific style */
td:first-child {
    font-weight: 600;
    color: #2c5282;
}

/* Table row hover effect */
tr:hover td {
    background-color: #f8fafc;
}

/* Last row styling */
tr:last-child td {
    border-bottom: none;
}

/* Alternate row background */
tr:nth-child(even) {
    background-color: #f9fafb;
}

/* Status indicator styles */
.status {
    padding: 6px 12px;
    border-radius: 12px;
    font-size: 13px;
    font-weight: 500;
    display: inline-block;
}

.status-active {
    background-color: #e6fffa;
    color: #047481;
}

.status-inactive {
    background-color: #fff5f5;
    color: #c53030;
}

/* Action buttons */
.action-btn {
    padding: 6px 12px;
    border-radius: 4px;
    font-size: 14px;
    font-weight: 500;
    text-decoration: none;
    transition: background-color 0.2s;
}

.edit-btn {
    background-color: #4299e1;
    color: white;
}

.edit-btn:hover {
    background-color: #3182ce;
}

.delete-btn {
    background-color: #fc8181;
    color: white;
    margin-left: 8px;
}

.delete-btn:hover {
    background-color: #f56565;
}

/* Responsive styles */
@media screen and (max-width: 768px) {
    body {
        padding: 10px;
    }
    
    table {
        display: block;
        overflow-x: auto;
        white-space: nowrap;
    }
    
    th, td {
        padding: 12px 10px;
    }
    
    h2 {
        font-size: 24px;
    }
    
    .action-btn {
        padding: 4px 8px;
        font-size: 13px;
    }
}
</style>
</head>
<body>
       <h2>List Vehicle</h2>
       
       
       <table border="1">
       
             <tr>
                 <th>ParkingCode</th>
                 <th>VehicleNo</th>
                 <th>VehicleType</th>
             </tr>
             
             <c:forEach items="${listVehicle}" var="v">
                 <tr>
                     <td>${v.parkingCode}</td> 
                     <td>${v.vehicleNo}</td>
                     <td>${v.vehicleType}</td>
                 </tr>
              </c:forEach>
                    
                 </table>

</body>
</html>