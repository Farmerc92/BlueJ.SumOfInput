/**
 * Takes an Integer input and sums up all the integers from 1 to the input.  
 * It then returns that sum.  
 *
 * @author Chris Farmer
 * @version Version 1.1
 */
public class SumOfInput
{
    // instance variables - replace the example below with your own
    private Integer sum;

    /**
     * Constructor for objects of class SumOfInput
     */
    public SumOfInput()
    {
        // initialise instance variables
        sum = 0;
    }
    
    public Integer oneToNumber(Integer numberToSum){
        Integer sum = 0;
        for (int i = 1; i <= numberToSum; i++) {
            sum += i;
        }
        return sum;
    }

}
