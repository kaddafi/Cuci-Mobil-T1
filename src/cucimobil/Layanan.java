package cucimobil;

/**
 *
 * @author M Kaddafi S
 */
public class Layanan {
    private String jenisCuci;
    private String tambahan;

    public String getJenisCuci() {
        return jenisCuci;
    }
    public void setJenisCuci(String jenisCuci) throws Exception {
        if (jenisCuci.equalsIgnoreCase("Cuci Biasa") || jenisCuci.equalsIgnoreCase("Cuci Salju"))
            this.jenisCuci = jenisCuci;
        else {
            throw new Exception ("Layanan cuci tidak tersedia");
        }
    }

    public String getTambahan() {
        return tambahan;
    }
    
    public void setTambahan(String tambahan) throws Exception {
        if (tambahan.equalsIgnoreCase("Doorsmeer") || tambahan.equalsIgnoreCase("Ganti Oli"))
            this.tambahan = tambahan;
        else {
            throw new Exception ("Layanan tambahan tidak tersedia");
        }
    }
    
    
}
