/* ACD_JAVAB_Session_5_Assignment_3_Main :
 * Calculate the area of square and rectangles using constructor overloading.
 */
package session5;
import java.util.Scanner;
class area
{
	area(float x)
	{
		System.out.println("Area of Square is " + (x*x) + " sq.units");
	}
	
	area (float x, float y)
	{
		System.out.println("Area of Rectangle is " + (x*y) + " sq.units");
	}
}

public class ACD_JAVAB_Session_5_Assignment_3_Main 
{
	public static void main(String[] args)
	{
		float a = 0, b = 0;
		Scanner s = new Scanner(System.in);

		System.out.print("Enter the Side of a Square : ");
		a = s.nextFloat();
		@SuppressWarnings("unused")
		area square = new area(a);		
		System.out.println("--------------------------------------------");
		System.out.println("Enter the Length & Breadth of a Rectangle : ");
		a = s.nextFloat();
		b = s.nextFloat();
		@SuppressWarnings("unused")
		area rectangle = new area(a,b);
		s.close();
	}
}

/* OUTPUT

Enter the Side of a Square : 10.5
Area of Square is 110.25 sq.units
--------------------------------------------
Enter the Length & Breadth of a Rectangle : 

10
12.5
Area of Rectangle is 125.0 sq.units

*/