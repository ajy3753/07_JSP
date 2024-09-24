<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <style>
        .outer{
            background: black;
            color: white;
            width: 1000px;
            margin: auto;
            margin-top: 50px;
            padding: 10px 0 50px 0px;
        }

        .list-area {
            max-width: 850px;
            margin: auto;
        }

        .thumbnail {
            display: inline-block;
        }
    </style>
</head>
<body>
    <%@ include file="../common/menubar.jsp" %>

    <div class="outer">
        <br>
        <h2 align="center">사진 게시판</h2>
        <br>

        <% if( loginUser != null ) { %>
	        <div align="right" style="width: 850px; margin-bottom: 4px;">
	        	<a href="<%=contextPath%>/enrollForm.bo" class="btn btn-sm btn-secondary">글쓰기</a>
	        </div>
        <% } %>

        <div class="list-area">
            <div class="thumbnail" align="center">
                <img src="">
            </div>
        </div>
    </div>
</body>
</html>