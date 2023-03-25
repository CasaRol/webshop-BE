package com.casafisk.webshop.api.account;

import com.casafisk.webshop.database.CustomerDBService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController("/account")
public class CustomerResource {

    CustomerDBService service;

    public CustomerResource(CustomerDBService service) {
        this.service = service;
    }
    private record Customer(UUID customerId, String name) {}

    List<Customer> store = List.of(new Customer(UUID.randomUUID(), "john"));

    @GetMapping("/{name}")
    public Customer getCustomer(@PathParam("name") String name) {
        createCustomer();
        return store
                .stream()
                .filter(customer ->
                        customer.name.equals(name))
                .findFirst()
                .orElse(null);
    }

    @GetMapping("/create")
    public String createCustomer() {
        System.out.println("CREATING CUSTOMER...");
        service.createCustomer(
                new com.casafisk.webshop.contracts.Customer(
                        UUID.randomUUID(), null, "John", "Doe", "some@email.com"));
        return "OK";
    }
}
