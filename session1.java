// Basic architecture
// cpu = central processing unit
// ALU does the arithmetic stuff
// CU keeps track of which line we're at
// python is an interpretive language, but it's slower because it's not
// machine ready; the computer has to do that
// whereas for java, we have to compile it manually to become machine readable, 
// so by the time you run it, it's already machine ready, and it's a lot faster

//the public can be removed, has to do with privacy

public class session1 { // put the same name as file name here
    public static void main(String[] arguments) {
        // public means
        // static means unchanging
        // void means it doesn't return anything
        // main is the method that will run when executing the program
        // start coding here
        
        System.out.println("Hello World");
        boolean x = false;
        int z = 5;
        // OR we can do
        int b, c;
        b = 1;
        c = 5;
        
        double f = 1.5; 
        String a = "Hello";
        
        int y = 2;
        System.out.println(y);
        
        String hello = "hello again!";
        System.out.println(hello);
        
        int l = 2 + (7 / 3);
        String g = "my integer is: ";
        
        System.out.println(g + l); // note that in java, we can add int and String
        
    }
}

// we put this in the terminal: javac CLASSNAME.java to make it machine readable
// we put java session1 to actually run it and see the results

// important types in java: boolean, int, double (like a float), String)
