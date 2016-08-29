public  class Rect extends Shape
{ 
  public double width;
  public double length;
       
 public Rect()
 {
  this(1,1);
  }
public Rect(double w, double l)
 {
  this.width = w;
  this.length = l;
 } 
public Rect(double w, double l, String color, boolean filled)
 {
  super(color,filled);
  this.width = w;
  this.length = l;
  }

  public double getwidth()
  {
    return width;
  }
  public void setwidth(double width)
  {
    this.width = width;
  }
  public double getlength()
  {
    return length;
  }
  public void setlength(double length)
  {
    this.length = length;
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
    return getClass() + "\n" + getcolor()+ "\n" + getfilled() +"\n" +"width: " + getwidth() + " " +"length: "+getlength()+"\n"+ "Area: "+getArea() + " " + "Perimeter: "+getPerimeter();
     
  }
}