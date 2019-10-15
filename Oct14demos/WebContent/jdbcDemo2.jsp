<%@ taglib prefix="sql" uri="http://java.sun.com/jstl/sql_rt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
<head>
<title>Updating a database using the sql:update tag</title>
<sql:setDataSource var="dataSource" driver="com.mysql.jdbc.Driver"
url="jdbc:mysql://localhost:3306/dxc"
scope="session" user="root" password="root" />

</head>
<body>
<h1>Modify Address List</h1>
<sql:update dataSource="${dataSource}" var="abc">
    INSERT INTO student (Roll, Name, Adress, Marks) VALUES (?, ?, ?, ?)
    <sql:param value='${param.roll}'/>
    <sql:param value='${param.name}'/>
    <sql:param value='${param.address}'/>
    <sql:param value='${param.marks}'/>
</sql:update>
</body>
</html>
