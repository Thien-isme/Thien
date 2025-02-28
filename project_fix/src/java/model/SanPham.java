package model;

public class SanPham {

    private String masanpham;
    private String tensanpham;
    private String hinhanhsanpham;
    private String mausac;
    private String kichco;
    private Integer soluong;
    private String kieumau;
    private Double gianhap;
    private Double giaban;
    private Integer giamgia;
    private String mota;

    // Constructor không tham số
    public SanPham() {
    }

    // Constructor đầy đủ tham số
    public SanPham(String masanpham, String tensanpham, String hinhanhsanpham,
            String mausac, String kichco, Integer soluong, String kieumau,
            Double gianhap, Double giaban, Integer giamgia, String mota) {
        this.masanpham = masanpham;
        this.tensanpham = tensanpham;
        this.hinhanhsanpham = hinhanhsanpham;
        this.mausac = mausac;
        this.kichco = kichco;
        this.soluong = soluong;
        this.kieumau = kieumau;
        this.gianhap = gianhap;
        this.giaban = giaban;
        this.giamgia = giamgia;
        this.mota = mota;
    }

    // Getter & Setter
    public String getMasanpham() {
        return masanpham;
    }

    public void setMasanpham(String masanpham) {
        this.masanpham = masanpham;
    }

    public String getTensanpham() {
        return tensanpham;
    }

    public void setTensanpham(String tensanpham) {
        this.tensanpham = tensanpham;
    }

    public String getHinhanhsanpham() {
        return hinhanhsanpham;
    }

    public void setHinhanhsanpham(String hinhanhsanpham) {
        this.hinhanhsanpham = hinhanhsanpham;
    }

    public String getMausac() {
        return mausac;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }

    public String getKichco() {
        return kichco;
    }

    public void setKichco(String kichco) {
        this.kichco = kichco;
    }

    public Integer getSoluong() {
        return soluong;
    }

    public void setSoluong(Integer soluong) {
        this.soluong = soluong;
    }

    public String getKieumau() {
        return kieumau;
    }

    public void setKieumau(String kieumau) {
        this.kieumau = kieumau;
    }

    public Double getGianhap() {
        return gianhap;
    }

    public void setGianhap(Double gianhap) {
        this.gianhap = gianhap;
    }

    public Double getGiaban() {
        return giaban;
    }

    public void setGiaban(Double giaban) {
        this.giaban = giaban;
    }

    public Integer getGiamgia() {
        return giamgia;
    }

    public void setGiamgia(Integer giamgia) {
        this.giamgia = giamgia;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
}
