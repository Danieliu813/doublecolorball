package doublecolorball;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class WriteToFile {

	public void writetofile(ArrayList<Integer> al) {
	
		File file = new File("E:","dcb.txt");
		try {
			if (!file.exists()) {
				file.createNewFile();
			}
			OutputStreamWriter opsw = new OutputStreamWriter(new FileOutputStream(file, true), "UTF-8");
			BufferedWriter bwriter = new BufferedWriter(opsw);

			Iterator<Integer> it = al.iterator();

			while (it.hasNext()) {
				bwriter.write(it.next().toString() + ",");

			}
			bwriter.write("\n");
			bwriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
