package com.pak.e_commerce.Model;

public class Cart
{
    private String pid, pname, price, quantity, discount, time,date;

    public Cart() {
    }

    public Cart(String pid, String pname, String price, String quantity, String discount, String time,String date) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
        this.time = time;
        this.date = date;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }


    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.discount = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.discount = date;
    }
}
