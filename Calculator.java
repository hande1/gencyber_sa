
/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Calculator
     */
    public Calculator()
    {
        // initialise instance variables
     
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sum(int x, int y)
    {
        
        return x+y ;
    }
    
    public int subtract(int x,int y){
        return x-y;
    }
    
    public int multiply(int x,int y){
        return x*y;
    }
    
    public int divide(int x,int y){
        return x/y;
    }
    
    public int max(int x, int y){
        
        if(x>y){
            return x;
        }else if(y>x){
            return y;
        }
        else{
         return 0;
        }
    }
}
