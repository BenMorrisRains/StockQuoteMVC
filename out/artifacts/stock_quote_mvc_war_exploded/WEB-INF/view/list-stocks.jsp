<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<head>
    <title>List stocks</title>

    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
    <div id="wrapper">
        <div id="header">
            <h2>Stock Quote Query Engine</h2>
        </div>
    </div>

<div id="container">
    <div id="content">

    <table>
        <tr>
            <th>Symbol</th>
            <th>Price</th>
            <th>Date</th>
        </tr>

        <c:forEach var="tempStockQuotes" items="${stockQuote1}">

        <tr>
            <td>${tempStockQuotes.symbol}</td>
            <td>${tempStockQuotes.price}</td>
            <td>${tempStockQuotes.date}</td>
        </tr>

        </c:forEach>

    </table>




    </div>
</div>
</body>
</html>
