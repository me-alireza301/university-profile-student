<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<%@ taglib prefix='sec' uri='http://www.springframework.org/security/tags' %>

<!DOCTYPE html>
<!--[if lt IE 7 ]><html lang="en" class="ie6 ielt7 ielt8 ielt9"><![endif]--><!--[if IE 7 ]><html lang="en" class="ie7 ielt8 ielt9"><![endif]--><!--[if IE 8 ]><html lang="en" class="ie8 ielt9"><![endif]--><!--[if IE 9 ]><html lang="en" class="ie9"> <![endif]--><!--[if (gt IE 9)|!(IE)]><!-->
<html lang="<spring:message code='language'/>"><!--<![endif]-->
<head>
    <title>UPS</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Le styles -->
    <link href="${pageContext.request.contextPath}/pages/css/ui-panel/bootstrap.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/pages/css/ui-panel/mes-admin.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/pages/css/ui-panel/bootstrap-responsive.css" rel="stylesheet">

    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
</head>

<body>

<div class="navbar navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container-fluid">
            <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </a>
            <a class="brand" href="#">UPS</a>
            <div class="nav-collapse">
                <ul class="nav pull-right">
                    <li class="divider-vertical"></li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="icon-cog"></i> Setting <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">User Profil</a></li>
                            <li><a href="#">Preference</a></li>
                            <li><a href="#">Delete Cookies</a></li>
                            <li class="divider"></li>
                            <li><a href="#">Separated link</a></li>
                        </ul>
                    </li>
                    <li class="divider-vertical"></li>
                    <li class="gravatar"><a href="profile.html"></a></li>
                    <li class="dropdown">
                        <a href="" class="dropdown-toggle" data-toggle="dropdown">${fullNameUser} <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li><a href="profile.html"><i class="icon-user"></i> Profile</a></li>
                            <li class="divider"></li>
                            <li><a href=<c:url value='/j_spring_security_logout'/>><i class="icon-off"></i> Sign Out</a></li>
                        </ul>
                    </li>
                </ul>
            </div><!--/.nav-collapse -->
        </div>
    </div>
</div>