package com.vm.entity;


public class Address 
{
    private int dno;
    private String streetName;
    private String city;
    public void setDno(int dno) {
        this.dno = dno;
    }
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
    public void setCity(String city) {
        this.city = city;
    }
    
    void displayAddress()
    {
        System.out.println("doorno is:"+dno);
        System.out.println("street name is :"+streetName);
        System.out.println("city is :"+city);
    }

}
