package genericCollection.sec04;

public class CompareMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<Interger, String> p1 = new Pair<Integer,String>(1, "사과");
		Pair<Interger, String> p2 = new Pair<>(1, "사과");
		
		boolean result1 = Util.compare(p1,p2);
		
		if(result1) {
			System.out.println("논리적인 동등한 객체 입니다.");
		}else {
			System.out.println("논리적인 동등하지 않은 객체 입니다.");
		}
		
		
	}

}
