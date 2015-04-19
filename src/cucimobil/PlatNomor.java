package cucimobil;

/**
 *
 * @author M Kaddafi S
 */
public class PlatNomor {
    private String kodeAwal;
    private String nomor;
    private String kodeAkhir;
    
    public String getKodeAwal() {
        return kodeAwal;
    }
    
    public void setKodeAwal (String kodeAwal) {
        if (kodeAwal.length() > 0
                && kodeAwal.length() <= 2) {
            this.kodeAwal = kodeAwal;
        }
    }
    
    public String getNomor() {
        return nomor;
    }
    
    public void setNomor(String nomor) throws Exception {
        try{
            Integer.parseInt(nomor);
        } catch (Exception e){
            throw new Exception("Harus berupa angka semua");
        }
        this.nomor = nomor;
    }
    
    public String getKodeAkhir() {
        return kodeAkhir;
    }

    public void setKodeAkhir(String kodeAkhir) {
        this.kodeAkhir = kodeAkhir;
    }
}
