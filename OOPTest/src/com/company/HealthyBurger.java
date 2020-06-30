package com.company;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double getHealthyExtra1Price;
    private String healthyExtra2Name;
    private double getHealthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.getHealthyExtra1Price = price;
    }

    public void addHealthAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.getHealthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if (this.healthyExtra1Name != null) {
            hamburgerPrice += this.getHealthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.getHealthyExtra1Price);
        }
        if (this.healthyExtra2Name != null) {
            hamburgerPrice += this.getHealthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.getHealthyExtra2Price);
        }
        return hamburgerPrice;
    }
}
