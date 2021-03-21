package Class3;

public class MyHomeWork3 {
    public static void main(String[] args) {
        double cTemp = 21.111;
        double fTemp = cTemp * 9 / 5 + 32;
        System.out.println(cTemp + "°C ---> " + fTemp + " °F");


        double kTemp = cTemp + 273.15;
        System.out.println(cTemp + "°C ---> " + kTemp + " °K");


        double frTemp = 24;
        double clTemp = (frTemp - 32) * 5 / 9;
        System.out.println(frTemp + " °F ---> " + clTemp + " °C");


        double klTemp = (frTemp + 459.67) * 5 / 9;
        System.out.println(frTemp + " °F ---> " + klTemp + " °K");


        double klvTemp = 31;
        double frhTemp = klvTemp * 9 / 5 - 459.67;
        System.out.println(klvTemp + " °K ---> " + frhTemp + " °F");


        double celTemp = klvTemp - 273.15;
        System.out.println(klvTemp + " °K ---> " + celTemp + " °C");
    }
}


