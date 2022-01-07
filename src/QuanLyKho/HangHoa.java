package QuanLyKho;
import java.io.Serializable;
import java.util.Date;
public class HangHoa implements Serializable{
	private String ma;
	private String ten;
	private double giaNhap;
	private Date ngayNhap;
	private int sLTonKho;
	private LoaiHang loai;
	public HangHoa(String ma, String ten, double giaNhap, Date ngayNhap, int sLTonKho) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.giaNhap = giaNhap;
		this.ngayNhap = ngayNhap;
		this.sLTonKho = sLTonKho;
	}
	public HangHoa(String ma) {
		super();
		this.ma = ma;
	}
	public String getMa() {
		return ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public double getGiaNhap() {
		return giaNhap;
	}
	public void setGiaNhap(double giaNhap) {
		this.giaNhap = giaNhap;
	}
	public Date getNgayNhap() {
		return ngayNhap;
	}
	public void setNgayNhap(Date ngayNhap) {
		this.ngayNhap = ngayNhap;
	}
	public int getsLTonKho() {
		return sLTonKho;
	}
	public void setsLTonKho(int sLTonKho) {
		this.sLTonKho = sLTonKho;
	}
	public LoaiHang getLoai() {
		return loai;
	}
	public void setLoai(LoaiHang loai) {
		this.loai = loai;
	}
	public boolean equals(Object obj) {
		return this.ma.equalsIgnoreCase(((HangHoa)obj).ma);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.ten;
	}

}
