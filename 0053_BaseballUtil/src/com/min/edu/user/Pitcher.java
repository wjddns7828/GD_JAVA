package com.min.edu.user;

/*
 * 컴퓨터가 자동으로 숫자를 생성하는 클래스<br>
 * @author 임정운
 * @since 23.05.18
 */
public class Pitcher extends GamerImpl {
	
	public Pitcher() {
		this(3);
	}
	
	public Pitcher(int n) {//체이닝 사용
		super(n);
	}
	
	/*
	 * 난수를 발생 시키는 메소드와 중복 검사 메소드를 사용하여 <br>
	 * 맴버필드의 랜덤 숫자의 묶음을 만들어주는 메소드<br> 
	 */
	@Override
	public void make() {
		int idx = 0;
		int n=box.length;
		while (idx != n) {
			int num = makenum();
			if (!checkBox(num)) {
				box[idx++] =num; 
			}
		}
	}
	private int makenum() {
		return (int) (Math.random()*9)+1;
	}
	
	
	/*
	 * 맴버필드의 Array에서 중복되는 값의 여부를 판단<br>
	 * @param 무작위 숫자<br>
	 * @return 중복 : true / 중복 아님 :false<br>
	 */
	private boolean checkBox(int randomNum) {
		boolean isc =false;
			for (int i = 0; i < box.length; i++) {
				if (box[i]== randomNum) {
					isc = true;
					break;
				}
			}
		return isc;
	}
}
