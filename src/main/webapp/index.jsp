<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" 
          xmlns:f="http://java.sun.com/jsf/core" 
          xmlns:h="http://java.sun.com/jsf/html" 
          xmlns:ice="http://www.icesoft.com/icefaces">
    <jsp:directive.page contentType="text/html;charset=UTF-8" />
    <jsp:directive.page language="java" />
    
    <html>
    <head>
        <title>Spring Pet Clinic</title>
        <h:outputStylesheet name="css/styles.css" />
    </head>
    <body>
        <h:form>
            <h:outputText value="Welcome to the Spring Pet Clinic!" />
            <h:commandLink value="View Owners" action="petclinic/ownerList.xhtml" />
            <h:commandLink value="View Pets" action="petclinic/petList.xhtml" />
            <h:commandLink value="View Vets" action="petclinic/vetList.xhtml" />
        </h:form>
    </body>
    </html>
</jsp:root>