<html>
    <body>
        <g:link controller="home" action="index">Back</g:link>
        <h1>Cart</h1>
        <g:link action="empty">
            Empty
        </g:link>
        <table border="1">
            <g:each in ="${itemList}" status="i" var="item">
                <tr>
                    <td>
                        <g:link controller="item" action="view" params="[id: item.id]">
                            ${item.name}
                        </g:link>
                    </td>
                    <td>${item.cost}</td>
                    <td>
                        <g:link action="remove" params="[id: item.id]">
                            Remove
                        </g:link>
                    </td>
                </tr>
            </g:each>
        </table>
    </body>
</html>