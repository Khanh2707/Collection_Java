package Sort;

import java.util.Comparator;

public class SortByGPAThenByName implements Comparator<SinhVien> {
    public int compare(SinhVien o1, SinhVien o2) {
        if (o1.getGPA() != o2.getGPA()) {
            if (o1.getGPA() > o2.getGPA())  return -1;
            else    return 1;
        }
        else {
            return o1.getHoTen().compareTo(o2.getHoTen());
        }
    }
}
