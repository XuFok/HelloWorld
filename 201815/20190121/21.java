package _1_17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _21 {
	static List<date> list = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr = new Scanner(System.in);

		int n = sr.nextInt();
		int p = sr.nextInt();

		for (int i = 0; i < n; i++) {
			list.add(new date(sr.nextInt(), sr.nextInt()));
		}
		sort(0, n - 1);

		int sum = 0;
		float ans = 0;
		for (int i = 0; i < n; i++) {
			if (sum + list.get(i).m <= p) {
				sum += list.get(i).m;
				ans += list.get(i).v;
				//System.out.println("+"+list.get(i).v+"   ans="+ ans);
			} else {
				ans += (p - sum) * list.get(i).dj;
				//System.out.println("+"+(p - sum) * list.get(i).dj+"   ans="+ ans);
				break;
			}
		}
		System.out.println(ans);
//		for (date c : list)
//			System.out.println(c.dj + "  " + c.m + "  " + c.v);
	}

	static void sort(int low, int hight) {
		if (low > hight)
			return;
		int i = low;
		int j = hight;
		date index = list.get(i);
		while (i < j) {
			while (i < j && list.get(j).dj <= index.dj)
				j--;
			if (i < j)
				list.set(i++, list.get(j));
			while (i < j && list.get(i).dj > index.dj)
				i++;
			if (i < j)
				list.set(j--, list.get(i));
		}
		list.set(i, index);
		sort(low, i - 1);
		sort(i + 1, hight);
	}

}

class date {
	int m;
	int v;
	float dj;

	date(int m, int v) {
		this.m = m;
		this.v = v;
		this.dj = v / (float) m;

	}
}
