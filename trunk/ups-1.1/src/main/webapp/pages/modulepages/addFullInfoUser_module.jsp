<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<div class="container-fluid">
    <div class="row-fluid">
        <div class="span12">
            <div class="row-fluid">
                <div class="span12 box">
                    <div class="box-head">
                        <h3>Feed</h3>
                    </div>
                    <div class="box-content">
                        <div class="content-inner">
                            <div class="row">
                                <div class="span3"></div>
                                <div class="span6">
                                    <h3>Who are you? ${hhh}</h3>
                                    <hr />
                                </div>
                            </div>
                            <div class="row">
                                <div class="span3">
                                    <center>
                                        <a href="?lang=en"><img src="${pageContext.request.contextPath}/pages/img/en.png" style="margin-top: 15px;" /></a>
                                        <a href="?lang=ru"><img src="${pageContext.request.contextPath}/pages/img/ru.png" style="margin-top: 15px;" /></a>
                                        <a href="?lang=uk"><img src="${pageContext.request.contextPath}/pages/img/uk.png" style="margin-top: 15px;" /></a>
                                    </center>
                                </div>
                                <div class="span6">
                                    <form:form action="feed/authority.html" method="POST">
                                        <form:label path="authority" >Please, select who are you?</form:label>
                                        <form:select path="authority"
                                                     items="${allRoles}"
                                                     itemValue="id"
                                                     itemLabel="name"/> <br />
                                        <input class="btn" type="submit" value="Next" />
                                    </form:form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>