package Array_Dictionary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arrayDict {
    private ArrayList<String> bookTitles;

    public arrayDict() {
        this.bookTitles = new ArrayList<>();
    }

    // Add a Book Title
    public void addBookTitle(String title) {
        bookTitles.add(title);
        System.out.println("Book added: " + title);
    }

    // Remove a Book Title
    public void removeBookTitle(String title) {
        if (bookTitles.remove(title)) {
            System.out.println("Book removed: " + title);
        } else {
            System.out.println("Book not found: " + title);
        }
    }

    // Search for a Book Title
    public int searchBookTitle(String title) {
        int index = bookTitles.indexOf(title);
        if (index >= 0) {
            System.out.println("Book found at index: " + index);
        } else {
            System.out.println("Book not found: " + title);
        }
        return index;
    }

    // List All Book Titles
    public void listAllBookTitles() {
        if (bookTitles.isEmpty()) {
            System.out.println("No books in the list.");
        } else {
            System.out.println("Book Titles:");
            for (String title : bookTitles) {
                System.out.println(title);
            }
        }
    }

    // Sort Book Titles
    public void sortBookTitles() {
        Collections.sort(bookTitles);
        System.out.println("Books sorted alphabetically.");
    }

    public static void main(String[] args) {
        arrayDict library = new arrayDict();
        Scanner sc = new Scanner(System.in);
        String title;
        int choice;

        do {
            System.out.println("\nLibrary System Menu:");
            System.out.println("1. Add a Book Title");
            System.out.println("2. Remove a Book Title");
            System.out.println("3. Search for a Book Title");
            System.out.println("4. List All Book Titles");
            System.out.println("5. Sort Book Titles");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the book title to add: ");
                    title = sc.nextLine();
                    library.addBookTitle(title);
                    break;
                case 2:
                    System.out.print("Enter the book title to remove: ");
                    title = sc.nextLine();
                    library.removeBookTitle(title);
                    break;
                case 3:
                    System.out.print("Enter the book title to search: ");
                    title = sc.nextLine();
                    library.searchBookTitle(title);
                    break;
                case 4:
                    library.listAllBookTitles();
                    break;
                case 5:
                    library.sortBookTitles();
                    library.listAllBookTitles();
                    break;
                case 6:
                    System.out.println("Exiting the system.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

    }
}