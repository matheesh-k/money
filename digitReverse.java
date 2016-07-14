import java.util.*;
public class digitReverse{
	public static void main(String[] args) {
		System.out.println("enter the digit");
		Scanner me=new Scanner(System.in);
		String stay=me.nextLine();
		char way[]= stay.toCharArray();
		System.out.println("the reversed digit:");
		for(int j=way.length-1;j>=0;j--){ 
			System.out.print(way[j]);
			
		}
		// TODO Auto-generated method stub
	}

	}


