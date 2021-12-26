package kuliah.UAS;

import java.util.Scanner;

public class UAS_BP1 {

    static String[][] bubbleSort(String[] menu, int[] harga){
        
        String hasil[][] = new String[10][2];
        for (int i = 0; i < menu.length; i++) {
            for (int j = 0; j < menu.length - 1; j++) {
                if(menu[j] != null){
                    if(menu[j].compareToIgnoreCase(menu[j+1]) > 0){
                        String temp = menu[j];
                        menu[j] = menu[j+1];
                        menu[j+1] = temp;
                        int h = harga[j];
                        harga[j] = harga[j+1];
                        harga[j+1] = h;
                    }
                }
            }
        }
        for (int i = 0; i < menu.length; i++) {
            hasil[i][0] = menu[i];
            hasil[i][1] = String.valueOf(harga[i]);
        }
        return hasil;
        
    }
    
    static String[][] searchMenu(String[] menu, int[] harga, String cari){
        
        String[][] hasil = new String[10][2];
        int index = 0;
        for (int i = 0; i < menu.length; i++){
            if(menu[i].indexOf(cari) >= 0){
                hasil[index][0] = menu[i];
                hasil[index][1] = String.valueOf(harga[i]);
                index++;
            }
        }
        return hasil;
        
    }
    
    static int hitungHarga(int hargaSatuan, int nominal){
        
        int harga = hargaSatuan * nominal;
        return harga;
        
    }
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        //Inisialisasi
        boolean akun = false;
        
        String makanan[] = new String[10];
        String minuman[] = new String[6];
        String cemilan[] = new String[4];
        int hargaMkn[] = new int[10];
        int hargaMnm[] = new int[10];
        int hargaCml[] = new int[10];
        
        //menu Makanan
        int jmlMkn = 7;
        makanan[0] = "Mie Goreng  "; hargaMkn[0] = 4000;
        makanan[1] = "Mie Kuah    "; hargaMkn[1] = 4000;
        makanan[2] = "Tahu Telor  "; hargaMkn[2] = 10000;
        makanan[3] = "Sate Ayam   "; hargaMkn[3] = 12000;
        makanan[4] = "Sate Kambing"; hargaMkn[4] = 15000;
        makanan[5] = "Soto Ayam   "; hargaMkn[5] = 9000;
        makanan[6] = "Nasi Goreng "; hargaMkn[6] = 13000;
        //menu Minuman
        int jmlMnm = 6;
        minuman[0] = "Pop Ice     "; hargaMnm[0] = 4000;
        minuman[1] = "Es Teh      "; hargaMnm[1] = 3000;
        minuman[2] = "Es Jeruk    "; hargaMnm[2] = 4000;
        minuman[3] = "Es Coklat   "; hargaMnm[3]= 6000;
        minuman[4] = "Es Susu     "; hargaMnm[4]= 5000;
        minuman[5] = "Kopi        "; hargaMnm[5]= 3000;
        //menu Cemilan
        int jmlCml = 4;
        cemilan[0] = "Kentang Goreng"; hargaCml[0] = 10000;
        cemilan[1] = "Gorengan      "; hargaCml[1] = 8000;
        cemilan[2] = "Pentol Bakar  "; hargaCml[2] = 15000;
        cemilan[3] = "Siomay        "; hargaCml[3] = 16000;
        
        String transaksi[][] = new String[20][3];
        String[] atasNama = new String[20];
        int[] nominal = new int[20];
        int[] totalHarga = new int[20];
        int totalTransaksi = 0;
        int menu = 0;
        int index = 0, idxMkn = 0, idxCml = 0, idxMnm = 0; 
        
        System.out.println("=================================================================");
        System.out.println("Kedai Halu 99");
        System.out.println("=================================================================\n");
                      
