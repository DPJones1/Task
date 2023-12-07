package services;

public class UserDetailsService {
 static int[] userIds = {1, 2, 3};
 static String[] userNames = {"Abraham Ama", "Bob Button", "Carol Carter"};
 static String[] departments = {"EE", "Trading", "Finance"};
 static float[] salaries = {30000, 50000, 20000};

 public void displayAllUsers() {
  int[] indices = {0, 1, 2};
  for (int i : indices) {
   int userId = userIds[i];
   String userName = userNames[i];
   String department = departments[i];
   float salary = salaries[i];

   System.out.println("userid: " + userId + ", User name: " + userName + ", Department: " + department + ", Salary: " + salary);
  }
 }

 public void displayUserInfo(int userId) {
  boolean isValidUserId = false;
  int i = 0;
  while (i < userIds.length) {
   if (userId == userIds[i]) {
    isValidUserId = true;

    String userName = userNames[i];
    String department = departments[i];
    float salary = salaries[i];

    System.out.println("userid: " + userId + ", User name: " + userName + ", department: " + department + ", salary:" + salary);

    break;
   }

   i++;
  }

  if (!isValidUserId) {
   System.out.println("The id is invalid");
  }
 }
}
