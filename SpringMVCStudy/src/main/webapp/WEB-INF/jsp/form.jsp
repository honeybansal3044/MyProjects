<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<form:form modelAttribute="customer">
	<table>
		<tr>
			<td>Customer Id:</td>
			<td><form:input path="id"/></td>
		</tr>
		<tr>
			<td>Customer Name:</td>
			<td><form:input path="name"/></td>
		</tr>
		<tr>
			<td>Customer City:</td>
			<td><form:input path="city"/></td>
		</tr>
		<tr>
            <td colspan="2">
                <input type="submit" value="Save Changes"/>
            </td>
        </tr>
	</table>
</form:form>