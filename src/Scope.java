public class Scope {
    public static void main(String[] args) {
        //System.out.println(hello); ini akan error karna scopenya di dalem block
//        System.out.println(hi); ini akan error karna scopenya di dalem block
        sayHello("Achmad");
        sayHello("");
    }
    static void sayHello(String name){
        String hello = "Hello "+ name;

        if(!name.isBlank()){
            String hi = "HI "+ name;
            System.out.println(hi);
        }

        System.out.println(hello);
    }
}
