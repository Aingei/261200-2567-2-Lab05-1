public class Main {
    public static void main(String[] args){

        User user1 = new User("John" ,1954 , 2 , 18);
        Admin user2 = new Admin("Nicolas" ,1964 , 1 , 7);

        user1.displayInfo();
        System.out.println(" ");
        user2.displayInfo();
        System.out.println(" ");
        user2.displayInfo(true);
        System.out.println(" ");
        user2.displayInfo(false);
    }
}