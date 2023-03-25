package com.casafisk.webshop.contracts.grouping.specs;

import com.casafisk.webshop.contracts.Measurement;
import jakarta.annotation.Nullable;

import java.util.UUID;

public abstract class Spec {

    private final UUID productId;
    private String manufacturer;
    private Measurement measurement;
    private String warranty;
    private String EAN;

    public Spec(UUID productId, String manufacturer, Measurement measurement, String warranty, String EAN) {
        this.productId = productId;
        this.manufacturer = manufacturer;
        this.measurement = measurement;
        this.warranty = warranty;
        this.EAN = EAN;
    }

    public UUID getProductId() {
        return productId;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Measurement getMeasurement() {
        return measurement;
    }

    public void setMeasurement(Measurement measurement) {
        this.measurement = measurement;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public String getEAN() {
        return EAN;
    }

    public void setEAN(String EAN) {
        this.EAN = EAN;
    }
}
