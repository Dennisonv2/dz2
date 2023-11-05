import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логин: ");
        String login =scanner.nextLine();
        System.out.println("Введите пароль: ");
        String password = scanner.nextLine();
        System.out.println("Подтвердите пароль: ");
        String confirmPassword = scanner.nextLine();

        try {
            boolean isValid = validateCredentials(login, password, confirmPassword);
            System.out.println("Вход потдтверждён: " + isValid);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean validateCredentials(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        try {
            if (!login.matches("[A-Za-z_]+") || login.length() >= 20) {
                throw new WrongLoginException("Неверный логин");
            }

            if (!password.matches("[A-Za-z_]+") || password.length() >= 20 || !password.equals(confirmPassword)) {
                throw new WrongPasswordException("Неверный пароль");
            }

            return true;
        } catch (Exception e) {
            throw new WrongLoginException("Неверный логин или пароль!");
        }
    }
}

class WrongLoginException extends Exception {
    public WrongLoginException() {
        super();
    }

    public WrongLoginException(String message) {
        super(message);
    }
}

class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super();
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
