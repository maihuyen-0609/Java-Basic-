package Dieukien;

public class learnSwitchCase {
    public static void main(String[] args) {
        String browser = "Firefox";

//        // dùng if else
//        if(browser=="Chrome"){
//            //chạy vs chrome
//        } else if (browser=="Firefox") {
//            //chạy vs firefox
//        } else if (browser=="Edge") {
//            //chạy vs Edge
//        }else {
//            //chạy vs Opera
//        }
        // dùng Switch Case
        switch (browser){
            case "Chrome":
                //chạy chrome
                System.out.println("Chạy testcase đó vs Chrome");
                break; // thoát case k cần duyệt tiếp
            case "Firefox":
                //chạy firefox
                System.out.println("Chạy testcase đó vs Firefox");
                break;
            case "Edge":
                //chạy edge
                System.out.println("Chạy testcase đó vs Edge");
                break;
            default:
                //chạy mặc định opera
                System.out.println("Chạy testcase đó vs Opera");
        }
    }
}
