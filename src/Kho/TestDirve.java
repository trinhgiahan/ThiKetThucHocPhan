package Kho;

import java.util.Arrays;
import java.util.Scanner;
 
public class TestDirve {
    static Scanner sc = new Scanner(System.in);
    static void nhapThongTinh(SanPham tt) {
        System.out.println("Import Product Code: ");
        tt.setproductCode(sc.nextInt());
        ;
        sc.nextLine();
        System.out.println("Enter Product Name : ");
        tt.setproductName(sc.nextLine());
        System.out.println("Enter the price of product : ");
        tt.setproductPrice(sc.nextLine());
        System.out.println("Enter the number of products remaining: ");
        tt.setproductRemaining(sc.nextLine());
        System.out.println("Enter the product date : ");
        tt.setDaTe(sc.nextLine());
    }
 
    public static void main(String[] args) {
        
        SanPham sp[] = null;
        int a, n = 0;
        boolean flag = true;
        do {
            System.out.println(" MENU ");
            System.out.println("1.Enter Product Information.");
            System.out.println("2.Export Product Information.");
            System.out.println("Choose Another Number To Exit.");
            a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Enter the number of products: ");
                    n = sc.nextInt();
                    sp = new SanPham[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("product number " + (i + 1)+": ");
                        sp[i] = new SanPham(i, null, null, null, null);
                        nhapThongTinh(sp[i]);
 
                    }
 
                    break;
                case 2:
                SanPham temp = sp[0];
                    for (int i = 0; i < sp.length - 1; i++) {
                        for (int j = i + 1; j < sp.length; j++) {
                            if (sp[i].getproductCode() > sp[j].getproductCode()) {
                                temp = sp[j];
                                sp[j] = sp[i];
                                sp[i] = temp;
                            }
                        }
                    }
                    System.out.printf("%-5s %14s %12s %20s %16s \n","Code","Product's name","Price","Product Remaining","Date");
                    for (int i = 0; i < n; i++) {
                        sp[i].hienThiTT();
                    }
                    break;
                default:
                    System.out.println("Goodbye");
                    flag = false;
                    break;
            }
        } while (flag);
    }
}
