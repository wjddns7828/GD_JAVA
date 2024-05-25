import com.min.edu.Child;
import com.min.edu.Parent;

public class ThisSuperMain {

	public static void main(String[] args) {
		// 자식의 타입으로 자식을 생성하기
		Child c = new Child();//TODO 01
		Parent p = c; //upcasting
		
		//1) 부모.자식 맴버필드 이름이 같음
		// 그렇다면 c.num을하면 누가 실행 될까?
		System.out.println(c.num);
		System.out.println(p.num);
		
		p.print();
		c.callParentPrint();
		
		System.out.println(c.getNum());
		System.out.println(p.getNum());
	}

}
