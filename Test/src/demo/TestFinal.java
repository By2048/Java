package demo;

class Book{
	int Id;
	public Book(int id) {
		this.Id=id;
	}
}

public class TestFinal {
	private   int tid=10;
	private   Book tbook=new Book(1);
	
	public static void main(String[] args) {
		TestFinal fin=new TestFinal();
		
		fin.tid++;
		
		System.out.println(fin.tbook.Id);
		System.out.println(fin.tid);
	}
}

