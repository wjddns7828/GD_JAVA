package com.min.edu;
/**
 * Abstract Class로 각 면적을 계산하는 자식 클래스 들이 extends하여<br>
 * 맴버 필드를 통해 필요한 x와y값을 입력 받고 <br>
 * 결과를 담을 수 있는 멤버 필드를 가지고 있는 클래스<br>
 * 공통 기능 : print() 를 구현<br>
 */
public abstract class AreaImpl implements IArea {
	
	/**
	 * 자식 클래스에서 사용하는 공통 변수 x
	 */
	protected int x;
	/**
	 * 자식 클래스에서 사용하는 공통 변수 y
	 */
	protected int y;
	/**
	 * 자식 클래스에서 cal메소드를 통해 을 통해 결과를 담는 변수 result
	 */
	protected double result;
	
	public AreaImpl(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	/**
	 * 각 면적을 계산하는 자식의 클래스에게 구현을 강요한다<br>
	 * <b> interface -&gt; class-&gt; abstract메소드 -&gt; </b>
	 */
	public abstract void cal();

	/**
	 * 면적의 결과를 출력하는 공통 메소드
	 */
	@Override
	public void print() {
		System.out.printf("%d와%d의 계산된 면적의 결과는 %f \n",x,y,result);

	}

}
