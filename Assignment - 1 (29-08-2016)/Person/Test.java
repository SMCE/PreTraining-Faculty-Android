public class Test 
{
 public static void main(String[] args) 
{
 Person person = new Person("SSB","GUNTUR");
 Person student = new Student("SSB","GNT","CSE",2016,500);
Person staff = new Staff("SSB","GNT","SMCE",25000);
 System.out.println(person.toString() + "\n");
 System.out.println(student.toString() + "\n");
System.out.println(staff.toString()+ "\n");
 
 }
      
}