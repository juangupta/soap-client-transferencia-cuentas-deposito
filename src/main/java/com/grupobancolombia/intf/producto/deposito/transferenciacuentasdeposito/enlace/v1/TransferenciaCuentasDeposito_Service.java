
package com.grupobancolombia.intf.producto.deposito.transferenciacuentasdeposito.enlace.v1;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "TransferenciaCuentasDeposito", targetNamespace = "http://grupobancolombia.com/intf/Producto/Deposito/TransferenciaCuentasDeposito/Enlace/V1.0", wsdlLocation = "classpath:/wsdl/TransferenciaCuentasDeposito_V1.0.wsdl")
public class TransferenciaCuentasDeposito_Service
    extends Service
{

    private final static URL TRANSFERENCIACUENTASDEPOSITO_WSDL_LOCATION;
    private final static WebServiceException TRANSFERENCIACUENTASDEPOSITO_EXCEPTION;
    private final static QName TRANSFERENCIACUENTASDEPOSITO_QNAME = new QName("http://grupobancolombia.com/intf/Producto/Deposito/TransferenciaCuentasDeposito/Enlace/V1.0", "TransferenciaCuentasDeposito");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("classpath:/wsdl/TransferenciaCuentasDeposito_V1.0.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TRANSFERENCIACUENTASDEPOSITO_WSDL_LOCATION = url;
        TRANSFERENCIACUENTASDEPOSITO_EXCEPTION = e;
    }

    public TransferenciaCuentasDeposito_Service() {
        super(__getWsdlLocation(), TRANSFERENCIACUENTASDEPOSITO_QNAME);
    }

    public TransferenciaCuentasDeposito_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), TRANSFERENCIACUENTASDEPOSITO_QNAME, features);
    }

    public TransferenciaCuentasDeposito_Service(URL wsdlLocation) {
        super(wsdlLocation, TRANSFERENCIACUENTASDEPOSITO_QNAME);
    }

    public TransferenciaCuentasDeposito_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TRANSFERENCIACUENTASDEPOSITO_QNAME, features);
    }

    public TransferenciaCuentasDeposito_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TransferenciaCuentasDeposito_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TransferenciaCuentasDeposito
     */
    @WebEndpoint(name = "TransferenciaCuentasDepositoHttpPort")
    public TransferenciaCuentasDeposito getTransferenciaCuentasDepositoHttpPort() {
        return super.getPort(new QName("http://grupobancolombia.com/intf/Producto/Deposito/TransferenciaCuentasDeposito/Enlace/V1.0", "TransferenciaCuentasDepositoHttpPort"), TransferenciaCuentasDeposito.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TransferenciaCuentasDeposito
     */
    @WebEndpoint(name = "TransferenciaCuentasDepositoHttpPort")
    public TransferenciaCuentasDeposito getTransferenciaCuentasDepositoHttpPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://grupobancolombia.com/intf/Producto/Deposito/TransferenciaCuentasDeposito/Enlace/V1.0", "TransferenciaCuentasDepositoHttpPort"), TransferenciaCuentasDeposito.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TRANSFERENCIACUENTASDEPOSITO_EXCEPTION!= null) {
            throw TRANSFERENCIACUENTASDEPOSITO_EXCEPTION;
        }
        return TRANSFERENCIACUENTASDEPOSITO_WSDL_LOCATION;
    }

}
