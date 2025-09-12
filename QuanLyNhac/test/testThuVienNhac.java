import java.util.ArrayList;
import java.util.Scanner;

public class testThuVienNhac {
    private ArrayList<thuVienNhac> danhSachThuVien = new ArrayList<thuVienNhac>();

    public ArrayList<thuVienNhac> addList(){
        thuVienNhac thuVien_1 = new thuVienNhac("TranSon");
        thuVienNhac thuVien_2 = new thuVienNhac("Sora");
        thuVienNhac thuVien_3 = new thuVienNhac("Bibo");

        danhSachThuVien.add(thuVien_1);
        danhSachThuVien.add(thuVien_2);
        danhSachThuVien.add(thuVien_3);

        return danhSachThuVien;
    }

    public void thuVien(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<thuVienNhac> ds = this.addList();

        thuVienNhac nguoiDung = ds.get(0);
        nguoiDung.themBaiHat("Noi nay co anh");
        nguoiDung.themBaiHat("Chung ta khong thuoc ve nhau");
        nguoiDung.themBaiHat("Dung lam trai tim anh dau");
        nguoiDung.themBaiHat("Buong doi tay nhau ra");
        System.out.println("Danh sach bai hat cua " + nguoiDung.layTenNguoiDung() + " (So luong: " + nguoiDung.layDanhSachBaiHat().size() + " bai hat)");
        System.out.println(nguoiDung.layDanhSachBaiHat());
        
        System.out.print("Nhap bai hat can them: ");
        String themBaiHat = scanner.nextLine();
        nguoiDung.themBaiHat(themBaiHat);
        System.out.print("Da them: " + themBaiHat + "\n");

        System.out.print("Nhap bai hat can xoa: ");
        String xoaBaiHat = scanner.nextLine();
        nguoiDung.xoaBaiHat(xoaBaiHat);
        System.out.print("Da xoa: " + xoaBaiHat + "\n");
        System.out.println("Danh sach bai hat moi (So luong: " + nguoiDung.layDanhSachBaiHat().size() + " bai hat)\n" + nguoiDung.layDanhSachBaiHat());

        scanner.close();



















        /*
        thuVienNhac nguoiDung_2 = ds.get(1);
        nguoiDung_2.themBaiHat("Lan cuoi");
        nguoiDung_2.themBaiHat("Thay chua");
        nguoiDung_2.themBaiHat("Xanh");
        nguoiDung_2.themBaiHat("May khi");
        System.out.println("Danh sach bai hat cua " + nguoiDung_2.layTenNguoiDung() + ":");
        System.out.println(nguoiDung_2.layDanhSachBaiHat());

        thuVienNhac nguoiDung_3 = ds.get(2);
        nguoiDung_3.themBaiHat("Cham hoa");
        nguoiDung_3.themBaiHat("Waiting for you");
        nguoiDung_3.themBaiHat("Em xinh");
        nguoiDung_3.themBaiHat("Em la");
        System.out.println("Danh sach bai hat cua " + nguoiDung_3.layTenNguoiDung() + ":");
        System.out.println(nguoiDung_3.layDanhSachBaiHat());
        */
    }
}


