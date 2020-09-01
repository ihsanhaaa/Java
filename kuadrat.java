/**
 * kuadrat
 */
public class kuadrat {

    public static void main(String[] args) {
        int pangkat = 2;
        double hasil;

        for(int a = 1; a <= 20; a++){
            hasil = Math.pow(a, pangkat);
            System.out.println("Kuadrat dari " + a + " = " + hasil);
        }
    }
}