/*
*coordinates of the center of a sphere(cx,cy,cz) and its radius.
*Task is to check whether a point (x,y,z)lies inside,outside or on this sphere.

Tip:A point (x,y,z) is inside the sphere with center and radius if
*->>(x-cx)^2+(y-cy)^2+(c-cz)^2<radius^2.
*similarly:on the sphere if distance between points is equal to radius^2.
          :outside the sphere if distance between points is greater than radius^2. 
*/
import java.util.Scanner;
class Point_Lies_Inside_Sphere_or_Not{
	public static int check(int cx,int cy,int cz,int a,int b,int c){
		int x1=(int)Math.pow((a-cx),2);
		int x2=(int)Math.pow((b-cy),2);
		int x3=(int)Math.pow((c-cz),2);
		return x1+x2+x3;
		
	}
	public static void main(String[] args){
		
		/*int a=21,b=11,c=21,cx=0,cy=0,cz=0;
		int radius=3;
		*/
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the point to check:");
		int cx=0,cy=0,cz=0;//cx,cy,cz represents center point.
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		System.out.println("Eneter radius:");
		int radius=s.nextInt();
		int result=check(cx,cy,cz,a,b,c);
		if(result<radius*radius)
			System.out.println("Point is inside the sphere");
	else if(result==radius*radius)
			System.out.println("Point lies on the sphere.");
		else
			System.out.println("Point is outside the sphere.");
	}
}