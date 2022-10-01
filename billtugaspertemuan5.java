Package javaappliccation3;
public class Bill {
    String nama, kopi;
    Integer harga, qty;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String setKopi(String kopi) {
        this.kopi = kopi;

    }

    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga){
        this.harga = harga;

    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Bill (String nama, String kopi, Integer harga, Integer qty, Integer bayar, Integer kembali) {
        this.nama = nama;
        this.kopi = kopi;
        this.harga = harga;
        this.qty = qty;
    }
}