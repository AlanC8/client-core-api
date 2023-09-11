package kz.java.clientcoreapi.service;

import kz.java.clientcoreapi.model.ClientModel;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class ClientServiceImpl implements ClientService{
    private static final HashMap<String, ClientModel> clientMap = new HashMap<>();

    static{
        ClientModel clientModel1 = new ClientModel(UUID.randomUUID().toString(),
                "Alan111", "1234Asdf", "asktome@gmail.com");
        ClientModel clientModel2 = new ClientModel(UUID.randomUUID().toString(),
                "Alan2", "1234Asdf#", "asktome2@gmail.com");
        ClientModel clientModel3 = new ClientModel(UUID.randomUUID().toString(),
                "Alan3", "1234Asdf$", "asktome3@gmail.com");
        clientMap.put(clientModel1.getClientId(), clientModel1);
        clientMap.put(clientModel2.getClientId(), clientModel2);
        clientMap.put(clientModel3.getClientId(), clientModel3);
    }

    @Override
    public void createClient(ClientModel clientModel) {
        clientModel.setClientId(UUID.randomUUID().toString());
        clientMap.put(clientModel.getClientId(), clientModel);
    }

    @Override
    public List<ClientModel> getAllClient() {
        return new ArrayList<>(clientMap.values());
    }

    @Override
    public void deleteClient(String clientId) {
        clientMap.remove(clientId);
    }

    @Override
    public void updateClient(String clientId, ClientModel clientModel) {
        clientModel.setClientId(clientId);
        clientMap.put(clientId, clientModel);
    }
}
