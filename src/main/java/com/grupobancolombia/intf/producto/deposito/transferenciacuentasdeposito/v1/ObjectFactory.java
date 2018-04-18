
package com.grupobancolombia.intf.producto.deposito.transferenciacuentasdeposito.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.grupobancolombia.intf.producto.deposito.transferenciacuentasdeposito.v1 package. 
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

    private final static QName _BusinessException_QNAME = new QName("http://grupobancolombia.com/intf/Producto/Deposito/TransferenciaCuentasDeposito/V1.0", "businessException");
    private final static QName _TransferirEntreCuentasDepositoResponse_QNAME = new QName("http://grupobancolombia.com/intf/Producto/Deposito/TransferenciaCuentasDeposito/V1.0", "transferirEntreCuentasDepositoResponse");
    private final static QName _AnularTransferencias_QNAME = new QName("http://grupobancolombia.com/intf/Producto/Deposito/TransferenciaCuentasDeposito/V1.0", "anularTransferencias");
    private final static QName _SystemException_QNAME = new QName("http://grupobancolombia.com/intf/Producto/Deposito/TransferenciaCuentasDeposito/V1.0", "systemException");
    private final static QName _TransferirEntreCuentasDeposito_QNAME = new QName("http://grupobancolombia.com/intf/Producto/Deposito/TransferenciaCuentasDeposito/V1.0", "transferirEntreCuentasDeposito");
    private final static QName _AnularTransferenciasResponse_QNAME = new QName("http://grupobancolombia.com/intf/Producto/Deposito/TransferenciaCuentasDeposito/V1.0", "anularTransferenciasResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.grupobancolombia.intf.producto.deposito.transferenciacuentasdeposito.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AnularTransferencias }
     * 
     */
    public AnularTransferencias createAnularTransferencias() {
        return new AnularTransferencias();
    }

    /**
     * Create an instance of {@link SystemException }
     * 
     */
    public SystemException createSystemException() {
        return new SystemException();
    }

    /**
     * Create an instance of {@link TransferirEntreCuentasDepositoResponse }
     * 
     */
    public TransferirEntreCuentasDepositoResponse createTransferirEntreCuentasDepositoResponse() {
        return new TransferirEntreCuentasDepositoResponse();
    }

    /**
     * Create an instance of {@link BusinessException }
     * 
     */
    public BusinessException createBusinessException() {
        return new BusinessException();
    }

    /**
     * Create an instance of {@link AnularTransferenciasResponse }
     * 
     */
    public AnularTransferenciasResponse createAnularTransferenciasResponse() {
        return new AnularTransferenciasResponse();
    }

    /**
     * Create an instance of {@link TransferirEntreCuentasDeposito }
     * 
     */
    public TransferirEntreCuentasDeposito createTransferirEntreCuentasDeposito() {
        return new TransferirEntreCuentasDeposito();
    }

    /**
     * Create an instance of {@link IdentificacionClienteCuentaDestino }
     * 
     */
    public IdentificacionClienteCuentaDestino createIdentificacionClienteCuentaDestino() {
        return new IdentificacionClienteCuentaDestino();
    }

    /**
     * Create an instance of {@link InformacionCliente }
     * 
     */
    public InformacionCliente createInformacionCliente() {
        return new InformacionCliente();
    }

    /**
     * Create an instance of {@link InformacionOficina }
     * 
     */
    public InformacionOficina createInformacionOficina() {
        return new InformacionOficina();
    }

    /**
     * Create an instance of {@link InformacionClienteAnul }
     * 
     */
    public InformacionClienteAnul createInformacionClienteAnul() {
        return new InformacionClienteAnul();
    }

    /**
     * Create an instance of {@link IdentificacionCuenta }
     * 
     */
    public IdentificacionCuenta createIdentificacionCuenta() {
        return new IdentificacionCuenta();
    }

    /**
     * Create an instance of {@link InformacionTransaccionResp }
     * 
     */
    public InformacionTransaccionResp createInformacionTransaccionResp() {
        return new InformacionTransaccionResp();
    }

    /**
     * Create an instance of {@link IdentificacionCliente }
     * 
     */
    public IdentificacionCliente createIdentificacionCliente() {
        return new IdentificacionCliente();
    }

    /**
     * Create an instance of {@link InformacionCuenta }
     * 
     */
    public InformacionCuenta createInformacionCuenta() {
        return new InformacionCuenta();
    }

    /**
     * Create an instance of {@link IdentificacionTransaccion }
     * 
     */
    public IdentificacionTransaccion createIdentificacionTransaccion() {
        return new IdentificacionTransaccion();
    }

    /**
     * Create an instance of {@link InformacionTransaccionAnuResp }
     * 
     */
    public InformacionTransaccionAnuResp createInformacionTransaccionAnuResp() {
        return new InformacionTransaccionAnuResp();
    }

    /**
     * Create an instance of {@link InformacionTransaccion }
     * 
     */
    public InformacionTransaccion createInformacionTransaccion() {
        return new InformacionTransaccion();
    }

    /**
     * Create an instance of {@link InformacionSistema }
     * 
     */
    public InformacionSistema createInformacionSistema() {
        return new InformacionSistema();
    }

    /**
     * Create an instance of {@link InformacionClienteResp }
     * 
     */
    public InformacionClienteResp createInformacionClienteResp() {
        return new InformacionClienteResp();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://grupobancolombia.com/intf/Producto/Deposito/TransferenciaCuentasDeposito/V1.0", name = "businessException")
    public JAXBElement<BusinessException> createBusinessException(BusinessException value) {
        return new JAXBElement<BusinessException>(_BusinessException_QNAME, BusinessException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferirEntreCuentasDepositoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://grupobancolombia.com/intf/Producto/Deposito/TransferenciaCuentasDeposito/V1.0", name = "transferirEntreCuentasDepositoResponse")
    public JAXBElement<TransferirEntreCuentasDepositoResponse> createTransferirEntreCuentasDepositoResponse(TransferirEntreCuentasDepositoResponse value) {
        return new JAXBElement<TransferirEntreCuentasDepositoResponse>(_TransferirEntreCuentasDepositoResponse_QNAME, TransferirEntreCuentasDepositoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnularTransferencias }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://grupobancolombia.com/intf/Producto/Deposito/TransferenciaCuentasDeposito/V1.0", name = "anularTransferencias")
    public JAXBElement<AnularTransferencias> createAnularTransferencias(AnularTransferencias value) {
        return new JAXBElement<AnularTransferencias>(_AnularTransferencias_QNAME, AnularTransferencias.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://grupobancolombia.com/intf/Producto/Deposito/TransferenciaCuentasDeposito/V1.0", name = "systemException")
    public JAXBElement<SystemException> createSystemException(SystemException value) {
        return new JAXBElement<SystemException>(_SystemException_QNAME, SystemException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferirEntreCuentasDeposito }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://grupobancolombia.com/intf/Producto/Deposito/TransferenciaCuentasDeposito/V1.0", name = "transferirEntreCuentasDeposito")
    public JAXBElement<TransferirEntreCuentasDeposito> createTransferirEntreCuentasDeposito(TransferirEntreCuentasDeposito value) {
        return new JAXBElement<TransferirEntreCuentasDeposito>(_TransferirEntreCuentasDeposito_QNAME, TransferirEntreCuentasDeposito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnularTransferenciasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://grupobancolombia.com/intf/Producto/Deposito/TransferenciaCuentasDeposito/V1.0", name = "anularTransferenciasResponse")
    public JAXBElement<AnularTransferenciasResponse> createAnularTransferenciasResponse(AnularTransferenciasResponse value) {
        return new JAXBElement<AnularTransferenciasResponse>(_AnularTransferenciasResponse_QNAME, AnularTransferenciasResponse.class, null, value);
    }

}
