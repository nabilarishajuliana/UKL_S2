
package perpus;
import java.util.Scanner;
import java.util.ArrayList;

public class peminjaman {
    
    //data untuk history peminjaman
    private ArrayList <Integer> idSiswa = new ArrayList <Integer>();
    private ArrayList <Integer> idBuku = new ArrayList <Integer>();
    private ArrayList <Integer> banyak = new ArrayList <Integer>();
    
    //data untuk history pengembalian
    private ArrayList <Integer> idSiswa2 = new ArrayList <Integer>();
    private ArrayList <Integer> idBuku2 = new ArrayList <Integer>();
    private ArrayList <Integer> banyak2 = new ArrayList <Integer>();
    
    
    public static Scanner masukkan= new Scanner (System.in);
    
    
   public void prosesPeminjaman(siswa siswa,buku buku,peminjaman peminjaman){
       
       ArrayList <Integer> idbukupinjem = new ArrayList <Integer>();
       ArrayList <Integer> banyaknya = new ArrayList <Integer>();
       
       System.out.println(">>>>>>>> PEMINJAMAN <<<<<<<<");
       System.out.print("Masukkan Id Siswa=");
       int idSiswa=masukkan.nextInt();
       
       if (siswa.getStatus(idSiswa)==false){ //false= sedang tidak meminjam
       
       int i=0;
       String temp="";
       
       do{
       System.out.print("masukkan Id buku=");
       int idBuku=masukkan.nextInt();
       
       
       idbukupinjem.add(idBuku);
       
       System.out.print("masukkan banyak buku "+ buku.getNamaBuku(idbukupinjem.get(i))+"=");
       int banyak=masukkan.nextInt();
       banyaknya.add(banyak);
       i++;
       System.out.print(">>Apakah masi ingin meminjam (y/t)=");
       temp=masukkan.next();
       
       
       }while (temp.equalsIgnoreCase("y"));
       
       
       System.out.println("");
       System.out.println("======== Data Buku Yang Dipinjam ========");
       System.out.println(" ID\t\t="+idSiswa);
       System.out.println(" Nama Siswa\t="+siswa.getNama(idSiswa));
               
       
       int total=0;
       
       for (int j = 0; j < idbukupinjem.size(); j++) {
           int jumlah=banyaknya.get(j)*buku.getHarga(idbukupinjem.get(j));
           total+=jumlah;
           System.out.println(" Nama Buku\t="+buku.getNamaBuku(idbukupinjem.get(j)));
           System.out.println(" Banyak Buku\t="+banyaknya.get(j));
           System.out.println(" Harga Buku\t="+buku.getHarga(idbukupinjem.get(j)));
           System.out.println(" Total Buku\t="+jumlah);
//           System.out.println(buku.getNamaBuku(idbukupinjem.get(j)) +"\t\t\t"+banyaknya.get(j)
//           +"\t\t"+buku.getHarga(idbukupinjem.get(j))+"\t\t"+jumlah); 
           
           System.out.println("");
           peminjaman.historyPeminjaman(buku, idSiswa, idbukupinjem.get(j), banyaknya.get(j));
       }
       
       System.out.println(" Total Harga =Rp "+total);
      
       siswa.editStatus(idSiswa, true);
       }
       else if(siswa.getStatus(idSiswa)==true){
           System.out.println("SISWA TELAH MEMINJAM BUKU,KEMBALIKAN BUKU TERLEBIH DAHULU");

       }
       System.out.println("");
       
   } 
   
   public void prosesPengembalian(siswa siswa,buku buku,peminjaman peminjaman){
       ArrayList <Integer> idbukukembali = new ArrayList <Integer>();
       ArrayList <Integer> banyaknya = new ArrayList <Integer>();
       
       System.out.println(">>>>>>>> PENGEMBALIAN <<<<<<<<");
       System.out.print("Masukkan Id Siswa=");
       int idSiswa=masukkan.nextInt();
       
       if (siswa.getStatus(idSiswa)==true){
       
         
       int i=0;
       String temp= "";
       
       do{
       System.out.print("masukkan Id buku=");
       int idBuku=masukkan.nextInt();
       
       idbukukembali.add(idBuku);
       
       System.out.print("masukkan banyak buku "+ buku.getNamaBuku(idbukukembali.get(i))+"=");
       int banyak=masukkan.nextInt();
       banyaknya.add(banyak);
       i++;
       System.out.print(">>Apakah masi ingin mengembalikan(y/t)=");
       temp=masukkan.next();
       
       }while (temp.equalsIgnoreCase("y"));
       
       System.out.println("");
       System.out.println("======== Data Buku Yang Dikembalikan ========");
       System.out.println(" ID\t\t="+idSiswa);
       System.out.println(" Nama Siswa\t="+siswa.getNama(idSiswa));
       
       int total=0;
       
       for (int j = 0; j < idbukukembali.size(); j++) {
            System.out.println(" Nama Buku\t="+buku.getNamaBuku(idbukukembali.get(j)));
           System.out.println(" Banyak Buku\t="+banyaknya.get(j)); 
           
           peminjaman.historyPengembalian(buku, idSiswa, idbukukembali.get(j), banyaknya.get(j));
       }
       
       
       siswa.editStatus(idSiswa, false);
       }
       else if(siswa.getStatus(idSiswa)==false){
           System.out.println("");
           System.out.println("SISWA TIDAK SEDANG MEMINJAM BUKU");
       }
       System.out.println(""); 
   }
   
   public void historyPengembalian(buku buku,int idSiswa,int idBuku,int banyak){
     this.idSiswa2.add(idSiswa);
       this.idBuku2.add(idBuku);
       this.banyak2.add(banyak);
       buku.editStok(idBuku, buku.getStok(idBuku)+banyak);  
   }
   
   public void historyPeminjaman(buku buku,int idSiswa,int idBuku,int banyak){
       this.idSiswa.add(idSiswa);
       this.idBuku.add(idBuku);
       this.banyak.add(banyak);
       buku.editStok(idBuku, buku.getStok(idBuku)-banyak);
   }
   
   public int getIdSiswa(int id) {
        return this.idSiswa.get(id);
    }

    public int getIdBuku(int id) {
        return this.idBuku.get(id);
    }

    public int getBanyak(int id) {
        return this.banyak.get(id);
    }
    
    public int getJumlahPeminjaman(){
        return this.idSiswa.size();
    }
    
    public int getJumlahPengembalian(){
        return this.idSiswa2.size();
    }
    
    
    
}
