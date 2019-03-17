package pl.edu.wszib.springwithtests.model;

import javax.persistence.*;

@Entity
@Table
public class ShoppingBasket {

    @Id
    @GeneratedValue
    private Integer id;

    @Transient
    private double grossValue;

    @Transient
    private double netValue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getGrossValue(double v) {
        return grossValue;
    }

    public void setGrossValue(double grossValue) {
        this.grossValue = grossValue;
    }

    public double getNetValue() {
        return netValue;
    }

    public void setNetValue(double netValue) {
        this.netValue = netValue;
    }
}
