<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
<p>Tasks</p>
<g:collect in="${taskList}" expr="it.name">
    <p>TaskName: ${it}</p>
</g:collect>
</body>
</html>