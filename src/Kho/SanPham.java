package Kho;
import java.util.Scanner;
public class SanPham {

    private int productCode;
    private String productName;
    private String productPrice;
    private String productRemaining;
    private String daTe;
 
    //khởi tạo constructor mặc định
    public void SanPham() {
 
    }
    //khởi tạo constructor có tham số
    public SanPham(int productCode, String productName, String productPrice, String productRemaining,String daTe) {
        this.productCode= productCode;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productRemaining= productRemaining;
        this.daTe=daTe;
    }
    //--------------begin getter and setter--------------------
    public int getproductCode() {
        return productCode;
    }
 
    public void setproductCode(int productCode) {
        this.productCode = productCode;
    }
 
    public String getproductName() {
        return productName;
    }
 
    public void setproductName(String productName) {
        this.productName = productName;
    }
 
    public String getproductPrice() {
        return productPrice;
    }
 
    public void setproductPrice(String productPrice) {
        this.productPrice = productPrice;
    }
 
    public String getproductRemaining() {
        return productRemaining;
    }
 
    public void setproductRemaining(String productRemaining) {
        this.productRemaining = productRemaining;
    }
    public String getDaTe() {
        return daTe;
    }
    public void setDaTe(String daTe) {
        this.daTe = daTe;
    }
   
    @Override
    public String toString() {
        return "SinhVienNhap{" +
                "productCode=" + productCode +
                ", productName='" + productName + "" +
                ", productPrice='" + productPrice + ""+
                ", productRemaining='" + productRemaining + "" +
                ", daTe='"+ daTe+ " "+
                '}';
    }

    public void hienThiTT() {
        System.out.printf("%-5d %-20s %-20s %-20s %-20s \n",productCode, productName, productPrice, productRemaining,daTe);
    }
}
    

