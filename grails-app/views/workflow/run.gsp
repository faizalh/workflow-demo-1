<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>
<body>
<p>This page shows the running instance of a process.</p>
<p>Process Instance id: ${processInstance.id}. See <g:link params="[processId: processInstance.id]" action="tasks">Tasks</g:link> </p>
</body>
</html>