public class Main {
    public static void main(String[] args) {
        int personsAge = 14;
        int temperature = 22;

        if( personsAge <= 20 && personsAge >= 45   && temperature <=-20 && temperature >=30) {
            System.out.println("Можно идти гулять");
        }
        else if (personsAge < 20 && temperature <= 0 && temperature>= 28) {
            System.out.println("Можно идти гулять");
        }
        else if ( personsAge > 45 && temperature <-10 && temperature>25) {
            System.out.println("Можно идти гулять");
        }
        else {
            System.out.println("Оставайтесь дома");
        }

    }
}