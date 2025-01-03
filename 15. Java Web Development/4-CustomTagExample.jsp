<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
    <c:forEach var="num" begin="1" end="5">
        <p>Number: ${num}</p>
    </c:forEach>
</body>
</html>
