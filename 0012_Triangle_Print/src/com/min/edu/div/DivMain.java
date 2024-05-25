package com.min.edu.div;

/**
 * TODO 친화수 구하기
 * 친화수란? A라는 값의 진약수를 구하고 그 값의 합을 완전수라고 한다.
 * 여기서 구한 완전수를 B라고 칭했을 떄 B의 완전수를 구하고 그것을 C라고한다
 * A와 C가 같을 떄 친화수라고 한다.
 * 
 * @author juoju
 *
 */
public class DivMain {

	public static void main(String[] args) {
		int[] num = new int [3];
		num[0] = 220; // 초기값 설정
		boolean TF = false;
		
		Div div = new Div(); // div를 Div Class의 reference로 선언한다.
		Div_Chk chk = new Div_Chk(); //chk를 Div_chk Class의 reference로 선언한다
		
		for(int count = 0; count <2; count++) {
			num[(count+1)] = div.cnt(num[count]);
		// num[count]의 값의 진약수를 구하고 구한 값의 완전수를 num[count+1]에 넣어준다.
		}
		TF = chk.Num_chk(num[0], num[2],TF);//A와C의 값을 비교하는 메소드로 보낸다 // True of False를 받는다.
		System.out.println(TF);
	}
}
