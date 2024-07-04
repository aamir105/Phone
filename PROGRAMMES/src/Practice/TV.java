package Practice;

public class TV {
    static String brand;
    static int size;
    static int price;


    public double CalculateDiscount(){
        if (size > 55){
//           double disctprice = 0.2 * price;
//            System.out.println("You got 20% discount."+disctprice);
            return 0.2 * price;
        }
        else{
            return 0.0;
//            System.out.println("You didn't get discount.");
        }
    }

    public void PrintDetails(){
        System.out.println("Brand: "+brand);
        System.out.println("Size: " + size);
        System.out.println("Original Price: " + price);
        double dp = (price - CalculateDiscount());
        System.out.println("Discount Price: " + dp);
    }

    public static void main(String[] args) {
        TV phone = new TV();
        TV.brand = "Apple";
        
        phone.size = 60;
        phone.price=10000;
        phone.CalculateDiscount();
        phone.PrintDetails();
    }
}
