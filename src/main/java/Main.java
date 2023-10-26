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
        Scanner scanner = new Scanner(System.in);
        ie.atu.student user1 = new ie.atu.student();


        System.out.print("Enter First Name: ");
        user1.setStudentName(scanner.nextLine());
        System.out.print("Enter Email Name: ");
        user1.setStudentEmail(scanner.nextLine());
        System.out.print("Enter Course Name: ");
        user1.setCourseName(scanner.nextLine());


        user1.displayInfo();

    }
}