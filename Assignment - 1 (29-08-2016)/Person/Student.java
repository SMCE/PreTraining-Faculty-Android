public class Student extends Person
{ 

  public String program; 
  public int year;
  public double fee; 
  
  public Student(String name, String address, String program, int year, double fee)
  { 
    super(name,address);
    this.program = program; 
    this.year = year; 
    this.fee=fee;
  } 
  public String getprogram()
  {
    return program;
  }
  public void setprogram(String program)
  {
    this.program = program;
  }
  public int getyear()
  {
    return year;
  }
  public void setyear(int year)
  {
    this.year = year;
  }
 public double getfee()
  {
    return fee;
  }
  public void setfee(double fee)
  {
    this.fee = fee;
  }
  public String toString()
  {
    return getClass() + "\n" + getName() + "\n" + getAddress() + "\n" + getprogram() + "\n" + getyear()+ "\n" + getfee();
     
  }
 }
