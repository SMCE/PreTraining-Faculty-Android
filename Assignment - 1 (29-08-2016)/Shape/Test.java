public class Test 
{
 public static void main(String[] args) 
{
 Shape rect1 =new Rect();
 Shape rect2 =new Rect(5,3);
 Shape rect3 =new Rect(2,2,"RED",true);
 System.out.println(rect1.toString() + "\n");
 System.out.println(rect2.toString() + "\n");
 System.out.println(rect3.toString() + "\n");
 
 Shape cir1 =new Circle();
 Shape cir2 =new Circle(2);
 Shape cir3 =new Circle(2,"RED",true);
 System.out.println(cir1.toString() + "\n");
 System.out.println(cir2.toString() + "\n");
 System.out.println(cir3.toString() + "\n");

 Shape sqr1 =new Square();
 Shape sqr2 =new Square(3);
 Shape sqr3 =new Square(2,"RED",true);
 System.out.println(sqr1.toString() + "\n");
 System.out.println(sqr2.toString() + "\n");
 System.out.println(sqr3.toString() + "\n");

 }
      
}