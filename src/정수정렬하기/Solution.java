package 정수정렬하기;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution {
	
	private static int[] ar;
	
	private static void quickSort(int start, int end) {
		
		if(start >= end) {
			return ;
		}
		
		int i = start-1, j = end+1;
		int p = ar[(i + j) / 2];
		
		while(true) {
			while(ar[++i] < p);
			while(ar[--j] > p);
			if(i >= j) break;
			int temp = ar[i];
			ar[i] = ar[j];
			ar[j] = temp;
		}
		
		quickSort(start, i-1);
		quickSort(j+1, end);
		
		
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int test = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= test; t++) {
			int len = Integer.parseInt(br.readLine());
			ar = new int[len];
			for(int i = 0; i < len; i++) {
				ar[i] = Integer.parseInt(br.readLine());
			}
			quickSort(0, len-1);
			int ans = 0;
			for(int i = 0; i < len; i++) {
				if(i % 2 == 0) {
					ans += ar[i];
				}
				else {
					ans -= ar[i];
				}
			}
			bw.write("Case #"+t+"\n");
			bw.write(ans+"\n");
		}
		bw.flush();
		
	}
}
