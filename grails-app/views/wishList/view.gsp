<html>
    <body>
        <g:link action="index">Back</g:link>
        <h1>${wishList}</h1>
        <g:link action="empty" params="[wishListId: wishList.id]">
            Empty
        </g:link>
        <g:link action="deleteWishList" params="[wishListId: wishList.id]">
            Delete
        </g:link>
        <table border="1">
            <g:each in ="${wishList.items}" status="i" var="item">
                <tr>
                    <td>
                        <g:link action="view" params="[id: item.id]">
                            ${item.name}
                        </g:link>
                    </td>
                    <td>${item.cost}</td>
                    <td>
                        <g:link action="removeItem" params="[wishListId: wishList.id, itemId: item.id]">
                            Remove
                        </g:link>
                    </td>
                </tr>
            </g:each>
        </table>
    </body>
</html>