import java.util.*;
import java.io.*;

class Book
{
    int id;
    String title;
    String author;
    boolean available;

    Book(int id, String title, String author)
    {
        this.id = id;
        this.title = title;
        this.author = author;
        this.available = true;
    }
}

public class LibraryManagementSystem
{
    static ArrayList<Book> books = new ArrayList<Book>();

    static void saveBooks()
    {
        try
        {
            FileWriter fw = new FileWriter("books.txt");

            for(Book b : books)
            {
                fw.write(b.id + "|" + b.title + "|" +
                         b.author + "|" + b.available + "\n");
            }

            fw.close();
        }
        catch(IOException e)
        {
            System.out.println("Error saving file");
        }
    }

    static void loadBooks()
    {
        try
        {
            BufferedReader br = new BufferedReader(
                new FileReader("books.txt"));

            String line;

            while((line = br.readLine()) != null)
            {
                String data[] = line.split("\\|");

                Book b = new Book(
                    Integer.parseInt(data[0]),
                    data[1],
                    data[2]
                );

                b.available = Boolean.parseBoolean(data[3]);
                books.add(b);
            }

            br.close();
        }
        catch(IOException e)
        {
            
        }
    }

    static void addBook(Scanner sc)
    {
        System.out.print("Enter Book ID: ");
        int id = Integer.parseInt(sc.nextLine());

        for(Book b : books)
        {
            if(b.id == id)
            {
                System.out.println("Book ID already exists");
                return;
            }
        }

        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        books.add(new Book(id, title, author));

        saveBooks();

        System.out.println("Book added successfully");
    }

    static void displayBooks()
    {
        if(books.isEmpty())
        {
            System.out.println("No books available");
            return;
        }

        for(Book b : books)
        {
            System.out.println("ID: " + b.id);
            System.out.println("Title: " + b.title);
            System.out.println("Author: " + b.author);

            if(b.available)
                System.out.println("Status: Available");
            else
                System.out.println("Status: Issued");
        }
    }

    static void searchBook(Scanner sc)
    {
        System.out.print("Enter Book ID to search: ");
        int id = Integer.parseInt(sc.nextLine());

        for(Book b : books)
        {
            if(b.id == id)
            {
                System.out.println("Book Found: " + b.title);
                return;
            }
        }

        System.out.println("Book not found");
    }

    static void issueBook(Scanner sc)
    {
        System.out.print("Enter Book ID to issue: ");
        int id = Integer.parseInt(sc.nextLine());

        for(Book b : books)
        {
            if(b.id == id)
            {
                if(b.available)
                {
                    b.available = false;
                    saveBooks();
                    System.out.println("Book issued successfully");
                }
                else
                {
                    System.out.println("Book is already issued");
                }
                return;
            }
        }

        System.out.println("Book not found");
    }

    static void returnBook(Scanner sc)
    {
        System.out.print("Enter Book ID to return: ");
        int id = Integer.parseInt(sc.nextLine());

        for(Book b : books)
        {
            if(b.id == id)
            {
                if(!b.available)
                {
                    b.available = true;
                    saveBooks();
                    System.out.println("Book returned successfully");
                }
                else
                {
                    System.out.println("Book was not issued");
                }
                return;
            }
        }

        System.out.println("Book not found");
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        loadBooks();

        int choice;

        do
        {
            System.out.println(" Library Management System ");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch(choice)
            {
                case 1:
                    addBook(sc);
                    break;

                case 2:
                    displayBooks();
                    break;

                case 3:
                    searchBook(sc);
                    break;

                case 4:
                    issueBook(sc);
                    break;

                case 5:
                    returnBook(sc);
                    break;

                case 6:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while(choice != 6);

        sc.close();
    }
}
