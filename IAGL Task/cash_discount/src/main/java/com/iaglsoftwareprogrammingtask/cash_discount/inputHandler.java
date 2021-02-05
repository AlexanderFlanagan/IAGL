package com.iaglsoftwareprogrammingtask.cash_discount;

public class inputHandler {
    private String depatureAirportCode;
    private String arrivalAirportCode;
    private String arrivalTime;
    private String departureTime;
    private float price;
    private boolean pricePoints;
    private boolean currency;

    public String getDepatureAirportCode() {
        return depatureAirportCode;
    }

    public boolean isCurrency() {
        return currency;
    }

    public void setCurrency(boolean currency) {
        this.currency = currency;
    }

    public boolean isPricePoints() {
        return pricePoints;
    }

    public void setPricePoints(boolean pricePoints) {
        this.pricePoints = pricePoints;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getArrivalAirportCode() {
        return arrivalAirportCode;
    }

    public void setArrivalAirportCode(String arrivalAirportCode) {
        this.arrivalAirportCode = arrivalAirportCode;
    }

    public void setDepatureAirportCode(String depatureAirportCode) {
        this.depatureAirportCode = depatureAirportCode;
    }

}