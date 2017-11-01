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

</form:form>


</body>
</html>
