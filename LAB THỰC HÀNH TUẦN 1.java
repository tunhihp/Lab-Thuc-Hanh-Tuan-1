public class SinhVienNhap
{
    private int maSV;
    private String hoTen;
    private String diaChi;
    private String sTD;

    public SinhVienNhap(int maSV, String hoTen, String diaChi, String sTD)
    {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.sTD = sTD;
    }

    public int getMaSV()
    {
        return maSV;
    }
    
    public void setMaSV(int maSV)
    {
        this.maSV = maSV;
    }

    public String getHoTen()
    {
        return hoTen;
    }
    public void setHoTen(String hoTen)
    {
        this.hoTen = hoTen;
    }

    public String getDiaChi()
    {
        return diaChi;
    }
    public void setDiaChi(String diaChi)
    {
        this.diaChi = diaChi;
    }

    public String getsTD()
    {
        return sTD;
    }
    public void setsTD(String sTD)
    {
        this.sTD = sTD;
    }

    @Override
    public String toString() 
    {
        return "maSV" + this.maSV + ", hoTen" + this.hoTen + ", diaChi" + this.diaChi + ", sTD" + this.sTD;
    }

    @Override
    public int combareto(SinhVienNhap sv)
    {
        return this.maSV - sv.maSV;
    }
}

public class main
{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Nhap so luong sinh vien: ");
    int n = scanner.nextInt();
    SinhVienNhap[] danhSachSV = new SinhVienNhap[n];

    for(int i=0; i<n; i++)
    {
        System.out.println("1. Nhap thong tin sinh vien"+ (i+1) + ":");
        SinhVienNhap sv = new SinhVienNhap();

        System.out.print("Nhap ma so sinh vien: ");
        sv.setMaSV(scanner.new());
        scanner.nextInt();

        System.out.print("Nhap ho va ten sinh vien: ");
        sv.setHoTen(scanner.nextInt());

        System.out.print("Nhap dia chi sinh vien: ");
        sv.setDiaChi(scanner.nextInt());

        System.out.print("Nhap so dien thoai bao gom 7 so: ");
        sv.setsTD(scanner.nextInt());

        danhSachSV[i] = sv;
    }
    
    }

}
