
package perpus;

import java.util.ArrayList;

public class siswa implements user{
    
    private ArrayList<String> namaSiswa = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telpon = new ArrayList<String>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();
    
    public siswa (){
        this.namaSiswa.add("yaya");
        this.alamat.add("Malang");
        this.telpon.add("08234569");
        this.status.add(false);
        
        this.namaSiswa.add("eleina");
        this.alamat.add("jakarta");
        this.telpon.add("08237823");
        this.status.add(false);
        
        this.namaSiswa.add("nami");
        this.alamat.add("Bandung");
        this.telpon.add("08288832");
        this.status.add(false);
    }
    
    public int getbanyaksiswa(){
        return this.namaSiswa.size();
    }
    
    public void editStatus(int id,boolean status){
        this.status.set(id, status);
    }
    
    public void setStatus(boolean status){
        this.status.add(status);
    }
    
    public boolean getStatus(int id){
        return this.status.get(id);
    }
    

    @Override
    public void setNama(String nama) {
     this.namaSiswa.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
     this.alamat.add(alamat);
    }

    @Override
    public void setTelpon(String telp) {
     this.telpon.add(telp);
    }

    @Override
    public String getNama(int id) {
     return this.namaSiswa.get(id);
    }

    @Override
    public String getalamat(int id) {
     return this.alamat.get(id);
    }

    @Override
    public String getTelpon(int id) {
     return this.telpon.get(id);
    }
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
 
//private int noId;
//
//public void dataSiswa(int id){
//
//String dataSiswa [][] = {
//    { "natsu","bogor","08123"},
//    { "luffy","surabaya","08124"},
//    { "kades","malang","08125"}
//    };
//
//if (id==1){
//    System.out.println(dataSiswa[0][id-1]);
//    System.out.println(dataSiswa[0][id]);
//    System.out.println(dataSiswa[0][id+1]);
//}
//else if (id==2){
//    System.out.println(dataSiswa[0][id-1]);
//    System.out.println(dataSiswa[0][id]);
//    System.out.println(dataSiswa[0][id+1]);
//}
//else if (id==3){
//    System.out.println(dataSiswa[0][id-1]);
//    System.out.println(dataSiswa[0][id]);
//    System.out.println(dataSiswa[0][id+1]);
//}
//
//}
//
//   
//
//    
//
//    
//
//    public int getId() {
//        return noId;
//    }
//
//    public void setId(int id) {
//        this.noId = id;
//    }
//
//   
//  public void siswa(){
//      
//          
//              System.out.println("======== DATA SISWA ========");
//              dataSiswa(noId);
//              System.out.println("Status="+super.status);
//              System.out.println("Nama buku="+super.buku);
              
//          
//              System.out.println("======== DATA SISWA ========");
//              dataSiswa(noId);
//              System.out.println("Status=peminjaman Buku");
//              System.out.println("Nama buku="+dataBuku[noBuku-1]);
              
          

      
  }
    

