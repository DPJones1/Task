public class User {

    private int id;
    private String name;
    private double salary;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setName("Orla");
        user.setSalary(50000);

        System.out.println("User Id is: " + user.getId());
        System.out.println("Name is: " + user.getName());
        System.out.println("Salary is: " + user.getSalary());


    }
}
