class Book
{
    int bookid;
    String bookname;
    int price;
    
    Book(int id, String name, int bPrice)
    {
        bookid = id;
        bookname = name;
        price = bPrice;
    }
    
    void display()
    {
        System.out.println("Book Id : "+bookid);
        System.out.println("Book Name : "+bookname);
        System.out.println("Book Price : "+price);
        System.out.println("\n");
    }
}

public class Main {
    public static void main(String[] args) {
        Book newBook[] = new Book[7];
		newBook[0] = new Book(1, "Java Programming", 100);
		newBook[1] = new Book(2, "C++ Programming", 100);
		newBook[2] = new Book(3, "Python Programming", 100);
		newBook[3] = new Book(4, "Javascript Programming", 100);
		newBook[4] = new Book(4, "DotNet Programming", 100);
		newBook[5] = new Book(4, "R Programming", 100);
		newBook[6] = new Book(4, "Pascal Programming", 100);
		
		for (int i = 0; i<7; i++)
		{
		    newBook[i].display();
		}
    }
}