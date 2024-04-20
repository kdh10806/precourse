
public class NumberList {

	public static void main(String[] args) {
		///첫줄i = 1~9
		//두번째줄i = 2의 배수
		//세번째줄i = 홀수
		//네번째줄i = 111,222,333
		//다섯번째줄i = 123,123,123
		//여섯번째줄i = 9~1
		
		System.out.println();
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%2d %2d %2d %2d %2d %2d%n", i, i*2, i*2-1, ((i-1)/3)+1, ((i-1)%3)+1, 10-i);
		}
	}

}

//일단 단순 연산자 먼저 적용시키고 나온 패턴에서 숫자를 만진다.
// 123123123 -> i -> i/3 -> (i+2)/3
// 111222333 -> i -> i%3 -> (i%3)+1 -> (i+2)%3+1

//ex) 피보나치 수열 -> 커튼 열리는 효과, 정지 물체가 가속하는 경우. n^2의 변화가 너무 클때