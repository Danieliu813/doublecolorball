package doublecolorball;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		DoubleColorBallCreate dcbc = new DoubleColorBallCreate();
		WriteToFile wtf = new WriteToFile();
		ReadFromFile rff = new ReadFromFile();


		System.out.println("������Ҫģ��������ɵĲ�Ʊע��");
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.next().toString());
		//sc2.close();
		System.out.println("������ɵĲ�Ʊ�����dcb.txt");

		// ���ɲ�Ʊ���ҽ�
		for (int i = 0; i < x; i++) {
			ArrayList<Integer> al = dcbc.DoubleColorBallCreatex();
			// д���ļ�
			wtf.writetofile(al);

		}
		// �����н����벢�ҽ�
		rff.readfromfile();
	}
}
