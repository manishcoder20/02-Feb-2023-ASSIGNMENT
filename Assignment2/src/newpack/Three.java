package newpack;
import java.util.*;


public class Three 
{
	public static void main(String args[])
    {
    	Scanner newscanner=new Scanner(System.in);
    	System.out.print("Enter units Consumed : ");
		int consume=newscanner.nextInt();
 
        System.out.println(
            calcbill(consume));
        newscanner.close();
    }

public static int calcbill(int unitconsume)
{
		    
	if (unitconsume > 300) 
	        {
	        return (100 * 10)+(100 * 15)+(100 * 20)+(unitconsume - 300)*25;
	        }
		    
    else if (unitconsume <= 300) 
	        {
	        return (100 * 10)+(100 * 15)+(unitconsume - 200)*20;
	        }
		    
    else if (unitconsume <= 200) 
	        {
	        return (100 * 10)+ (unitconsume - 100)* 15;
	        }
		    
    else if (unitconsume <= 100) 
	        {
	            return unitconsume * 10;
	        }
	return 0;
}
	 

}

