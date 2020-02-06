package edu.psu.pizzashop;

public class Order
{
    public String pizza;
    public int soda;
    public int wing;
String  creditnumber;
    public String getCreditnumber() {
        return creditnumber;
    }

    public void setCreditnumber(String creditnumber) {
        this.creditnumber = creditnumber;
    }

    public String getPizza() {
        return pizza;
    }

    public void setPizza(String pizza) {
        this.pizza = pizza;
    }

    public int getSoda() {
        return soda;
    }

    public void setSoda(int soda) {
        this.soda = soda;
    }

    public int getWing() {
        return wing;
    }

    public void setWing(int wing) {
        this.wing = wing;
    }
}
