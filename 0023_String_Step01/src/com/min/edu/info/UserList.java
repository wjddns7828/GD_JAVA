package com.min.edu.info;

public class UserList {
	
	private User_VO[] lists;
	
	public UserList() {
		lists = new User_VO[3];
	}
	
	public void addUser(User_VO inVo) {
		for (int i = 0; i < lists.length; i++) {
			if (lists[i] == null) {
				lists[i] = inVo;
				break;
			}
			if (i==2) {
				System.out.println("더 이상 추가 할 수 없습니다.");
			}
		}//for
		
		
	}
	/**
	 * 맴버필드 머시기
	 * @param inVo
	 * @return
	 */
	public boolean listCheck(User_VO inVo) {
		boolean isc = false;
		for (int i = 0; i < lists.length; i++){
			if(lists[i].equals(inVo)) {
				isc=true;
			}
			
			//각 값들을 분해해서 내부의 값을 각각 비교하는 방식
			//많은 값들이 있을경우 불가능하다.
//			if(lists[i].getName().equals(inVo.getName())&&
//					lists[i].getAge()==inVo.getAge()&&
//					lists[i].getAddress().equals(inVo.getAddress())){
//				isc=true;
//			}
			
//			if(lists[i] == inVo) { 객체의 ==비교는 주소를 비교함
//				isc = true;
//			if(lists[i].equals(inVo)) { //객체의 equals비교
//				isc = true;
		}
		return isc;
	}

	public User_VO[] getLists() {
		return lists;
	}
	
	
}
