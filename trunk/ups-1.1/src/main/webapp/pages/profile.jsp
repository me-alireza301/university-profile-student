<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="viewtemplates/header.jsp" />

<div class="container-fluid">
    <div class="row-fluid">
        <div class="span2">
            <jsp:include page="modulepages/menu_module.jsp" />
        </div>

        <div class="span10">
            <div class="row-fluid">
                <div class="span12 box">
                    <div class="box-head">
                        <h3>Profile</h3>
                    </div>
                    <div class="box-content">
                        <div class="content">


                            <div class="row-fluid">
                                <div class="span9 logo">
                                    <h1><a href="#">Your Name</a> </h1>
                                </div>

                            </div>
                            <hr>
                            <div class="row ">
                                <div class="span4">
                                    <div class="well sidebar-nav">
                                        <a href="#" class="thumbnail">
                                            <img src="img/photo.png" alt="">
                                        </a>
                                        <hr>
                                        <address>
                                            <i class="icon-home"></i> 1234 main St. <br>
                                            <i class="icon-map-marker"></i> Anytown, XX 12345 <br>
                                            <i class="icon-signal"></i> (555)123-4567 <br>
                                            <i class="icon-envelope"></i> name@domainname.com <br>
                                        </address>
                                        <hr>
                                        <ul class="nav nav-list">
                                            <li class="active"><a href="javascript:"><i class="icon-white icon-tag"></i> Skills</a></li>
                                        </ul>
                                        <br>
                                        <!--Skill-->
                                        <div class="row">
                                            <div class="span1">
                                                <span class="label ">PHP</span>
                                            </div><!--/span1-->
                                            <div class="progress">
                                                <div class="bar" style="width: 88%"></div>
                                            </div><!--/progress bar-->
                                        </div><!--/row-->
                                        <div class="row">
                                            <div class="span1">
                                                <span class="label ">HTML</span>
                                            </div><!--/span1-->
                                            <div class="progress">
                                                <div class="bar" style="width: 90%"></div>
                                            </div><!--/progress bar-->
                                        </div><!--/row-->
                                        <div class="row">
                                            <div class="span1">
                                                <span class="label ">JS</span>
                                            </div><!--/span1-->
                                            <div class="progress">
                                                <div class="bar" style="width: 75%"></div>
                                            </div><!--/progress bar-->
                                        </div><!--/row-->
                                        <div class="row">
                                            <div class="span1">
                                                <span class="label ">CSS</span>
                                            </div><!--/span1-->
                                            <div class="progress">
                                                <div class="bar" style="width: 70%"></div>
                                            </div><!--/progress bar-->
                                        </div><!--/row-->
                                        <!--/Skill-->
                                        <hr>
                                        <!-- Quick Contact form -->
                                        <ul class="nav nav-list">
                                            <li class="active"><a href="javascript:"><i class="icon-white icon-envelope"></i> Quick Contact Form</a></li>
                                        </ul>
                                        <form class="contact">
                                            <br>
                                            <label><strong>Name :</strong></label>
                                            <input type="text" placeholder="Name ..." class="">
                                            <label><strong>E-Mail :</strong></label>
                                            <input type="text" placeholder="E-Mail ..." class="">
                                            <label><strong>Message :</strong></label>
                                            <textarea class="" id="textarea" rows="3"></textarea>
                                            <br>
                                            <button class="btn" type="submit"><i class="icon-envelope"></i> Submit</button>
                                        </form>
                                        <!-- /Quick Contact form -->
                                    </div><!--/.well -->
                                </div><!--/span-->


                            </div><!--/row-->

                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

</div>

<jsp:include page="viewtemplates/footer.jsp" />