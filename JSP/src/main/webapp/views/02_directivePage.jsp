<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList, java.util.Date" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>2. JSP 지시어 - page</title>
</head>
<body>
    <h1>page 지시어</h1>

    <%
        ArrayList<String> list = new ArrayList<>();
        list.add("Servlet");
        list.add("JSP");

        Date today = new Date();
    %>

    <h3>0번째 인덱스 : <%=list.get(0)%></h6>
    <h3>현재 날짜 및 시간 : <%=today%></h6>
</body>
</html>