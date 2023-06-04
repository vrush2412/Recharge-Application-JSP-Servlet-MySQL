<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="background: #0088a9">
<style>
body {
  margin: 0;
}

.wrapper {
  background-color: #1976d2;
  display: grid;
  grid-gap: 1em;
  grid-template-columns: 1fr;
  grid-template-rows: auto;
  justify-items: center;
  height: 100vh;
  width: 100vw;
}

.item1 {
  align-self: end;
}

.item2 {
  align-self: start;
}

input {
  box-shadow: -1px 2px 1px 2px rgba(0,0,0,.3);
  box-sizing: border-box;
  border-width: 0;
  color: #424242;
  text-align: center;
}

button {
  background-color: #d81b60;
  border-width: 0;
  box-shadow: 2px 3px 2px rgba(0,0,0,.5);
  color: #fff;
  text-shadow: 2px 2px #880e4f;
  text-transform: uppercase;
}

button:hover,
button:active {
  box-shadow: 1px 1px 1px #000;
}


input, button {
    border-radius: 0.2ch;
    font-family: 'Fredoka One', cursive;
    font-size: -webkit-xxx-large;
    width: 12ch;
}


</style>
  <div class="wrapper">
  <div class="item1">
    <input type="password" name="id" id="userID" placeholder="Enter PIN">
  </div>
  <div class="item2">
   <a href="paymentSuccessful.jsp"> <button>Pay</button></a>
  </div>
</div>
</body>
</html>
</body>
</html>