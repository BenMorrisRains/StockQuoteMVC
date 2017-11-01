<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <title>Stock Quote Query</title>
</head>
<body>
<h1>Easy Stock Quote Query</h1>

<form:form action="processForm" modelAttribute="stock">

    Stock symbol: <form:input path="symbol" /> <!--Property of the StockQuote class -->
    Date from: <form:input path="from" />
    Date to:  <form:input path ="to" />
    Interval: <form:input path="interval" />

    <input type="submit" value="Submit" />

</form:form>


</body>
</html>
