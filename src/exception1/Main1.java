package exception1;

public class Main1 {
	public static void main(String[] args) {
		int num[] = {1,2,3,4};
		try {
			System.out.println(num[5]);
		}catch(Exception e) {
			System.err.println(e.toString());
		}
		for(int i:num) {
			System.out.println(i);
		}
		
	}
}
