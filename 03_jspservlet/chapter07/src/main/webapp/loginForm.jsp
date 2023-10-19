<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
  <body>
    <div class="container">
    	<h1>
    	로그인 입력 화면
    	</h1>
    	<fieldset>
    	 <form action="loginInfo.jsp" method="post">
    	 <legend>로그인 폼</legend>
    	 <label for="userid">아이디</label>
    	 <input type="text" name="userid"><br>
    	 <label for="password">패스워드</label>
    	 <input type="password" name="password"><br>
    	 <input type="submit" value="전송">
    	</form>
    	</fieldset>
    </div>
  </body>
<%@ include file="footer.jsp" %>