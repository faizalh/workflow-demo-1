<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
<p>This page contains a list of process definitions.</p>
<table border="3">
    <tr>
        <th>Process Definition Key</th>
        <th>Action</th>
    </tr>
<g:collect in="${processDefinitions}" expr="it.key">
    <tr>
        <td>${it}</td>
        <td><g:link params="[processKey: it]" action="run">Run</g:link></td>
    </tr>
</g:collect>
</table>

</body>
</html>