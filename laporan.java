
package perpus;


public class laporan {
    
    public void laporan(buku buku){
        System.out.println("======== List Buku ========");
        System.out.println("Id Buku: Nama Buku, Stok, Harga\t");
        for (int i = 0; i < buku.banyakBuku(); i++) {
            System.out.println(i+": "+buku.getNamaBuku(i)+", "+buku.getStok(i)+", "+
                    buku.getHarga(i));
        }
    }
    
    public void laporan(siswa siswa){
        System.out.println("======== Daftar Siswa ========");
        System.out.println("Nama\t Alamat\t telepon\t\t status");
        for (int i = 0; i < siswa.getbanyaksiswa(); i++) {
            System.out.println(siswa.getNama(i)+"\t "+siswa.getalamat(i)+"\t "+
                    siswa.getTelpon(i)+ "\t "+siswa.getStatus(i));
        }
    }
    
    public void laporan(petugas petugas){
        System.out.println("======== Daftar Petugas ========");
        System.out.println("Nama\t Alamat\t        telepon");
        for (int i = 0; i < petugas.getBanyakPetugas(); i++) {
            System.out.println(petugas.getNama(i)+"\t "+petugas.getalamat(i)+"   \t"+
                    petugas.getTelpon(i));
        }
    }
}
