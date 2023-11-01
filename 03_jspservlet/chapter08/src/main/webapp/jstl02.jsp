<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ include file="header.jsp"%>
<body>
	<div class="container">
		<h1>c:if 태그</h1>

		<c:set var="myColor" value="파랑" />
		<c:if test="${myColor == '빨강' }">
    		색상은 빨강색이다.
    	</c:if>
		<c:if test="${myColor != '빨강' }">
    		색상은 빨강색이 아닙니다.
    	</c:if>

		<h1>c:choose 태그</h1>

		<c:set var="grade" value="90" />
		<c:choose>
			<c:when test="${grade >= 90 }">
    		학점은 A이다.
    	</c:when>
			<c:when test="${grade >= 80 }">
    		학점은 B이다.
    	</c:when>
			<c:when test="${grade >= 70 }">
    		학점은 C이다.
    	</c:when>
			<c:otherwise>
    		학점은 F이다.
    	</c:otherwise>
		</c:choose>

	</div>
</body>
<%@ include file="footer.jsp"%>