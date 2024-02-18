package mystudent;

public class App {
    public static void main(String[] args) {

Student myStudent = new Student();
myStudent.firstName= "Michael";
myStudent.lastName = "Jordan";
myStudent.major = "Business";
myStudent.GPA = "3.8";
myStudent.age = "50";
myStudent.onProbation = false;
System.out.println(myStudent.firstName);
System.out.println(myStudent.lastName);
    }

    
}
