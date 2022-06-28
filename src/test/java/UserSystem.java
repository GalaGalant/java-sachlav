import java.util.Scanner;

public class UserSystem {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner (System.in);

    String truelogin = "Admin";
    String truepass = "P@ssword";

    System.out.print("Введите логин:");
    String inputlogin = keyboard.nextLine(); // gets login input from user

    if (truelogin.equals(inputlogin)) {
        System.out.print("Введите пароль:");
        String inputpass = keyboard.nextLine(); // gets pass input from user
        if (truepass.equals(inputpass)) {
            System.out.print("Здравствуйте, " + inputlogin + ", Вы вошли в систему!");
        }
        else {
            System.out.print("Вы ввели неверный пароль :(");
        }
    }
    else {
        System.out.print("Не могу найти такого пользователя...");
    }
}
}



