
public class UserInfoProgram {
    static int[] userIds = {1, 2, 3};
    static String[] userNames = {"Abraham Ama", "Bob Button", "Carol Carter"};
    static String[] departments = {"EE", "Trading", "Finance"};
    static float[] salaries = {30000, 50000, 20000};

    public static void displayAllUsers() {
        for (int i = 0; i < userIds.length; i++) {
            int userId = userIds[i];
            String userName = userNames[i];
            String department = departments[i];
            float salary = salaries[i];

            System.out.println("userid: " + userId + ", User name: " + userName + ", Department: " + department + ", Salary: " + salary);

        }
    }
    public static void displayUserInfo(int userId) {
        boolean isValidUserId = false;
        for (int i = 0; i < userIds.length; i++) {
            if (userId == userIds[i]) {
                isValidUserId = true;

                String userName = userNames[i];
                String department = departments[i];
                float salary = salaries[i];

                System.out.println("userid: " + userId + ", User name:   " + userName + ", department: " + department + ", salary:" + salary);

                break;
            }
        }

        if (!isValidUserId) {
            System.out.println("The id is invalid");
        }
    }

    public static void main(String[] args) {
        if (args.length < 2 || !args[0].equals("user")) {
            System.out.println("Please provide valid user id or type 'users' for all");
            return;
        }

        String input = args[1];

        if (input.equals("users")) {
            displayAllUsers();

        } else {
            try {
                int inputUserId = Integer.parseInt(input);
                displayUserInfo(inputUserId);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
            }
            }
        }
    }


