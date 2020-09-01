import java.util.Scanner;

/**
 * UASsmartphone
 */
public class UASsmartphone {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cek = "";
        int choice = 0;
        int choice_menu = 0;
        int Iphone4 = 0, Iphone4s = 0, Iphone5c = 0, Iphone5s = 0, Iphone6s = 0, Iphone6plus = 0, Iphone7 = 0,
                Iphone7plus = 0, Iphone8 = 0, Iphone8plus = 0, IphoneX = 0, IphoneXS = 0, IphoneXR = 0;
        int jml_Iphone4 = 0, jml_Iphone4s = 0, jml_Iphone5c = 0, jml_Iphone5s = 0, jml_Iphone6s = 0,
                jml_Iphone6plus = 0, jml_Iphone7 = 0, jml_Iphone7plus = 0, jml_Iphone8 = 0, jml_Iphone8plus = 0,
                jml_IphoneX = 0, jml_IphoneXS = 0, jml_IphoneXR = 0;
        int meja = 0;
        int subtotal = 0;

        do {
            do {
                System.out.println("");
                cek = "Y";
                System.out.println("===== Aplikasi Penjualan Smartphone Sederhana =====");
                System.out.println("1. Daftar Smartphone");
                System.out.println("2. Pembayaran");
                System.out.println("3. Exit");

                try {
                    System.out.print("Pilihan Anda: ");
                    choice = input.nextInt();
                    if (choice != 1 && choice != 2 && choice != 3) {
                        cek = "N";
                    }
                } catch (Exception err) {
                    cek = "N";
                    input.nextInt();
                    if (cek == "N") {
                        System.out.println("Salah Input");
                    }
                }
            } while (cek == "N");
            switch (choice) {
            case 1:
                do {
                    System.out.println("");
                    System.out.println(" ================= Daftar Smartphone yang tersedia =================");
                    System.out.println("No. 1 \t Iphone 4 \t\t Hitam \t iOS 4 \t 16 \t 4 \t 1000000");
                    System.out.println("No. 2 \t Iphone 4s \t\t Hitam \t iOS 5 \t 32 \t 4 \t 1500000");
                    System.out.println("No. 3 \t Iphone 5c \t\t Hijau \t iOS 7 \t 16 \t 5 \t 2000000");
                    System.out.println("No. 4 \t Iphone 5s \t\t Grey \t iOS 7 \t 16 \t 5 \t 2500000");
                    System.out.println("No. 5 \t Iphone 6+ \t\t Hitam \t iOS 8 \t 128 \t 6 \t 6500000");
                    System.out.println("No. 6 \t Iphone 6s \t\t Putih \t iOS 9 \t 64 \t 5 \t 5500000");
                    System.out.println("No. 7 \t Iphone  7 \t\t Hitam \t iOS10 \t 256 \t 5 \t 13000000");
                    System.out.println("No. 8 \t Iphone 7+ \t\t Hitam \t iOS10 \t 256 \t 6 \t 15000000");
                    System.out.println("No. 9 \t Iphone  8 \t\t Putih \t iOS11 \t 256 \t 5 \t 12000000");
                    System.out.println("No.10  \t Iphone 8+ \t\t Hitam \t iOS11 \t 256 \t 6 \t 15000000");
                    System.out.println("No.11 \t Iphone  X \t\t Gold \t iOS11 \t 64 \t 6 \t 18000000");
                    System.out.println("No.12 \t Iphone XS \t\t Hitam \t iOS12 \t 256 \t 6 \t 24000000");
                    System.out.println("No.13 \t Iphone XR \t\t Hitam \t iOS12 \t 64 \t 6 \t 13000000");
                    System.out.println();

                    try {
                        System.out.print("PILIH >> ");
                        choice_menu = input.nextInt();
                        if (choice_menu != 1 && choice_menu != 2 && choice_menu != 3 && choice_menu != 4
                                && choice_menu != 5 && choice_menu != 6 && choice_menu != 7 && choice_menu != 8
                                && choice_menu != 9 && choice_menu != 10 && choice_menu != 11 && choice_menu != 12
                                && choice_menu != 13) {
                            cek = "N";
                        }
                    } catch (Exception err) {
                        cek = "N";
                        input.nextLine();
                    }
                } while (cek == "N");

                switch (choice_menu) {
                case 1:
                    Iphone4 = 1;
                    do {
                        cek = "Y";

                        try {
                            System.out.print("Banyak Unit [1-10]: ");
                            jml_Iphone4 = input.nextInt();
                            if (jml_Iphone4 < 1 || jml_Iphone4 > 10) {
                                cek = "N";
                            }
                        } catch (Exception err) {
                            cek = "N";
                            input.nextLine();
                        }
                        if (cek == "N") {
                            System.out.println("Salah input");
                        }
                        System.out.println("Pesanan Anda: " + jml_Iphone4 + " Unit HP Iphone 4");
                        System.out.println("Silahkan lanjut ke menu pembayaran");
                        System.out.println("");
                    } while (cek == "N");
                    break;

                case 2:
                    Iphone4s = 1;
                    do {
                        cek = "Y";

                        try {
                            System.out.print("Banyak Unit [1-10]: ");
                            jml_Iphone4s = input.nextInt();
                            if (jml_Iphone4s < 1 || jml_Iphone4s > 10) {
                                cek = "N";
                            }
                        } catch (Exception err) {
                            cek = "N";
                            input.nextLine();
                        }
                        if (cek == "N") {
                            System.out.println("Salah input");
                        }
                        System.out.println("Pesanan Anda: " + Iphone4s + " Unit HP Iphone 4s");
                        System.out.println("Silahkan lanjut ke menu pembayaran");
                        System.out.println("");
                    } while (cek == "N");
                    break;

                case 3:
                    Iphone5c = 1;
                    do {
                        cek = "Y";

                        try {
                            System.out.print("Banyak Unit [1-10]: ");
                            jml_Iphone5c = input.nextInt();
                            if (jml_Iphone5c < 1 || jml_Iphone5c > 10) {
                                cek = "N";
                            }
                        } catch (Exception err) {
                            cek = "N";
                            input.nextLine();
                        }
                        if (cek == "N") {
                            System.out.println("Salah input");
                        }
                        System.out.println("Pesanan Anda: " + Iphone5c + " Unit HP Iphone 5c");
                        System.out.println("Silahkan lanjut ke menu pembayaran");
                        System.out.println("");
                    } while (cek == "N");
                    break;

                case 4:
                    Iphone5s = 1;
                    do {
                        cek = "Y";

                        try {
                            System.out.print("Banyak Unit [1-10]: ");
                            jml_Iphone5s = input.nextInt();
                            if (jml_Iphone5s < 1 || jml_Iphone5s > 10) {
                                cek = "N";
                            }
                        } catch (Exception err) {
                            cek = "N";
                            input.nextLine();
                        }
                        if (cek == "N") {
                            System.out.println("Salah input");
                        }
                        System.out.println("Pesanan Anda: " + Iphone5s + " Unit HP Iphone 5s");
                        System.out.println("Silahkan lanjut ke menu pembayaran");
                        System.out.println("");
                    } while (cek == "N");
                    break;

                case 5:
                    Iphone6plus = 1;
                    do {
                        cek = "Y";

                        try {
                            System.out.print("Banyak Unit [1-10]: ");
                            jml_Iphone6plus = input.nextInt();
                            if (jml_Iphone6plus < 1 || jml_Iphone6plus > 10) {
                                cek = "N";
                            }
                        } catch (Exception err) {
                            cek = "N";
                            input.nextLine();
                        }
                        if (cek == "N") {
                            System.out.println("Salah input");
                        }
                        System.out.println("Pesanan Anda: " + Iphone6plus + " Unit HP Iphone 6+");
                        System.out.println("Silahkan lanjut ke menu pembayaran");
                        System.out.println("");
                    } while (cek == "N");
                    break;

                case 6:
                    Iphone6s = 1;
                    do {
                        cek = "Y";

                        try {
                            System.out.print("Banyak Unit [1-10]: ");
                            jml_Iphone6s = input.nextInt();
                            if (jml_Iphone6s < 1 || jml_Iphone6s > 10) {
                                cek = "N";
                            }
                        } catch (Exception err) {
                            cek = "N";
                            input.nextLine();
                        }
                        if (cek == "N") {
                            System.out.println("Salah input");
                        }
                        System.out.println("Pesanan Anda: " + Iphone6s + " Unit HP Iphone 6s");
                        System.out.println("Silahkan lanjut ke menu pembayaran");
                        System.out.println("");
                    } while (cek == "N");
                    break;

                case 7:
                    Iphone7 = 1;
                    do {
                        cek = "Y";

                        try {
                            System.out.print("Banyak Unit [1-10]: ");
                            jml_Iphone7 = input.nextInt();
                            if (jml_Iphone7 < 1 || jml_Iphone7 > 10) {
                                cek = "N";
                            }
                        } catch (Exception err) {
                            cek = "N";
                            input.nextLine();
                        }
                        if (cek == "N") {
                            System.out.println("Salah input");
                        }
                        System.out.println("Pesanan Anda: " + Iphone7 + " Unit HP Iphone 7");
                        System.out.println("Silahkan lanjut ke menu pembayaran");
                        System.out.println("");
                    } while (cek == "N");
                    break;

                case 8:
                    Iphone7plus = 1;
                    do {
                        cek = "Y";

                        try {
                            System.out.print("Banyak Unit [1-10]: ");
                            jml_Iphone7plus = input.nextInt();
                            if (jml_Iphone7plus < 1 || jml_Iphone7plus > 10) {
                                cek = "N";
                            }
                        } catch (Exception err) {
                            cek = "N";
                            input.nextLine();
                        }
                        if (cek == "N") {
                            System.out.println("Salah input");
                        }
                        System.out.println("Pesanan Anda: " + Iphone7plus + " Unit HP Iphone 7+");
                        System.out.println("Silahkan lanjut ke menu pembayaran");
                        System.out.println("");
                    } while (cek == "N");
                    break;

                case 9:
                    Iphone8 = 1;
                    do {
                        cek = "Y";

                        try {
                            System.out.print("Banyak Unit [1-10]: ");
                            jml_Iphone8 = input.nextInt();
                            if (jml_Iphone8 < 1 || jml_Iphone8 > 10) {
                                cek = "N";
                            }
                        } catch (Exception err) {
                            cek = "N";
                            input.nextLine();
                        }
                        if (cek == "N") {
                            System.out.println("Salah input");
                        }
                        System.out.println("Pesanan Anda: " + Iphone8 + " Unit HP Iphone 8");
                        System.out.println("Silahkan lanjut ke menu pembayaran");
                        System.out.println("");
                    } while (cek == "N");
                    break;

                case 10:
                    Iphone8plus = 1;
                    do {
                        cek = "Y";

                        try {
                            System.out.print("Banyak Unit [1-10]: ");
                            jml_Iphone8plus = input.nextInt();
                            if (jml_Iphone8plus < 1 || jml_Iphone8plus > 10) {
                                cek = "N";
                            }
                        } catch (Exception err) {
                            cek = "N";
                            input.nextLine();
                        }
                        if (cek == "N") {
                            System.out.println("Salah input");
                        }
                        System.out.println("Pesanan Anda: " + Iphone8plus + " Unit HP Iphone 8+");
                        System.out.println("Silahkan lanjut ke menu pembayaran");
                        System.out.println("");
                    } while (cek == "N");
                    break;

                case 11:
                    IphoneX = 1;
                    do {
                        cek = "Y";

                        try {
                            System.out.print("Banyak Unit [1-10]: ");
                            jml_IphoneX = input.nextInt();
                            if (jml_IphoneX < 1 || jml_IphoneX > 10) {
                                cek = "N";
                            }
                        } catch (Exception err) {
                            cek = "N";
                            input.nextLine();
                        }
                        if (cek == "N") {
                            System.out.println("Salah input");
                        }
                        System.out.println("Pesanan Anda: " + IphoneX + " Unit HP Iphone X");
                        System.out.println("Silahkan lanjut ke menu pembayaran");
                        System.out.println("");
                    } while (cek == "N");
                    break;

                case 12:
                    IphoneXS = 1;
                    do {
                        cek = "Y";

                        try {
                            System.out.print("Banyak Unit [1-10]: ");
                            jml_IphoneXS = input.nextInt();
                            if (jml_IphoneXS < 1 || jml_IphoneXS > 10) {
                                cek = "N";
                            }
                        } catch (Exception err) {
                            cek = "N";
                            input.nextLine();
                        }
                        if (cek == "N") {
                            System.out.println("Salah input");
                        }
                        System.out.println("Pesanan Anda: " + IphoneXS + " Unit HP Iphone XS");
                        System.out.println("Silahkan lanjut ke menu pembayaran");
                        System.out.println("");
                    } while (cek == "N");
                    break;

                case 13:
                    IphoneXR = 1;
                    do {
                        cek = "Y";

                        try {
                            System.out.print("Banyak Unit [1-10]: ");
                            jml_IphoneXR = input.nextInt();
                            if (jml_IphoneXR < 1 || jml_IphoneXR > 10) {
                                cek = "N";
                            }
                        } catch (Exception err) {
                            cek = "N";
                            input.nextLine();
                        }
                        if (cek == "N") {
                            System.out.println("Salah input");
                        }
                        System.out.println("Pesanan Anda: " + IphoneXR + " Unit HP Iphone XR");
                        System.out.println("Silahkan lanjut ke menu pembayaran");
                        System.out.println("");
                    } while (cek == "N");
                    break;
                }
                break;

            case 2:
                System.out.println("");
                System.out.println(" ============== Menu Pembayaran ==============");
                if (Iphone4 == 0 && Iphone4s == 0 && Iphone5c == 0 && Iphone5s == 0 && Iphone6plus == 0 && Iphone6s == 0
                        && Iphone7 == 0 && Iphone7plus == 0 && Iphone8 == 0 && Iphone8plus == 0 && IphoneX == 0
                        && IphoneXS == 0 && IphoneXR == 0) {
                    System.out.println("anda belum membeli apapun");
                    System.out.println("Silahkan untuk kembali ke menu Daftar Smartphone untuk pembelian");
                    break;
                }

                int total_Iphone4 = 0, total_Iphone4s = 0, total_Iphone5c = 0, total_Iphone5s = 0, total_Iphone6s = 0,
                        total_Iphone6plus = 0, total_Iphone7 = 0, total_Iphone7plus = 0, total_Iphone8 = 0,
                        total_Iphone8plus = 0, total_IphoneX = 0, total_IphoneXS = 0, total_IphoneXR = 0;
                if (Iphone4 == 1) {
                    total_Iphone4 = 1000000 * jml_Iphone4;
                }
                if (Iphone4s == 1) {
                    total_Iphone4s = 1500000 * jml_Iphone4s;
                }
                if (Iphone5c == 1) {
                    total_Iphone5c = 2000000 * jml_Iphone5c;
                }
                if (Iphone5s == 1) {
                    total_Iphone5s = 2500000 * jml_Iphone5s;
                }
                if (Iphone6plus == 1) {
                    total_Iphone6plus = 6500000 * jml_Iphone6plus;
                }
                if (Iphone6s == 1) {
                    total_Iphone6s = 5500000 * jml_Iphone6s;
                }
                if (Iphone7 == 1) {
                    total_Iphone7 = 13000000 * jml_Iphone7;
                }
                if (Iphone7plus == 1) {
                    total_Iphone7plus = 15000000 * jml_Iphone7plus;
                }
                if (Iphone8 == 1) {
                    total_Iphone8 = 12000000 * jml_Iphone8;
                }
                if (Iphone8plus == 1) {
                    total_Iphone8plus = 15000000 * jml_Iphone8plus;
                }
                if (IphoneX == 1) {
                    total_IphoneX = 18000000 * jml_IphoneX;
                }
                if (IphoneXS == 1) {
                    total_IphoneXS = 24000000 * jml_IphoneXS;
                }
                if (IphoneXR == 1) {
                    total_IphoneXR = 13000000 * jml_IphoneXR;
                }
                subtotal = total_Iphone4 + total_Iphone4s + total_Iphone5c + total_Iphone5s + total_Iphone6s
                        + total_Iphone6plus + total_Iphone7 + total_Iphone7plus + total_Iphone8 + total_Iphone8plus
                        + total_IphoneX + total_IphoneXS + total_IphoneXR;

                System.out.println("Transaksi Pembelian Smartphone:");
                System.out.println(jml_Iphone4 + " Unit Iphone 4 \t : Rp." + total_Iphone4);
                System.out.println(jml_Iphone4s + " Unit Iphone 4s \t : Rp." + total_Iphone4s);
                System.out.println(jml_Iphone5c + " Unit Iphone 5c \t : Rp." + total_Iphone5c);
                System.out.println(jml_Iphone5s + " Unit Iphone 5s \t : Rp." + total_Iphone5s);
                System.out.println(jml_Iphone6plus + " Unit Iphone 6+ \t : Rp." + total_Iphone6plus);
                System.out.println(jml_Iphone6s + " Unit Iphone 6s \t : Rp." + total_Iphone6s);
                System.out.println(jml_Iphone7 + " Unit Iphone 7 \t : Rp." + total_Iphone7);
                System.out.println(jml_Iphone7plus + " Unit Iphone 7+ \t : Rp." + total_Iphone7plus);
                System.out.println(jml_Iphone8 + " Unit Iphone 8 \t : Rp." + total_Iphone8);
                System.out.println(jml_Iphone8plus + " Unit Iphone 8+ \t : Rp." + total_Iphone8plus);
                System.out.println(jml_IphoneX + " Unit Iphone X \t : Rp." + total_IphoneX);
                System.out.println(jml_IphoneXS + " Unit Iphone XS \t : Rp." + total_IphoneXS);
                System.out.println(jml_IphoneXR + " Unit Iphone XR \t : Rp." + total_IphoneXR);
                System.out.println("______________________________________________ +");
                System.out.println("Total Pembayaran: \t : Rp." + subtotal);
                break;

            case 3:
                System.out.println("======== Menu Exit ========");
                System.out.println("Terima Kasih");
                System.exit(0);
                break;
            }

        } while (true);
    }
}