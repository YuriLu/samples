/*
*Task is to check whether the given three llines are concurrent or not.
*Three lines are said to be concurrentif they pass through same point i.e.,they meet at same point.
*/

class Three_Straight_Lines_Are_Concurrent_Or_Not{
	static boolean check(int a1,int b1,int c1,int a2,int b2,int c2,int a3,int b3,int c3){
		return (a3*(b1*c2-b2*c1/a1*b2-a2*b1)+b3*(c1*a2-c2*a1/a1*b2-a2*b1)+c3*(a1*b2-a2*b1)==0);
		
	}
	public static void main(String []args){
		int a1=2,b1=-3,c1=5;
		int a2=3,b2=4,c2=-7;
		int a3=9,b3=-5,c3=4;
		boolean b=check(a1,b1,c1,a2,b2,c2,a3,b3,c3);
		if(b)
			System.out.println("Three line are concurrent.");
		else
			System.out.println("Not concurrent.");
	}
}