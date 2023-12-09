public class Hund {
    private String name;
    private String rasse;
    private boolean istBrav;

    public Hund(String name, String rasse) {
        this.name = name;
        this.rasse = rasse;
        this.istBrav = true;
    }

    public void bellt(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Wau");
        }
        istBrav = false;
    }

    public void schlaeft() {
        System.out.println("zzzzzzzzzzzzzzzzzzzzzzz");
        istBrav = true;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Rasse: " + rasse);
        System.out.println("Brav: " + (istBrav ? "Ja" : "Nein"));
    }
}
