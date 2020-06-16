import java.util.Scanner;
import java.lang.Math;

/**
 * 
 */

/**
 * @author Taoheed King
 * Class: CMSC203 
 * Program: Wind Chill
 * Instructor: Professor Gringory Grinberg
 * Description: (I calculate the Wind Chill based on the temp and wind speed
 * entered by the user)
 * Due: MM/DD/YYYY (<06/20/2020>)
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Taoheed King
*/

public class Temperature {
	public static void main(String[] args) {
		
		/**
		 * Created a scanner class
		 */
		Scanner keyboard = new Scanner(System.in);
		/**
		 * Declare and initialized the named constants
		 */
		final double namedConstant1 = 35.74;
		final double namedConstant2 = 0.6215;
		final double namedConstant3 = 0.4275;
		final double namedConstant4 = 0.16;
		/**
		 * Declared some constant String variables
		 */
		final String tempWarning = "REMEMBER, Temperature input must be greater than or equal to -45 but less than \n or equal to 40";
		final String windspeedWarning = "REMEMBER, Wind Chill input must be greater than or equal to 5, but less than or equal to 60";
		/**
		 * Declare variables
		 */
		double fahrenheitTemp = 0;
		double windSpeed = 0;
		double calculateWindChill = 0;
		
		/**
		 * print welcome statement for user along with input guidelines
		 */
		System.out.println("Welcome to the Wind Chill program!");
		
		System.out.println();
		
		//Display temperature input warning
		System.out.println(tempWarning);
		
		System.out.println();
		
		//Ask user for temperature input
		System.out.println("Please enter the Temperature: ");
		
		//User enters input
		fahrenheitTemp = keyboard.nextDouble();
		
		/**
		 * Temperature Validation
		 */
		if (!(fahrenheitTemp >= -45 && fahrenheitTemp <= 40)) {
			
			//Display warning for temperature input
			System.out.println(tempWarning);
			
			//Ask user to enter temperature
			System.out.println("Wrong Input! Please enter the Temperature");
			fahrenheitTemp = keyboard.nextDouble();
			
		} else {
			//Display wind speed input warning
			System.out.println(windspeedWarning);
				
			System.out.println();
				
			//Ask user for wind speed input
			System.out.println("Please enter the Wind Speed: ");
			
			//Enter wind speed input
			windSpeed = keyboard.nextDouble();
			
			/**
			 * Wind Speed Validation
			 */
			if (!(windSpeed >= 5 && windSpeed <= 60)) {
				//Tells user to enter the correct input for temperature				
					System.out.println("Wrong input! Please Re-enter a valid input for the Wind Chill");
					
					System.out.println(windspeedWarning);
					
					//User re-enters correct value
					windSpeed = keyboard.nextDouble();
					
					System.out.println("BREAK");
				} else {
					//Calculate result
					calculateWindChill = (namedConstant1 + (namedConstant2 * fahrenheitTemp)
							- (namedConstant1 * (Math.pow(windSpeed, namedConstant4))) 
							+ ((namedConstant3 * fahrenheitTemp) * (Math.pow(windSpeed, namedConstant4))));
					
					//Display Result
					System.out.println("The Wind Chill temperature: " + (Math.floor(calculateWindChill * 100) / 100) + " degrees Fahrenheit");
					
					System.out.println();
					
					//Programmer
					System.out.println("Programmer: Taoheed King");
					
					//Close keyboard
					keyboard.close();
				}
		}
	}
}