package Sort;

import java.util.*;

public class DrivenClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<SinhVien> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            Double gpa = Double.parseDouble(sc.nextLine());
            list.add(new SinhVien(id,ten,lop,gpa));
        }
        // Anonymous inner class
//        Collections.sort(list, new Comparator<SinhVien>() {
//            @Override
//            public int compare(SinhVien o1, SinhVien o2) {
//                return -o1.getHoTen().compareTo(o2.getHoTen());
//            }
//        });

//4
//123
//Huong
//CNTT1
//3.5
//124
//Nam
//CNTT2
//2.5
//125
//Quang
//CNTT2
//2.8
//126
//Lam
//CNTT1
//3.1

        //Lambda (java 8 trở lên)
        //Collections.sort(list,(SinhVien o1,SinhVien o2)->o1.getHoTen().compareTo(o2.getHoTen()));

        //Tạo ra 1 class rồi implements giống anonymous
        //Collections.sort(list, new SortByName());
        //Collections.sort(list, new SortByGPA());

        //sort 2 tiêu chí trở lên
        Collections.sort(list, new SortByGPAThenByName());
        for (SinhVien x : list) {
            System.out.println(x);
        }
    }
}
