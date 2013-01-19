<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="<spring:message code='language'/>">
<head>
    <meta charset="utf-8">
    <title>UPS</title>
    <link href="${pageContext.request.contextPath}/pages/css/bootstrap.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/pages/css/bootstrap-responsive.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/pages/css/style.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/pages/css/typica-login.css" rel="stylesheet" />

    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

</head>

<body>

<div class="navbar navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container">
            <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </a>
            <a class="brand" href="${pageContext.request.contextPath}"><img src="${pageContext.request.contextPath}/pages/img/logo.png" alt="UPS - University Profile Student"></a>

            <%--<c:if test="${isAuthentication}" >--%>
                <%--<p><img src="${pageContext.request.contextPath}/pages/img/user-passport.png"> ${fullNameUser}</p>--%>
            <%--</c:if>--%>
            <%--<c:if test="${!isAuthentication}" >--%>
                <div style="float: right;">
                    <a href="?lang=en"><img src="${pageContext.request.contextPath}/pages/img/en.png" style="margin-top: 15px;" /></a>
                    <a href="?lang=ru"><img src="${pageContext.request.contextPath}/pages/img/ru.png" style="margin-top: 15px;" /></a>
                    <a href="?lang=uk"><img src="${pageContext.request.contextPath}/pages/img/uk.png" style="margin-top: 15px;" /></a>
                </div>
            <%--</c:if>--%>



        </div>
    </div>
</div>


