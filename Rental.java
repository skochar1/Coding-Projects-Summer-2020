public class Rental {
    /* Implement the Rental class here */
    String name;
    int counter = 0;
    Car cars[] = new Car[4];

    public Rental(String rentalName) { // why don't we need a void/anything to signify returning?
        name = rentalName;
    }

    public void printName() {
        System.out.println(name);
    }

    public static void printRentalHours() {
        System.out.println("Rentals are open from 8:00am to 8:00pm, 7 days a week");
    }

    public void addCar(Car newCar) { // not static because we are calling it on an instance (some rental place)
        cars[counter] = newCar;
        counter++;
    }

    public void rentCar(String model, String make) {
        boolean found = false;

        for (int i = 0; i < counter; i++) {
            // Car car = cars[i];
            if (cars[i].getMakeAndModel().equals(make + " " + model)) {
                if (cars[i].isRented())
                    found = true;
                else {
                    cars[i].rented();
                    System.out.println("You successfully rented a " + make + " " + model);
                    return;
                }
            }
        }
        if (!found)
            System.out.println("This car is not in our listing.");
        else
            System.out.println("This car is already rented.");
    }

    /* needs a tweak */
    public void printAvailableCars() {
        if (counter == 0)
            System.out.println("No cars in listing.");
        else {
            int c = 0;
            for (int i = 0; i < counter; i++) {
                if (!cars[i].isRented()) {
                    c++;
                    System.out.println(cars[i].model + " " + cars[i].make);
                }
            }
            if (c == 0)
                System.out.println("No cars available at the moment.");
        }
    }

    public void returnCar(String model, String make) {
        for (int i = 0; i < counter; i++) {
            if (cars[i].getMakeAndModel().equals(make + " " + model) && cars[i].isRented()) {
                System.out.println("You successfully returned the " + model + " " + make);
                cars[i].returned();
                return;
            }
        }
        System.out.println("No " + make + " " + model + " in our listing.");
    }

    public static void main(String[] args) {
        // Creates two car rentals
        Rental rental1 = new Rental("Rent-Some-Cars");
        Rental rental2 = new Rental("Rent-Them-All");

        // Add four cars to the first rental
        rental1.addCar(new Car("Honda", "Element"));
        rental1.addCar(new Car("Mitsubishi", "Eclipse"));
        rental1.addCar(new Car("Toyota", "FJ Cruiser"));
        rental1.addCar(new Car("Mitsubishi", "Eclipse"));

        Car[] cars = rental1.cars;
        for (Car car : cars) {
            System.out.println(car.make + " " + car.model);
        }

        // Print opening hours and the names
        System.out.println("Rental hours:");
        printRentalHours();
        System.out.println();

        System.out.println("Rental names:");
        rental1.printName();
        rental2.printName();
        System.out.println();

        // Attempt to rent a Honda Element from both rentals
        System.out.println("Renting Honda Element:");
        rental1.rentCar("Honda", "Element");
        rental1.rentCar("Honda", "Element");
        rental2.rentCar("Honda", "Element");
        System.out.println();

        // Print the make and model for all available cars from both rentals
        System.out.println("Cars available in the first rental:");
        rental1.printAvailableCars();
        System.out.println();
        System.out.println("Cars available in the other rental:");
        rental2.printAvailableCars();
        System.out.println();

        // Exhaustive renting in first rental
        System.out.println("Renting all cars (and more) in the first rental:");
        rental1.rentCar("Mitsubishi", "Eclipse");
        rental1.rentCar("Honda", "Element");
        rental1.rentCar("Mitsubishi", "Eclipse");
        rental1.rentCar("Toyota", "FJ Cruiser");
        rental1.rentCar("Mazca", "Cx-3");
        System.out.println();

        // Print available cars from the first rental
        System.out.println("Cars available in the first rental");
        rental1.printAvailableCars();
        System.out.println();

        // Return Honda Element to the first rental, plus rejecting incorrect rental
        // return
        System.out.println("Returning Honda Element:");
        rental1.returnCar("Honda", "Element");
        System.out.println();
        System.out.println("Incorrect accidental return:");
        rental2.returnCar("Mitsubishi", "Eclipse");
        System.out.println();

        // Print the available cars from the first rental
        System.out.println("Cars available in the first rental:");
        rental1.printAvailableCars();
        System.out.println();
        System.out.println("Cars available in the other rental:");
        rental2.printAvailableCars();
    }
}
