package com.casafisk.webshop.api.account;

import jakarta.websocket.server.PathParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController("/account")
public class CustomerResource {

    private record Customer(UUID customerId, String name) {
    }

    List<Customer> store = List.of(new Customer(UUID.randomUUID(), "john"));

    @GetMapping("/{name}")
    public Customer getCustomer(@PathParam("name") String name) {
        return store
                .stream()
                .filter(customer ->
                        customer.name.equals(name))
                .findFirst()
                .orElse(null);
    }
}
