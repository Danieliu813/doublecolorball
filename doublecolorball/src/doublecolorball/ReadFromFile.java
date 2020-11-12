package doublecolorball;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//从文件中读取号码
public class ReadFromFile {
	public void readfromfile() throws IOException {

		File file = new File("E:", "dcb.txt");
		CreateRightNumber crn = new CreateRightNumber();
		int[] right = crn.createrigthnumber();
		InputStreamReader isr = new InputStreamReader(new FileInputStream(file));
		BufferedReader br = new BufferedReader(isr);
		int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0;
		String line = "";
		String[] line2 = null;
		line = br.readLine();

		CheckNum cn = new CheckNum();

		while (line != null) {
			ArrayList<Integer> al = new ArrayList<Integer>();
			line2 = line.split(",");
			for (int i = 0; i < 7; i++) {
				al.add(Integer.parseInt(line2[i]));
			}
			int result = cn.checknum(al, right);
			//System.out.println(result);
			if (result > 0) {
				switch (result) {
				case 6:
					a = a + 1;
					break;
				case 5:
					b = b + 1;
					break;
				case 4:
					c = c + 1;
					break;
				case 3:
					d = d + 1;
					break;
				case 2:
					e = e + 1;
					break;
				case 1:
					f = f + 1;
					break;
				}

			}


			line = br.readLine();
		}
		System.out.println("您本次购买彩票共中的1等奖" + f + "注，2等奖" + e + "注，3等奖" + d + "注，4等级" + c + "注，5等奖" + b + "注，6等奖" + a + "注。");
		br.close();

	}
}
