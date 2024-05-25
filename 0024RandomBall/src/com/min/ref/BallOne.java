package com.min.ref;

import java.util.Objects;

/**
 * 랜덤 숫자 하나를 생성하는 클래스
 * @author GDJ67
 *
 */
public class BallOne {
	
	private int ball;
	
	
	//랜덤 숫자 생성
	public BallOne() {
		ball = (int)(Math.random()*45)+1;
	}
	
	//private라 가져 올 수 있는 메소드
	public int getBall() {
		return ball;
	}

	@Override // 그냥 가져오면 hash코드로 가져오기 떄문에 String으로 가져오기
	public String toString() {
		return "[" + ball + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(ball);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BallOne other = (BallOne) obj;
		return ball == other.ball;
	}	
	
	
	
}
