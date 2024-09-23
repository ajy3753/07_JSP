<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>3. JSP 지시어 - include</title>
</head>
<body>
    <h1>Include 지시어</h1>

    <div style="border: 1px solid darkcyan">
        <%@ include file="01_ScriptingElement.jsp" %>
    </div>

    <h3>* include한 JSP 상에 선언 되어있는 변수를 가져다가 사용 가능</h3>
    <p>1부터 100까지의 총 합계 : <%=sum%></p>
</body>
</html>