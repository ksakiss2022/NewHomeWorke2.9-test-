package HomeWorke2_7;

import java.security.cert.CertificateNotYetValidException;

public class Date {

    private static final String CHEK = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz_-";
    // private static final String CHEK = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[_])(?=.*[-]).{1,20}$";
    //подскажи как правильно заменить, я с регулярными еще очень на Вы.
    //private String check = "^\w+$";
    //^   начало строки
//\w  буквенно-цифровой символ или знак подчёркивания
// +   один и более раз
//$   конец строки
    private String login;
    private String password;
    private String confirmPassword;

    public static boolean valiDate(String login, String password, String confirmPassword) {
        try {
            checkPassworldLogin(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    private static void checkPassworldLogin(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        if (!validate(login)) {
            throw new WrongLoginException("Не верно заданы символы в логин");
        }

        if (!validate(password)) {
            throw new WrongPasswordException("Пароль не верный");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Проверьте, пароль не совпадает");
        }
    }

    private static boolean validate(String s) {
        if (s.length() > 20) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (!CHEK.contains(String.valueOf(s.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}
