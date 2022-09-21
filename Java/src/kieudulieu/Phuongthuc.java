package kieudulieu;

public class Phuongthuc {
    String name = "Mina";
    //khai báo phuong thuc
    // phạm vi truy cập: chung/khác class, chung/khác package
    // kiểu dữ liệu void: KO TRẢ VỀ KẾT QUẢ TÍNH TOÁN CHO HÀM ĐÓ
    //int, string, double, array, list : CÓ TRẢ VỀ KẾT QUẢ


    public void getInfo() {
        System.out.println(name);
    }
    public int numberA(){
        int a = 10;
        return a;
    }
    public int numberB(){
        int b = 10;
        int c = b + numberA();
        return numberA();
    }
    public int cong2so (int a, int b){
        return a + b;
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    public static void main(String[] args) {
        Phuongthuc obj = new Phuongthuc();
        System.out.println(obj.numberA());
        System.out.println(obj.numberB());
        System.out.println(obj.name);
        System.out.println(obj.cong2so(1, 2 ));

    }

//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }
}
