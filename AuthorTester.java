import java.util.Scanner;

public class AuthorTester {
    public static	void	main(String[]	args)	{

        Scanner in = new Scanner(System.in);

        Author author = new Author("Эдуард Лимонов",	"non",	'М');

        System.out.print("Введите email писателя:\n");
        author.Set_Email(in.next());
        System.out.print("\n");

        System.out.println(author);
    }
}
