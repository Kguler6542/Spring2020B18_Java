package day48_Abstraction;

public class Samsung extends Phone{

    static {
        brand= "Samsung";
    }

    public Samsung (String model, double price, String size) {
        this.model = model;
        this.price = price;
        this.size = size;

    }
    @Override
    public void calling(long phoneNumber) {
        System.out.println("Samsung calls");
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Samsung texts ");
    }
    public void freezing( ){
        System.out.println("Samsung is freezing when using "); }
}
