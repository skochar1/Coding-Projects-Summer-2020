public class Fastest{
  
    public static int fastestTime(int[] times) {
      int num_times = times.length;
      int currentTime = times[0];
      int currentIndex = 0;
      
      //int currentTime = Integer.MAX_VALUE;   Integer.MAX_VALUE is a constant, we can think of it as positive infinity
      //int currentIndex = -1;                 another way to initialize it
      
      for (int i = 0; i < num_times; i++) {
        if (times[i] < currentTime) {
          currentTime = times[i]
          currentIndex = i;
        } 
      }
      return currentTime;
    }
    
    public static void main(string[] args) {
        System.out.println(fastestTime(something);
      
      int[] times =  {100, 2, 102, 104, 106};
      i = 1
    }
  }

// Objects = Classes
// Primitives (int, double, char, . . .)     in java, primitives are not objects; in python, everything is an object, but the distinction is between immutable vs mutable
// Objects (String, Arrays, . . .)           same distinction in java; mutables are objects, and immutables are primitives 

//making classes

// inside MyFileName.java
public class Baby {
    // Data Attributes - variables that have primitives/objects that are building blocks
    // TYPE VARNAME;
    static int babyID = 0; // now, if I change the babyID for alfred, it'll also change it for linda
    String name;
    boolean Female;
    double weight = 4.0;
    // TYPE VARNAME = VARVALUE;
    int numPoops = 0;
	
    Baby (String babyName, boolean Fem) { // this is a constructor; basically just tells us how to make it/what to include when making a new baby
      name = babyName;
      Female = Fem;
    }
    
   
    // Method Attributes - functions for the class
    void poop() {
      numPoops += 1;
      System.out.println("I went doodoo.");
    }
    
    void sayHello() {
      System.out.println("Hello, I'm " + name);
    }
    
    void eat(double foodWeight) {
      if (foodWeight > 0 && foodWeight < weight) {
        weight += foodWeight;
      }
  }
    
    
    public static void main(String[] args) { // the String[] is there because when you use terminal to call the file, you can also input a value after it and add it to the array of things being run
        Baby aBaby = new Baby("Alfred", false);
        aBaby.sayHello(); // prints "Hello, I'm Alfred" to console.
    }
  }
// $javac MyFileName.java
// $java MyFileName
// $java MyFileName 6
  // $args  {"MyFileName", "6"}     6 is a string, we have to convert to int: Integer.parseInt(StringValue)

//in attributes, including the () means that the function is run, while not including the () means that the instance is a reference pointing to the original function 


// for python tutor:
//x = 1
//def func1(x, y):
//    z = x + y
//    return z * 2
//z = func1(5, 6)
//f = func1
//f(7, 8)

//static void main -- why?