import java.util.*;
public class wifi{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String a=in.next();
		String b=in.next();
		if((a.length()>b.length())||(a.length()==b.length()))
			System.out.println(a);
		else
			System.out.println(b);
		
}}
