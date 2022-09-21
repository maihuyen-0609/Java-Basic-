package Dieukien;

public class dieukien {
    public static void main(String[] args) {
        int a = 10;
        int b= 5;
        int c = 3;
        if (a>b){
            a += 2;
            System.out.println(a);
        }
        String headerPage = "Dashboard"; // ví dụ thôi, auto test sẽ lấy bằng selenium
        //Login trc = email/pass bấm signin
        if (headerPage=="Dashboard"){
            System.out.println("Clicked on Client");
        }
        // Có nghĩa login success
        else{
            System.out.println("Login Fail");
        }
        if(a>b){
            //làm công việc 1
            System.out.println("a lớn hơn b");
            }
        else if (a>c){
            //công việc 2
            System.out.println(b);
                }
        else if (b>c) {
            //công việc 3
            System.out.println(c);
                }
            else{
                //làm gì đó ngoài 3 cv trên
            System.out.println("nothing");
                }
            String s = (a>b)?"a lớn hơn b":"a nhỏ hơn b"; // câu lệnh viết ngắn gọn của if else ( chỉ sử dụng khi chỉ có 2 kết quả )
            }
    }

