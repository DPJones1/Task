public class UserInfoProgram {
    public static void main(String[] args) {
        int[] userIds = {1, 2, 3};
        String[] userNames = {"Abraham Ama", "Bob Button", "Carol Carter"};
        String[] departments = {"EE", "Trading", "Finance"};
        float[] salaries = {30000, 50000, 20000};

        if (args.length != 1) {
            System.out.println("Please provide valid user id or type 'users' for all");
            return;
        }

        String input = args[0];

        if (input.equals("users")) {

            for (int i = 0; i < userIds.length; i++) {
                int userId = userIds[i];
                String userName = userNames[i];
                String department = departments[i];
                float salary = salaries[i];

                System.out.println("userid: " + userId + ", User name: " + userName + ", Department: " + department + ", Salary: " + salary);
            }

        } else {

            int inputUserId = Integer.parseInt(input);

            boolean isValidUserId = false;
            for (int userId : userIds) {
                if (inputUserId == userId) {
                    isValidUserId = true;
                    break;
                }
            }

            if (isValidUserId) {
                int arrayIndex = inputUserId - 1;

                String userName = userNames[arrayIndex];
                String department = departments[arrayIndex];
                float salary = salaries[arrayIndex];

                System.out.println("userid: " + inputUserId + ", User name:   " + userName + ", department: " + department + ", salary:" + salary);
            } else {

                System.out.println("The id is invalid");
            }
        }
    }
}
