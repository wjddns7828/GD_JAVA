package com.woon.arr;

public class Array_Storage {

	//그냥 값을 넣은 배열을 만들어주고 배열 리턴가능한지 테스트해본 메소드임  >> 커피자판기에서는 그냥 X에 값 넣어주면됨
	public int[] firstArr() { //실제 값이 들어가 있는 배열 
		int[] a = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = i+10; // 0~4까지의 인덱스에 값을 넣어준다. Ex) a[0] = 1
			System.out.printf("a[%d]의 값 : %d / \t",i, i+10);
		}
		return a;
	}//firstArr

	//TODO 001 배열의 인덱스를 무한 증가 시키는 반복문을 만들어보자
	public void secondArr(int[] arr) {
		//TODO 001_01 For문 사용 Index 갯수 증가
		int[] c = null;// <<<@@@@@여기랑
		for (int i = 0; i < 3; i++) { // c의 index 갯수를 추가해주는 메소드
			c = new int [i]; //<< @@@@여기를 이용하는데 while로 바꾸고 while조건문 설정
		}
		
		//TODO 001_02While문 사용 Index 갯수 증가 For와 같은 원리로 증가시킴
		boolean chk = true;
		int i = 0;
		int[] d = null;
		while(chk==true) { //조건이 참일 때 실행함
			d = new int [i];
			System.out.printf("\n D의 인덱스 %d 번째 Index 생성 완료: %d\n", d.length,i);
			if (i==5) {
				chk=false;
			}else 
			i++;
		}
		
		//TODO 002 X[N번째] 인덱스에 Y[M]을 넣는데 값은 바꿔도 안바뀌게 
		//즉 X[0] 에는 Y[1]의 값이 들어가는데 Y[1]을 바꿔도 X[0]안에 있는 값은 변경X
		
		c[1]= arr[1]; // $$$$여기를 이용해서 X의 n번쨰 index에 Y의 n번째 index값을 저장
		System.out.println(c==arr);// false 이유는 ref가 다름 
		System.out.println(c[1]==arr[1]); // true인 이유 : 값은 같음
		//arr의 값이 바껴도 바뀌지않음
		
		//증명
		arr[1]= arr[1]+3;
		
		d[3] = arr[1];
		System.out.printf("arr[1] 값 : %d | c[1]의 값 : %d\n",arr[1],c[1]);
		System.out.println(d[3]);
		
		System.out.println(d[3]);
		System.out.println(c[1]==arr[1]); // false인 이유 : 값이 다름 즉 같은 레퍼런스가 아니라는 반증
	} // 
}
