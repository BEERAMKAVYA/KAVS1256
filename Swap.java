import java.util.*;
class Swap
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter x value:");
        int x=s.nextInt();
        System.out.print("Enter y value:");
        int y=s.nextInt();
        System.out.print("Enter z value:");
        int z=s.nextInt();
        System.out.println("Before swapping");
        System.out.println("=======================");
        System.out.println("x= "+x);
        System.out.println("y= "+y);
        System.out.println("z= "+z);
        int a=x;
        x=y;
        y=z;
        z=a;
        System.out.println("After swapping");
        System.out.println("=======================");
        System.out.println("x= "+x);
        System.out.println("y= "+y);
        System.out.println("z= "+z);
        
    }
}