package List.ArrayList;

import java.util.Comparator;

public class SortPoint implements Comparator<SinhVien>{

	@Override
	public int compare(SinhVien o1, SinhVien o2) {
		if (o1.getDiemTB() > o2.getDiemTB()) return 1;
		else return -1;
	}
	
}
