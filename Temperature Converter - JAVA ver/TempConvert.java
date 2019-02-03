import java.util.Scanner;

public class TempConvert {
	public static void main (String [] args) {
		char continueLoop = 'Y';
		double temporary = 0;
		double tempKnown; //numerical unit for conversion
		char tempKnownUnit = 'K'; //Unit for known temperature
		double resultTemp = 0; // numerical value for result of conversion 
		char resultTempUnit = 'F'; //unit for display of conversion result
		while(continueLoop == 'Y') {
		System.out.println("Please select starting unit (F = Fahrenheit, C= Celcius, K= Kelvin, R= Reaumur, A= Rankine, N = Newton) ");
		Scanner input = new Scanner(System.in);
		tempKnownUnit = input.next().toUpperCase().charAt(0);
		System.out.println(tempKnownUnit + " is the starting unit for conversion.");
		
		System.out.println("Please input a temperature in " + tempKnownUnit);
		tempKnown = input.nextDouble();
		
		System.out.println ("Please select resulting unit (F = Fahrenheit, C= Celcius, K= Kelvin, R= Reaumur, A= Rankine, N = Newton) ");
		resultTempUnit = input.next().toUpperCase().charAt(0);
		System.out.println("result will be in " + resultTempUnit);
		
		if (tempKnownUnit == 'F' && resultTempUnit == 'K') {
			resultTemp = FtoK (tempKnown);
			System.out.println("Your temperature of " + tempKnown + " " + tempKnownUnit + " converts to " + resultTemp + " " + resultTempUnit);
		}
		else if (tempKnownUnit == 'C' && resultTempUnit == 'F') {
			resultTemp = CtoF(tempKnown);
			System.out.println("Your temperature of " + tempKnown + " " + tempKnownUnit + " converts to " + resultTemp + " " + resultTempUnit);
		}
		else if(tempKnownUnit == 'C' && resultTempUnit == 'K') {
			resultTemp = CtoK(tempKnown);
			System.out.println("Your temperature of " + tempKnown + " " + tempKnownUnit + " converts to " + resultTemp + " " + resultTempUnit);
		}
		else if (tempKnownUnit == 'K' && resultTempUnit == 'C') {
			resultTemp = KtoC(tempKnown);
			System.out.println("Your temperature of " + tempKnown + " " + tempKnownUnit + " converts to " + resultTemp + " " + resultTempUnit);
		}
		else if(tempKnownUnit == 'F' && resultTempUnit == 'C') {
			resultTemp = FtoC(tempKnown);
			System.out.println("Your temperature of " + tempKnown + " " + tempKnownUnit + " converts to " + resultTemp + " " + resultTempUnit);
		}
		else if(tempKnownUnit == 'K' && resultTempUnit == 'F') {
			resultTemp = KtoF(tempKnown);
			System.out.println("Your temperature of " + tempKnown + " " + tempKnownUnit + " converts to " + resultTemp + " " + resultTempUnit);
		}
		else if (tempKnownUnit == 'R' && resultTempUnit == 'C') {
			resultTemp = RtoC(tempKnown);
			System.out.println("Your temperature of " + tempKnown + " " + tempKnownUnit + " converts to " + resultTemp + " " + resultTempUnit);
		}
		else if(tempKnownUnit == 'R' && resultTempUnit == 'F') {
			resultTemp = RtoF(tempKnown);
			System.out.println("Your temperature of " + tempKnown + " " + tempKnownUnit + " converts to " + resultTemp + " " + resultTempUnit);
		}
		else if(tempKnownUnit == 'R' && resultTempUnit == 'K') {
			resultTemp = RtoK(tempKnown);
			System.out.println("Your temperature of " + tempKnown + " " + tempKnownUnit + " converts to " + resultTemp + " " + resultTempUnit);
		}
		else if (tempKnownUnit == 'C' && resultTempUnit == 'R') {
				resultTemp = CtoR(tempKnown);
				System.out.println("Your temperature of " + tempKnown + " " + tempKnownUnit + " converts to " + resultTemp + " " + resultTempUnit);
		}
		else if(tempKnownUnit == 'K' && resultTempUnit == 'R') {
			resultTemp = KtoR(tempKnown);
			System.out.println("Your temperature of " + tempKnown + " " + tempKnownUnit + " converts to " + resultTemp + " " + resultTempUnit);
		}
		else if(tempKnownUnit == 'F' && resultTempUnit == 'R') {
			resultTemp = FtoR(tempKnown);
			System.out.println("Your temperature of " + tempKnown + " " + tempKnownUnit + " converts to " + resultTemp + " " + resultTempUnit);
		}
		else if(tempKnownUnit == 'F' && resultTempUnit == 'A') {
			resultTemp = FtoRA(tempKnown);
			System.out.println("Your temperature of " + tempKnown + " " + tempKnownUnit + " converts to " + resultTemp + " " + resultTempUnit);
		}
		else if(tempKnownUnit == 'A' && resultTempUnit == 'F') {
			resultTemp = RAtoF(tempKnown);
			System.out.println("Your temperature of " + tempKnown + " " + tempKnownUnit + " converts to " + resultTemp + " " + resultTempUnit);
		}
		else if(tempKnownUnit == 'C' && resultTempUnit == 'A') {
			resultTemp = CtoRA(tempKnown);
			System.out.println("Your temperature of " + tempKnown + " " + tempKnownUnit + " converts to " + resultTemp + " " + resultTempUnit);
		}
		else if(tempKnownUnit == 'K' && resultTempUnit == 'A') {
			resultTemp = KtoRA(tempKnown);
			System.out.println("Your temperature of " + tempKnown + " " + tempKnownUnit + " converts to " + resultTemp + " " + resultTempUnit);
		}
		else if(tempKnownUnit == 'R' && resultTempUnit == 'A') {
			resultTemp = RtoRA(tempKnown);
			System.out.println("Your temperature of " + tempKnown + " " + tempKnownUnit + " converts to " + resultTemp + " " + resultTempUnit);
		}
		else if(tempKnownUnit == 'A' && resultTempUnit == 'C') {
			resultTemp = RAtoC(tempKnown);
			System.out.println("Your temperature of " + tempKnown + " " + tempKnownUnit + " converts to " + resultTemp + " " + resultTempUnit);
		}
		else if(tempKnownUnit == 'A' && resultTempUnit == 'K') {
			resultTemp = RAtoK(tempKnown);
			System.out.println("Your temperature of " + tempKnown + " " + tempKnownUnit + " converts to " + resultTemp + " " + resultTempUnit);
		}
		else if(tempKnownUnit == 'A' && resultTempUnit == 'R') {
			resultTemp = RAtoR(tempKnown);
			System.out.println("Your temperature of " + tempKnown + " " + tempKnownUnit + " converts to " + resultTemp + " " + resultTempUnit);
		}
		else if (tempKnownUnit == 'F' && resultTempUnit == 'N') {
			resultTemp = FtoN(tempKnown);
			System.out.println("Your temperature of " + tempKnown + " " + tempKnownUnit + " converts to " + resultTemp + " " + resultTempUnit);
		}
		else if (tempKnownUnit == 'C' && resultTempUnit == 'N') {
			resultTemp = CtoN(tempKnown);
			System.out.println("Your temperature of " + tempKnown + " " + tempKnownUnit + " converts to " + resultTemp + " " + resultTempUnit);
		}
		else if(tempKnownUnit == 'K' && resultTempUnit == 'N') {
			resultTemp = KtoN(tempKnown);
			System.out.println("Your temperature of " + tempKnown + " " + tempKnownUnit + " converts to " + resultTemp + " " + resultTempUnit);
		}
		else if(tempKnownUnit == 'R' && resultTempUnit == 'N') {
			resultTemp = RtoN(tempKnown);
			System.out.println("Your temperature of " + tempKnown + " " + tempKnownUnit + " converts to " + resultTemp + " " + resultTempUnit);
		}
		else if(tempKnownUnit == 'A' && resultTempUnit == 'N') {
			resultTemp = RAtoN(tempKnown);
			System.out.println("Your temperature of " + tempKnown + " " + tempKnownUnit + " converts to " + resultTemp + " " + resultTempUnit);
		}
		else if(tempKnownUnit == 'N' && resultTempUnit == 'F') {
			resultTemp = NtoF(tempKnown);
			System.out.println("Your temperature of " + tempKnown + " " + tempKnownUnit + " converts to " + resultTemp + " " + resultTempUnit);
		}
		else if(tempKnownUnit == 'N' && resultTempUnit == 'C') {
			resultTemp = NtoC(tempKnown);
			System.out.println("Your temperature of " + tempKnown + " " + tempKnownUnit + " converts to " + resultTemp + " " + resultTempUnit);
		}
		else if(tempKnownUnit == 'N' && resultTempUnit == 'K') {
			resultTemp = NtoK(tempKnown);
			System.out.println("Your temperature of " + tempKnown + " " + tempKnownUnit + " converts to " + resultTemp + " " + resultTempUnit);
		}
		else if(tempKnownUnit == 'N' && resultTempUnit == 'R') {
			resultTemp = NtoR(tempKnown);
			System.out.println("Your temperature of " + tempKnown + " " + tempKnownUnit + " converts to " + resultTemp + " " + resultTempUnit);
		}
		else if(tempKnownUnit == 'N' && resultTempUnit == 'A') {
			resultTemp = NtoRA(tempKnown);
			System.out.println("Your temperature of " + tempKnown + " " + tempKnownUnit + " converts to " + resultTemp + " " + resultTempUnit);
		}
		else if(tempKnownUnit == resultTempUnit) {
			System.out.println("Whoops!  You entered the same unit twice!  Therefore, the temperatures are the same when 'converted'.");
		}
		else {
			System.out.println("Sorry, but a unit you entered is not available, or does not exist.  Please check your units and try again");
		}
		System.out.println("Do you want to convert another temperature? (Y == YES, N = NO)");
		continueLoop = input.next().toUpperCase().charAt(0);
		}
	}
		public static double FtoK(double tempKnown) {
		double temporary = FtoC(tempKnown);
		double resultTemp = temporary + 273.15;
		return resultTemp;
	}
	public static double CtoF(double tempKnown) {
		double resultTemp = (tempKnown * (9.0/5)) + 32;
		return resultTemp;
	}
	public static double CtoK(double tempKnown) {
		double resultTemp = tempKnown + 273.15;
		return resultTemp;
	}
	public static double KtoF(double tempKnown) {
		double temporary = tempKnown - 273.15;
		double resultTemp = CtoF(temporary);
		return resultTemp;
	}
	public static double KtoC(double tempKnown) {
		double resultTemp = tempKnown - 273.15;
		return resultTemp;
	}
	public static double FtoC (double tempKnown) {
		double resultTemp = ((tempKnown - 32)*5.0)/9;
		return resultTemp;
	}
	public static double RtoC(double tempKnown) {
		double resultTemp = tempKnown * (5.0/4);
		return resultTemp;
	}
	public static double RtoK(double tempKnown) {
		double temporary = RtoC(tempKnown);
		double resultTemp = CtoK(temporary);
		return resultTemp;
	}
	public static double RtoF(double tempKnown) {
		double temporary = RtoC(tempKnown);
		double resultTemp = CtoF(temporary);
		return resultTemp;
	}
	public static double FtoR(double tempKnown) {
		double temporary = FtoC(tempKnown);
		double resultTemp = CtoR(temporary);
		return resultTemp;
	}
	public static double KtoR(double tempKnown) {
		double temporary = KtoC(tempKnown);
		double resultTemp = CtoR(temporary);
		return resultTemp;
	}
	public static double CtoR(double tempKnown) {
		double resultTemp = tempKnown * (4.0/5);
		return resultTemp;
	}
	public static double FtoRA(double tempKnown) {
		double resultTemp = tempKnown + 459.67;
		return resultTemp;
	}
	public static double CtoRA(double tempKnown) {
		double temporary = CtoF(tempKnown);
		double resultTemp = FtoRA(temporary);
		return resultTemp;
	}
	public static double KtoRA(double tempKnown) {
		double temporary = KtoF(tempKnown);
		double resultTemp = FtoRA(temporary);
		return resultTemp;
	}
	public static double RtoRA(double tempKnown) {
		double temporary = RtoF(tempKnown);
		double resultTemp = FtoRA(tempKnown);
		return resultTemp;
	}
	public static double RAtoF(double tempKnown) {
		double resultTemp = tempKnown - 459.57;
		return resultTemp;
	}
	public static double RAtoC(double tempKnown) {
		double temporary = RAtoF(tempKnown);
		double resultTemp = FtoC(temporary);
		return resultTemp;
	}
	public static double RAtoK(double tempKnown) {
		double temporary = RAtoF(tempKnown);
		double resultTemp = FtoK(temporary);
		return resultTemp;
	}
	public static double RAtoR(double tempKnown) {
		double temporary = RAtoF(tempKnown);
		double resultTemp = FtoR(temporary);
		return resultTemp;
	}
	public static double FtoN(double tempKnown) {
		double resultTemp = (((tempKnown-32) * 11.0) / 60);
		return resultTemp;
	}
	public static double CtoN(double tempKnown) {
		double temporary = CtoF(tempKnown);
		double resultTemp = FtoN(temporary);
		return resultTemp;
	}
	public static double KtoN(double tempKnown) {
		double temporary = KtoF(tempKnown);
		double resultTemp = FtoN(temporary);
		return resultTemp;
	}
	public static double RtoN(double tempKnown) {
		double temporary = RtoF(tempKnown);
		double resultTemp = FtoN(temporary);
		return resultTemp;
	}
	public static double RAtoN(double tempKnown) {
		double temporary = RAtoF(tempKnown);
		double resultTemp = FtoN(temporary);
		return resultTemp;
	}
	public static double NtoF(double tempKnown) {
		double resultTemp = (((tempKnown *60.0) /11) +32);
		return resultTemp;
	}
	public static double NtoC(double tempKnown) {
		double temporary = NtoF(tempKnown);
		double resultTemp = FtoC(temporary);
		return resultTemp;
	}
	public static double NtoK(double tempKnown) {
		double temporary = NtoF(tempKnown);
		double resultTemp = FtoK(temporary);
		return resultTemp;
	}
	public static double NtoR(double tempKnown) {
		double temporary = NtoF(tempKnown);
		double resultTemp = FtoR(temporary);
		return resultTemp;
	}
	public static double NtoRA(double tempKnown) {
		double temporary = NtoF(tempKnown);
		double resultTemp = FtoRA(temporary);
		return resultTemp;
	}
}