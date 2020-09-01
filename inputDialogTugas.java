import javax.swing.JOptionPane;
/**
 * inputDialogTugas
 */
public class inputDialogTugas {

    public static void main(String[] args) {
        
        //Deklarasi Variabel
        short umur;

        //Baca Inputan User
        String nama = JOptionPane.showInputDialog("Masukkan Nama: ");
        System.out.println("Masukkan Nama: " + nama);
        String alamat = JOptionPane.showInputDialog("Tinggal di: ");
        System.out.println("Tinggal di: " + alamat);
        String bilangan = JOptionPane.showInputDialog("Berumur: ");
        System.out.println("Berumur: " + bilangan);
        umur = Short.parseShort(bilangan);

        //Cetak Hasil
        System.out.println("Nama saya " + nama + "Tinggal di " + alamat + ", " + "Berumur " + umur + " Tahun");
    }
}