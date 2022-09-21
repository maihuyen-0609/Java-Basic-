package learnCollection;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class learnlist {
    public static void main(String[] args) {
        //Khai báo list thuộc 3 kiểu con của nó
        List <Integer> list1 = new ArrayList<>();
        list1.add(10);
        String.valueOf(list1.add(10)); // chuyển kiểu dữ liệu từ int sang String

        List<String> linkedList = new LinkedList<String>();
        linkedList.add("100");
        Integer.parseInt(String.valueOf(linkedList.get(0))); // chuyển kiểu dữ liệu từ String sang int

        List list = new Vector(); // kiểu dữ liệu Object
        list.add(12);
        list.add(12);
        list.add("Automation");

        for(Object vt: list){
            System.out.println(vt);
        }
        //Khi dùng list thì nên chọn 1 kiểu dữ liệu cố định : int, string,...
        //Trong Java có hàm chuyển kiểu dữ liệu : int >> String, String >> int
        for(String str : linkedList){
            System.out.println(Integer.parseInt(String.valueOf(linkedList.get(0)))); // duyệt linkedlist từ dạng chữ số sang dạng số
        }

    }
}
