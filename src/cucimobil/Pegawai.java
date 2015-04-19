package cucimobil;

/**
 *
 * @author M Kaddafi S
 */
public class Pegawai {
    private String nama;
    private String idPegawai;
    private String alamat;
    private String noHp;

    public Pegawai(){
        
    }
          
    public void setNama(String nama) throws Exception {
        for (char c : nama.toCharArray()) {
                if(Character.isDigit(c)){
                    throw new Exception("Nama harus berupa huruf");
                }
            }
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setIdPegawai(String idPegawai) throws Exception {
        try{
            Integer.parseInt(idPegawai);
        } catch (Exception e){
            throw new Exception("Nomor ID harus berupa angka");
        }
        this.idPegawai = idPegawai;
    }

    public String getIdPegawai() {
        return idPegawai;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setNoHp(String noHp) throws Exception {
        for (char c : noHp.toCharArray()) {
                if(!Character.isDigit(c)){
                    throw new Exception("Nomor harus berupa angka");
                }
            }
        this.noHp = noHp;
    }
    
    public String getNoHp() {
        return noHp;
    }
}
