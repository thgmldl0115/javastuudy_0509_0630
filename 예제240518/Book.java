package 예제240518;
// 제목과 저자를 나타내는 title과 author 필드를 가진 Book 클래스를 작성하고, 생성자를 작성하여 필드를 초기화하라
public class Book {
	String title;
	String author;
	
	public Book(String t) { 
		title = t; author = "저자미상";
	}
	
	public Book(String t, String a) { 
		title = t; author = a;
	}
	
	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자", "생텍쥐페리");
		Book loveStory = new Book("춘향전");
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
	}
}