<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<%@ taglib prefix='sec' uri='http://www.springframework.org/security/tags' %>

<jsp:include page="viewtemplates/header.jsp" />

<sec:authorize ifNotGranted="ROLE_ANONYMOUS">
    <div class="container-fluid">
        <div class="row-fluid">
            <div class="span2">
                <jsp:include page="modulepages/menu_module.jsp" />
            </div>

            <div class="span10">
                <div class="row-fluid">
                    <div class="span12 box">
                        <div class="box-head">
                            <h3>Feed</h3>
                        </div>
                        <div class="box-content">
                            <div class="content-inner">
                                text
                            </div>
                        </div>
                    </div>
                </div>

            </div>
        </div>

        </div>
    </div>
</sec:authorize>

<sec:authorize ifAnyGranted="ROLE_ANONYMOUS">
    <jsp:include page="modulepages/addFullInfoUser_module.jsp" />
</sec:authorize>

<jsp:include page="viewtemplates/footer.jsp" />