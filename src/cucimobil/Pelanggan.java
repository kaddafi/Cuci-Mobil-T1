package cucimobil;

/**
 *
 * @author M Kaddafi S
 */
public class Pelanggan {
    private String nama;
    private String idPelanggan;
    private String alamat;
    private String noHp;
    private String tipeMobil;
    private PlatNomor platNomor;

    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) throws Exception {
        for (char c : nama.toCharArray()) {
                if(Character.isDigit(c)){
                    throw new Exception("Nama harus berupa huruf");
                }
            }
        this.nama = nama;
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(String idPelanggan) throws Exception {
        try{
            Integer.parseInt(idPelanggan);
        } catch (Exception e){
            throw new Exception("Nomor ID harus berupa angka");
        }
        this.idPelanggan = idPelanggan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) throws Exception {
        for (char c : noHp.toCharArray()) {
                if(!Character.isDigit(c)){
                    throw new Exception("Nomor harus berupa angka");
                }
            }
        this.noHp = noHp;
    }

    public String getTipeMobil() {
        return tipeMobil;
    }

    public void setTipe(String tipeMobil) {
        this.tipeMobil = tipeMobil;
    }
    
    public PlatNomor getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(PlatNomor platNomor) {
        this.platNomor = platNomor;
    }
}
