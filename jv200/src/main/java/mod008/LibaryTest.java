package mod008;

public class LibaryTest {
	
	public static void main(String[] args) {
		Libary lib = Libary.getLibary();
		Libary lib2 = Libary.getLibary();
		for(int i = 0; i < 200; i++) {
			lib.addBook(new Book("�����", i));
		}
		lib.addBook(new Book("�ڹ�", 2));
		lib2.addBook(new Book("hello",1234));
		System.out.println(lib2.toString());
		System.out.println(lib2.getBook(5));
		System.out.println(lib.toString());
		
		System.out.println(lib2.getBook(2));
	}
}
