package Sort;

public class SinhVien {
    private String maSV;
    private String hoTen;
    private String lop;
    private double GPA;

    public SinhVien(String maSV, String hoTen, String lop, double GPA) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.GPA = GPA;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getLop() {
        return lop;
    }

    public double getGPA() {
        return GPA;
    }

    public String toString() {
        return this.maSV+ " " +this.hoTen+ " " +this.lop+ " " +String.format("%.02f",this.GPA);
    }
}
