import java.util.*;
public class DemoBook {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input author name : ");
		String authorName = input.nextLine();
		System.out.print("Input author e-mail : ");
		String authorEmail = input.nextLine();
		Author author1 = new Author (authorName, authorEmail);
		System.out.println(author1);
		System.out.println();
		System.out.print("Input book title : ");
		String bookTitle = input.nextLine();
		System.out.print("Input book page :");
		int bookPage = input.nextInt();
		Book book1 = new Book(bookTitle, author1, bookPage);
		System.out.println(book1);
	}

}
