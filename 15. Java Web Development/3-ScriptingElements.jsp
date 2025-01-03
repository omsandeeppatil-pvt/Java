<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%-- Declaration: Define variables or methods --%>
<%! int addNumbers(int a, int b) {
    return a + b;
} %>

<html>
<body>
    <%-- Scriptlet: Embed Java code --%>
    <% 
        int num1 = 10;
        int num2 = 20;
        int sum = addNumbers(num1, num2);
    %>
    <h1>Sum of <%= num1 %> and <%= num2 %> is: <%= sum %></h1>
</body>
</html>
