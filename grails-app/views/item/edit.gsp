<html>
    <body>
        <g:link action="index">Back</g:link>
        <g:form name="saveEdit" action="saveEdit">
            <g:hiddenField name="id" value="${item.id}"/>
            <g:textField name="itemName" value="${item.name}" />
            <g:field type="number" name="itemCost" value="${item.cost}"/>
            <g:actionSubmit value="Save"  action="saveEdit"/>
            <g:actionSubmit value="Cancel"  action="index"/>
        </g:form>
    </body>
</html>