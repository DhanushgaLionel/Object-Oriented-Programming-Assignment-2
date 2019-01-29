/**
* WoodenBeam class
* @author Dhanushga Lionel 100616831
* @version 8.00, 12 Oct 2017
*/

public class WoodenBeam8{
  double distanceInFeet,height,width,stress,MaxLoad;
/**
* @param distanceInFeet is variable for length of beam
*@param height is variable for height of beam
* @param width is variable for width of beam
*/
public WoodenBeam8(double distanceInFeet, double height, double width){
this.distanceInFeet = distanceInFeet;
this.height = height;
this.width = width;
}
/**
*this method coverts the lenght of beam from feet to inches
*/
public double convertFeetToInches(){
    return this.distanceInFeet * 2.54;
    }
/**
*This method calculates the interia of the beam with the formula base*(height^3)/12
*/
public double inertia(){
    return (this.width * (this.height * this.height * this.height)) / 12;
    }
/**
* This method calulates the half of the height of the beam
*/
public double centeroid(){
    return this.height * 0.5;
     }
/**
*This method computes the maximum load that can be placed at the end of a symmetrical wooden beam
*/
  public double computeMaxLoad(double stress){
  this.stress = stress;
  this.MaxLoad = MaxLoad;
    MaxLoad = (stress * (this.width * (this.height * this.height * this.height)) / 12) / ((this.distanceInFeet *   2.54 * (this.height * 0.5)));
  return this.MaxLoad;
    }
    /**
    *This method gets the stress of the load that is specified
    */

    public double getstress(){
      return this.stress;
    }
    /**
    *This method returns the maximum load can be placed at the end of a symmetrical wooden beam
    */

    public double getMaxLoad(){
      this.MaxLoad = MaxLoad;
        MaxLoad = (stress * (this.width * (this.height * this.height * this.height)) / 12) / ((this.distanceInFeet *   2.54 * (this.height * 0.5)));
      return this.MaxLoad;
    }
    /**
    *This method returns the length of the beam
    */

public double getlength(){
    return this.distanceInFeet;
    }
    /**
    *This method return the height of the beam
    */

  public double getheight(){
    return this.height;
    }
    /**
    *This method returns the width of the beam
    */
public double getbase(){
    return this.width;
  }
public static void main(String[] args){
  //Initialize WoodenBeam objects
    WoodenBeam8 wb1 = new WoodenBeam8(8.0, 2.0, 4.0);
    WoodenBeam8 wb2 = new WoodenBeam8(8.0, 3.0, 6.0);
    double maxload1 = wb1.computeMaxLoad(3000.0);
    double maxload2 = wb2.computeMaxLoad(3000.0);
    //Print Info
    System.out.println("For Beam #1:");
    System.out.print("The length of the beam is d = " + wb1.getlength() + " feet");
    System.out.println(" which is equal to " + wb1.convertFeetToInches() + " inches");
    System.out.println("The length of the base is b = " + wb1.getbase() + " inches");
    System.out.println("The height of the beam is h = " + wb1.getheight() + " inches");
    System.out.println("The stress on the fixed end of the beam is S = " + wb1.getstress() + " lbs per square inch");
    System.out.println("The rectangualr moment of inertia is: " + wb1.inertia() + " in^4");
    System.out.println("The centroid of the beams is: " + wb1.centeroid() + " inches");
    System.out.print("Using the formula L = (S * i) / (d * c) = (3000 * 10.67) / (96 * 2)");
    System.out.println(", the maximum load that can be placed at the end of the beam is: " + wb1.getMaxLoad() + " lbs");
    System.out.println("\n\n");
    System.out.println("For Beam #2:");
    System.out.print("The lenght of the beam is d = " + wb2.getlength() + " feet");
    System.out.println(" which is equal to " + wb2.convertFeetToInches() + " inches");
    System.out.println("The lenght of the base is b = " + wb2.getbase() + " inches");
    System.out.println("The height of the beam is h = " + wb2.getheight() + " inches");
    System.out.println("The stress on the fixed end of the beam is S = " + wb2.getstress() + " lbs per square inch");
    System.out.println("The rectangualr moment of inertia is: " + wb2.inertia() + "in^4");
    System.out.println("The centroid of the beams is: " + wb2.centeroid() + " inches");
    System.out.print("Using the formula L = (S * i) / (d * c) = (3000 * 10.67) / (96 * 2)");
    System.out.println(", the maximum load that can be placed at the end of the beam is: " + wb2.getMaxLoad() + " lbs");
  }
}
