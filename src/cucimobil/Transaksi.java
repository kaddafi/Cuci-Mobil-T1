package cucimobil;

import java.util.Date;

/**
 *
 * @author M Kaddafi S
 */
public class Transaksi {
    private Date waktu;
    private String KodeLayanan;
    private int biaya;

    public String getKodeLayanan() {
        return KodeLayanan;
    }

    public void setKodeLayanan(String KodeLayanan) throws Exception {
        try{
            Integer.parseInt(KodeLayanan);
        } catch (Exception e){
            throw new Exception("Kode Layanan harus berupa angka");
        }
        this.KodeLayanan = KodeLayanan;
    }

    public int getBiaya() {
        return biaya;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }
    
    public Date getWaktu() {
        return waktu;
    }

    public void setWaktu(Date waktu) {
        this.waktu = waktu;
    } 
}
