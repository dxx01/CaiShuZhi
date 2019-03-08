<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta  charset="UTF-8">
    <title>猜数字</title>
    <script type="text/javascript" src="js/jquery-1.12.4.min.js"></script>
    <script type="text/javascript" src="js/kongzi.js"></script>
    <style>
        body {
            padding: 100px 0;
            background-color: #2b3b49;
            color: #fff;
            text-align: center;
            font-size: 2.5em;
        }
        input {
            padding: 5px 20px;
            height: 50px;
            background-color: #3b4b59;
            border: 1px solid #c0c0c0;
            box-sizing: border-box;
            color: #fff;
            font-size: 20px;
        }
        button {
            padding: 5px 20px;
            height: 50px;
            font-size: 16px;
        }
    </style>
</head>
<body>

<h1>猜数字游戏</h1>
<p>Hi，我已经准备了一个0~100的数字，你需要在仅有的10机会之内猜对它。</p>

<form action="ccc" method="post">
    <input type="number" min="0" max="100" name="num" id="pp" placeholder="随便猜" oninput="laa()">
    <input type="number" name="ci" placeholder="随便猜" style="display:none" value="${sessionScope.ci1}">
     <!-- <input type="number" name="shui" placeholder="随便猜" style="display:none" value="0"> -->
   <button onmouseenter="aa()" id="kk" type="submit">试一试</button>
   
</form><br/>
<a style="text-decoration: none;" href="ccc">重来</a>
<span>${sessionScope.error}</span>
<span id="ll" style="display: none">${sessionScope.hui}</span>
</body>
