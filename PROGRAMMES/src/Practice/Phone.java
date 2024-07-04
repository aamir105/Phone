package Practice;

public class Phone {
    static String make;
    static String model;
    static int storage;

    public void CalculatePrice(){
        double basePrice = 200.0;
        double priceFactor = 10.0;
        double totalprice = basePrice + (storage * priceFactor);
        System.out.println("TOTAL PRICE OF PHONE: "+ totalprice);
    }

    public void PrintDetails(){
        System.out.println("Make: "+make);
        System.out.println("Model: " + model);
        System.out.println("Storage Capacity: " + storage + " GB");
    }

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.make = "Apple";
        phone.model = "12 ProMax";
        phone.storage = 128;
        phone.CalculatePrice();
        phone.PrintDetails();
    }
}
