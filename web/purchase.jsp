<%-- 
    Document   : login
    Created on : Apr 27, 2024, 1:05:43 PM
    Author     : Asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="/css/purchase.css" rel="stylesheet"type="text/css">
    </head>
    <style>
        #purchase_details{
            background-color: gray;
            width: 400px;
            display: flex;
            flex-direction: column;
            border-radius: 15px;
        }
        .inputs{
            padding: 10px;
            margin: 10px;
            background-color: #faf2cc;
            border: 2px solid gray;
        }
        #h3{
            padding-left:15px; 
            color: white;
            font-size: 15px;
        }
        .place_Order{
            padding: 10px;
            margin: 10px;
            background-color: #faf2cc;
            border: 2px solid gray;
            width: 350px;
            margin-left: 25px;
        }
    </style>
    <body>
        <div id="purchase_details">
            <h3 id="h3">Personal Details</h3>
            <input class="inputs" type="text" placeholder="First Name"/>
            <input class="inputs" type="text" placeholder="Last Name"/>
            <input class="inputs" type="text" placeholder="Address"/>
            <input class="inputs" type="text" placeholder="City"/>
            <input class="inputs" type="number" placeholder="Pincode"/>
            <input class="inputs" type="text" placeholder="State"/>
            <select Class="inputs">
                <option>
                    Select payment method
                </option>
                <option>
                    Credit Card
                </option>
                <option>
                    UPI (Google pay, Phone Pay) 
                </option>
                <option>
                    Cash On Delivery
                </option>
                <option>
                    Net banking
                </option>
            </select>
        </div>
           <button class="place_Order">
                Place Order
            </button>
    </body>
</html>
