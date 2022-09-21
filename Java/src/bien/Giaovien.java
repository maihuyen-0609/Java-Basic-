package bien;

public class Giaovien {
    static int a =0;
    static int b=0;
    static int c=1;
    public void info1(){ //lấy giá trị đã nhập
        a=5;
        b=10;
        c=a+b;
        System.out.println(c);
    }
    public void info2(){
        c=b-a;
        System.out.println(c);
    }

    public static void main(String[] args) {
        Giaovien obj = new Giaovien();
        obj.info1();
        System.out.println(Giaovien.c);
    }

}
