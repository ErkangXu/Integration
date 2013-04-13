<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>Post car information</title>
</head>
 
<body>
<h1>Post the information of the car you want to sell here</h1>
 
<h2>Add Car</h2>
<s:form action="addCarAction" >
  <s:textfield name="vin" label="Vin" value="" />
  <s:textfield name="model" label="model" value="" />
  <s:textfield name="make" label="make" value="" />
  <s:textfield name="mileage" label="mileage" value="" />
  <s:textfield name="price" label="price" value="" />
  <s:textfield name="sellerName" label="seller name" value="" />
  <s:textfield name="sellerPhoneNumber" label="seller phone number" value="" />
  <s:submit />
</s:form>

<a href="searchCars.html">Search your dream car!</a>

</body>
</html>
