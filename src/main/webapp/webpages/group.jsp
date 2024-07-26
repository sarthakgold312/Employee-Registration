<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Registration</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f0f0f0;
        padding: 20px;
    }
    form {
        width: 50%;
        margin: auto;
        background-color: #fff;
        padding: 20px;
        border-radius: 5px;
        box-shadow: 0 0 10px rgba(0,0,0,0.1);
    }
    label {
        display: block;
        margin-bottom: 10px;
    }
    input[type="text"] {
        width: 100%;
        padding: 8px;
        margin-bottom: 15px;
        box-sizing: border-box;
        border: 1px solid #ccc;
        border-radius: 4px;
    }
    input[type="submit"] {
        background-color: #4CAF50;
        color: white;
        padding: 10px 15px;
        border: none;
        border-radius: 4px;
        cursor: pointer;
    }
    input[type="submit"]:hover {
        background-color: #45a049;
    }
</style>
</head>
<body>
<form method="post" action="details">
    <label for="Employee name">Employee ID : </label>
    <input type="text" name="cid" /><br/>
    <label for="Employee name">Employee Name : </label>
    <input type="text" name="cname" /><br/>
    <label for="Employee email">Employee Email : </label>
    <input type="text" name="cemail" /><br/>
    <input type="submit" value="Submit" />
</form>
</body>
</html>
