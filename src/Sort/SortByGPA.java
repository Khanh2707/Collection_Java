package Sort;

import java.util.Comparator;

public class SortByGPA implements Comparator<SinhVien> {
    @Override
    public int compare(SinhVien o1, SinhVien o2) {
        if (o1.getGPA() > o2.getGPA())  return -1;
        else return 1;
    }
}
