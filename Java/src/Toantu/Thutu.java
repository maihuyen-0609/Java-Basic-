package Toantu;

public class Thutu {
    public static void main(String[] args) {
        int a = 10;
        int b = 11;
        int c = 15;
        // Nó sẽ ưu tiên phép CỘNG TRƯỚC
        System.out.println(a+b-c);
        // Nó sẽ ưu tiên phép  VÀ && TRƯỚC
        System.out.println("kết hợp điều kiện" + ((a<c)&&(a==b)||(b<c)));

    }
}
