public class BMICalculator 
{   
    /* TOBIAS MELDIA 200209
     * Natasha Kliva 210547
     * MCS YEAR 2 */
    
    public BMICalculator()
    {   
        // NO CODE REQUIRED HERE
    }
    
    public double value ( double weight, double height )
    {   /* BMI CALCULATION
        In this method, when the two  parameters 'weight' & 'height' are
        given values from the main method where the method is been called,
        the BMI is calculated by dividing weight by the square of height.
        Then the method returns a value of the BMI */
        
        double BMI;
        BMI = weight/(height*height);
        return BMI;
        
    }//************************************************************************
    
    public String classification8 ( double bmi ) 
    {   
        double newBMI = bmi;
        
        /* In this method 'classification8', when a value is given to the
        parameter 'bmi' from the main method, then it will return a string
        value from any of the 8 category listed in the if statements back
        to the main method where it is exactly been called. */
        
        if ( newBMI >= 0 && newBMI < 15.9 )
        {   // CATHEGORY 1
            return "Very severely underweight\n";
        }
        
        else if ( newBMI >=15.9 && newBMI < 16.9)
        {   // CATEGORY 2
            return "Severely underweight\n";
        }
        
        else if ( newBMI >= 16.9 && newBMI < 18.4)
        {   // CATEGORY 3
            return " Underweight\n";
        }
        
        else if ( newBMI >= 18.4 && newBMI < 24.9)
        {   // CATEGORY 4
            return " Normal(Healthy/Normal)\n";
        }
        
        else if ( newBMI >= 24.9 && newBMI < 29.9)
        {   // CATEMGORY 5
            return " Overweight(Pre-obese)\n";
        }
        
        else if ( newBMI >= 29.9 && newBMI < 34.9)
        {   // CATEGORY 6
            return " Obese Class I (Moderately obese)\n";
        }
        
        else if ( newBMI >= 34.9 && newBMI < 39.9)
        {   // CATEGORY 7
            return " Obese Class II (Severely obese)\n";
        }
        
        else if ( newBMI >= 39.9)
        {   // CATEGORY 8
            return" Obese Class III (Very severely obese)\n";
        }
        
        else 
        {   // in case negative values are entered
            return "No negative values are allowed";
        }
    
    } //***********************************************************************
    
    public String classification3( double bmi )
    {   
        /* In this method 'classification3', when a value is given to the
        parameter 'bmi'from the main method, then it will return a string
        value from any of the 3 category stated in if statements back to
        the main method where it is exactly been called. */
        
        double newBMI = bmi;
        
        if ( newBMI >=0 && newBMI < 18.5) // LOWEST BMI
        {
            return "Lowest BMI:";
        }
        
        else if ( newBMI >= 18.5 && newBMI < 25) // NORMAL BMI
        {
            return "Average BMI:";
        }
        
        else if ( newBMI >= 25 ) // HIGHEST BMI
        {
            return "Highest BMI:";
        }
        
        else // in case the user inputs a negative value
        {
            return "No negative values allowed.";
        }
    
    } //**********************************************************************

} // EXIST THE CLASS
