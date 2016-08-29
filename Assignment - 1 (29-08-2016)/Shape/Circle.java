public  class Circle extends Shape
{ 
  public double radius;
        
 public Circle()
 {
  this(1);
  }
public Circle(double r)
 {
  this.radius = r;
 } 
public Circle(double r, String color, boolean filled)
 {
  super(color,filled);
  this.radius = r;
  }

  public double getradius()
  {
    return radius;
  }
  public void setradius(double radius)
  {
    this.radius = radius;
  }
  
  public double getArea() 
   {
       return 3.14* radius*radius;
    }

    public double getPerimeter() 
    {
       return 2 * 3.14*radius;
    }
  public String toString()
  {
    return getClass() + "\n" + getcolor()+ "\n" + getfilled() +"\n" +"radius: " + getradius() + "\n"+ "Area: "+getArea() + " " + "Perimeter: "+getPerimeter();
     
  }
}