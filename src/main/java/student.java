/*
jack kilkenny
G00401535
26/10/2023
STUDENT APP
*/
package ie.atu;

public class student {
    private String studentName;
    private String studentEmail;
    private String courseName;
    private String studentBName;
    private String studentBEmail;
    private String courseBName;


    //Setters
    public void setStudentName(String studentName){this.studentName = studentName;}
    public void setStudentEmail(String studentEmail){
        this.studentEmail = studentEmail;
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    //Getters
    public String getStudentName(){return studentName;}
    public String getStudentEmail(){return studentEmail;}
    public String getCourseName(){return courseName;}

    public student(){
        this.studentName = "DefaultName";
        this.studentEmail = "DefaultEmail@atu.ie";
        this.courseName = "DefaultCourse";
    }

    public student(String studentBName){
        this.studentBName = studentBName;
    }
    public void setStudentBEmail(String studentBEmail){
        this.studentBEmail = studentBEmail;
    }
    public void setCourseBName(String courseBName){
        this.courseBName = courseBName;
    }
    public String getStudentBEmail(){
        return studentBEmail;
    }
    public String getCourseBName(){
        return courseBName;
    }



    public void displayInfo1() {
        System.out.println("\nStudent Name: " + getStudentName() + "\nStudent Email: " + getStudentEmail() + "\nCourse Name: " + getCourseName());
    }
    public void displayInfo2() {
        System.out.println("\nStudent Name: " + studentBName + "\nStudent Email: " + studentBEmail + "\nCourse Name: " + getCourseBName());
    }
}
