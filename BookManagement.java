import java.util.*;

public class BookManagement {
    int BookId;
    String BookName;
    String AuthorName;
    String Category;
    int Quantity;

    public BookManagement(int BookId, String BookName, String AuthorName, String Category, int Quantity) {
        this.BookId = BookId;
        this.BookName = BookName;
        this.AuthorName = AuthorName;
        this.Category = Category;
        this.Quantity = Quantity;
    }

    int getBookID() {
        return BookId;
    }

    String getBookName() {
        return BookName;
    }

    String getAuthorName() {
        return BookName;
    }

    String getCategory() {
        return BookName;
    }

    int getQuantity() {
        return Quantity;
    }

    void setBookID(int BookId) {
        this.BookId = BookId;
    }

    void setBookName(String BookName) {
        this.BookName = BookName;
    }

    void setAuthorName(String AuthorName) {
        this.AuthorName = AuthorName;
    }

    void setCategory(String Category) {
        this.Category = Category;
    }

    void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

}
