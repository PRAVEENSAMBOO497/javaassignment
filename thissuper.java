

class student1
{
 String name;
 int roll;
 String status;

 student1()
 {
    name ="hari";
    roll = 2;
    status ="software devolper";
    this.displaystudent1();
 }
 public void displaystudent1()
 {
    System.out.println("student1 naame="+name);
    System.out.println("student1 roll="+roll);
    System.out.println("student1 status="+status);
 }
}
class student2 extends student1
{
    student2()
 {   
    super();
    name = "Muthu";
    roll = 1;
    status =" marketing work";
    this.displaystudent2();
 }

public void displaystudent2()
 {
    System.out.println("student2 name="+name);
    System.out.println("student2 int="+roll);
    System.out.println("student2 status="+status);
 }
}
class student3 extends student2
{
    student3()
    {
    super();
    name = "suraj";
    roll = 3;
    status = "sofware devolper";
    this.displaystudent3();
    }

public void displaystudent3()
    {
    System.out.println("student3 name="+name);
    System.out.println("student3 int="+roll);
    System.out.println("student3 status="+status);
    }
}    
class example4
{
    public static void main (String sjh[])
    {
       student3 obj1=new student3();
    }
}
