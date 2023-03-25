package com.casafisk.webshop.database;

import com.casafisk.webshop.contracts.Customer;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerDBService {

    private final FirebaseDatabase database;

    @Autowired
    public CustomerDBService(FirebaseApp firebaseApp) {
        database = FirebaseDatabase.getInstance(firebaseApp);
    }

    public void createCustomer(Customer customer) {
            System.out.println("Persisting customer...");

            DatabaseReference customerRef = database.getReference().child("customers");
            DatabaseReference newCustomerRef = customerRef.push();
            newCustomerRef.setValueAsync(customer);

            System.out.println("DONE!");
    }
}
