public class Continue {
    public static void main(String[] args) {
        for (var counter = 1;counter <= 100; counter++){
            if (counter % 2 == 0){
                continue;
            }
            System.out.println("Bilangan Ganjil nya dari 100 ->"+ counter);
        }
    }
}
