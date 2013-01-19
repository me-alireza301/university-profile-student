<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:include page="viewtemplates/header-wellcome-page.jsp" />

<div class="container">

    <div id="login-wraper">

        <form action="<c:url value='j_spring_security_check' />" method="post" class="form login-form">
            <legend><spring:message code='login.titleLogin'/> <span class="blue">UPS</span></legend>
            <div class="body">
                <div class="alert">
                    <button type="button" class="close" data-dismiss="alert">&times;</button>
                    <strong>Warning!</strong> ${message}
                </div>
                <label>E-mail</label>
                <input type="text" name="j_username" placeholder="e-mail" class="reg-input" size="64" value="steve@mail.com" />

                <label><spring:message code='login.password'/></label>
                <input type="password" name="j_password" placeholder="password" class="reg-input" size="30" value="1"/>
            </div>
            <div class="footer">
                <button type="submit" class="btn btn-success"><spring:message code='login.buttonLogin'/></button>
            </div>
        </form>

    </div>

</div>

<footer class="white navbar-fixed-bottom">
    <spring:message code='login.forRegister'/> <a href="registration.html" class="btn btn-black"><spring:message code='login.register'/></a>
</footer>

<jsp:include page="viewtemplates/footer-wellcome-page.jsp" />