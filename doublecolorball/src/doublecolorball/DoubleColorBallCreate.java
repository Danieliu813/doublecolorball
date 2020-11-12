package doublecolorball;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;
//Éú³ÉË«É«ÇòºÅÂë
public class DoubleColorBallCreate {

	public ArrayList<Integer> DoubleColorBallCreatex() {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		Random r = new Random();
		for (; ts.size() < 6;) {

			int red = r.nextInt(34);
			if (red > 0) {
				ts.add(red);

			}

		}
		Iterator<Integer> it = ts.iterator();

		while (it.hasNext()) {
			int a = it.next();
			al.add(a);

		}

		while (true) {
			int i = r.nextInt(17);
			if (i > 0) {
				al.add(i);
				break;
			}

		}
		return al;
	}

}
