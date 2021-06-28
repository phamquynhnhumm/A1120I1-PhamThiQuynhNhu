<%--
  Created by IntelliJ IDEA.
  User: nhu
  Date: 6/23/2021
  Time: 12:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<header class="row">
    <div class="col-sm-8 shopping-mall">
        <img class="avatar" src="img/avatar_1.jpg" width="60px" height="60px">
    </div>
    <div>
    <%
        if(session.getAttribute("ten") != null){
    %>
    <h2>Tài Khoản: <strong><%=session.getAttribute("ten") %></strong> </h2>
    <%} %>
    <%
        if(session.getAttribute("quyen") != null){
    %>
    <h6>Quyền: <strong><%=session.getAttribute("quyen") %></strong> </h6>
    <%} %>
    </div>
</header>