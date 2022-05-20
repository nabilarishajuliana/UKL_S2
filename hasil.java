
package perpus;

import java.util.Scanner;

public class hasil {
    
public static Scanner masukkan=new Scanner(System.in);
    
    public static void main(String[] args) {
        
        laporan laporan=new laporan();
        peminjaman peminjaman=new peminjaman();
        siswa siswa=new siswa ();
        petugas petugas= new petugas ();
        buku buku= new buku ();
        
        laporan.laporan(buku);
        System.out.println("");
        laporan.laporan(siswa);
        System.out.println("");
        laporan.laporan(petugas);
        System.out.println("");
        
        
        while (true){
        System.out.println(">>>>> SELAMAT DATANG DI PERPUS <<<<<");
        System.out.println("[1] PEMINJAMAN");
        System.out.println("[2] PENGEMBALIAN");
        System.out.println("[3] KELUAR");
        System.out.print("Masukkan pilihan=");
        int no=masukkan.nextInt();
        
        
        if (no==1){
            System.out.println("");
         peminjaman.prosesPeminjaman(siswa, buku, peminjaman);  
        
        }
        else if(no==2){
            System.out.println("");
        peminjaman.prosesPengembalian(siswa, buku, peminjaman);
            
        }
        else if(no==3){
            System.out.println("");
            System.out.println(">> TERIMAKASIH <<");
            System.exit(0);
        }
        else{
            System.out.println("");
            System.out.println("SALAH INPUT!!!");
            System.exit(0);
        }
        }
        
        
        
        
        
        
        
//         siswa data=new siswa();
//        peminjaman data2=new peminjaman();
//        
//        String alamatSiswa;
//        int ID;
//        int telponSiswa,pilih,statusSiswa;
//        System.out.println("masukkan nama ID=");
//        ID=masukkan.nextInt();
//        data.setId(ID);
//        System.out.println("masukkan alamat siswa:");
//        alamatSiswa=masukkan.nextLine();
//        System.out.println("masukkan no telpon:");
//        telponSiswa=masukkan.nextInt();
//        System.out.println("=========== pilihan ===========");
//        System.out.println("1.sedang meminjam buku");
//        System.out.println("2.tidak sedang meminjam buku");
//        System.out.println("pilih (1/2)=");
//        statusSiswa=masukkan.nextInt();
//        
//        
//       if (statusSiswa ==1){
//           System.out.println("=========== pilihan ===========");
//           System.out.println("1.ingin mengembalikan");
//           System.out.println("2.tidak ingin mengembalikan");
//           System.out.println("pilih (1/2)=");
//           pilih=masukkan.nextInt();
//           if (pilih==2){
//               System.out.println("tidak bisa meminjam,harus mengembalikan terlebih dahulu!!!");
//               System.exit(0);
//           }
//           else if(pilih==1){
//               data2.pengembalian();
//               data.siswa();
//           }
//        
//       }
       
        
//         ArrayList<String> nama = new ArrayList<>();
//         ArrayList<String> alamat = new ArrayList<>();
//         ArrayList<Integer> telpon = new ArrayList<>();
//         ArrayList<String> status = new ArrayList<>();
         
//         nama.add(ID);
//         alamat.add(alamatSiswa);
//         telpon.add(telponSiswa);
//         status.add(statusSiswa);
         
//         if (statusSiswa.equalsIgnoreCase("meminjam")){
//             
//         }
         
//         data.setNama(nama.get(0));
//         data.setAlamat(alamat.get(0));
//         data.setTelpon(telpon.get(0));
//         data.setStatus(status.get(0));
         
    }
    
}
