<html>
    <body>
        <g:link action="index">Back</g:link>
        <g:if test="${isAdmin}">
            <g:link action="delete" params="[id: item.id]">
                Delete
            </g:link>
            <g:link action="edit" params="[id: item.id]">
                Edit
            </g:link>
        </g:if>
        <h1>${item.name}</h1>
        <h3>$${item.cost}</h2>
        <g:form name="addToWishList" action="addToWishList">
            <g:hiddenField name="id" value="${item.id}"/>
            <g:actionSubmit value="Add to WishList"  action="addToWishList"/>
            <g:select name="wishListId" from="${wishLists}" optionKey="id"/>
        </g:form>
        <g:form name="addToCart" action="addToCart">
            <g:hiddenField name="id" value="${item.id}"/>
            <g:actionSubmit value="Add to Cart"  action="addToCart"/>
        </g:form>
    </body>
</html>