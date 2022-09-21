package learnCollection;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;

public class learnArraylist {
    public static void main(String[] args) {
        //khai báo 1 array list ( mảng dạng danh sách) - thuộc List interface ( Collection)
        //ko giới hạn số phần tử
        // có thể sắp xếp theo thứ tự
//        ArrayList list = new ArrayList(); // khai báo dạng cũ

        List<String> list=  new ArrayList<>(); // Khai báo dạng mới
        list.add("Mina");
        list.add("Lion");
        list.addAll(list);

        ArrayList<String> listNEW = new ArrayList<>();
        listNEW.add("Lim");
        listNEW.add("Nem");
        listNEW.addAll(listNEW);
        listNEW.remove(1);

        for (String name:list){
    System.out.println(name);
}
        for (String name:listNEW){
            System.out.println(name);
        }
int mangSOCHAN[] = new int[50];
        List<Integer> listSOCHAN = new ArrayList<>(); // Khai báo mảng dạng int
        int count = 0;
        for(int i = 0; i <=50; i++){
            if (i%2==0){
                //mangSOCHAN[count] = i;
                listSOCHAN.add(i);
                count++;
            }
        }
//        for (int number:mangSOCHAN){
//            System.out.println(number);
//        }
        for (int number : listSOCHAN){
            System.out.println(number);
        }
        System.out.println(listSOCHAN.get(6));
//        for (int i = 0; i<listSOCHAN.size(); i ++){
//            System.out.println(listSOCHAN.get(i));
//        }
    }

}
