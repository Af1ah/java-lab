/*11.Create a class Student to read and display the student details. Create another class
mark inherit from student to read marks of 5 subjects and find total and average.
Write a Java program to display the result of a student.  */
public class student {
    public static void main(String args[]){
        Details s1=new Details("shehna",1,32,65,87);
        s1.percentage();
        s1.printDetails();
    }
}
class Details{
    String name;
    int rollno;
    float mark1,mark2,mark3,p;
    Details(String n,int r,float m1,float m2,float m3)
    {
        name=n;
        rollno=r;
        mark1=m1;
        mark2=m2;
        mark3=m3;
    }
    void percentage(){
        p=((mark1+mark2+mark3)/300)*100;
    }
    void printDetails()
    {
        System.out.println("rollno:"+rollno);
        System.out.println("name:"+name);
        System.out.println("mark1:"+mark1);
        System.out.println("mark2:"+mark2);
        System.out.println("mark3:"+mark3);
        System.out.println("percentage:"+p+"%");
        System.out.println("...............");
    }
}

