package CH06.P03;
//개미 전사 

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0; i < n ; i++) {
			
			arr[i] = sc.nextInt();
		}
		int[] dp = new int[n];
		//dp[i] = dp[i] + dp[i-2]
		
		//(보텀업)
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + arr[i]);
        }

        System.out.println(dp[n - 1]);
	}

}
