package doublecolorball;

import java.util.ArrayList;
import java.util.Iterator;

//¶Ò½±
public class CheckNum {

	public int checknum(ArrayList<Integer> buy, int[] y) {
		int result = 0;
		int red_result = 0;
		int blue_result = 0;
		Iterator<Integer> it1 = buy.iterator();

		int[] x = new int[7];

		for (int i = 0; it1.hasNext(); i++) {
			x[i] = it1.next().intValue();

		}

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (x[i] == y[j]) {
					red_result = red_result + 1;
				}
			}

		}
		if (x[6] == y[6]) {
			blue_result = 1;
		}
		//System.out.println("ºìÇò" + red_result + "ÀºÇò" + blue_result);
		// Ë«É«ÇòÖÐ½±¹æÔò
		if (red_result == 6 && blue_result == 1) {
			result = 1;
		}
		if (red_result == 6 && blue_result == 0) {
			result = 2;
		}
		if (red_result == 5 && blue_result == 1) {
			result = 3;
		}
		if ((red_result == 4 && blue_result == 1) || (red_result == 5)) {
			result = 4;
		}
		if ((red_result == 3 && blue_result == 1) || (red_result == 4)) {
			result = 5;
		}
		if (blue_result == 1 && red_result <= 2) {
			result = 6;
		}
		return result;
	}
}
