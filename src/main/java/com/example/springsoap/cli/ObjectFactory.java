//
// Este arquivo foi gerado pela Eclipse Implementation of JAXB, v3.0.0 
// Consulte https://eclipse-ee4j.github.io/jaxb-ri 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2024.09.30 às 02:50:01 PM BRT 
//


package com.example.springsoap.cli;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.springsoap.cli package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.springsoap.cli
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetClienteRequest }
     * 
     */
    public GetClienteRequest createGetClienteRequest() {
        return new GetClienteRequest();
    }

    /**
     * Create an instance of {@link GetClienteResponse }
     * 
     */
    public GetClienteResponse createGetClienteResponse() {
        return new GetClienteResponse();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link GetAllClientesRequest }
     * 
     */
    public GetAllClientesRequest createGetAllClientesRequest() {
        return new GetAllClientesRequest();
    }

    /**
     * Create an instance of {@link GetAllClientesResponse }
     * 
     */
    public GetAllClientesResponse createGetAllClientesResponse() {
        return new GetAllClientesResponse();
    }

}
