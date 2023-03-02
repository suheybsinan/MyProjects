package login;

import java.util.Scanner;

public class LoginRunner {

    public static void main(String[] args) {

        start();

    }

    public static void start(){

        UserService userService = new UserService();
        Scanner input = new Scanner(System.in);
        int select;

        do {
            userService.showMenu();
            select = input.nextInt();

            switch (select){
                case 1:
//                    userService.register();
                    break;
                case 2:
//                    userService.login();
                    break;
                case 3:

                    System.out.println("Hosca kalin.");
                    break;
                default:
                    System.out.println("Hatali giris yaptiniz. Tekrar deneyiniz.");
            }



        }while (select!=3);

    }

}
