package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        for (User boec : users) {
            if (boec.getUsername().equals(login)) {
                rsl = boec;
                break;
            }
        }
             if (rsl == null) {
                 throw new UserNotFoundException("Пользователь c таким именем не найден.");
                }
        return rsl;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if ((user.getUsername()).length() < 3 || !user.isValid()) {
            throw new UserInvalidException("Пользователь не соответствует требованиям допуска.");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {new User("Petr Arsentev", true)};
        try {
             User user = findUser(users, "Petr Arsentev");
             if (validate(user)) {
                 System.out.println("This user has an access");
             }
        } catch (UserInvalidException ex) {
               System.out.println(ex.getMessage());
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
            }
    }
}