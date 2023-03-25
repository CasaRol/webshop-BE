package com.casafisk.webshop.contracts;

import com.casafisk.webshop.contracts.grouping.ProductCategory;
import com.casafisk.webshop.contracts.grouping.specs.Spec;

import java.util.UUID;

public class Product {
    private UUID id;
    private String name;
    private ProductCategory category;
    private String manufacturer;
    private double price;
    private String description;
    private Spec spec; //Use Specific spec class NOT abstract!
    private int stock;

}
