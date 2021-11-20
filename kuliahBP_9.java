
/*
 + Code by Mochammad Yusuf Pratama ( NPM 21082010063 )( Par B082 )
 + FIK Sistem Informasi UPN "Veteran" Jawa Timur
 + 
 + Input Output Documentation : 
 + https://myassignmentyusuf.wordpress.com/2021/11/18/portofolio-mata-kuliah-bahasa-pemrograman-1-8/
*/

package kuliah;

import java.util.Scanner;

public class kuliahBP_9 {
    
    public static void main(String[] args) {
        
        // Call Scanner
        Scanner sc = new Scanner(System.in);
        
        // Inisialisasi
        Boolean start = false;
        String pesanan[][] = new String[10][2];
        int harga[][] = new int[10][2];
        int nominal[][] = new int[10][2];
        int bayar[][] = new int[10][2];
        int indexmkn = 0, indexmnm = 0;
        int menu, subMenu = 0;
        int totalPembelian = 0, hargaAkhir = 0, diskon = 0,
                uangPembayaran = 0, kembalian = 0;
        
        // Judul Program
        System.out.println("=================================================================");
        System.out.println("Kasir Warunkk Ryujinnn");
        System.out.println("=================================================================");
        System.out.println("Sedia : ");
        System.out.println("1. Aneka Makanan.");
        System.out.println("2. Aneka Minuman.");
        System.out.println("=================================================================");
        
        while(!start) {
        
            System.out.print("Makanan / Minuman : ");
            menu = sc.nextInt();
            System.out.println("=================================================================");

            switch(menu) {

                case 1: // Makanan

                    Boolean makanan = false;
                    
                    while(!makanan) {

                        System.out.println("Aneka Menu Makanan : ");
                        System.out.println("1. Mie Goreng Rp10.000 per Porsi.");
                        System.out.println("2. Mie Kuah Rp12.000 per Porsi.");
                        System.out.println("3. Nasi Goreng Rp15.000 per Porsi.");
                        System.out.println("4. Kentang Goreng Rp10.000 per Porsi.");
                        System.out.println("5. Gorengan Rp10.000 per Porsi.");
                        System.out.print("Pilih Menu Makanan : ");
                        subMenu = sc.nextInt();

                        switch(subMenu) {

                            case 1: // Mie Goreng
                                pesanan[indexmkn][0] = "Mie Goreng    ";
                                harga[indexmkn][0] = 10000;
                                System.out.print("Nominal Pembelian : ");
                                nominal[indexmkn][0] = sc.nextInt();
                                bayar[indexmkn][0] = harga[indexmkn][0] * nominal[indexmkn][0];
                                System.out.println("Total Bayar : Rp" + bayar[indexmkn][0]);
                                totalPembelian = totalPembelian + bayar[indexmkn][0];
                                break;
                            case 2: // Mie Kuah
                                pesanan[indexmkn][0] = "Mie Kuah      ";
                                harga[indexmkn][0] = 12000;
                                System.out.print("Nominal Pembelian : ");
                                nominal[indexmkn][0] = sc.nextInt();
                                bayar[indexmkn][0] = harga[indexmkn][0] * nominal[indexmkn][0];
                                System.out.println("Total Bayar : Rp" + bayar[indexmkn][0]);
                                totalPembelian = totalPembelian + bayar[indexmkn][0];
                                break;
                            case 3: // Nasi Goreng
                                pesanan[indexmkn][0] = "Nasi Goreng   ";
                                harga[indexmkn][0] = 15000;
                                System.out.print("Nominal Pembelian : ");
                                nominal[indexmkn][0] = sc.nextInt();
                                bayar[indexmkn][0] = harga[indexmkn][0] * nominal[indexmkn][0];
                                System.out.println("Total Bayar : Rp" + bayar[indexmkn][0]);
                                totalPembelian = totalPembelian + bayar[indexmkn][0];
                                break;
                            case 4: // Kentang Goreng
                                pesanan[indexmkn][0] = "Kentang Goreng";
                                harga[indexmkn][0] = 10000;
                                System.out.print("Nominal Pembelian : ");
                                nominal[indexmkn][0] = sc.nextInt();
                                bayar[indexmkn][0] = harga[indexmkn][0] * nominal[indexmkn][0];
                                System.out.println("Total Bayar : Rp" + bayar[indexmkn][0]);
                                totalPembelian = totalPembelian + bayar[indexmkn][0];
                                break;
                            case 5: // Gorengan
                                pesanan[indexmkn][0] = "Gorengan      ";
                                harga[indexmkn][0] = 10000;
                                System.out.print("Nominal Pembelian : ");
                                nominal[indexmkn][0] = sc.nextInt();
                                bayar[indexmkn][0] = harga[indexmkn][0] * nominal[indexmkn][0];
                                System.out.println("Total Bayar : Rp" + bayar[indexmkn][0]);
                                totalPembelian = totalPembelian + bayar[indexmkn][0];
                                break;
                            default:
                                System.out.println("");

                        }

                        indexmkn++;

                        System.out.println("=================================================================");

                        String jawab;
                        boolean stopAsk = false;

                        // Loop (Pertanyaan)
                        while (!stopAsk) {
                            System.out.print("Ingin Menambah Pesanan (Y/N) : ");

                            jawab = sc.next();

                            if (!jawab.toLowerCase().equals("y") && !jawab.toLowerCase().equals("n")) {
                                continue;
                            }

                            stopAsk = true;

                            if (jawab.toLowerCase().equals("n")) {
                                makanan = true;
                            }

                        }
                        
                        System.out.println("=================================================================");

                    }

                    break;

                case 2: // Minuman

                    Boolean minuman = false;
                    
                    while(!minuman) {

                        System.out.println("Aneka Menu Minuman : ");
                        System.out.println("1. Es Teh Rp5.000 per Porsi.");
                        System.out.println("2. Es Jeruk Rp6.000 per Porsi.");
                        System.out.println("3. Es Susu Rp8.000 per Porsi.");
                        System.out.println("4. Kopi Rp6.000 per Porsi.");
                        System.out.println("5. Air Mineral Rp4.000 per Porsi.");
                        System.out.print("Pilih Menu Minuman : ");
                        subMenu = sc.nextInt();

                        switch(subMenu) {

                            case 1: // Es Teh
                                pesanan[indexmnm][1] = "Es Teh        ";
                                harga[indexmnm][1] = 5000;
                                System.out.print("Nominal Pembelian : ");
                                nominal[indexmnm][1] = sc.nextInt();
                                bayar[indexmnm][1] = harga[indexmnm][1] * nominal[indexmnm][1];
                                System.out.println("Total Bayar : Rp" + bayar[indexmnm][1]);
                                totalPembelian = totalPembelian + bayar[indexmnm][1];
                                break;
                            case 2: // Es Jeruk
                                pesanan[indexmnm][1] = "Es Jeruk      ";
                                harga[indexmnm][1] = 6000;
                                System.out.print("Masukkan Jumlah Porsi : ");
                                nominal[indexmnm][1] = sc.nextInt();
                                bayar[indexmnm][1] = harga[indexmnm][1] * nominal[indexmnm][1];
                                System.out.println("Total Bayar : Rp" + bayar[indexmnm][1]);
                                totalPembelian = totalPembelian + bayar[indexmnm][1];
                                break;
                            case 3: // Es Susu
                                pesanan[indexmnm][1] = "Es Susu       ";
                                harga[indexmnm][1] = 8000;
                                System.out.print("Masukkan Jumlah Porsi : ");
                                nominal[indexmnm][1] = sc.nextInt();
                                bayar[indexmnm][1] = harga[indexmnm][1] * nominal[indexmnm][1];
                                System.out.println("Total Bayar : Rp" + bayar[indexmnm][1]);
                                totalPembelian = totalPembelian + bayar[indexmnm][1];
                                break;
                            case 4: // Kopi
                                pesanan[indexmnm][1] = "Kopi          ";
                                harga[indexmnm][1] = 6000;
                                System.out.print("Masukkan Jumlah Porsi : ");
                                nominal[indexmnm][1] = sc.nextInt();
                                bayar[indexmnm][1] = harga[indexmnm][1] * nominal[indexmnm][1];
                                System.out.println("Total Bayar : Rp" + bayar[indexmnm][1]);
                                totalPembelian = totalPembelian + bayar[indexmnm][1];
                                break;
                            case 5: // Air Mineral
                                pesanan[indexmnm][1] = "Air Mineral   ";
                                harga[indexmnm][1] = 5000;
                                System.out.print("Masukkan Jumlah Porsi : ");
                                nominal[indexmnm][1] = sc.nextInt();
                                bayar[indexmnm][1] = harga[indexmnm][1] * nominal[indexmnm][1];
                                System.out.println("Total Bayar : Rp" + bayar[indexmnm][1]);
                                totalPembelian = totalPembelian + bayar[indexmnm][1];
                                break;
                            default:
                                System.out.println("");

                        }

                        indexmnm++;

                        System.out.println("=================================================================");

                        String jawab;
                        boolean stopAsk = false;

                        // Loop (Pertanyaan)
                        while (!stopAsk) {
                            System.out.print("Ingin Menambah Pesanan (Y/N) : ");

                            jawab = sc.next();

                            if (!jawab.toLowerCase().equals("y") && !jawab.toLowerCase().equals("n")) {
                                continue;
                            }

                            stopAsk = true;

                            if (jawab.toLowerCase().equals("n")) {
                                minuman = true;
                            }

                        }
                        
                        System.out.println("=================================================================");

                    }

                    break;

                default: 
                    System.out.print("");
                    break;

            }
            
            System.out.println("=================================================================");

            String jawab;
            boolean stopAsk = false;

            // Loop (Pertanyaan)
            while (!stopAsk) {
                System.out.print("Ingin Menambah Makanan / Minuman (Y/N) : ");

                jawab = sc.next();

                if (!jawab.toLowerCase().equals("y") && !jawab.toLowerCase().equals("n")) {
                    continue;
                }

                stopAsk = true;

                if (jawab.toLowerCase().equals("n")) {
                    start = true;
                }

            }
            
            System.out.println("=================================================================");
        
        }
        
        System.out.println("");
        
        // Kartu Member
        String kartuMember;
        boolean loop = false;
        
        // Input Uang Pembayaran
        System.out.println("=================================================================");
        System.out.println("Total Pembelian : Rp" + totalPembelian);
        System.out.print("Uang Pembayaran : ");
        uangPembayaran = sc.nextInt();
        
        // Pengkondisian dan Looping Kartu Member
        while(!loop) {
            
            System.out.print("Memiliki Kartu Member Warunkk Ryujinnn [Y/N] ? ");
            kartuMember = sc.next();
            
            if(!kartuMember.toLowerCase().equals("y") && !kartuMember.toLowerCase().equals("n")) {
                continue;
            }
            
            System.out.println("=================================================================");
            System.out.println("");
            
            if(loop = true) {
                
                if(kartuMember.toLowerCase().equals("y")) {
                    // Memiliki Kartu Disc 10%
                    
                    diskon = (int)(totalPembelian * 0.1);
                    hargaAkhir = totalPembelian - diskon;
                    kembalian = uangPembayaran - hargaAkhir;
                    
                    // Struk Memiliki Kartu
                    System.out.println("=================================================================");
                    System.out.println("Struk Pembayaran Warunkk Ryujinnn");
                    System.out.println("=================================================================");
                    System.out.println("No.  Menu\t\tHarga\t\tPorsi\t\tBayar");
                    System.out.println("=================================================================");
            
                    System.out.println("Makanan : ");
                    for(int a = 0; a <= indexmkn; a++) {
                        if(pesanan[a][0]!=null){
                            System.out.print((a+1) + ".   " + pesanan[a][0] + "\tRp" +
                                harga[a][0] + "\t\t" + nominal[a][0] + "\t\tRp" + bayar[a][0] + "\n");
                        }
                    }
                    System.out.println("Minuman : ");
                    for(int b = 0; b <= indexmnm; b++) {
                        if(pesanan[b][1]!=null){
                            System.out.print((b+1) + ".   " + pesanan[b][1] + "\tRp" +
                                harga[b][1] + "\t\t" + nominal[b][1] + "\t\tRp" + bayar[b][1] + "\n");
                        }
                    }
                    
                    System.out.println("=================================================================");
                    System.out.println("Total Pembelian\t\t: Rp" + totalPembelian);
                    System.out.println("Diskon Kartu Member\t: Rp" + diskon);
                    System.out.println("Harga Akhir\t\t: Rp" + hargaAkhir);
                    System.out.println("Uang Pembayaran\t\t: Rp" + uangPembayaran);
                    System.out.println("Kembalian\t\t: Rp" + kembalian);
                    System.out.println("=================================================================");
                
                } else if(kartuMember.toLowerCase().equals("n")) {
                    // Tidak Memiliki Kartu
                    
                    kembalian = uangPembayaran - totalPembelian;
                    
                    // Struk Tidak Memiliki Kartu
                    System.out.println("=================================================================");
                    System.out.println("Struk Pembayaran Warunkk Ryujinnn");
                    System.out.println("=================================================================");
                    System.out.println("No.  Menu\t\tHarga\t\tPorsi\t\tBayar");
                    System.out.println("=================================================================");
                    
                    System.out.println("Makanan : ");
                    for(int a = 0; a <= indexmkn; a++) {
                        if(pesanan[a][0]!=null){
                            System.out.print((a+1) + ".   " + pesanan[a][0] + "\tRp" +
                                harga[a][0] + "\t\t" + nominal[a][0] + "\t\tRp" + bayar[a][0] + "\n");
                        }
                    }
                    System.out.println("Minuman : ");
                    for(int b = 0; b <= indexmnm; b++) {
                        if(pesanan[b][1]!=null){
                            System.out.print((b+1) + ".   " + pesanan[b][1] + "\tRp" +
                                harga[b][1] + "\t\t" + nominal[b][1] + "\t\tRp" + bayar[b][1] + "\n");
                        }
                    }
                    
                    System.out.println("=================================================================");
                    System.out.println("Total Pembelian\t\t: Rp" + totalPembelian);
                    System.out.println("Uang Pembayaran\t\t: Rp" + uangPembayaran);
                    System.out.println("Kembalian\t\t: Rp" + kembalian);
                    System.out.println("=================================================================");
                    
                }
            
            }
             
        }
        
        System.out.println("");
        System.out.println("=================================================================");
        System.out.println("Terima Kasih Telah Membeli!");
        System.out.println("=================================================================");
        System.out.println("");
        
    }
    
}
