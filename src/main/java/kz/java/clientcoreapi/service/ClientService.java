package kz.java.clientcoreapi.service;

import kz.java.clientcoreapi.model.ClientModel;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ClientService {
    void createClient(ClientModel clientModel);
    List<ClientModel> getAllClient();
    void deleteClient(String clientId);
    void updateClient(String clientId, ClientModel clientModel);
}
