
/**
 * Write a description of class MyCalculator here.
 *
 * @HandeD (your name)
 * @version (a version number or a date)
 */
public class MyCalculator
{
   public int Add(int x, int y){
    
       return x+y;
    }
    
    public int Subtract(int x, int y){
    
       return x-y;
    }
    
    public int Multiply(int x, int y){
    
       return x*y;
    }

   public int Divide(int x, int y){
    
       return x/y;
    }
    
    public int Average(int x,int y, int z, int a){
    
    return Add(Add(x,y),Add(z,a))/4;
    
    }
    
    public int Max(int x, int y, int z){
    int result = 0;
    
            if(x>y){
                result = x;
                if(x>z){
                    result = x;
                }
                else if(z>x){
                    
                    result = z;
                }
            } else{ // y>x
                
                if(y>z){
                    result = y;
                }else{
                    result = z;
                }
            
            } // end else
    
            return result;
    }//end max method
    

    
   
    
    
}
