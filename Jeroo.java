/**
 * Put your Jeroo methods in this class.
 * @author Steve Aronson
 */
public class Jeroo extends JerooBase {

    
  public void plantCross() { 
  hopTwo();
  hopTwo();
  hopTwo();
  turn(RIGHT);
  hopTwo();
  hopPlant();
  hopPlantThree();
  turn(RIGHT);
  hopPlantThree();
  turn(LEFT);
  hopPlantTwo();
  turn(LEFT);
  hopPlantThree();
  turn(RIGHT);
  hopPlantThree();
  turn(LEFT);
  hopPlantTwo();
  turn(LEFT);
  hopPlantThree();
  turn(RIGHT);
  hopPlantThree();
  turn(LEFT);
  hopPlantTwo();
  turn(LEFT);
  hopPlantThree();
  turn(RIGHT);
  hopPlantThree();
  turn(LEFT);
  hopPlant();
  turn(RIGHT);
  hop();
  }
        
   
    // Put any helpermethods here
    
  
// merges the commands hop and plant together 
public void hopPlant() {
  hop();
  plant();
}
//uses the hopPlant command three times
public void hopPlantThree() {
  hopPlant();
  hopPlantTwo();
}
//uses the hopPlant command two times

public void hopPlantTwo() {
  hopPlant();
  hopPlant();
}
//makes the Jeroo hop twice

public void hopTwo() {
  hop();
  hop();

}
    
    
    
    
    // Do NOT touch the code below here

    public Jeroo() {super();}

    public Jeroo(int flowers) {super(flowers); }

    public Jeroo(int x, int y) { super(x, y); }

    public Jeroo(int x, int y, CompassDirection direction) { super (x, y, direction);}

    public Jeroo(int x, int y, int flowers) { super (x, y, flowers);}

    public Jeroo(int x, int y, CompassDirection direction, int flowers) { super(x, y, direction, flowers);}

}
