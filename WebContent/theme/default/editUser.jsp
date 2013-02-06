<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="common/header.jsp"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div>asdfasdf
	<form:form method="post" commandName="user">
	<p>
		用户名：<form:input path="name"/>
	</p>
	<p>
		密码：<form:input path="pwd" />
	</p>
	<p>
		<input type="submit" align="center" value="保存" />
	</p>
	</form:form>
</div>

<%@include file="common/footer.jsp"%>