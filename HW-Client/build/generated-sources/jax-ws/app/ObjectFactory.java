
package app;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the app package. 
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

    private final static QName _CumprimentarResponse_QNAME = new QName("http://app/", "cumprimentarResponse");
    private final static QName _Cumprimentar_QNAME = new QName("http://app/", "cumprimentar");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: app
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CumprimentarResponse }
     * 
     */
    public CumprimentarResponse createCumprimentarResponse() {
        return new CumprimentarResponse();
    }

    /**
     * Create an instance of {@link Cumprimentar }
     * 
     */
    public Cumprimentar createCumprimentar() {
        return new Cumprimentar();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CumprimentarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://app/", name = "cumprimentarResponse")
    public JAXBElement<CumprimentarResponse> createCumprimentarResponse(CumprimentarResponse value) {
        return new JAXBElement<CumprimentarResponse>(_CumprimentarResponse_QNAME, CumprimentarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cumprimentar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://app/", name = "cumprimentar")
    public JAXBElement<Cumprimentar> createCumprimentar(Cumprimentar value) {
        return new JAXBElement<Cumprimentar>(_Cumprimentar_QNAME, Cumprimentar.class, null, value);
    }

}
