public class review {
    public static void main(String[] arguments) { //main is the name of the method, arguments are string arrays
        String[] foo;
        foo = new String[4];
        foo[0] = "a";
        foo[1] = "b";
        foo[2] = "c";
        foo[3] = "d";

        for (int i = 0; i < foo.length; i++) {
            if (foo[i] == "a" || foo[i] == "c") {
                System.out.println("hi");

            }
        }
        
        for (String letter : arguments) {
            if (letter.equals("a") || letter.equals("c")) {
                System.out.println("bye");
            }

        }
    
    }
        
    public static void run(int x) { //run is the name is the method, x is the integer argument
        if (x > 5)
            System.out.println("yes");
        else
            System.out.println("no");
                }
    
    public class Baby { 
        //static int babyID = 0; // now, if I change the babyID for alfred, it'll also change it for linda
        String name;
        boolean Female;
        double weight = 4.0;
        int numPoops = 0;
        Baby (String babyName, boolean Fem) { // this is a constructor; basically just tells us how to make it/what to include when making a new baby
            name = babyName; // the constructor basically acts as the __init__ for the class, but if we don't have one, java defaults to an empty one
            Female = Fem;
                    }
            
    }  
}
// the idea of the term static is that we can run the code without needing an instance; for ex, we need to be able to run the file 'review.java' 
// w/o needing to call the review class or creating an instance of the class, because here, creating an instance makes no sense
// however, the Baby class is not static, so we need to call an instance of Baby to run it (example for Baby a, we call a.name to run the code)
