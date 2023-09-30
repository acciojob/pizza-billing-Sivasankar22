package com.driver;

import java.net.StandardSocketOptions;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int ischeese;
    private  int istoppings;

    private  int ispaperBag;

    private boolean addcheese;
    private  boolean addtoppings;

    private  boolean addpaperBag;

    private  boolean addbill;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg)
        {
            this.price=300;
            this.istoppings=70;
        }
        else {
            this.price = 400;
            this.istoppings=120;
        }
        this.ischeese=80;
        this.ispaperBag=20;
        this.bill="Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return price=300;
    }

    public void addExtraCheese(){
        if(addcheese==false)
        {
            price=price+ischeese;
            addcheese=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(addtoppings==false)
        {
            price=price+istoppings;
            addtoppings=true;
        }

    }

    public void addTakeaway(){
        // your code goes here
        if(addpaperBag==false){
            price=price+ispaperBag;
            addpaperBag=true;
        }
    }

    public String getBill(){

         if(addbill==false) {

             if (addcheese) {
                 bill = bill+"Extra Cheese Added: "+this.ischeese+"\n";
             }
             if(addtoppings) bill = bill+"Extra Toppings Added: "+this.istoppings+"\n";
             if(addpaperBag) bill = bill +"Paperbag Added: "+this.ispaperBag+"\n";
             addbill=true;
         }
         bill = bill+"Total Price:"+this.price+"\n";
        return this.bill;
    }
}
