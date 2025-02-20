package org.nathan.moduleinterfacesoap.service;

import com.example.springsoap.cli.Cliente;
import com.example.springsoap.cli.GetAllClientesRequest;
import com.example.springsoap.cli.GetAllClientesResponse;
import org.nathan.moduleinterfacesoap.model.ClienteREST;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ConvertService {

    @Autowired
    private RestClientService restClientService;

    public GetAllClientesResponse mountAllCliente(GetAllClientesRequest getAllClientesRequest) {
        System.out.println(getAllClientesRequest);
        // Lista vinda da REST API
        List<ClienteREST> clienteRESTSList = restClientService.getAllClients();
        // Lista vazia com clientes SOAP
        List<Cliente> clientesList = new ArrayList<>();
        // Responsta esperada

        GetAllClientesResponse response = new GetAllClientesResponse();

        if (!clienteRESTSList.isEmpty()) {
            for (ClienteREST clienteREST : clienteRESTSList) {
                clientesList.add(createObject(clienteREST));
            }
            response.setCliente(clientesList);
            return response;
        }

        response.setCliente(clientesList);
        return response;
    }

    public Cliente mountCliente(String id) {
        List<ClienteREST> clienteRESTSList = restClientService.getAllClients();

        if (!clienteRESTSList.isEmpty()) {
            for (ClienteREST clienteREST : clienteRESTSList) {
                if (clienteREST.getId().equals(id)) {
                    return createObject(clienteREST);
                }
            }
        }

        return new Cliente();
    }

    public Cliente createObject(ClienteREST clienteREST) {
        Cliente cliente = new Cliente();
        cliente.setEndereco(clienteREST.getEndereco());
        cliente.setGenero(clienteREST.getGenero());
        cliente.setId(clienteREST.getId());
        cliente.setNascimento(clienteREST.getNascimento());
        cliente.setNome(clienteREST.getNome());
        cliente.setProfissao(clienteREST.getProfissao());
        cliente.setSobrenome(clienteREST.getSobrenome());

        return cliente;
    }
}
