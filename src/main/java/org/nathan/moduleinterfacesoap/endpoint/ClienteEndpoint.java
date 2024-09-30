package org.nathan.moduleinterfacesoap.endpoint;

import com.example.springsoap.cli.*;
import org.nathan.moduleinterfacesoap.service.ConvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ClienteEndpoint {

    private static final String NAMESPACE_URI = "http://www.example.com/springsoap/cli";

    private final ConvertService convertService;

    @Autowired
    public ClienteEndpoint(ConvertService convertService) {
        this.convertService = convertService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getClienteRequest")
    @ResponsePayload
    public GetClienteResponse getCliente(@RequestPayload GetClienteRequest getClienteRequest) {
        GetClienteResponse response = new GetClienteResponse();
        response.setCliente(convertService.mountCliente(getClienteRequest.getId()));

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllClientesRequest")
    @ResponsePayload
    public GetAllClientesResponse getAllClients(@RequestPayload GetAllClientesRequest getAllClientesRequest) {
        System.out.println(getAllClientesRequest);
        return convertService.mountAllCliente(getAllClientesRequest);
    }
}
