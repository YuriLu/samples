/*
*A string is said to be Colindrome if it has consecutive 3 alphabets 
*followed by the reverse of those 3 alphabets and so on...
happy coding....14/11/18
*/
import java.util.Scanner;
class Colindrome{
	public static void main(String[] args){
		String s1="";
		String s2="";
		//String str="aabbaac";avoid scanner to use this.
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any String:");
		String str=s.nextLine();
		for(int i=0;i<3;i++){
			s1=s1+str.charAt(i);
		}
		for(int i=3;i<6;i++){
			s2=s2+str.charAt(i);
		}
		if(s1.equals(s2))
			System.out.println("colindrome");
		else
			System.out.println("not colindrome");
		
	}
}