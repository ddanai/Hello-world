//A class is a user-defined data type
/*
Every class has: 
1. Constructor
2. Fields
3. Methods
*/
public class Moose { //<----- Class declaration
    /*
    Field declarations go at the top of the class
    A field is data that is owned by the class
    (or an instance of the class)
    */
    
    /** The number of points on a Moose's antlers*/
    int antlerSize;
    
    /** The color of the Moose's hair */
    //Color hairColor;
    
    /** The moose's given full name */
    String name;
    
    int weight;
    
    /*
    Constructors go after the fields
    
    Constructor creates an instance of a class
    That is, it creates a particular Moose object
    Iniitializes all of the fields.
    */
    public Moose(int as, String name, int weight) {
        this.antlerSize = as;
        //this.hairColor = hc;
        this.name = name + " The Moose";
        this.weight = weight;
    }
    
    public Moose() {
        this.antlerSize = 0;
        //this.hairColor = Color.BLACK;
        this.name = "Marvin the Moose";
        this.weight = 500;
    }
    
    /*
    After the constructors come the methods
    */
    public void speak() {
        System.out.println("Weeerrrgh");
    }
    
    public void eat(Moose that) {
        this.weight += that.weight;
        //Dot "." operator references a field or method
        // of the corresponding instance.
        System.out.println("Oh no! " + this.name 
                            + " has eaten " + that.name);
        System.out.println(this.name + " now weighs " + this.weight);
    }
    
    public static void main(String[] args) {
        Moose steve = new Moose(2, "Steve", 750);
        Moose marvin = new Moose();
        
        steve.speak();
        
        steve.eat(marvin);
    }
}