public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = 'H';

        switch (nilai){
            case 'A':
                System.out.println("Wow, nilai anda bagus");
                break;
            case 'B':
                System.out.println("Bagus");
            case 'C':
                System.out.println("Cukup");
                break;
            case 'D':
                System.out.println("Remedial");
            default:
                System.out.println("Panggil Orang Tua");
        }

        switch (nilai){
            case 'A' -> System.out.println("Wow, nilai anda bagus");
            case 'B','C' -> System.out.println("Bagus");
            case 'D' -> System.out.println("Remedial");
            default -> {
                System.out.println("Panggil Orang Tua");
            }
        }

        String ucapan;
        switch (nilai){
            case 'A'-> ucapan = "Wow, nilai anda bagus";
            case 'B','C'-> ucapan = "Bagus";
            case 'D'-> ucapan = "Remedial";
            default -> {
                ucapan = "Panggil Orang Tua";
            }
        }
        System.out.println(ucapan);

        ucapan = switch (nilai){
            case 'A': yield "Wow, nilai anda bagus";
            case 'B','C': yield "Bagus";
            case 'D': yield "Remedial";
            default: yield "Panggil Orang Tua";
        };
        System.out.println(ucapan );
    }
}
