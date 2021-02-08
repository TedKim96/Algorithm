package CH06.P01;
// 피보나치 수열  

import java.util.*;

public class Main {

	// 한 번 계산된 결과를 메모이제이션(Memoization)하기 위한 배열 초기화
    public static long[] d = new long[100];

    // 피보나치 함수(Fibonacci Function)를 재귀함수로 구현 (탑다운 다이나믹 프로그래밍)
    public static long fibo(int x) {
        // 종료 조건(1 혹은 2일 때 1을 반환)
        if (x == 1 || x == 2) {
            return 1;
        }
        // 이미 계산한 적 있는 문제라면 그대로 반환
        if (d[x] != 0) {
            return d[x];
        }
        // 아직 계산하지 않은 문제라면 점화식에 따라서 피보나치 결과 반환
        d[x] = fibo(x - 1) + fibo(x - 2);
        return d[x];
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(fibo(50));
		
		
		long[] d = new long[100];
		// 첫 번째 피보나치 수와 두 번째 피보나치 수는 1
        d[1] = 1;
        d[2] = 1;
        int n = 50; // 50번째 피보나치 수를 계산

        // 피보나치 함수(Fibonacci Function) 반복문으로 구현(보텀업 다이나믹 프로그래밍)
        for (int i = 3; i <= n; i++) {
            d[i] = d[i - 1] + d[i - 2];
        }
        System.out.println(d[n]);
	}

}
