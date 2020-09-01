/**
 * array1
 */
public class arrayNama {

    public static void main(String[] args) {

        String[][] entry = { { "Florence", "735-1234", "Manila" }, { "Joyce", "983- 3333", "Quezon City" },
                { "Becca", "456-3322", "Manila" } };
        String[] keterangan = { "Nama", "Tel.", "Alamat" };

        for (int i = 0; i < entry.length; i++) {
            for (int j = 0; j < entry[0].length; j++) {

                // cetak
                System.out.print(keterangan[j] + "   : ");
                System.out.print(entry[i][j]);
                System.out.println("");
            }
        }

    }
}