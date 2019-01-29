import java.util.Scanner;
import java.lang.*;
/**
* WoodenBeam class
* @author Dhanushga Lionel
* @version 8.00, 12 Oct 2017
*/
/**
*@param length is the variable for length
*@param wireGauge is variable for wireGauge
*@param copper is variable for copper
*@param aluminum is variable for aluminum
*/
public class WireResistance14{
  double length;
  int wireGauge;
  double copper;
  double aluminum;
  /**
  *@param length is the variable for length
  *@param wireGauge is variable for wireGauge
  *@param copper is variable for copper
  *@param aluminum is variable for aluminum
  */
  public WireResistance14(double length, int wireGauge){
    this.length = length;
    this.wireGauge = wireGauge;
  }
  /**
  *this method gets the length of the wire
  */
  public double getlength(){
    return this.length;
  }
  /**
  * this method gets the wire gauge
  */
  public int getwireGauge(){
    return this.wireGauge;
  }
  /**
  *This method computes the diamete
  */
 // Takes the write gauge and returns the corresponding wire diameter
 double computeDiameter(int wireGauge) {
   return 0.127 * (92 ^ ((36 - this.wireGauge) / 39));
 }
 /**
 *this method computes the resistance of copper wire
 */
 // Takes the length and gauge of a piece of copper wire and returns the resistance of that wire.
 double computeCopperWireResistance() {
   double a = 36 - this.wireGauge / 39;
   double b = 92;
   this.copper = (1.678 * Math.pow(10, -8) * 4 * this.length) / ((Math.PI * 0.127 * Math.pow (b,a)) * Math.PI * 0.127 * Math.pow(b,a));
return this.copper;
   }
 // Takes the length and gauge of a piece of aluminum wire and returns the resistance of that wire. The resistivity
 // of aluminum is 2.82 x 10−8 Ω m
 /**
 *This method computes resistance of aluminum wire
 */
double computeAlumWireResistance(){
   double a = 36 - this.wireGauge / 39;
   double b = 92;
   this.aluminum = (2.82 * Math.pow(10, -8) * 4 * this.length) / ((Math.PI * 0.127 * Math.pow(b,a)) * Math.PI * 0.127 * Math.pow(b,a));
return this.aluminum;
 }
 /**
 *This method returns the copper resistance
 */
 public double getCopper(){
   return this.copper;
 }
 /**
*This method returns the aluminum resistance
 */
 public double getaluminum(){
   return this.aluminum;
 }
 public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   System.out.println("Enter the wire gauge: ");
   int wireGauge = in.nextInt();
   System.out.println("Enter the wire length: ");
  double length = in.nextDouble();

    WireResistance14 calc1 = new WireResistance14(length, wireGauge);
   System.out.println("The resistance of a " + calc1.getlength() + " inch piece of " + calc1.getwireGauge() + " gauge Copper wire is " + calc1.getCopper() + " Ohms.");
   System.out.println("The resistance of a " + calc1.getlength() + " inch piece of " + calc1.getwireGauge() + " gauge aluminum wire is " + calc1.getaluminum() + " Ohms.");
 }
}
