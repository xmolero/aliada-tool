<%@ page contentType="text/html;charset=UTF-8" language="java"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="html"%>
<ul class="breadcrumb">
	<span class="breadCrumb"><html:text name="home"/></span>
	<li><span class="breadcrumb activeGreen"><html:text name="organisation.title"/></span></li>
	<li><span class="breadcrumb"><html:text name="manage.title"/></span></li>
	<li><span class="breadcrumb"><html:text name="conversion.title"/></span></li>
	<li><span class="breadcrumb"><html:text name="linking.title"/></span></li>
</ul>
<div id="institutionPage">
	<html:form id="institutionConfiguration" action="/editInstitution.action"
		enctype="multipart/form-data">
	<div class="content form">
		<table class="pad10">
			<tr>
				<td colspan="2"><html:textfield theme="xhtml"
						key="organisationName"
						cssClass="inputPage disabled" size="15" readonly="true"/></td>
			</tr>
			<tr>
				<td><html:file theme="xhtml" key="organisationLogo" /></td>
			</tr>
			<tr>
				<td colspan="2"><html:textfield theme="xhtml"
						key="organisationCatalogUrl"
						cssClass="inputPage" size="15" /></td>
			</tr>
		</table>
		<html:actionmessage/>
		<html:submit action="editInstitution" property="saveButton"
			cssClass="leftMargin submitButton buttonGreen" key="edit" />
	</div>	
	<div id="submitButtons" class="buttons row">
		<html:form id="submitButtonsForm">
			<html:submit action="showUsers" property="usersButton"
				cssClass="submitButton button" key="users" />
			<html:submit action="manage" cssClass="fright submitButton button"
				key="next" />
		</html:form>
	</div>
	</html:form>
</div>

