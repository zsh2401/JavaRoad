public class UseBook{
	public static void main(String[]args){
		Book a = new Book();
		Book b = new Book();
		Book c = b;
		
		b.name = "666"; //
		c.name = "777"; //一旦其中一个更改,另一个也改,这两个变量引用了同一个对象
		
		System.out.println(a.name);
		System.out.println(b.name);
		System.out.println(c.name);
	}
}