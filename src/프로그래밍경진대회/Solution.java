package 프로그래밍경진대회;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int test = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= test; t++) {
			int num = Integer.parseInt(br.readLine());
			int[] ar = new int[num];
			int max = -1;
			for(int i = 0; i < num ; i++) {
				ar[i] = Integer.parseInt(br.readLine());
				if(max < ar[i]) {
					max = ar[i];
				}
			}
			int ans = 0;
			for(int i = 0; i < num ; i++) {
				if(max + 1 <= ar[i] + num) {
					ans++;
				}
			}
			bw.write("Case #"+t+"\n");
			bw.write(ans+"\n");
		}
		bw.flush();
	}
}
