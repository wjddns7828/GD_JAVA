package com.min.edu;
/**
 * 부모가 (java.lang.object) 자식을 복제 하는 것 
 *	부모의 메소드인 clone을 사용하여 복제 
 *	부모 클래스는 자식에게 구현을 강요 할 수 있지만 특징은 강요 할 수 없음
 *	
 *	값은 같은데 Ref와 Hashcode가 다른 애를 부모를 통해서 만들어 보자
 */
public class UserInfoVo implements Cloneable{
	private String name;
	private String addr;
	private int age;
	
	
	public UserInfoVo(String name, String addr, int age) {
		super();
		this.name = name;
		this.addr = addr;
		this.age = age;
	}


	@Override
	public String toString() {
		return "UserInfoVo [name=" + name + ", addr=" + addr + ", age=" + age + "]";
	}
	
	//throws : 사용 시 예외가 발생 할 수 있는데
	//CloneNotSupportedException : 복제를 지원하지 않는다.
	
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		return super.clone();
//	}
	
	public Object createClone() {
		Object obj  = null;
		try {
			obj = this.clone();
		} catch (CloneNotSupportedException e) {//this가 복제가능한 클래스인가요?
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
	
	
}
