<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="background: #0088a9">

<!DOCTYPE html>
<html>
	<head>
		<title>Invoice</title>
    <link href='https://fonts.googleapis.com/css?family=Roboto' rel='stylesheet'>
    <style>
        .payment-email-success{
          width: 90%; 
          position: relative; 
          background-color: #ffffff; 
          border-radius: 15px; 
          border: 1px solid; 
          overflow: hidden; 
          margin: 0 auto;
        }
        .email-header{
          width: 100%; 
          background-color: #ffffff; 
          border-bottom: 2px solid; 
          padding: 25px;
        }
        .header-left{
          width:45%; 
          display:inline-block;
        }
        .header-right{
          width:45%; 
          display: inline-block; 
          text-align: right;
        }
        .company-name{
          font-size:16px; 
          font-weight: 700; 
          margin: 0; 
        }
        .company-address{
          font-size:16px; 
          margin: 0;
        }
        .payment-mid-block{
          padding:30px; 
          background-color: #0879a8; 
          text-align:center;
        }
        .success-img{
          width:100%; 
          text-align: center; 
          position: relative;
        }
        .transaction-detail-block{
          width:100%; 
          display: block; 
          background-color: #ffffff; 
          margin: 0 auto; 
          border-radius: 10px; 
          padding: 10px 0; 
          text-align:center;
        }
        .transaction-head{
          font-size:20px; 
          font-weight: 700; 
          color: #ffffff; 
          text-align: center; 
        }
        .transaction-det-font{
          display: block; 
          width: 100%; 
          font-size:16px; 
        }
        .attr-name{
          display:inline-block; 
          width:45%; 
          text-align: right; 
          padding-right:20px; 
          padding-bottom:10px;
        }
        .attr-value{
          display:inline-block; 
          width:45%; 
          text-align: left; 
          padding-bottom:10px;
        }
        .share-code-block{
          padding: 20px 50px; 
          border-top: 1px solid; 
          text-align: center;
        }
        .share-text{
          font-size:14px; 
          font-weight: 700; 
          color: #000000;
        }
        .share-code-btn{
          width: 100px; 
          padding: 10px 20px; 
          color: #ffffff; 
          font-size:16px; 
          font-weight: 700; 
          border-radius: 5px; 
          background-color: #ef3c31; 
          margin: 0 auto;
        }
        .email-footer{
          width: 100%; 
          display:block; 
          margin: 0 auto; 
          text-align: center;
        }
        .email-footer-img{
          display:inline-block; 
          margin: 0 10px;
        }
        .happy-vyapar{
          font-size:20px; 
          text-align: center;
        }

        @media all and (max-width:300px) and (max-width:768px) {
          .company-name{
            font-size:13px !important;
          }
          .company-address{
            font-size:13px !important; 
          } 
          .transaction-head{
            font-size:16px !important;
          }
          .transaction-det-font{
            font-size:13px !important; 
          }
        }
    </style>
		</head>
		<body style="font-family: 'Roboto';">
			<div class="payment-email-success">
				<div class="email-header">
					<div class="header-left">
						
					</div>
				
				</div>
				<div class="payment-mid-block">
					<div class="success-img">
						<img src="https://s3-us-west-2.amazonaws.com/vyapar-web-image/success-tick.png" />
					</div>
					<p class="transaction-head">Payment Successfull</p>
					<div class="transaction-detail-block">
						
						
					</div>
				</div>
        
					</div>
				</body>
			</html>
</body>
</html>