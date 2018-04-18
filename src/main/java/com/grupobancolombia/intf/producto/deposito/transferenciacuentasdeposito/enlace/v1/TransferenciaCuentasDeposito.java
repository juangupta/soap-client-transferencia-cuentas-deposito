
package com.grupobancolombia.intf.producto.deposito.transferenciacuentasdeposito.enlace.v1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import com.grupobancolombia.ents.soi.messageformat.v2.RequestHeader;
import com.grupobancolombia.ents.soi.messageformat.v2.ResponseHeader;
import com.grupobancolombia.intf.producto.deposito.transferenciacuentasdeposito.v1.AnularTransferencias;
import com.grupobancolombia.intf.producto.deposito.transferenciacuentasdeposito.v1.AnularTransferenciasResponse;
import com.grupobancolombia.intf.producto.deposito.transferenciacuentasdeposito.v1.TransferirEntreCuentasDeposito;
import com.grupobancolombia.intf.producto.deposito.transferenciacuentasdeposito.v1.TransferirEntreCuentasDepositoResponse;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TransferenciaCuentasDeposito", targetNamespace = "http://grupobancolombia.com/intf/Producto/Deposito/TransferenciaCuentasDeposito/V1.0")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    com.grupobancolombia.ents.common.genericexception.v2.ObjectFactory.class,
    com.grupobancolombia.ents.soi.coreextensions.v2.ObjectFactory.class,
    com.grupobancolombia.ents.soi.messageformat.v2.ObjectFactory.class,
    com.grupobancolombia.intf.producto.deposito.transferenciacuentasdeposito.v1.ObjectFactory.class
})
@XmlRootElement
public interface TransferenciaCuentasDeposito {


    /**
     * 
     * @param result
     * @param responseHeader
     * @param requestHeader
     * @param parameters
     * @throws SystemExceptionMsg
     * @throws BusinessExceptionMsg
     */
    @WebMethod(action = "http://grupobancolombia.com/intf/Producto/Deposito/TransferenciaCuentasDeposito/V1.0/transferirEntreCuentasDeposito")
    public void transferirEntreCuentasDeposito(
        @WebParam(name = "transferirEntreCuentasDeposito", targetNamespace = "http://grupobancolombia.com/intf/Producto/Deposito/TransferenciaCuentasDeposito/V1.0", partName = "parameters")
        TransferirEntreCuentasDeposito parameters,
        @WebParam(name = "requestHeader", targetNamespace = "http://grupobancolombia.com/ents/SOI/MessageFormat/V2.1", header = true, partName = "requestHeader")
        RequestHeader requestHeader,
        @WebParam(name = "transferirEntreCuentasDepositoResponse", targetNamespace = "http://grupobancolombia.com/intf/Producto/Deposito/TransferenciaCuentasDeposito/V1.0", mode = WebParam.Mode.OUT, partName = "result")
        Holder<TransferirEntreCuentasDepositoResponse> result,
        @WebParam(name = "responseHeader", targetNamespace = "http://grupobancolombia.com/ents/SOI/MessageFormat/V2.1", header = true, mode = WebParam.Mode.OUT, partName = "responseHeader")
        Holder<ResponseHeader> responseHeader)
        throws BusinessExceptionMsg, SystemExceptionMsg
    ;

    /**
     * 
     * @param result
     * @param responseHeader
     * @param requestHeader
     * @param parameters
     * @throws SystemExceptionMsg
     * @throws BusinessExceptionMsg
     */
    @WebMethod(action = "http://grupobancolombia.com/intf/Producto/Deposito/TransferenciaCuentasDeposito/V1.0/anularTransferenciasRequest")
    public void anularTransferencias(
        @WebParam(name = "anularTransferencias", targetNamespace = "http://grupobancolombia.com/intf/Producto/Deposito/TransferenciaCuentasDeposito/V1.0", partName = "parameters")
        AnularTransferencias parameters,
        @WebParam(name = "requestHeader", targetNamespace = "http://grupobancolombia.com/ents/SOI/MessageFormat/V2.1", header = true, partName = "requestHeader")
        RequestHeader requestHeader,
        @WebParam(name = "anularTransferenciasResponse", targetNamespace = "http://grupobancolombia.com/intf/Producto/Deposito/TransferenciaCuentasDeposito/V1.0", mode = WebParam.Mode.OUT, partName = "result")
        Holder<AnularTransferenciasResponse> result,
        @WebParam(name = "responseHeader", targetNamespace = "http://grupobancolombia.com/ents/SOI/MessageFormat/V2.1", header = true, mode = WebParam.Mode.OUT, partName = "responseHeader")
        Holder<ResponseHeader> responseHeader)
        throws BusinessExceptionMsg, SystemExceptionMsg
    ;

}
