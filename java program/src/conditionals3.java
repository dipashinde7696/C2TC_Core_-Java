import java.util. Scanner;
public class conditionals3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String website = s.next();
		if (website.endsWith(".org")) {
			System.out.println("This is organizational website");
		}
		else if(website.endsWith(".com")) {
			System.out.println("This is a commercial website");
		}
		else if(website.endsWith(".in")) {
			System.out.println("This is an Indian website");
		}
	}
}


