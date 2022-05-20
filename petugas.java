
package perpus;

import java.util.ArrayList;

public class petugas implements user {
    
    private ArrayList<String> namaKariyawan = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telpon = new ArrayList<String>();
    
    public petugas (){
        this.namaKariyawan.add("lutfi");
        this.alamat.add("Malang");
        this.telpon.add("08220939");
        
        this.namaKariyawan.add("jeki");
        this.alamat.add("surabaya");
        this.telpon.add("08749369");
        
        this.namaKariyawan.add("juna");
        this.alamat.add("jogja");
        this.telpon.add("08239076");
    } 
    
    public int getBanyakPetugas(){
        return this.namaKariyawan.size();
    }

    @Override
    public void setNama(String nama) {
     this.namaKariyawan.add(nama);
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
     return this.namaKariyawan.get(id);
    }

    @Override
    public String getalamat(int id) {
     return this.alamat.get(id);
    }

    @Override
    public String getTelpon(int id) {
     return this.telpon.get(id);
    }
    
}
