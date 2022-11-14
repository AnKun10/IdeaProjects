package entity;

import java.util.Arrays;

public class SalerProduct {
    private Saler saler;
    private SalerProductDetail[] salerProductDetails;

    public SalerProduct(Saler saler, SalerProductDetail[] salerProductDetails) {
    }

    public Saler getSaler() {
        return saler;
    }

    public void setSaler(Saler saler) {
        this.saler = saler;
    }

    public SalerProductDetail[] getSalerProductDetails() {
        return salerProductDetails;
    }

    public void setSalerProductDetails(SalerProductDetail[] salerProductDetails) {
        this.salerProductDetails = salerProductDetails;
    }

    @Override
    public String toString() {
        return "SalerProduct{" +
                "saler=" + saler +
                ", salerProductDetails=" + Arrays.toString(salerProductDetails) +
                '}';
    }
}
