/**
* PrintVoltageWater6 class
* @author Dhanushga Lionel
* @version 6.00, 12 Oct 2017
*/
public class PrintVoltageWater6{

	public static void main (String[] args){

		double vm;
		double R;
		int Rs = 75;
		int vs = 20;
		double R0 = 50;
		double k = 0.5;
		System.out.println("Temp" + "\t" + "vm");
		System.out.println("-----" + "\t" + "-----");
		for (int T = 0; T <= 100; T += 10){
			R = R0 + (k * T);
			vm = (R / (R + Rs)) * vs;
			System.out.println(T + " \t" + vm);
		}
	}
}
