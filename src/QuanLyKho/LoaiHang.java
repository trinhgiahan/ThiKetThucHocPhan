package QuanLyKho;
import java.io.Serializable;
import java.util.Date;
import java.util.Vector;
public class LoaiHang implements Serializable{
	private String maLoai;
	private String tenLoai;
	private Vector<HangHoa>hangHoas; 
	public boolean themHang(HangHoa hang) {
		if(hangHoas.contains(hang)) 
			return false;
		this.hangHoas.add(hang);
		hang.setLoai(this);
		return true;
	}
	public boolean xoaHang(String maHang) {
		HangHoa hH=new HangHoa(maHang);
		if(hangHoas.contains(hH)) {
			hangHoas.remove(hH);
			return true;
		}
		return false;
	}
	public HangHoa timKiem(String Mahang) {
		HangHoa hangHoa=new HangHoa(Mahang);
		if(hangHoas.contains(hangHoa))
			return hangHoas.get(hangHoas.indexOf(hangHoa));
		return null;
	}
	public boolean capNhap(String ma, String ten, double giaNhap, Date ngayNhap, int sLTonKho) {
		HangHoa hangHoa=new HangHoa(ma);
		if(hangHoas.contains(hangHoa)) {
			hangHoa=hangHoas.get(hangHoas.indexOf(hangHoa));
			hangHoa.setTen(ten);
			hangHoa.setGiaNhap(giaNhap);
			hangHoa.setNgayNhap(ngayNhap);
			hangHoa.setsLTonKho(sLTonKho);
			return true;
		}
		return false;
	}
	public int tongSoLuong() {
		int Tong=0;
		for(HangHoa hangHoa:hangHoas) {
			Tong+=hangHoa.getsLTonKho();
		}
		return Tong;
	}
	public double tongGiaTri() {
		double tongGiaTri=0;
		for(HangHoa hangHoa:hangHoas) {
			tongGiaTri+=hangHoa.getGiaNhap()*hangHoa.getsLTonKho();
		}
		return tongGiaTri;
	}
	public LoaiHang() {
        super();
        this.hangHoas=new Vector<HangHoa>();

    }
	 public Vector<HangHoa> getHangHoa() {
	        return hangHoas;
	    }

	public String getMaLoai() {
		return maLoai;
	}

	public void setMaLoai(String maLoai) {
		this.maLoai = maLoai;
	}

	public String getTenLoai() {
		return tenLoai;
	}

	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.tenLoai;
	}
	
}
