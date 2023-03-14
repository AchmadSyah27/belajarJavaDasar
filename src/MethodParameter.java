public class MethodParameter {
    public static void main(String[] args) {
        sayHello("Achmad","Syah");
        sayHello("Budi","Nugroho");
        sayHello("Joko","Nugroho");


    }
    static void sayHello(String firstName, String lastName){
        System.out.println("Hello "+firstName+ " "+lastName);
    }
}
