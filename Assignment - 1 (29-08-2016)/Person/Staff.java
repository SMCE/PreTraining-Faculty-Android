public class Staff extends Person
{ 

  public String school; 
    public double pay; 
  
  public Staff(String name, String address, String school,  double pay)
  { 
    super(name,address);
    this.school = school; 
    this.pay=pay;
  } 
  public String getschool()
  {
    return school;
  }
  public void setschool(String school)
  {
    this.school = school;
  }
  
 public double getpay()
  {
    return pay;
  }
  public void setpay(double pay)
  {
    this.pay = pay;
  }
  public String toString()
  {
    return getClass() + "\n" + getName() + "\n" + getAddress() + "\n" + getschool() + "\n"+ getpay();
     
  }
 }
