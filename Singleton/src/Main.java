
public class Main {

	public static void main(String[] args) {
		
//		System.out.println("Start.");
//		Singleton obj1 = Singleton.getInstance();
//		Singleton obj2 = Singleton.getInstance();
//		if (obj1 == obj2) {
//			System.out.println("obj1とobj2は同じインスタンスです。");
//		}
//		else {
//			System.out.println("obj1とobj2は同じインスタンスではありません。");
//		}
//		System.out.println("End.");
		
		Triple obj1 = Triple.getInstance(-1);
		if (null == obj1) {
			System.out.println("インスタンスの生成に失敗しました。");
		}
		Triple obj2 = Triple.getInstance(3);
		if (null == obj2) {
			System.out.println("インスタンスの生成に失敗しました。");
		}
		Triple obj3 = Triple.getInstance(0);
	}

}
