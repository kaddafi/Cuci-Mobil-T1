package cucimobil;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author M Kaddafi S
 */
public class CuciMobil {

    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai();
        try{
            pegawai1.setNama("Santo");
        } catch (Exception e){
            System.out.println("Terdapat Kesalahan : " + e.getMessage());
        }
        try{
            pegawai1.setIdPegawai("44011504");
        } catch (Exception e){
            System.out.println("Terdapat Kesalahan : " + e.getMessage());
        }
        pegawai1.setAlamat("Jalan Kebon Nanas 2 Jaktim");
        try{
            pegawai1.setNoHp("087834651823");
        } catch (Exception e){
            System.out.println("Terdapat Kesalahan : " + e.getMessage());
        }
        
        Pelanggan pelanggan1 = new Pelanggan();
        try{
            pelanggan1.setNama("Joko");
        } catch (Exception e){
            System.out.println("Terdapat Kesalahan : " + e.getMessage());
        }

        try{
            pelanggan1.setIdPelanggan("77011504");
        } catch (Exception e){
            System.out.println("Terdapat Kesalahan : " + e.getMessage());
        }
        pelanggan1.setAlamat("Jalan Kebon Sayur 1 Jaktim");
        try{
            pelanggan1.setNoHp("085790234123");
        } catch (Exception e){
            System.out.println("Terdapat Kesalahan : " + e.getMessage());
        }
        pelanggan1.setTipeMobil("Nissan X-Trail");
        
        PlatNomor platNomorPelanggan1 = new PlatNomor();
        platNomorPelanggan1.setKodeAwal("H");
        try {
            platNomorPelanggan1.setNomor("3003");
        } catch (Exception e) {
            System.out.println("Terdapat Kesalahan : " + e.getMessage());
        }
        platNomorPelanggan1.setKodeAkhir("B");
        
        Layanan layananPelanggan1 = new Layanan();
        try {
            layananPelanggan1.setJenisCuci("Cuci Salju");
        } catch (Exception e) {
            System.out.println("Terdapat Kesalahan : " + e.getMessage());
        }
        try {
            layananPelanggan1.setTambahan("Doorsmeer");
        } catch (Exception e) {
            System.out.println("Terdapat Kesalahan : " + e.getMessage());
        }
        
        Transaksi transaksi1 = new Transaksi();
        transaksi1.setWaktu(new Date());
        try {
            transaksi1.setKodeLayanan("19041501");
        } catch (Exception e) {
            System.out.println("Terdapat Kesalahan : " + e.getMessage());
        }
        transaksi1.setBiaya(200000);
     
        cetakPegawai(pegawai1);
        System.out.println();
        cetakPelanggan(pelanggan1);       
        System.out.println();
        cetakNota(pegawai1, pelanggan1, platNomorPelanggan1, layananPelanggan1, transaksi1);        
    }
    
    static void cetakPegawai (Pegawai pegawai){
        System.out.println("---DAFTAR PEGAWAI---");
        System.out.println("Nama     : " +pegawai.getNama());
        System.out.println("Nomor Id : " +pegawai.getIdPegawai());
        System.out.println("Alamat   : " +pegawai.getAlamat());
        System.out.println("Nomor HP : " +pegawai.getNoHp());
    }
    
    static void cetakPelanggan (Pelanggan pelanggan){
        System.out.println("---DAFTAR PELANGGAN---");
        System.out.println("Nama     : " +pelanggan.getNama());
        System.out.println("Nomor Id : " +pelanggan.getIdPelanggan());
        System.out.println("Alamat   : " +pelanggan.getAlamat());
        System.out.println("Nomor HP : " +pelanggan.getNoHp());
    }
    static void cetakNota (Pegawai pegawai, Pelanggan pelanggan, PlatNomor platNomor, Layanan layanan, Transaksi transaksi){
        System.out.println("-----CETAK NOTA-----");
        System.out.println("Tanggal        : " +transaksi.getWaktu());
        System.out.println("Kode Transaksi : " +transaksi.getKodeLayanan());
        System.out.println("Petugas        : " +pegawai.getNama());
        System.out.println("--------------------");
        System.out.println("Pelanggan   : " +pelanggan.getNama());
        System.out.println("Nomor HP    : " +pelanggan.getNoHp());
        System.out.println("Mobil       : " +pelanggan.getTipeMobil());
        System.out.println("No Polisi   : " +platNomor.getKodeAwal()+ " " +platNomor.getNomor()+ " " +platNomor.getKodeAkhir());
        System.out.println("--------------------");
        System.out.println("Layanan     : " +layanan.getJenisCuci());
        System.out.println("Tambahan    : " +layanan.getTambahan());
        System.out.println("Total Biaya : " +transaksi.getBiaya());
    }
}
