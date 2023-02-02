package newpack;
import java.util.*;
public class One {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Random 4 Digits to Check : ");
	
		List<Integer> checker=new ArrayList();
		checker.add(sc.nextInt());
		checker.add(sc.nextInt());
		checker.add(sc.nextInt());
		checker.add(sc.nextInt());
		checker.forEach(odd->
		    {
			if(odd%2!=0)
				System.out.println("The Odd Numbers are : "+odd);
			});
		sc.close();
	}

}
