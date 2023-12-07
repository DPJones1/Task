package userInfoProgram;

import services.UserDetailsService;

public class UserInfoProgram {

    public static void main(String[] args) {
        UserDetailsService UserDetailsService = new UserDetailsService();

        if (args.length < 2 || !args[0].equals("user")) {
            System.out.println("Please provide valid user id or type 'users' for all");
            return;
        }

        String input = args[1];

        if (input.equals("users")) {
            UserDetailsService.displayAllUsers();

        } else {
            try {
                int inputUserId = Integer.parseInt(input);
                UserDetailsService.displayUserInfo(inputUserId);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
            }
            }
        }
    }


