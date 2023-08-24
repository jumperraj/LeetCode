import java.util.Scanner;

class Solution {
	int value(char i) {
		switch (i) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		}
		return 0;
	}

	public int romanToInt(String string) {
		int sum = 0;
		int i = 0;
		char[] a = new char[string.length()];
		for (int j = 0; j < string.length(); j++) {
			a[j] = string.charAt(j);
		}
		while (i < ((a.length) - 1)) {

			if (value(a[i]) > value(a[i + 1])) {
				System.out.println("s001");
				System.out.println(i);
				sum += value(a[i]);
				i++;
				System.out.println(i);

			} else if (value(a[i]) == value(a[i + 1])) {
				System.out.println("s002");
				System.out.println(i);
				sum += value(a[i]);
				i++;
				System.out.println(i);

			} else if (value(a[i]) < value(a[i + 1])) {
				System.out.println("s003");
				sum += (value(a[i + 1]) - value(a[i]));
				System.out.println("s004");
				i += 2;
				System.out.println(i);
			}

		}
		System.out.println("s006");
		if (i == (a.length - 1)) {
			sum += value(a[i]);
		}

		return sum;

	}

	public static void main(String[] args) {
		System.out.println("enter the roman integer");
		Scanner s = new Scanner(System.in);
		String a = s.next();
		Solution sol = new Solution();
		int sum = sol.romanToInt(a);
		System.out.println("the value is :" + sum);
	}

}