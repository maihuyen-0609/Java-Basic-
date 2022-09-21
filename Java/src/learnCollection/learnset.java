package learnCollection;

import java.util.HashSet;
import java.util.Set;

public class learnset {
    public static void main(String[] args) {
        Set<String> driver = new HashSet<>();
        driver.add("123456");
        driver.add("123456");// không lưu dc vì trùng giá trị đầu
        driver.add("Mina");

        for (String set:driver){
            System.out.println(set);
        }
        // lấy hết gtri trong cột Client của bảng >> 187 gtri
        // dùng for để add 187 vào Set collection >> set tự động lọc trùng
        // in ra ds từ set để nhận dc giá trị k trùng nhau

    }
}
