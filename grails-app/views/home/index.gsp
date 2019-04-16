<html>
    <body>
        <h1>Home</h1>
        <g:if test="${session.user == null}">
            <g:form name="login" action="login">
                <g:textField name="username" value="" />
                <g:passwordField name="password" value="" />
                <g:actionSubmit value="Login"  action="login"/>
            </g:form>
        </g:if>
        <g:else>
            <g:link action="logout">Logout</g:link>
            <h2>Welcome ${session.user.username}</h2>
            <g:link controller="item" action="index">Items</g:link>
            <g:link controller="cart" action="index">Cart</g:link>
            <g:link controller="wishList" action="index">WishLists</g:link>
        </g:else>
    </body>
</html>