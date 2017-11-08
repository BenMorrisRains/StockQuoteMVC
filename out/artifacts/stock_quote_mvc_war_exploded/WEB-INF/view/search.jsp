<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
    <title>Stock Quote Query</title>

    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/style.css">

    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
</head>
<body>

<div id="wrapper">
    <div id="header">
        <h2>Easy Quote Query</h2>
    </div>
</div>
<div id="container">
    <html>
    <body>
    <h2>Search for Stock</h2>

    <form:form action="doSearch" method="post" modelAttribute="stockQuote">

        Symbol: <input id="symbol" type="search" name="searchText"/><br/>

        <br><br>

        <input type="submit" name="action" value="search"/>



    </form:form>

    <br><br>

    <h2>Found Stocks</h2>
    <table border="1">
        <th>Symbol</th>
        <th>Price</th>
        <th>Date</th>
        <c:forEach items="${stockQuote}" var="stock">
            <tr>
                <td>${stock.symbol}</td>
                <td>${stock.price}</td>
                <td>${stock.date}</td>
            </tr>
        </c:forEach>
    </table>



    </body>
    </html>
</div>

</body>
</html>