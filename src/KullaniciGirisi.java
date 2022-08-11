import java.util.Scanner;

public class KullaniciGirisi {
    public  static void main(String [] args) {
        String UserName,Password;

        Scanner inp = new Scanner(System.in);

        System.out.print("Username : ");
        UserName = inp.nextLine();

        System.out.print("Password : ");
        Password = inp.nextLine();

        if (UserName.equals("quibblees") && Password.equals("java123")) {
            System.out.println("Logged In ! ");
        } else {
            System.out.println("Invalid login or password. Please try again.");
        }

    }
}
