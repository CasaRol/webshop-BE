package com.casafisk.webshop.contracts;

import java.util.Objects;
import java.util.UUID;

public class Customer {
    private final UUID id;
    private String billingId;
    private String firstName;
    private String lastName;
    private String email;

    public Customer(String billingId, String firstName, String lastName, String email) {
        this.id = UUID.randomUUID();
        this.billingId = billingId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Customer(UUID id, String billingId, String firstName, String lastName, String email) {
        this.id = id;
        this.billingId = billingId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public UUID getId() {
        return id;
    }

    public String getBillingId() {
        return billingId;
    }

    public void setBillingId(String billingId) {
        this.billingId = billingId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id.equals(customer.id) && Objects.equals(billingId, customer.billingId) && Objects.equals(firstName, customer.firstName) && Objects.equals(lastName, customer.lastName) && email.equals(customer.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, billingId, firstName, lastName, email);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", billingId='" + billingId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