        while(!akun){
            
            System.out.print("Login Sebagai [Kasir/Admin/Owner] : ");
            String auth = scan.next();
            
            switch(auth.toLowerCase()){
            
                case "kasir" : //Kasir
                    System.out.println("Login Sebagai Kasir!\n");
                    
                    boolean pilihMenu = false;
                    
                    while(!pilihMenu) {
                        
                        System.out.println("=================================================================");
                        System.out.println("Daftar Menu : ");
                        System.out.println("1. Aneka Makanan");
                        System.out.println("2. Aneka Cemilan");
                        System.out.println("3. Aneka Minuman");
                        System.out.println("=================================================================\n");
                        System.out.print("Pilih Menu : ");
                        int pilih = scan.nextInt();
                        
                        switch(pilih) {
                            
                            case 1: //Makanan
                                
                                boolean forOpsi1 = false;
                                
                                while(!forOpsi1){
                                    
                                    System.out.print("Show All / Cari Menu Makanan [1/2] : ");
                                    int opsi1 = scan.nextInt();
                                    
                                    switch(opsi1){
                                        
                                        case 1 : //Show All Menu Makanan
                                            
                                            String[][] sortMakanan = bubbleSort(makanan, hargaMkn);
                                            System.out.println("Daftar Menu Makanan : ");
                                            System.out.println("No.\tNama Makanan\tHarga Per-Porsi");
                                            for (int c = 0; c < jmlMkn; c++) {
                                                System.out.println((c+1) + ".\t" + sortMakanan[c][0] + "\tRp" 
                                                        + sortMakanan[c][1]);
                                            }
                                            
                                            System.out.print("Pilih menu : ");
                                            menu = scan.nextInt();
                                            System.out.print("Nominal : ");
                                            nominal[index] = scan.nextInt();
                                            
                                            transaksi[index][0] = sortMakanan[menu - 1][0];
                                            transaksi[index][1] = String.valueOf(sortMakanan[menu-1][1]);
                                            totalHarga[index] = hitungHarga(Integer.parseInt(transaksi[index][1])
                                                    , nominal[index]);
                                            
                                            index++;
                                            
                                            System.out.println("");
                                            
                                            break;
                                        
                                        case 2 : //Cari Menu Makanan
                                            
                                            System.out.print("Cari Menu Makanan : ");
                                            String cariMakanan = scan.next();
                                            
                                            String hasilCari[][] = searchMenu(makanan, hargaMkn, cariMakanan);
                                            System.out.println("Hasil Pencarian : ");
                                            System.out.println("No.\tNama Makanan\tHarga Per-Porsi");
                                            for (int i = 0; i < hasilCari.length; i++){
                                                if(hasilCari[i][0] != null){
                                                    System.out.println((i+1) + ".\t" + hasilCari[i][0] + "\tRp" 
                                                            + Integer.parseInt(hasilCari[i][1]));
                                                }
                                            }
                                            
                                            System.out.print("Pilih menu : ");
                                            menu = scan.nextInt();
                                            System.out.print("Nominal : ");
                                            nominal[index] = scan.nextInt();
                                            
                                            transaksi[index][0] = hasilCari[menu - 1][0];
                                            transaksi[index][1] = String.valueOf(hasilCari[menu-1][1]);
                                            totalHarga[index] = hitungHarga(Integer.parseInt(transaksi[index][1])
                                                    , nominal[index]);
                                            
                                            index++;
                                            
                                            System.out.println("");
                                            
                                            break;
                                            
                                        default:
                                            System.out.println("Opsi Anda Salah!");
                                        
                                    }
                                    
                                    System.out.println("");
                                    
                                    String jawab;
                                    boolean stopAsk = false;

                                    // Loop (Pertanyaan Opsi 1 Kembali)
                                    while (!stopAsk) {
                                        System.out.print("Memesan Makanan Lagi (Y/N) : ");

                                        jawab = scan.next();

                                        if (!jawab.toLowerCase().equals("y") && !jawab.toLowerCase().equals("n")) {
                                            continue;
                                        }

                                        stopAsk = true;

                                        if (jawab.toLowerCase().equals("n")) {
                                            forOpsi1 = true;
                                        }

                                    }
                                    
                                }
                                
                                break;
                            case 2: //Cemilan
                                
                                boolean forOpsi2 = false;
                                
                                while(!forOpsi2){
                                    
                                    System.out.print("Show All / Cari Menu Cemilan [1/2] : ");
                                    int opsi2 = scan.nextInt();
                                    
                                    switch(opsi2){
                                        
                                        case 1 : //Show All Menu Cemilan
                                            
                                            String[][] sortCemilan = bubbleSort(cemilan, hargaCml);
                                            System.out.println("Daftar Menu Cemilan : ");
                                            System.out.println("No.\tNama Cemilan\tHarga Per-Porsi");
                                            for (int d = 0; d < jmlCml; d++) {
                                                System.out.println((d+1) + ".\t" + sortCemilan[d][0] + "\tRp" 
                                                        + sortCemilan[d][1]);
                                            }
                                            
                                            System.out.print("Pilih menu : ");
                                            menu = scan.nextInt();
                                            System.out.print("Nominal : ");
                                            nominal[index] = scan.nextInt();
                                            
                                            transaksi[index][0] = sortCemilan[menu - 1][0];
                                            transaksi[index][1] = String.valueOf(sortCemilan[menu-1][1]);
                                            totalHarga[index] = hitungHarga(Integer.parseInt(transaksi[index][1])
                                                    , nominal[index]);
                                            
                                            index++;
                                            
                                            System.out.println("");
                                            
                                            break;
                                            
                                        case 2 : //Cari Menu Cemilan
                                            
                                            System.out.print("Cari Menu Makanan : ");
                                            String cariCemilan = scan.next();
                                            
                                            String hasilCari[][] = searchMenu(cemilan, hargaCml, cariCemilan);
                                            System.out.println("Hasil Pencarian : ");
                                            System.out.println("No.\tNama Cemilan\tHarga Per-Porsi");
                                            for (int i = 0; i < hasilCari.length; i++){
                                                if(hasilCari[i][0] != null){
                                                    System.out.println((i+1) + ".\t" + hasilCari[i][0] + "\tRp" 
                                                            + Integer.parseInt(hasilCari[i][1]));
                                                }
                                            }
                                            
                                            System.out.print("Pilih menu : ");
                                            menu = scan.nextInt();
                                            System.out.print("Nominal : ");
                                            nominal[index] = scan.nextInt();
                                            
                                            transaksi[index][0] = hasilCari[menu - 1][0];
                                            transaksi[index][1] = String.valueOf(hasilCari[menu-1][1]);
                                            totalHarga[index] = hitungHarga(Integer.parseInt(transaksi[index][1])
                                                    , nominal[index]);
                                            
                                            index++;
                                            
                                            System.out.println("");
                                            
                                            break;
                                            
                                        default:
                                            System.out.println("Opsi Anda Salah");
                                        
                                    }
                                    
                                    System.out.println("");
                                    
                                    String jawab;
                                    boolean stopAsk = false;

                                    // Loop (Pertanyaan Opsi 2 Kembali)
                                    while (!stopAsk) {
                                        System.out.print("Memesan Cemilan Lagi (Y/N) : ");

                                        jawab = scan.next();

                                        if (!jawab.toLowerCase().equals("y") && !jawab.toLowerCase().equals("n")) {
                                            continue;
                                        }

                                        stopAsk = true;

                                        if (jawab.toLowerCase().equals("n")) {
                                            forOpsi2 = true;
                                        }

                                    }
                                    
                                }
                                
                                break;
                                
                            case 3: //Minuman
                                
                                boolean forOpsi3 = false;
                                
                                while(!forOpsi3){
                                    
                                    System.out.print("Show All / Cari Menu Minuman [1/2] : ");
                                    int opsi3 = scan.nextInt();
                                    
                                    switch(opsi3){
                                        
                                        case 1 : //Show All Menu Minuman
                                            
                                            String[][] sortMinuman = bubbleSort(minuman, hargaMnm);
                                            System.out.println("Daftar Menu Minuman : ");
                                            System.out.println("No.\tNama Minuman\tHarga Per-Porsi");
                                            for (int e = 0; e < jmlMnm; e++) {
                                                System.out.println((e+1) + ".  " + sortMinuman[e][0] + "\tRp" 
                                                        + sortMinuman[e][1]);
                                            }
                                            
                                            System.out.print("Pilih menu : ");
                                            menu = scan.nextInt();
                                            System.out.print("Nominal : ");
                                            nominal[index] = scan.nextInt();
                                            
                                            transaksi[index][0] = sortMinuman[menu - 1][0];
                                            transaksi[index][1] = String.valueOf(sortMinuman[menu-1][1]);
                                            totalHarga[index] = hitungHarga(Integer.parseInt(transaksi[index][1])
                                                    , nominal[index]);
                                            
                                            index++;
                                            
                                            System.out.println("");
                                            
                                            break;
                                        
                                        case 2 : //Cari Menu Minuman
                                            
                                            System.out.print("Cari Menu Makanan : ");
                                            String cariMinuman = scan.next();
                                            
                                            String hasilCari[][] = searchMenu(minuman, hargaMnm, cariMinuman);
                                            System.out.println("Hasil Pencarian : ");
                                            System.out.println("No.\tNama Minuman\tHarga Per-Porsi");
                                            for (int i = 0; i < hasilCari.length; i++){
                                                if(hasilCari[i][0] != null){
                                                    System.out.println((i+1) + ".\t" + hasilCari[i][0] + "\tRp" 
                                                            + Integer.parseInt(hasilCari[i][1]));
                                                }
                                            }
                                            
                                            System.out.print("Pilih menu : ");
                                            menu = scan.nextInt();
                                            System.out.print("Nominal : ");
                                            nominal[index] = scan.nextInt();
                                            
                                            transaksi[index][0] = hasilCari[menu - 1][0];
                                            transaksi[index][1] = String.valueOf(hasilCari[menu-1][1]);
                                            totalHarga[index] = hitungHarga(Integer.parseInt(transaksi[index][1])
                                                    , nominal[index]);
                                            
                                            index++;
                                            
                                            System.out.println("");
                                            
                                            break;
                                        
                                        default:
                                            System.out.println("Opsi Anda Salah");
                                        
                                    }
                                    
                                    System.out.println("");
                                    
                                    String jawab;
                                    boolean stopAsk = false;

                                    // Loop (Pertanyaan Opsi 3 Kembali)
                                    while (!stopAsk) {
                                        System.out.print("Memesan Minuman Lagi (Y/N) : ");

                                        jawab = scan.next();

                                        if (!jawab.toLowerCase().equals("y") && !jawab.toLowerCase().equals("n")) {
                                            continue;
                                        }

                                        stopAsk = true;

                                        if (jawab.toLowerCase().equals("n")) {
                                            forOpsi3 = true;
                                        }

                                    }
                                    
                                }
                                
                                break;
                                
                            default:
                                System.out.println("Pilihan Menu Tidak Tersedia!");
                                break;
                            
                        }
                        
                        System.out.println("");
                        
                        String jawab;
                        boolean stopAsk = false;

                        // Loop (Pertanyaan Transaksi Kembali)
                        while (!stopAsk) {
                            System.out.print("Ingin Memilih Menu Lagi (Y/N) : ");

                            jawab = scan.next();

                            if (!jawab.toLowerCase().equals("y") && !jawab.toLowerCase().equals("n")) {
                                continue;
                            }

                            stopAsk = true;

                            if (jawab.toLowerCase().equals("n")) {
                                pilihMenu = true;
                            }

                        }
                    
                    }
                    
                    System.out.println("Daftar Transaksi : ");
                    System.out.println("No.\tNama Menu\tHarga Per-Porsi\tNominal\tTotal Harga");
                    for (int i = 0; i < index; i++) {
                        System.out.println((i+1) + ".\t" + transaksi[i][0] + "\tRp" + transaksi[i][1] + "\t\t" 
                                + nominal[i] + "\t" + totalHarga[i]);
                        totalTransaksi = totalTransaksi + totalHarga[i];
                    }
                    System.out.println("Total Transaksi Kedai Halu 99 : " + totalTransaksi);
                    
                    break;
                
                case "admin" : //Admin
                    System.out.println("Login Sebagai Admin!\n");
                    
                    boolean pilihMenu2 = false;
                    
                    while(!pilihMenu2) {
                        
                        //CRUD
                        System.out.println("=================================================================");
                        System.out.println("Opsi Admin : ");
                        System.out.println("1. Menampilkan Menu");
                        System.out.println("2. Menambah Menu");
                        System.out.println("3. Mengubah Menu");
                        System.out.println("4. Menghapus Menu");
                        System.out.println("=================================================================\n");
                        System.out.print("Pilih Menu : ");
                        int pilih2 = scan.nextInt();
                        
                        switch(pilih2){
                            
                            case 1 : //Menampilkan Menu
                                break;
                            case 2 : //Menambah Menu
                                
                                boolean create = false;
                                
                                System.out.println("");
                                
                                while(!create) {
                                    
                                    System.out.println("1. Menambah Menu Makanan");
                                    System.out.println("2. Menambah Menu Cemilan");
                                    System.out.println("3. Menambah Menu Minuman");
                                    System.out.print("PIlih Opsi : ");
                                    int opsi = scan.nextInt();
                                    
                                    switch(opsi){
                                        
                                        case 1 : // Create Makanan
                                            
                                            boolean createMakanan = false;
                                            
                                            while(!createMakanan){
                                                
                                                System.out.print("Nama Menu Makanan : ");
                                                makanan[jmlMkn] = scan.next();
                                                System.out.print("Harga Menu Makanan : ");
                                                hargaMkn[jmlMkn] = scan.nextInt();
                                                jmlMkn++;
                                                
                                                String jawab;
                                                boolean stopAsk = false;

                                                // Loop (Pertanyaan Opsi 1 Kembali)
                                                while (!stopAsk) {
                                                    System.out.print("Ingin Menambah Menu Makanan Lagi (Y/N) : ");

                                                    jawab = scan.next();

                                                    if (!jawab.toLowerCase().equals("y") && !jawab.toLowerCase().equals("n")) {
                                                        continue;
                                                    }

                                                    stopAsk = true;

                                                    if (jawab.toLowerCase().equals("n")) {
                                                        createMakanan = true;
                                                    }

                                                }
                                                
                                            }
                                            
                                            break;
                                        case 2 : // Create Cemilan
                                            
                                            boolean createCemilan = false;
                                            
                                            while(!createCemilan){
                                                
                                                System.out.print("Nama Menu Cemilan : ");
                                                makanan[jmlMkn] = scan.next();
                                                System.out.print("Harga Menu Cemilan : ");
                                                hargaMkn[jmlMkn] = scan.nextInt();
                                                jmlMkn++;
                                                
                                                String jawab;
                                                boolean stopAsk = false;

                                                // Loop (Pertanyaan Opsi 1 Kembali)
                                                while (!stopAsk) {
                                                    System.out.print("Ingin Menambah Menu Cemilan Lagi (Y/N) : ");

                                                    jawab = scan.next();

                                                    if (!jawab.toLowerCase().equals("y") && !jawab.toLowerCase().equals("n")) {
                                                        continue;
                                                    }

                                                    stopAsk = true;

                                                    if (jawab.toLowerCase().equals("n")) {
                                                        createCemilan = true;
                                                    }

                                                }
                                                
                                            }
                                            
                                            break;
                                        case 3 : // Create Minuman
                                            
                                            boolean createMinuman = false;
                                            
                                            while(!createMinuman){
                                                
                                                System.out.print("Nama Menu Minuman : ");
                                                makanan[jmlMkn] = scan.next();
                                                System.out.print("Harga Menu Minuman : ");
                                                hargaMkn[jmlMkn] = scan.nextInt();
                                                jmlMkn++;
                                                
                                                String jawab;
                                                boolean stopAsk = false;

                                                // Loop (Pertanyaan Opsi 1 Kembali)
                                                while (!stopAsk) {
                                                    System.out.print("Ingin Menambah Menu Minuman Lagi (Y/N) : ");

                                                    jawab = scan.next();

                                                    if (!jawab.toLowerCase().equals("y") && !jawab.toLowerCase().equals("n")) {
                                                        continue;
                                                    }

                                                    stopAsk = true;

                                                    if (jawab.toLowerCase().equals("n")) {
                                                        createMinuman = true;
                                                    }

                                                }
                                                
                                            }
                                            
                                            break;
                                        default:
                                            System.out.println("Opsi Menambah Anda Salah!");
                                        
                                    }
                                    
                                    String jawab;
                                    boolean stopAsk = false;

                                    // Loop (Pertanyaan Opsi 1 Kembali)
                                    while (!stopAsk) {
                                        System.out.print("Ingin Menambah Menu Lagi (Y/N) : ");

                                        jawab = scan.next();

                                        if (!jawab.toLowerCase().equals("y") && !jawab.toLowerCase().equals("n")) {
                                            continue;
                                        }

                                        stopAsk = true;

                                        if (jawab.toLowerCase().equals("n")) {
                                            create = true;
                                        }

                                    }
                                    
                                }
                                
                                break;
                            case 3 : //Mengubah Menu
                                break;
                            case 4 : // Menghapus Menu
                                break;
                            default : 
                                System.out.println("Pilihan Opsi Salah!");
                            
                        }
                        
                        System.out.println("");
                                    
                        String jawab;
                        boolean stopAsk = false;

                        // Loop (Pertanyaan Opsi 1 Kembali)
                        while (!stopAsk) {
                            System.out.print("Ingin Memilih Opsi Lain (Y/N) : ");

                            jawab = scan.next();

                            if (!jawab.toLowerCase().equals("y") && !jawab.toLowerCase().equals("n")) {
                                continue;
                            }

                            stopAsk = true;

                            if (jawab.toLowerCase().equals("n")) {
                                pilihMenu2 = true;
                            }

                        }
                    
                    }
                    
                    break;
                    
                case "owner" : //Owner
                    System.out.println("Login Sebagai Owner!");
                    
                    
                    
                    break;
                    
                default: 
                    System.out.println("Akun Salah atau Tidak Ditemukan");
                    break;
                
            }
            
            System.out.println("");
            
            String jawab;
            boolean stopAsk = false;
            
            // Loop (Pertanyaan Login Kembali)
            while (!stopAsk) {
                System.out.print("Ingin Login Kembali (Y/N) : ");

                jawab = scan.next();

                if (!jawab.toLowerCase().equals("y") && !jawab.toLowerCase().equals("n")) {
                    continue;
                }

                stopAsk = true;

                if (jawab.toLowerCase().equals("n")) {
                    akun = true;
                }

            }
            
        }
        
        
        
    }
    
}
