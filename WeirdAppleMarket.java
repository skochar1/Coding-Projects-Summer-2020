public class WeirdAppleMarket {
    public static void Market(double price, int numberApples) { // remember that there are types in front of the arguments

        if (price <= 2.00 && numberApples < 4) { // we can make this a lot cleaner by putting less conditions in the conditionals and just using more conditionals
            System.out.println(numberApples * price);
        }
        else if (price <= 2.00 && numberApples >= 4 && numberApples <= 10) { // brackets only needed in 2+ lines in conditional
            System.out.println(numberApples * price * 0.9);
        }
        else {
            System.out.println("Error");
        }
    }

    public static void main(String[] arguments) {
        Market(0.75, 12);
        Market(1.25, 7);
        Market(2.25, 2);
    }

}

/* With cleaner conditions

public class WeirdAppleMarket {
    public static void Market(double price, int numberApples) { // remember that there are types in front of the arguments

        if (price > 2.0) {
           System.out.println("Violation of market price"); 
        }
        else if (numberApples > 10) {
           System.out.println("Taking too many apples!");
        }
        else if (numberApples >= 4) {
          System.out.println(numberApples * price * 0.9);
        }
        else {
		  //System.out.println(numberApples * price)
        }
    }
 */

 // With fruitful function
 /*    public class WeirdAppleMarket {
        public static double Market(double price, int numberApples) { // remember that there are types in front of the arguments
            if (price <= 2.00 && numberApples < 4) {
                return (numberApples * price);
            }
            else if (price <= 2.00 && numberApples >= 4 && numberApples <= 10) {
                return (numberApples * price * 0.9);
            }
            else {
                System.out.println("Error!"); // returning -1 is standard practice
                return -1;
            }
        } */