package com.casafisk.webshop.contracts.grouping.specs;

import com.casafisk.webshop.contracts.Measurement;

import java.util.UUID;

public class ElectronicSpec extends Spec {
    private double powerConsumption;

    public ElectronicSpec(UUID productId, String manufacturer, Measurement measurement, String warranty, String EAN, double powerConsumption) {
        super(productId, manufacturer, measurement, warranty, EAN);
        this.powerConsumption = powerConsumption;

    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }
}
