/*
jack kilkenny
G00401535
26/10/2023
STUDENT APP
*/

package ie.atu;

import java.util.Scanner;

public class Main {

    public static void main(String[]args){
        String firstName;
        Scanner scanner = new Scanner(System.in);
        ie.atu.student user1 = new ie.atu.student();


        System.out.print("Enter First Name: ");
        user1.setStudentName(scanner.nextLine());
        System.out.print("Enter Email: ");
        user1.setStudentEmail(scanner.nextLine());
        System.out.print("Enter Course Name: ");
        user1.setCourseName(scanner.nextLine());

        System.out.print("Enter First Name: ");
        firstName = scanner.nextLine();
        ie.atu.student user2 = new ie.atu.student(firstName);
        System.out.print("Enter Email: ");
        user2.setStudentBEmail(scanner.nextLine());
        System.out.print("Enter Course Name: ");
        user2.setCourseBName(scanner.nextLine());


        user1.displayInfo1();
        user2.displayInfo2();
    }
}