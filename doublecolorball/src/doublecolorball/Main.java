package doublecolorball;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		DoubleColorBallCreate dcbc = new DoubleColorBallCreate();
		WriteToFile wtf = new WriteToFile();
		ReadFromFile rff = new ReadFromFile();


		System.out.println("请输入要模拟随机生成的彩票注数");
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.next().toString());
		//sc2.close();
		System.out.println("随机生成的彩票号码见dcb.txt");

		// 生成彩票并兑奖
		for (int i = 0; i < x; i++) {
			ArrayList<Integer> al = dcbc.DoubleColorBallCreatex();
			// 写入文件
			wtf.writetofile(al);

		}
		// 输入中奖号码并兑奖
		rff.readfromfile();
	}
}
