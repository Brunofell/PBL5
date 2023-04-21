public class Main {
    public static void main(String[] args) {

        Cachorro c1 = new Cachorro();
        Gato g1 = new Gato();


        System.out.println("- Atenção! O cachorro vai latir...");
        c1.FazerBarulho();
        System.out.println("- SILÊNCIO! O gato tem algo a dizer...");
        g1.FazerBarulho();
    }
}