public  class Square extends Rect
{ 
  public double side;
        
 public Square()
 {
  this(1);
  }
public Square(double s)
 {
 super(s,s);
 this.side = s;
 } 
public Square(double s, String color, boolean filled)
 {
  super(s,s);
  super.color = color;
  super.filled = filled;
  this.side = s;
  }

  public double getside()
  {
    return side;
  }
  public void setside(double side)
  {
    this.side = side;
  }
     public void setwidth(double side)
  {
    this.width = side;
  }
  public void setlength(double side)
  {
    this.length = side;
  }
 public double getArea() 
   {
       return width * length;
    }

    public double getPerimeter() 
    {
       return 2 * (width + length);
    }
 
  public String toString()
  {
    return getClass() + "\n" + getcolor()+ "\n" + getfilled() +"\n" +"side: " + getside() + "\n"+ "Area: "+getArea() + " " + "Perimeter: "+getPerimeter();
     
  }
}