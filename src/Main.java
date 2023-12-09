public class Main {
    public static void main(String[] args) {
        Hund hund1 = new Hund("Bello", "Dackel");
        Hund hund2 = new Hund("Rex", "Schäferhund");


        hund1.bellt(3);
        hund2.schlaeft();

        System.out.println("Informationen über Hund 1:");
        hund1.print();

        System.out.println("\nInformationen über Hund 2:");
        hund2.print();
    }
}