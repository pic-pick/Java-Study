package oopException.sec02;

public class TryCatchEx {

    public static void main(String[] args) {
        // try ~ catch
        int[] arr = {1,2,3};
        try {
            System.out.println(arr[5]);
            Class class1 = Class.forName("java.lang.String2"); // 예외 발생하면
            System.out.println("클래스가 존재합니다");
        }catch(ArrayIndexOutOfBoundsException e){ 
        	
        }catch (ClassNotFoundException e) { // 해당 예외 발생시 예외 정보를 전달받는 참조변수
            System.out.println("클래스가 존재하지 않습니다");
        }
    } // try ~ catch 블럭 사용했기 때문에 ClassNotFoundException 예외가 발생한 경우 정상 종료 진행
}