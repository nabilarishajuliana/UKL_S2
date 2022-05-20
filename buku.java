
package perpus;
import java.util.ArrayList;

public class buku {
    private ArrayList <String> namaBuku = new ArrayList <String>();
    private ArrayList <Integer> stok = new ArrayList <Integer>();
    private ArrayList <Integer> harga = new ArrayList <Integer>();
    
    public buku (){
        this.namaBuku.add("Buku Matematika");
        this.stok.add(12);
        this.harga.add(5000);
        
        this.namaBuku.add("Buku Bahasa Indonesia");
        this.stok.add(18);
        this.harga.add(7000);
        
        this.namaBuku.add("Buku IPA");
        this.stok.add(20);
        this.harga.add(6000);
        
    }
    
    public int banyakBuku(){
        return this.namaBuku.size();
    }
    
    public void editStok(int id,int stok){
        this.stok.set(id, stok);
    }
    
    public void setNamaBuku(String nama){
        this.namaBuku.add(nama);
    }
    
    public void setStok(int stok){
        this.stok.add(stok);
    }
    
    public void setHarga(int harga){
        this.harga.add(harga);
    }
    
     public String getNamaBuku(int id) {
        return this.namaBuku.get(id);
    }

    public int getStok(int id) {
        return this.stok.get(id);
    }

    public int getHarga(int id) {
        return this.harga.get(id);
    }
    
   
    
    
    
    
    
    
    
    
    
//   int stok;
//        String dataBuku []={
//        "buku MTK","buku IPA","buku SEJARAH","buku SENI BUDAYA",
//        "buku B.INDO","buku B.ING","buku PPKN"
//        };
//        int stokBuku[]={5,6,4,8,6,7,10};
//   
//    public void pengembalian (int no){
//        if (no==1){
//            System.out.println("stok awal="+stokBuku[0]);
//            stokBuku[0]+=1;
//             System.out.println("stok terbaru="+stokBuku[0]);
//        }
//        else if (no==2){
//        System.out.println("stok awal="+stokBuku[1]);
//            stokBuku[1]+=1;
//            System.out.println("stok terbaru="+stokBuku[1]);
//        }
//        else if (no==3){
//            System.out.println("stok awal="+stokBuku[2]);
//            stokBuku[2]+=1;
//            System.out.println("stok terbaru="+stokBuku[2]);
//        }
//        else if (no==4){
//            System.out.println("stok awal="+stokBuku[3]);
//            stokBuku[3]+=1;
//            System.out.println("stok terbaru="+stokBuku[3]);
//        }
//        else if (no==5){
//            System.out.println("stok awal="+stokBuku[4]);
//            stokBuku[4]+=1;
//            System.out.println("stok terbaru="+stokBuku[4]);
//        }
//        else if (no==6){
//            System.out.println("stok awal="+stokBuku[5]);
//            stokBuku[5]+=1;
//            System.out.println("stok terbaru="+stokBuku[5]);
//        }
//        else if (no==7){
//            System.out.println("stok awal="+stokBuku[6]);
//            stokBuku[6]+=1;
//            System.out.println("stok terbaru="+stokBuku[6]);
//        }
//        
//    }
//    
//    public void peminjaman (int no){
//         if (no==1){
//            stokBuku[0]-=1;
//        }
//        else if (no==2){
//            stokBuku[1]-=1;
//        }
//        else if (no==3){
//            stokBuku[2]-=1;
//        }
//        else if (no==4){
//            stokBuku[3]-=1;
//        }
//        else if (no==5){
//            stokBuku[4]-=1;
//        }
//        else if (no==6){
//            stokBuku[5]-=1;
//        }
//        else if (no==7){
//            stokBuku[6]-=1;
//        }
//    }
//    

   
    
    
}
