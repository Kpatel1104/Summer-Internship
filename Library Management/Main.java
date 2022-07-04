import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        books ob = new books();
        int choice;
        int searchChoice;
        do {

            ob.dispMenu();
            choice = input.nextInt();
            switch (choice)
            {
                case 1:
                    book b = new book();

                    ob.addBook(b);

                    break;
                case 2:
                    System.out.println(" press 1 to Search with Book:");
                    System.out.println(" Press 2 to Search with Book's Author Name:");
                    searchChoice = input.nextInt();
                    switch (searchChoice) {
                        case 1:
                            ob.searchByCategory();
                        case 2:
                            ob.searchByAuthorName();
                        case 3:
                            ob.searchByTitle();
                    }
                    break;
                case 3:
                    ob.showAllBooks();
                    break;
                default:
                    System.out.println("ENTER BETWEEN 0 TO 4.");
                case 4:

                    ob.sortbyauthor();
                case 5:

                    ob.sortbycategories();

            }
        }
        while (choice != 0);
    }
}
