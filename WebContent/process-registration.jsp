<jsp:useBean id="user" class="com.wellnwill.jm2009.learn.model.User">
</jsp:useBean>
<jsp:setProperty property="*" name="user"/>
<jsp:setProperty property="typeOfUser" name="user" value="ADMIN" />
${user}