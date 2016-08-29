public class Test 
{
 public static void main(String[] args) 
{
Shape rect1 =new Rect();
 Shape rect2 =new Rect(5,3);
 Shape rect3 =new Rect("RED",true,2,2);
System.out.println(rect1.toString() + "\n");
System.out.println(rect2.toString() + "\n");
 System.out.println(rect3.toString() + "\n");
 
 }
      
}