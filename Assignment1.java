// import the required classes
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Arrays;

public class Assignment1 {
    
    /* TOBIAS MELDIA 200209
     * Natasha Kliva 210547
     * MCS YEAR 2 */
    
    public static void main (String[] args) {
        
        // LOCAL VARIABLES
        double weight, height;
        double arrayBMI[] = new double[10]; // array to hold 10 values
        double mini;
        double maxi;
        double average;
        int N; // N for 10 people
        int numLow = 0;
        int numNormal = 0;
        int numHigh = 0;
         
        
        
        // to perform rounding to one decimal place
        DecimalFormat oneDeciPoint = new DecimalFormat("###.#");
        
        // creating a Scanner object
        Scanner take = new Scanner(System.in);
        
        // creating a object of BMICalculator
        BMICalculator call = new BMICalculator();
        
        // WELCOME MESSAGE
        System.out.println("WELCOME TO DWU STUDENTS BMI CALCULATOR");
        System.out.println(":::::::::::::::::::::::::::::::::::::");
        
        // for loop for N = 10;
        for ( N = 0; N < arrayBMI.length; N++ )
        {   
            // these two questions will repeat N = 10 times
            System.out.print("Height for person " + (N+1) + " (m): ");
            height = take.nextDouble();
            System.out.print("Weight for person " + (N+1) + " (kgs): ");
            weight = take.nextDouble();
            
            //passing the value of weight & height the te parameters of value method
            arrayBMI[N] = call.value(weight, height);
            
            // passing the value of newBMI to the parameter bmi of the method classsification8
            String class8 = call.classification8(arrayBMI[N]);
            
            if( arrayBMI[N] >= 0 && arrayBMI[N] < 18.5)
            {
                System.out.println( "BMI = " + arrayBMI[N] + "\nBMI for Person " +
                        (N+1) + " : " + oneDeciPoint.format(arrayBMI[N]) +
                        " kg/m^2, which is " + class8 );
            }
            
            else if ( arrayBMI[N] >= 18.5 && arrayBMI[N] < 25 )
            {
                System.out.println( "BMI = " + arrayBMI[N] + "\nBMI for Person " +
                        (N+1) + " : " + oneDeciPoint.format(arrayBMI[N]) +
                        " kg/m^2, which is " + class8 );
            }
            
            else if ( arrayBMI[N] >= 25) 
            {
                System.out.println( "BMI = " + arrayBMI[N] + "\nBMI for Person " +
                        (N+1) + " : " + oneDeciPoint.format(arrayBMI[N]) +
                        " kg/m^2, which is " + class8 );
            }
            
            else // in case negative inputs are entered
            {
                System.out.println("Negative values are not allowed.");
            }
 
        } // The for loop ends here....
        
        /* Sort array list from the lowest to the hight. So the the first
        value of the raay is the lowest, last the value is the highest and
        the average is in between the 5th & te 6th element of the array */
        
        Arrays.sort(arrayBMI);
        mini = arrayBMI[0];
        maxi = arrayBMI[9];
        average = (arrayBMI[0]+arrayBMI[1]+arrayBMI[3]+arrayBMI[4]+arrayBMI[5]+
                arrayBMI[6]+arrayBMI[7]+arrayBMI[8]+arrayBMI[9])/N;
        
        // passing the values to the parameter of the classsification3
        String minBMI = call.classification3(mini);
        String maxBMI = call.classification3(maxi);
        String averageBMI = call.classification3(average);
        
        for ( N = 0; N < arrayBMI.length; N++){
            if (arrayBMI[N] >= 0 && arrayBMI[N] < 18.9) {
                numLow++;
            }
            else if (arrayBMI[N] >= 18.9 && arrayBMI[N] < 25) {
                numNormal++;
            }
            else if (arrayBMI[N] > 25) {
                numHigh++;
            }
        }
        
        // SUMMARY
        System.out.println("\nSummary");
        System.out.println("*****************************************");
        System.out.println(minBMI +" "+ oneDeciPoint.format(mini));
        System.out.println(maxBMI +" "+ oneDeciPoint.format(maxi));
        System.out.println(averageBMI +" "+ oneDeciPoint.format(average));
        System.out.println("Number with low BMI: " + numLow);
        System.out.println("Number with normal BMI: " + numNormal);
        System.out.println("Number with high BMI: " + numHigh);
        System.out.println("*****************************************");
        
        // GOODBYE MESSAGE
        System.out.println("\nTHANK YOU FOR USING DWU STUDENTS BMI CALCULATOR!\n");
    
    } // end of the MAIN METHOD

} // EXIT THE CLASS
