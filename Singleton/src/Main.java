
public class Main {

	public static void main(String[] args) {
		
//		System.out.println("Start.");
//		Singleton obj1 = Singleton.getInstance();
//		Singleton obj2 = Singleton.getInstance();
//		if (obj1 == obj2) {
//			System.out.println("obj1��obj2�͓����C���X�^���X�ł��B");
//		}
//		else {
//			System.out.println("obj1��obj2�͓����C���X�^���X�ł͂���܂���B");
//		}
//		System.out.println("End.");
		
		Triple obj1 = Triple.getInstance(-1);
		if (null == obj1) {
			System.out.println("�C���X�^���X�̐����Ɏ��s���܂����B");
		}
		Triple obj2 = Triple.getInstance(3);
		if (null == obj2) {
			System.out.println("�C���X�^���X�̐����Ɏ��s���܂����B");
		}
		Triple obj3 = Triple.getInstance(0);
	}

}