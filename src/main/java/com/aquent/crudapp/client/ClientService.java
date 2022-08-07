package com.aquent.crudapp.client;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface ClientService {

  
    List<Client> listClient();

  
    Integer createClient(Client client);

   
    Client readClient(Integer id);

  
    void updateClient(Client client);

    void deleteClient(Integer id);

    List<String> validateClient(Client client);
}