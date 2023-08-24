class Solution {
	static int value(char val) {
		if (((val >= '0') && (val <= '9'))) {
			return (val - '0');
		}
		switch (val) {
		case ' ':
			return -2;
		case '+':
			return -2;
		case '-':
			return -2;
		default:
			return -1;
		}
	}

	static int myAtoi(String s) {
		int i = s.length() - 1;
		char arr[] = s.toCharArray();
		int sum = 0;
		int j = 0, t = 0, flag = 0, flag2 = 0, flag3 = 0;
		int k = 0;
		if (arr.length == 0) {
			return 0;
		}
		if (value(arr[0]) == -1) {
			return 0;
		}
		while ((k < arr.length) && (value(arr[k]) != -1)) {
			if ((value(arr[k]) == -2) && (j != 0)) {
				break;
			}

			if (((arr[k] == '+') || (arr[k] == '-') || (arr[k] == ' ')) & (flag == 1)) {
				sum = 0;
				return 0;
			}

			if ((arr[k] == '+') || (arr[k] == '-')) {
				flag = 1;
			}

			if ((value(arr[k]) != -2)) {
				j++;
			}

			k++;

		}
		k--;
		if ((k - j) >= 0) {
			if (arr[k - j] == '-') {
				while ((t <= j) && (value(arr[k]) != -2)) {

					sum -= value(arr[k]) * Math.pow(10, t);
					t++;
					if (sum == 0) {
						flag2 = 1;
					}
					if (k == 0) {
						return sum;
					}
					k--;

				}
				return sum;

			}
		}
		while ((t <= j) && (value(arr[k]) != -2)) {

			sum += value(arr[k]) * Math.pow(10, t);
			t++;
			if (k == 0) {
				return sum;
			}
			k--;
		}

		return sum;
	}
}
