package HomeWork.HomeWork27;

import HomeWork.HomeWork27.exceptions.WrongLoginException;
import HomeWork.HomeWork27.exceptions.WrongPasswordException;

public class Main {

    private static final String password = "Lil_peep1996";

    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        //todo Тут протестить работу метода

        try {
            System.out.println(confirmPassword("Lil_11peep", password, "-Lil_peep1996"));
        }
        catch (WrongPasswordException | WrongLoginException e){
            System.out.println(e.getMessage());
        }
    }

    //todo тут создать метод confirmPassword()
   public static boolean confirmPassword(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        if(!validLoginOrPassword(login)){
            throw new WrongLoginException("Не корректный логин!!");
        }
        if(!validLoginOrPassword(confirmPassword)){
           throw new WrongPasswordException("Не корректный пароль!");
        }
        return password.equalsIgnoreCase(confirmPassword);
   }

   private static boolean validLoginOrPassword(String loginOrPassowrd){
        return loginOrPassowrd.matches("\\w+") && loginOrPassowrd.length() < 20;
   }


}