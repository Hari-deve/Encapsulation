import java.util.Scanner;

public class NameCorrection {
    static Scanner userInput=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to Aadhar Name Correction Service\n********\nPlease Enter your Details listed Below");
        System.out.println("Please Enter Your Name to be Corrected ");
        String userName=userInput.nextLine();
        System.out.println("Enter your Mobile number ");
        long userMobileNumber=userInput.nextLong();
        System.out.println("Enter your last 4digit Aadhar number");
        long userAadharNumber=userInput.nextLong();
        userInput.nextLine();
        System.out.println("Enter the correct name ");
        String userUpdatedName=userInput.nextLine();
        AadharDetails user=new AadharDetails(userName,userMobileNumber,userAadharNumber);
        System.out.println("Before Correction");
        System.out.println("Your Name: "+user.getName());
        System.out.println("Your Mobile number: "+user.getMobileNumber());
        System.out.println("Your Name: "+user.getAadharnumber());
        System.out.println("************************");
        user.setName(userUpdatedName);
        System.out.println("After Correction");
        System.out.println("Your Name: "+user.getName());
        System.out.println("Your Mobile number: "+user.getMobileNumber());
        System.out.println("Your Name: "+user.getAadharnumber());

    }
}