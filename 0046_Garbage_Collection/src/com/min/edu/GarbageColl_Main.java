package com.min.edu;

public class GarbageColl_Main {
	public static void main(String[] args) throws InterruptedException {
		System.out.println(new ObjectVO().hashCode());
		System.out.println(new ObjectVO().hashCode());
			
		ObjectVO vo = new ObjectVO();
		System.out.println(vo.hashCode());
//		vo = null;
		new String("가");
		
		System.out.println("objecvo갯수 1 : "+ ObjectVO.newObjectCnt);
		System.gc();
		Thread.sleep(5000);
		System.out.println("objecvo갯수 2 : "+ ObjectVO.newObjectCnt);
		System.gc();
		System.out.println("메인 실행완료"+vo.hashCode());
	}
}
