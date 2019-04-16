<html>
    <body>
        <g:link action="index">Back</g:link>
        <g:form name="saveNew" action="saveNew">
            <g:textField name="itemName" value="" />
            <g:field type="number" name="itemCost" value=""/>
            <g:actionSubmit value="Save"  action="saveNew"/>
            <g:actionSubmit value="Cancel"  action="index"/>
        </g:form>
    </body>
</html>