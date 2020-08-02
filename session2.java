import java.util.concurrent.locks.Condition;

class session2 {
    public static void main(Strings[] arguments) {
        String b = 'a' + 1; //now, b's type is String, and it is b = 'a1'
        System.out.println('a' + 1); // the value of this would be the printed string 'a1', despite no variable declaration
        System.out.println(b); // here, b was assigned String, so it has to be a string
                // because 'a' and 1 aren't assigned to any variables, 'a' and 1 are considered "temporary values" and 'a1' is the value store in memory for b
                // aka 'a' and '1' are not stored in memory, so after they're applied to b, they're gone
                // in python, when we do a = 1, it calls on the class Int and gets the integer 1; for java, they're considered primitive types,
                // so we have to assign the variable type (String, int, etc.)
        
        String s = 8; // error because 8 is an int
        String s = 8 + ''; // works because 8 + '' is resolved first, which yields '8', which is a string so s accepts it as a string.
        //OR
        String s = (String) 8; // this changes the type; we follow the format of explicit casting: type var_name = (type) expression;
        double a = 1 + 3; // implicit casting; a gets 4.0
        int x = (int) 10.5; // explicit casting; gives us 10, truncated and without the .0
    }
}

// writing functions (aka functions)

class FILENAME { // format of writing a function
    public static NAME() { // only have to write public static void for the main function
        STATEMENTS
        return EXPRESSION;
    }
}

// for the temperature function:

public class temperature {
    public static double convert_F_to_C(double F) // public static double: this double refers to the returned value's type
    {                                            // convert_F_to_C is the function name; double F is the argument, and it will throw an error if it is given a non-double value argument (ex. a string)
        double C = (F - 32) * (5.0)/9
        return C
    }


    public static void main(String[] arguments) { // if the function doesn't return anything, we put void in front of it
        double val = convert_F_to_C(55.5); // the main method is basically what's executed in the terminal, so we need it
    }                                       // writing stuff inside the main method is the equivalent of calling functions in python, causing them to
                                            // actually execute instead of just being saved
                                            // in python, we use the main method so that the functions from one file can be used in another file, but we don't have to
                                            // in java we need the main method, but in python, we only need it for importing and stuff
                                            // in java, when we run the file, we essentially call the main function and run it
                                            // in python, if we add the main method and all the stuff, then calling the function essentially tells it to run that main function
                                            // in python, for if __name__== 'main', main is the file itself; if you import that file1 into another file2, the main section of file1 doesn't run
                                            // because now, for the file we're working on, main = file2

}

}

class Calculator {
    //import java.lang.Math; how to import in java
    public static double cube(double x) {
        double y = Math.pow(x, 3);
        return y;
    
    public static void isEvenAndPos(int x) { // does not return anything
        if (x % 2 == 0 && Math.abs(x) == x) { // && = and || = or
            System.out.println("True");
        }
        else if(CONDITION) { 
            STATEMENTS
        }
        
        else {
            System.out.println("False")
        }
        
    
    }
    }
}