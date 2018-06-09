package com.lanou.entity;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;

public class Phone {
    @NotBlank(message = "品牌不能为空")
    private String brand;
    @Pattern(regexp = "[A-Z]([A_Za-z0-9]{3}-){1,3}[0=9]{3,4}[A-Z]?")
    private String model;
    @Min(value = 0)
    private Double price;
    private Date launchDate;

    public String getBrand() {
        return brand;
    }

    public Phone setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Phone setModel(String model) {
        this.model = model;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public Phone setPrice(Double price) {
        this.price = price;
        return this;
    }

    public Date getLaunchDate() {
        return launchDate;
    }

    public Phone setLaunchDate(Date launchDate) {
        this.launchDate = launchDate;
        return this;
    }
}
