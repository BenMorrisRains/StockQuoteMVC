<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Stock Quote Query</title>
    <!-- CSS -->
    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/style.css">

    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
    <!-- End CSS -->

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

    <p>Currently, you are limited to Google("GOOG"), Amazon("AMZN"), or PayPal("PYPL"). All dates must be entered
    in the following sytle "yyyy-MM-dd". Try entering GOOG for the symbol, 2004-01-01 for the From Date, and 2004-08-01
    for the Until Date. </p>

    <form:form action="doSearch" method="post" modelAttribute="stockQuote">
        <table>
            <tr>
                <td>Symbol:</td>
            </tr>
            <tr>
                <td><input id="symbol" type="text" name="searchText"/></td>
            </tr>
            <tr>
                <td>From Date:</td>
            </tr>
            <tr>
            <td><input id="fromDate" type="text" name="fromDate"/></td>
            </tr>
            <tr>
                <td>Until Date</td>
            </tr>
            <tr>
            <td><input id="untilDate" type="text" name="untilDate"/></td>
            </tr>
        </table>
        <br><br>

        <input type="submit" name="action" value="search"/>

    </form:form>

    <p>View the complete list of stocks: <a href="/stockQuote/list">Complete List</a></p>

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