<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Payment Form</title>
    <link href="css/payment.css" rel="stylesheet">
    <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet"
        integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
    <link rel="stylesheet" href="pay.css">
</head>

<body style="background: #0088a9">
 <form action="Payment_Controller" method="get">
    <div class="wrapper">
        <h2>Payment Form</h2>
       
            <h4>Account</h4>
            <div class="input-group">
                <div class="input-box">
                    <input type="text" placeholder="First Name" required class="name" name="Name">
                    <i class="fa fa-user icon"></i>
                </div>
                <div class="input-box">
                    <input type="text" placeholder="Last Name" required class="name">
                    <i class="fa fa-user icon"></i>
                </div>
            </div>
            <div class="input-group">
                <div class="input-box">
                    <input type="email" placeholder="Email Adress" required class="name" name="Email">
                    <i class="fa fa-envelope icon"></i>
                </div>
            </div>
            <div class="input-group">
                <div class="input-box">
                    <h4> Date of Birth</h4>
                    <input type="text" placeholder="DD" name="Dob" class="dob">
                    <input type="text" placeholder="MM"  name="Dob" class="dob">
                    <input type="text" placeholder="YYYY"  name="Dob" class="dob">
                </div>
                <div class="input-box">
                    <h4> Gender</h4>
                    <input type="radio" id="b1" name="Gender" checked class="radio">
                    <label for="b1">Male</label>
                    <input type="radio" id="b2" name="Gender" class="radio">
                    <label for="b2">Female</label>
                 </div>
            </div>
            <div class="input-group">
                <div class="input-box">
                    <h4>Payment Details</h4>
                   
                    <input type="radio" name="PayMentmod" id="bc1" checked class="radio">
                    <label for="bc1"><span><i class="fa fa-cc-visa"></i> Google Pay</span></label>
                    <input type="radio" name="PayMentmod" id="bc2" class="radio">
                    <label for="bc2"><span><i class="fa fa-cc-paypal"></i> Paypal</span></label>
                </div>
            </div>
            <div class="input-group">
                <div class="input-box">
                    <input type="tel" placeholder="Enter bank Name" required class="name" name="BankName">
                    <i class="fa fa-credit-card icon"></i>
                </div>
            </div>
            <div class="input-group">
                <div class="input-box">
                    <input type="tel" pattern="[1-9]{1}[0-9.]{0,3}" placeholder="Enter Amount" vlaue ="+Amount+" name="Amount" onclick="setText7(this)" required class="name">
                    <i class="fa fa-user icon"></i>
                </div>
                <div class="input-box">
                   <input type="datetime-local" name="Date">
                </div>
            </div>
            <div class="input-group">
                <div class="input-box">
                   <a href="pay.jsp"><button type="submit">Next</button></a> 
                </div>
            </div>
        
    </div>
    </form>
   
</body>

</html>