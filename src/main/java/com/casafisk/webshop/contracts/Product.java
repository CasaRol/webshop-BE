package com.casafisk.webshop.contracts;

import com.casafisk.webshop.contracts.grouping.ProductCategory;

import java.util.UUID;

public class Product {
    private UUID id;
    private String name;
    private ProductCategory category;
    private double price;
    private String description;

}
