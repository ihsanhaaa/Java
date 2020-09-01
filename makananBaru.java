import java.io.*;
import java.util.Scanner;

/**
 * makananBaru
 */
public class makananBaru {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String validasi = "";
        int pilihan = 0;
        int menu = 0;
        int buburPedas = 0, nasiGoreng = 0, mieSagu = 0, chaiKue = 0, kwaTiawGoreng = 0, esLidahBuaya = 0, esJeruk = 0,
                esKacangMerah = 0, esTeler = 0, esTeh = 0;
        int qty_buburPedas = 0, qty_nasiGoreng = 0, qty_mieSagu = 0, qty_chaiKue = 0, qty_kwaTiawGoreng = 0,
                qty_esLidahBuaya = 0, qty_esJeruk = 0, qty_esKacangMerah = 0, qty_esTeler = 0, qty_esTeh = 0;
        int meja = 0;
        int totalPembayaran = 0;

        do {
            do {
                System.out.println("");
                validasi = "Y";
                System.out.println("===== Aplikasi Pemesanan Makanan =====");
                System.out.println("1. Tampil Menu");
                System.out.println("2. Pembayaran");
                System.out.println("3. Keluar");

                try {
                    System.out.print("Pilihan Anda: ");
                    pilihan = input.nextInt();
                    if (pilihan != 1 && pilihan != 2 && pilihan != 3) {
                        validasi = "N";
                    }
                } catch (Exception err) {
                    validasi = "N";
                    input.nextInt();
                    if (validasi == "N") {
                        System.out.println("Salah Input");
                    }
                }
            } while (validasi == "N");
            switch (pilihan) {
            case 1:
                do {
                    System.out.println("");
                    System.out.println(" ============ Daftar Menu Restoran Afriani Kamelia ============");
                    System.out.println("\t1. Bubur Pedas \t\t Rp.10000");
                    System.out.println("\t2. Nasi Goreng \t\t Rp.13000");
                    System.out.println("\t3. Mie Sagu \t\t Rp.10000");
                    System.out.println("\t4. Chai Kue \t\t Rp.10000");
                    System.out.println("\t5. KwaTiaw goreng \t Rp.10000");

                    System.out.println("\t6. Es Lidah Buaya \t Rp.5000");
                    System.out.println("\t7. Es Jeruk \t\t Rp.3000");
                    System.out.println("\t8. Es KacangMerah \t Rp.7000");
                    System.out.println("\t9. Es Teler \t\t Rp.7000");
                    System.out.println("\t10.Es Teh \t\t Rp.3000");
                    System.out.println();

                    try {
                        System.out.print("Pesanan: ");
                        menu = input.nextInt();
                        if (menu != 1 && menu != 2 && menu != 3 && menu != 4 && menu != 5 && menu != 6 && menu != 7
                                && menu != 8 && menu != 9 && menu != 10) {
                            validasi = "N";
                        }
                    } catch (Exception err) {
                        validasi = "N";
                        input.nextLine();
                    }
                } while (validasi == "N");

                switch (menu) {
                case 1: // buburPedas
                    buburPedas = 1;
                    do {
                        validasi = "Y";

                        try {
                            System.out.print("Banyak Porsi [1-10]: ");
                            qty_buburPedas = input.nextInt();
                            if (qty_buburPedas < 1 || qty_buburPedas > 10) {
                                validasi = "N";
                            }
                        } catch (Exception err) {

                        }
                        System.out.println("Pesanan Anda: " + qty_buburPedas + " Porsi Bubur Pedas");
                        System.out.println("Silahkan lanjut ke menu pembayaran");
                        System.out.println("");
                    } while (validasi == "N");
                    break;

                case 2: // nasiGoreng
                    nasiGoreng = 1;
                    do {
                        validasi = "Y";

                        try {
                            System.out.print("Banyak Porsi [1-10]: ");
                            qty_nasiGoreng = input.nextInt();
                            if (qty_nasiGoreng < 1 || qty_nasiGoreng > 10) {
                                validasi = "N";
                            }
                        } catch (Exception err) {
                            validasi = "N";
                            input.nextLine();
                        }
                        if (validasi == "N") {
                            System.out.println("Salah input");
                        }
                        System.out.println("Pesanan Anda: " + qty_nasiGoreng + " Porsi Nasi Goreng");
                        System.out.println("Silahkan lanjut ke menu pembayaran");
                        System.out.println("");
                    } while (validasi == "N");
                    break;

                case 3: // mieSagu
                    mieSagu = 1;
                    do {
                        validasi = "Y";

                        try {
                            System.out.print("Banyak Porsi [1-10]: ");
                            qty_mieSagu = input.nextInt();
                            if (qty_mieSagu < 1 || qty_mieSagu > 10) {
                                validasi = "N";
                            }
                        } catch (Exception err) {
                            validasi = "N";
                            input.nextLine();
                        }
                        if (validasi == "N") {
                            System.out.println("Salah input");
                        }
                        System.out.println("Pesanan Anda: " + qty_mieSagu + " Porsi Mie Sagu");
                        System.out.println("Silahkan lanjut ke menu pembayaran");
                        System.out.println("");
                    } while (validasi == "N");
                    break;

                case 4: // chaiKue
                    chaiKue = 1;
                    do {
                        validasi = "Y";

                        try {
                            System.out.print("Banyak Porsi [1-10]: ");
                            qty_chaiKue = input.nextInt();
                            if (qty_chaiKue < 1 || qty_chaiKue > 10) {
                                validasi = "N";
                            }
                        } catch (Exception err) {
                            validasi = "N";
                            input.nextLine();
                        }
                        if (validasi == "N") {
                            System.out.println("Salah input");
                        }
                        System.out.println("Pesanan Anda: " + qty_chaiKue + " Chai Kue");
                        System.out.println("Silahkan lanjut ke menu pembayaran");
                        System.out.println("");
                    } while (validasi == "N");
                    break;

                case 5: // kwaTiawGoreng
                    kwaTiawGoreng = 1;
                    do {
                        validasi = "Y";

                        try {
                            System.out.print("Banyak Porsi [1-10]: ");
                            qty_kwaTiawGoreng = input.nextInt();
                            if (qty_kwaTiawGoreng < 1 || qty_kwaTiawGoreng > 10) {
                                validasi = "N";
                            }
                        } catch (Exception err) {
                            validasi = "N";
                            input.nextLine();
                        }
                        if (validasi == "N") {
                            System.out.println("Salah input");
                        }
                        System.out.println("Pesanan Anda: " + qty_kwaTiawGoreng + " Porsi KwaTiaw Goreng");
                        System.out.println("Silahkan lanjut ke menu pembayaran");
                        System.out.println("");
                    } while (validasi == "N");
                    break;

                case 6: // esLidahBuaya
                    esLidahBuaya = 1;
                    do {
                        validasi = "Y";

                        try {
                            System.out.print("Berapa Gelas [1-10]: ");
                            qty_esLidahBuaya = input.nextInt();
                            if (qty_esLidahBuaya < 1 || qty_esLidahBuaya > 10) {
                                validasi = "N";
                            }
                        } catch (Exception err) {
                            validasi = "N";
                            input.nextLine();
                        }
                        if (validasi == "N") {
                            System.out.println("Salah input");
                        }
                        System.out.println("Pesanan Anda: " + qty_esLidahBuaya + " Es Lidah Buaya");
                        System.out.println("Silahkan lanjut ke menu pembayaran");
                        System.out.println("");
                    } while (validasi == "N");
                    break;

                case 7: // esJeruk
                    esJeruk = 1;
                    do {
                        validasi = "Y";

                        try {
                            System.out.print("Berapa Gelas [1-10]: ");
                            qty_esJeruk = input.nextInt();
                            if (qty_esJeruk < 1 || qty_esJeruk > 10) {
                                validasi = "N";
                            }
                        } catch (Exception err) {
                            validasi = "N";
                            input.nextLine();
                        }
                        if (validasi == "N") {
                            System.out.println("Salah input");
                        }
                        System.out.println("Pesanan Anda: " + qty_esJeruk + " Es Jeruk");
                        System.out.println("Silahkan lanjut ke menu pembayaran");
                        System.out.println("");
                    } while (validasi == "N");
                    break;

                case 8: // esKacangMerah
                    esKacangMerah = 1;
                    do {
                        validasi = "Y";

                        try {
                            System.out.print("Berapa Gelas [1-10]: ");
                            qty_esKacangMerah = input.nextInt();
                            if (qty_esKacangMerah < 1 || qty_esKacangMerah > 10) {
                                validasi = "N";
                            }
                        } catch (Exception err) {
                            validasi = "N";
                            input.nextLine();
                        }
                        if (validasi == "N") {
                            System.out.println("Salah input");
                        }
                        System.out.println("Pesanan Anda: " + qty_esKacangMerah + " Es Kacang Merah");
                        System.out.println("Silahkan lanjut ke menu pembayaran");
                        System.out.println("");
                    } while (validasi == "N");
                    break;

                case 9: // esTeler
                    esTeler = 1;
                    do {
                        validasi = "Y";
                        try {
                            System.out.print("Berapa Gelas [1-10]: ");
                            qty_esTeler = input.nextInt();
                            if (qty_esTeler < 1 || qty_esTeler > 10) {
                                validasi = "N";
                            }
                        } catch (Exception err) {
                            validasi = "N";
                            input.nextLine();
                        }
                        if (validasi == "N") {
                            System.out.println("Salah input");
                        }
                        System.out.println("Pesanan Anda: " + qty_esTeler + " Es Teler");
                        System.out.println("Silahkan lanjut ke menu pembayaran");
                        System.out.println("");
                    } while (validasi == "N");
                    break;

                case 10: // esTeh
                    esTeh = 1;
                    do {
                        validasi = "Y";

                        try {
                            System.out.print("Berapa Gelas [1-10]: ");
                            qty_esTeh = input.nextInt();
                            if (qty_esTeh < 1 || qty_esTeh > 10) {
                                validasi = "N";
                            }
                        } catch (Exception err) {
                            validasi = "N";
                            input.nextLine();
                        }
                        if (validasi == "N") {
                            System.out.println("Salah input");
                        }
                        System.out.println("Pesanan Anda: " + qty_esTeh + " Es Teh");
                        System.out.println("Silahkan lanjut ke menu pembayaran");
                        System.out.println("");
                    } while (validasi == "N");
                    break;

                }
                break;

            case 2:
                System.out.println("");
                System.out.println(" ========= Menu Pembayaran =========");
                if (buburPedas == 0 && nasiGoreng == 0 && mieSagu == 0 && chaiKue == 0 && kwaTiawGoreng == 0
                        && esLidahBuaya == 0 && esJeruk == 0 && esKacangMerah == 0 && esTeler == 0 && esTeh == 0) {
                    System.out.println("anda belum memesan apapun");
                    System.out.println("Mohon untuk kembali ke menu untuk memesan");
                    break;
                }

                int total_buburPedas = 0, total_nasiGoreng = 0, total_mieSagu = 0, total_chaiKue = 0,
                        total_kwaTiawGoreng = 0, total_esLidahBuaya = 0, total_esJeruk = 0, total_esKacangMerah = 0,
                        total_esTeler = 0, total_esTeh = 0;

                if (buburPedas == 1) {
                    total_buburPedas = 10000 * qty_buburPedas;
                }
                if (nasiGoreng == 1) {
                    total_nasiGoreng = 13000 * qty_nasiGoreng;
                }
                if (mieSagu == 1) {
                    total_mieSagu = 10000 * qty_mieSagu;
                }
                if (chaiKue == 1) {
                    total_chaiKue = 10000 * qty_chaiKue;
                }
                if (kwaTiawGoreng == 1) {
                    total_kwaTiawGoreng = 10000 * qty_kwaTiawGoreng;
                }
                if (esLidahBuaya == 1) {
                    total_esLidahBuaya = 5000 * qty_esLidahBuaya;
                }
                if (esJeruk == 1) {
                    total_esJeruk = 3000 * qty_esJeruk;
                }
                if (esKacangMerah == 1) {
                    total_esKacangMerah = 7000 * qty_esKacangMerah;
                }
                if (esTeler == 1) {
                    total_esTeler = 7000 * qty_esTeler;
                }
                if (esTeh == 1) {
                    total_esTeh = 3000 * qty_esTeh;
                }

                totalPembayaran = total_buburPedas + total_nasiGoreng + total_mieSagu + total_chaiKue
                        + total_kwaTiawGoreng + total_esLidahBuaya + total_esJeruk + total_esKacangMerah + total_esTeler
                        + total_esTeh;

                System.out.println("Meja No: " + meja);
                System.out.println("Anda memesan:");
                System.out.println("@" + qty_buburPedas + " Bubur Pedas \t\t : Rp." + total_buburPedas);
                System.out.println("@" + qty_nasiGoreng + " Nasi Goreng \t\t : Rp." + total_nasiGoreng);
                System.out.println("@" + qty_mieSagu + " Mie Sagu \t\t : Rp." + total_mieSagu);
                System.out.println("@" + qty_chaiKue + " Chai Kue \t\t : Rp." + total_chaiKue);
                System.out.println("@" + qty_kwaTiawGoreng + " KwaTiaw Goreng \t : Rp." + total_kwaTiawGoreng);

                System.out.println("@" + qty_esLidahBuaya + " Es Lidah Buaya \t : Rp." + total_esLidahBuaya);
                System.out.println("@" + qty_esJeruk + " Es Jeruk \t\t : Rp." + total_esJeruk);
                System.out.println("@" + qty_esKacangMerah + " Es Kacang Merah \t : Rp." + total_esKacangMerah);
                System.out.println("@" + qty_esTeler + " Es Teler \t\t : Rp." + total_esTeler);
                System.out.println("@" + qty_esTeh + " Es Teh \t\t : Rp." + total_esTeh);
                System.out.println("------------------------------------------------");
                System.out.println("Total Pembayaran: \t : Rp." + totalPembayaran);
                System.out.println("Terima Kasih");

                break;

            case 3:
                System.exit(0);
                break;
            }

        } while (true);
    }
}