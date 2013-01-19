<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<jsp:include page="viewtemplates/header-wellcome-page.jsp" />

<div class="container">

    <div id="register-wraper">
        <form:form method="post" action="registration.html" id="register-form" cssClass="form" >
            <legend><spring:message code='reg.titleRegister'/> <span class="blue">UPS</span></legend>

            <div class="body">

                <div class="control-group control-inline">
                    <form:label path="firstname"><spring:message code='reg.firstname'/></form:label>
                    <form:input path="firstname" placeholder="First name" size="20" cssClass="input-medium" />
                </div>

                <div class="control-group control-inline">
                    <form:label path="lastname"><spring:message code='reg.lastname'/></form:label>
                    <form:input path="lastname" placeholder="Last name" size="20" cssClass="input-medium" />
                </div>

                <form:label path="email">E-mail</form:label>
                <form:input path="email" placeholder="E-mail" size="20" cssClass="input-huge" />

                <form:label path="password"><spring:message code='login.password'/></form:label>
                <form:password path="password" placeholder="Password" size="30" cssClass="input-huge" />

            </div>

            <div class="footer">
                <label class="checkbox inline">
                    <input type="checkbox" id="inlineCheckbox1" value="option1"> I agree to something I will never read
                </label>
                <button type="submit" class="btn btn-success"><spring:message code='reg.buttonRegistration'/></button>
            </div>
        </form:form>
    </div>
</div>

<footer class="white navbar-fixed-bottom">
    Alread have an account? <a href="login.html" class="btn btn-black">Sign in</a>
</footer>

<jsp:include page="viewtemplates/footer-wellcome-page.jsp" />
