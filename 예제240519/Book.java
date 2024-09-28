package 예제240519;
// 예제 4-4에서 작성한 Book 클래스의 생성자를 this를 이용하여 수정하라.
public class Book {
	String title;
	String author;
	
	void show() {System.out.println(title+" "+author);}
	
	public Book() { 
		this(" ", " ");
		System.out.println("생성자 호출됨");
	}
	
	public Book(String title) { 
		this(title, "저자미상");
	}
	
	public Book(String title, String author) {
		this.title= title; this.author=author;
	}
	
	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자", "생텍쥐페리");
		Book loveStory = new Book("춘향전");
		Book emptyBook = new Book();
		loveStory.show();
	}
}