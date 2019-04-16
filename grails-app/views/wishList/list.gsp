<html>
    <body>
        <g:link controller="home" action="index">Back</g:link>
        <h1>WishLists</h1>
        <g:form name="addWishListForm" action="addWishList">
            <g:textField name="wishListName" value="">  </g:textField>
            <g:actionSubmit value="Add WishList"  action="addWishList"/>
        </g:form>
        <table border="1">
            <g:each in ="${wishLists}" status="i" var="wishList">
                <tr>
                    <td>
                        <g:link action="view" params="[id: wishList.id]">
                            ${wishList.name}
                        </g:link>
                    </td>
                </tr>
            </g:each>
        </table>
    </body>
</html>