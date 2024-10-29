package GUI;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class Library {

    private ArrayList<Book> books;
    private ArrayList<Member> members;
    private HashMap<Integer, Date> borrowedBooks;
    private final double FINE_PER_DAY = 1.5;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
        borrowedBooks = new HashMap<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerMember(Member member) {
        members.add(member);
    }

    public String borrowBook(int memberId, String bookTitle) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(bookTitle) && !book.isBorrowed()) {
                book.borrowBook();
                borrowedBooks.put(memberId, new Date());
                return "Book borrowed successfully!";
            }
        }
        return "Book is not available.";
    }

    public String returnBook(int memberId, String bookTitle) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(bookTitle) && book.isBorrowed()) {
                book.returnBook();
                calculateFine(memberId);
                borrowedBooks.remove(memberId);
                return "Book returned successfully!";
            }
        }
        return "Book was not borrowed by the member.";
    }

    public void calculateFine(int memberId) {
        Date borrowedDate = borrowedBooks.get(memberId);
        if (borrowedDate == null) {
            return;
        }

        long diff = new Date().getTime() - borrowedDate.getTime();
        int daysLate = (int) (diff / (1000 * 60 * 60 * 24));
        double fine = daysLate * FINE_PER_DAY;
        JOptionPane.showMessageDialog(null, "Fine for member " + memberId + ": $" + fine);
    }

    public String listBooks() {
        StringBuilder list = new StringBuilder();
        for (Book book : books) {
            list.append(book.toString()).append("\n");
        }
        return list.toString();
    }
}
