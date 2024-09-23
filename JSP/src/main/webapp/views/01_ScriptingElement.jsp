<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>1. JSP 스크립트 원소</title>
</head>
<body>
    <h1>스크립팅 원소</h1>

    <!-- HTML 주석 : 개발자도구 탭에 노출 -->
    <%-- JSP 주석 : 개발자도구 탭에 노출X --%>

    <%
        // 스크립틀릿 : 해당영역에 일반적인 자바코드를 작성 (변수 선언 및 초기화, 제어문 등)
        int sum = 0;
        for(int i = 1; i <= 100; i++) {
            sum += i;
        }
    %>

    <p>
        JSP 변수값을 화면으로 출력 <br>
        1) 스크립틀릿 이용 : <% out.println(sum); %> <br>
        2) 표현식(출력식) 이용 : <%=sum%> <br>
    </p>

    <% String[] nameArr = {"홍길동", "흥부", "심청"}; %>

    <h5>배열의 길이 : <%=nameArr.length%></h5>
    <h5>배열에 담긴 값 : <%=String.join(",", nameArr)%></h5>

    <h4>반복문을 통해서 HTML 요소를 반복적으로 화면에 출력할 수 있다.</h4>
    <ul>
        <% for(int i = 0; i < nameArr.length; i++) { %>
            <li><%=nameArr[i]%></li>
        <%
            }
            for(String name : nameArr) {
        %>
            <li><%=name%></li>
        <% } %>
    </ul>
</body>
</html>