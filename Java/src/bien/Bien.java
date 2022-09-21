package bien;

import bien.ThongTin;

public class Bien {
    String address = "Viet Nam"; // biến toàn cục
    static String ten = "Mina";// biến static
    static int tuoi = 24;//biến static
//public void sayHello(){
//    int n = 10; //bien cục bộ
//    System.out.println("Gia tri cua n la:" + n );
//
//}
    public static void main(String[] args) {
        for(int i=1; i<10; i++){
            System.out.println(i);
        }

       // String name = "Mina";
//        int age = 25;
//        double weight = 30;
//        System.out.println(name);
//        System.out.println(age);
//        System.out.println(weight);
//        //Bien toàn cục phải gọi lại hàm
//        Bien obj = new Bien(); // Khởi tạo đối tượng class
//        obj.sayHello();
//        System.out.println(obj.address);
//        //Static
//        System.out.println("Tuổi" + tuoi); // Khỏi thông qua đối tượng class
//        System.out.println("Tên"+ Bien.ten);
//        System.out.println(ThongTin.name);}
    }}