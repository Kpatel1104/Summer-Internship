import java.util.Scanner;
import java.util.*;

public class book {
    public int sNo;

    public String title;
    public String category;
    public String bookName;
    public String authorName;

    Map <String,String> mp=new TreeMap<String,String>();
    Map <String,String> mp1=new TreeMap<String,String>();





    Scanner input = new Scanner(System.in);

    public book()
    {
        mp.put("Robin sharma","The monk who sold his ferrari");
        mp.put("Nepolian Hill","Think and Grow Rich");
        mp.put("Chetan Bhagat","Half Girlfriend");

        mp1.put("Selfhelp","The monk who sold his ferrari");
        mp1.put("Business","Think and Grow Rich");
        mp1.put("Autobiography","Autobiography of a Yogi");


        System.out.println("Enter Serial No of Book:");
        this.sNo = input.nextInt();
        input.nextLine();

        System.out.println("Enter Book Name:");
        this.bookName = input.nextLine();

        System.out.println("Enter Author Name:");
        this.authorName = input.nextLine();

        System.out.println("Enter Category:");
        this.category = input.nextLine();
    }
    //public int sortbyauthor(){

      //  mp.put(authorName,bookName);

        //System.out.println("the book sorted by author name:");
    //System.out.println(mp);

      //  return 0;

    //}
    //public int sortbycategories(){

      //  mp1.put(category,bookName);

        //System.out.println("the book sorted by Category");
    //System.out.println(mp1);

      //  return 0;

    //}
}
