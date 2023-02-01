import java.util.Scanner; // Needing to import this class to be able to read from the keyboard.
public class Tax_on_Income_Calculator_for_Canadian {

	
	//This program help Canadian to calculate their total tax payable and the average tax rate. 
	//The total tax payable is calculated as tax rate table for Canadian base on their yearly income and the average tax rate is calculated as the Total Taxes paid / Taxable income

		public static void main(String[] args) {
			
			//Declaring variables for tax rate 
			final double rate1 = 0.15;
			final double rate2 = 0.205;
			final double rate3 = 0.26;
			final double rate4 = 0.29;
			final double rate5 = 0.33; 		
			

			
			//Declaring scanner
			Scanner input = new Scanner(System.in);
			
			//Prints a welcome message.
			System.out.println("Welcome to the tax calculator program");
			
			//Asking User for input
			System.out.println("Enter your taxable income: ");
			
			double income = input.nextDouble();
			


			// Declare if Statement if the user income is less than or equal to 49020
			if (income <= 49020 ) {
				
				//Declaring a variable for calculate tax for rate 1 
				double tax1 = income * rate1;
				System.out.println("Pay 15.0% on the amount $"+ income + " or $" + tax1);	
				
				//Calculating Total taxes paid
				double sum = tax1;
				//Calculating Average tax rate
				double average = sum/ income;
				double averagePrecentage = average * 100;
				//display Total taxes paid and average tax rate
				System.out.println("The tax amount is: $" + sum);
				System.out.println("The average tax rate is: " +averagePrecentage+ "%");
				
				}
				
			// Declare if Statement if the user income is between 49020 and 98040
			else if (income >= 49020 && income <= 98040 ) {	
				//Declaring a variable for calculate tax for rate 1 
				double tax1 = 49020 * rate1;
				System.out.println("Pay 15.0% on the amount $49020.0 or $" + tax1);	
				 
				//Declaring variables for calculate tax for rate 2
				double tax2 = income - 49020;
				double tax2Remain = tax2 * rate2;
				
				System.out.println("Pay 20.5% on the amount $" +tax2+ " or $" + tax2Remain);
				
				//Calculating Total taxes paid
				double sum = tax2Remain + tax1;
				//Calculating Average tax rate
				double average = sum/ income;
				double averagePrecentage = average * 100;
				//display Total taxes paid and average tax rate
				System.out.println("The tax amount is: $" + sum);
				System.out.println("The average tax rate is: " +averagePrecentage+ "%");
				
			}
			
			// Declare if Statement if the user income is between 98040 and 151978
			else if (income >= 98040 && income <= 151978 ) {	
				
				//Declaring a variable for calculate tax for rate 1
				double tax1 = 49020 * rate1;
				System.out.println("Pay 15.0% on the amount $49020.0 or $" + tax1);	
				 
				//Declaring a variable for calculate tax for rate 2
				double tax2 = 49020 * rate2;
				
				System.out.println("Pay 20.5% on the amount $49020.0 or $" + tax2);
				
				//Declaring variables for calculate tax for rate 3
				double tax3 = income - 98040;
				double tax3Remain = tax3 *rate3;
				
				System.out.println("Pay 26.0% on the amount $" +tax3+ " or $" + tax3Remain);
				
				//Calculating Total taxes paid
				double sum = tax3Remain + tax2 + tax1;
				//Calculating Average tax rate
				double average = sum/ income;
				double averagePrecentage = average * 100;
				//display Total taxes paid  and average tax rate
				System.out.println("The tax amount is: $" + sum);
				System.out.println("The average tax rate is: " +averagePrecentage+ "%");
			}
			
			// Declare if Statement if the user income is between 151978 and 216511
			else if (income >= 151978 && income <= 216511 ) {	
				
				//Declaring a variable for calculate tax for rate 1
				double tax1 = 49020 * rate1;
				System.out.println("Pay 15.0% on the amount $49020.0 or $" + tax1);	
				
				//Declaring a variable for calculate tax for rate 2
				double tax2 = 49020 * rate2;
				
				System.out.println("Pay 20.5% on the amount $49020.0 or $" + tax2);
				
				//Declaring a variable for calculate tax for rate 3
				double tax3 = 53938 *rate3;
				
				System.out.println("Pay 26.0% on the amount $53938.0 or $" + tax3);
				
				//Declaring variables for calculate tax for rate 4
				double tax4 = income - 151978;
				double tax4Remain = tax4 *rate4;
				
				System.out.println("Pay 29.0% on the amount $" +tax4+ " or $" + tax4Remain);
				
				//Calculating Total taxes paid
				double sum = tax4Remain+tax3 + tax2 + tax1;
				//Calculating Average tax rate
				double average = sum/ income;
				double averagePrecentage = average * 100;
				//display Total taxes paid  and average tax rate
				System.out.println("The tax amount is: $" + sum);
				System.out.println("The average tax rate is: " +averagePrecentage+ "%");
			}
			
			// Declare if Statement if the user income is more than or equal to 216511
			else if (income >= 216511 ) {	
				
				//Declaring a variable for calculate tax for rate 1
				double tax1 = 49020 * rate1;
				System.out.println("Pay 15.0% on the amount $49020.0 or $" + tax1);	
				 
				//Declaring a variable for calculate tax for rate 2
				double tax2 = 49020 * rate2;
				System.out.println("Pay 20.5% on the amount $49020.0 or $" + tax2);
				
				//Declaring a variable for calculate tax for rate 3
				double tax3 = 53938 *rate3;
				System.out.println("Pay 26.0% on the amount $64533.0 or $" + tax3);
				
				//Declaring a variable for calculate tax for rate 4
				double tax4 = 64533 *rate4;
				System.out.println("Pay 29.0% on the amount $64533.0  or $" + tax4);
				
				//Declaring variables for calculate tax for rate 5
				double tax5 = income - 216511;
				double tax5Remain = 151978 *rate4;
				
				System.out.println("Pay 32.0% on the amount $" +tax5+ " or $" + tax5Remain);
				
				//Calculating Total taxes paid
				double sum = tax5Remain + tax4 +tax3 + tax2 + tax1;
				//Calculating Average tax rate
				double average = sum/ income;
				double averagePrecentage = average * 100;
				//display Total taxes paid  and average tax rate
				System.out.println("The tax amount is: $" + sum);
				System.out.println("The average tax rate is: " +averagePrecentage+ "%");
			}
			
			// Declare if Statement if the user input is wrong
			else {
	          System.out.println("Error");
	      }
			

			  //Close the Scanner Object
		    input.close();	
			
			
		}

	}