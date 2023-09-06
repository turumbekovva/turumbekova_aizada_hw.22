public class Main {
    public static void main(String[] args) {
        System.out.println(ageAndTemperature(14,30));
        System.out.println(ageAndTemperature(16,25));
        System.out.println(ageAndTemperature(17,20));
        System.out.println(ageAndTemperature(10,23));
        System.out.println(ageAndTemperature(12,29));
    }
    public static String ageAndTemperature(int personsAge,int temperature){

        if( personsAge > 20 && personsAge < 45 && temperature >-20 && temperature <30) {
            return "Можно идти гулять";
        }
        else if (personsAge < 20 && temperature > 0 && temperature< 28) {
            return "Можно идти гулять";
        }
        else if ( personsAge > 45 && temperature >-10 && temperature<25) {
            return "Можно идти гулять";
        }
        else {
            return "оставайтесь дома";
        }
    }

}