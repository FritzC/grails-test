<html>
    <body>
        <g:link controller="home" action="index">Back</g:link>
        <g:if test="${isAdmin}">
            <g:link action="create">
                New
            </g:link>
        </g:if>
        <h1>Item List</h1>
        <table border="1">
            <g:each in ="${itemList}" status="i" var="item">
                <tr>
                    <td>
                        <g:link action="view" params="[id: item.id]">
                            ${item.name}
                        </g:link>
                    </td>
                    <td>${item.cost}</td>
                </tr>
            </g:each>
        </table>
    </body>
</html>