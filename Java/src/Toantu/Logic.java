package Toantu;

public class Logic {
    public static void main(String[] args) {
        int a =10;
        int b = 5;
        int c = 7;
        //true khi tất cả đều true và ngc lại
        System.out.println("So sánh 2 điều kiện VÀ && " + ((a<c)&&(a>b)));
        //true khi hoặc 1 trong 2 đúng
        System.out.println("So sánh 2 điều kiện VÀ && " + ((a>c)||(a<b)));
    }
}
