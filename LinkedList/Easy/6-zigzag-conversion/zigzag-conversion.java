class Solution {
	public static String convert(String s, int numRows) {
		int i = 0;
		char arr[] = s.toCharArray();
		char arr1[][] = new char[1000][1000];
		int n = numRows - 2;
		int k = 0;
		while (i < s.length()) {
            int j = n;
			int t = 0;
				while (((numRows - 1) == 0) && (i < arr.length)) {
					arr1[t][k] = arr[i];
					i++;
					k++;
				}
                try{
				while (((k % (numRows - 1)) != 0) && (j != 0)&& (i < arr.length)) {
					arr1[j][k] = arr[i];
					i++;
					j--;
					k++;
				}
                }catch(Exception e)
                {
                    continue;
                }
				while ((t <= (numRows-1))&& (i < arr.length)) {
					arr1[t][k] = arr[i];
					i++;
					t++;
				}
				k++;
		}
		String str = "";
		for (int l = 0; l < numRows; l++) {
			for (int r = 0; r < (k + 1); r++) {
				if (arr1[l][r] != 0) {
					str = str + arr1[l][r];
				}
			}
		}
		return str;

	}
}