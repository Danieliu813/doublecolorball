package doublecolorball;

import java.io.IOException;
import java.util.Scanner;

//输入开奖号码
public class CreateRightNumber {
	public int[] createrigthnumber() throws IOException {
		System.out.println("请输入本期开奖7个号码并用逗号隔开：");
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toString();
		String[] arr = str.split(",");
		int[] y = new int[7];
		for (int m = 0; m < 7; m++) {
			y[m] = Integer.parseInt(arr[m]);
		}
		sc.close();
		return y;
	}
}
