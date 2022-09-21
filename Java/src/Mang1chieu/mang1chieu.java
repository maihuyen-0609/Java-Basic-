package Mang1chieu;

public class mang1chieu {
    public static void main(String[] args) {
        //khai báo mảng 1 chiều
        String sinhvien[] = new String[5]; //mảng sinh viên kiểu String có thể lưu tối đa 5 phần tử
        //Nạp dữ liệu vào mảng sinh viên
        sinhvien[0]= "Mina";
        sinhvien[1]= "Lion";
        sinhvien[2]= "Cap";
        sinhvien[3]= "Nem";
        sinhvien[4]= "Mina5"; // Kết thúc tại độ dài mảng -1(sinhvien.lenght -1)

        //Duyệt mảng sinh viên để gọi value ra theo vị trí
        //name lưu lại mỗi giá trị sau mỗi lần duyệt
        for (String name : sinhvien){
            System.out.println(name);
        }
        //Khai báo mảng kiểu nặc danh
        int a[]={33,5,7,6,8};
        System.out.println(a.length);//in ra độ dài mảng
        System.out.println(a[2]);
        // in mảng a ra màn hình
        for (int i=0; i<a.length;i++) {
            System.out.println(a[i] + "");
        }
    }
}
