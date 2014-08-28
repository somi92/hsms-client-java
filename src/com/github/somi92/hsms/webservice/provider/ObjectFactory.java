
package com.github.somi92.hsms.webservice.provider;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.github.somi92.hsms.webservice.provider package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAllActions_QNAME = new QName("http://provider.webservice.hsms.somi92.github.com/", "getAllActions");
    private final static QName _GetActionsByPriorityResponse_QNAME = new QName("http://provider.webservice.hsms.somi92.github.com/", "getActionsByPriorityResponse");
    private final static QName _GetActionsByPriority_QNAME = new QName("http://provider.webservice.hsms.somi92.github.com/", "getActionsByPriority");
    private final static QName _GetAllActionsResponse_QNAME = new QName("http://provider.webservice.hsms.somi92.github.com/", "getAllActionsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.github.somi92.hsms.webservice.provider
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetActionsByPriority }
     * 
     */
    public GetActionsByPriority createGetActionsByPriority() {
        return new GetActionsByPriority();
    }

    /**
     * Create an instance of {@link GetAllActionsResponse }
     * 
     */
    public GetAllActionsResponse createGetAllActionsResponse() {
        return new GetAllActionsResponse();
    }

    /**
     * Create an instance of {@link GetActionsByPriorityResponse }
     * 
     */
    public GetActionsByPriorityResponse createGetActionsByPriorityResponse() {
        return new GetActionsByPriorityResponse();
    }

    /**
     * Create an instance of {@link GetAllActions }
     * 
     */
    public GetAllActions createGetAllActions() {
        return new GetAllActions();
    }

    /**
     * Create an instance of {@link Hsms }
     * 
     */
    public Hsms createHsms() {
        return new Hsms();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllActions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://provider.webservice.hsms.somi92.github.com/", name = "getAllActions")
    public JAXBElement<GetAllActions> createGetAllActions(GetAllActions value) {
        return new JAXBElement<GetAllActions>(_GetAllActions_QNAME, GetAllActions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActionsByPriorityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://provider.webservice.hsms.somi92.github.com/", name = "getActionsByPriorityResponse")
    public JAXBElement<GetActionsByPriorityResponse> createGetActionsByPriorityResponse(GetActionsByPriorityResponse value) {
        return new JAXBElement<GetActionsByPriorityResponse>(_GetActionsByPriorityResponse_QNAME, GetActionsByPriorityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActionsByPriority }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://provider.webservice.hsms.somi92.github.com/", name = "getActionsByPriority")
    public JAXBElement<GetActionsByPriority> createGetActionsByPriority(GetActionsByPriority value) {
        return new JAXBElement<GetActionsByPriority>(_GetActionsByPriority_QNAME, GetActionsByPriority.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllActionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://provider.webservice.hsms.somi92.github.com/", name = "getAllActionsResponse")
    public JAXBElement<GetAllActionsResponse> createGetAllActionsResponse(GetAllActionsResponse value) {
        return new JAXBElement<GetAllActionsResponse>(_GetAllActionsResponse_QNAME, GetAllActionsResponse.class, null, value);
    }

}
