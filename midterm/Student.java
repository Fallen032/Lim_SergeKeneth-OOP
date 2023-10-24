import java.util.Scanner;

class Student {
   String first_name;
   String middle_name;
   String last_name;
   String suffix;
   String full_name;
   
   public void setfirstName(String Name){
      this.first_name = Name;
   }
   public void setmiddleName(String Middle){
      this.middle_name = Middle;
   }
   public void setlastName(String Last){
      this.last_name = Last;
   }
   public void setSuffix(String Suffix){
      this.suffix = Suffix;
   }
   public String getfirstName(){
      return first_name;
   }
   public String getmiddleName(){
      return middle_name;
   }
   public String getlastName(){
      return last_name;
   }
   public String getSuffix(){
      return suffix;
   }
   public String getfullName(){
      return first_name + " " + middle_name + " " + last_name + " " + suffix;
   }
   
   public static void main(String[] args) {
    Student info = new Student();
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter first name: ");
    String first = input.nextLine();
    info.setfirstName(first);
    
    System.out.print("Enter middle name: ");
    String middle = input.nextLine();
    info.setmiddleName(middle);
    
    System.out.print("Enter last name: ");
    String last = input.nextLine();
    info.setlastName(last);
    
    System.out.print("Enter suffix: ");
    String suffix = input.nextLine();
    info.setSuffix(suffix);
    
   System.out.println("First Name: " + info.getfirstName());
   System.out.println("Middle Name: " + info.getmiddleName());
   System.out.println("Last Name: " + info.getlastName());
   System.out.println("Suffix:  " + info.getSuffix());
   System.out.println("Full Name: " + info.getfullName());
 }
}
