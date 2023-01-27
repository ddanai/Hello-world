/**
* This class represents the basic functionality that an Animal in Object Zoo
* should have. The animal class is abstract, and so must be overriden.This
* class, however, contains methods for controlling the size and x and y location
* of an Animal as well as causing the Animal to walk around and remain on the screen.
*
* Note that this class (nor its sub-classes) cannot be instantiated without first
* calling the function {@code setDim(x,y)} and specifying the sketch dimmensions
* in which the class will be deployed.
*
*
* @author J. Hammer
* @version 1.0.0
*/
public abstract class Animal {
  private int xLoc;
  private int yLoc;
  private int size;
  private double trajX;
  private double trajY;
  private static int height = -1;
  private static int width = -1;

  /**
  * Constructs a new Animal object at a given location and size.
  * Before constructing an Animal, you must call setDim() and
  * specify the dimmensions of the sketch.
  */
  public Animal(int x, int y, int size) {
    if (this.height < 0 || this.width < 0) {
     throw new IllegalArgumentException("Sketch width and height must be set > 0 before instantiation!"); 
    }
    this.xLoc = x;
    this.yLoc = y;
    this.size = size;
    this.trajX = Math.random() * 10 - 5;
    this.trajY = Math.random() * 10 - 5;
  }
  
  /**
  * Create an animal of base size in the top left corner.
  */
  public Animal() {
      this(0,0,1);
  }
  
  /**
  * Set the dimmension of the sketch in which the Animal class is being deployed.
  */
  public static void setDim(int w, int h) {
    width = w;
    height = h;
  }

  /**
  * Move the Animal to the specified coordinate.
  */
  public final void move(int x, int y) {
    this.xLoc = x;
    this.yLoc = y;
  }

  /**
  * Overriden by the extending class! 
  * Draws the object to the Processing Canvas.
  */
  public abstract void draw();


  
  /**
  * Advance the Animal along its trajectory. If it hits a wall, turn around.
  */
  public final void walk() {
    this.move((int)(xLoc + trajX), (int)(yLoc + trajY));
    
    if (xLoc < 0 || xLoc > width) trajX *= -1;
    if (yLoc < 0 || yLoc > height) trajY *= -1; 
  }

  /** The Y location of the Animal */
  public final int getY() {
    return yLoc;
  }
  
  /** The X location of the Animal */
  public int getX() {
    return xLoc;
  }
  
  /** The size of the Animal */
  public final int getSize() {
    return size;
  }
}
