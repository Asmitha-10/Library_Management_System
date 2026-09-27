import java.util.*;

public class LibraryManagement {
   List<BookManagement> book = new ArrayList<>();
   List<Members> member = new ArrayList<>();
   ArrayList<BookIssue> bookissue = new ArrayList<>();

   void AddBook(BookManagement obj) {
      book.add(obj);
   }

   void viewBooks() {
      for (BookManagement i : book) {
         System.out.printf("BookID     : %d\n", i.BookId);
         System.out.printf("BookName   : %s\n", i.BookName);
         System.out.printf("AuthorName : %s\n", i.AuthorName);
         System.out.printf("Category   : %s\n", i.Category);
         System.out.printf("Quantity   : %d\n", i.Quantity);
         System.out.println("\n");
         System.out.println("--------------------------------------");
         System.out.println("\n");
      }
   }

   void AddMember(Members obj) {
      member.add(obj);
   }

   void viewMembers() {
      for (Members i : member) {
         System.out.printf("ID          :    %d\n", i.memID);
         System.out.printf("Name        :    %s\n", i.memName);
         System.out.printf("PhoneNumber :    %s\n", i.phNo);
         System.out.println("\n");
         System.out.println("----------------------------------------");
         System.out.println("\n");
      }
   }

   void SearchBook(int BookId) {
      boolean flag = false;
      for (BookManagement i : book) {
         if (i.BookId == BookId) {
            System.out.println("Found Book\n");
            System.out.println("BookID     :   " + i.BookId);
            System.out.println("BookName   :   " + i.BookName);
            System.out.println("AuthorName :   " + i.AuthorName);
            System.out.println("Category   :   " + i.Category);
            System.out.println("Quantity   :   " + i.Quantity);
            flag = true;
         }
      }
      if (flag = false) {
         System.out.printf("Book Not Available");
      }
   }

   void SearchMember(int MemberID) {
      boolean flag = false;
      for (Members i : member) {
         if (i.memID == MemberID)
            return;
      }
      if (flag == false) {
         System.out.println("Member Not Found");
      }
   }

   void BookIssue(BookIssue obj) {
      bookissue.add(obj);
   }

   int CalculateFine(int BookId, int memberID, int date) {
      int fine = 0;
      for (BookIssue i : bookissue) {
         if (i.BookID == BookId && i.MemberID == memberID) {
            if (date > i.returndate) {
               fine = date - i.returndate;
            }
         }
      }
      return fine;
   }

   int renewBook(int bookid, int memid, int date) {
      int returndate = 0;
      for (BookIssue i : bookissue) {
         if (i.BookID == bookid && i.MemberID == memid) {
            i.date = date;
            i.returndate = date + 15;
            if (returndate > 30) {
               returndate = 30 - date;
               returndate = 15 - returndate;
            }
         }
      }
      return returndate;
   }

   void removeBook(int bookid) {
      boolean flag = false;
      for (BookManagement i : book) {
         if (i.BookId == bookid) {
            book.remove(i);
            flag = true;
         }
      }
      if (!flag) {
         System.out.println("Book not found");
      }
   }

   void updatebook(int BookId, String BookName, String AuthorName, String Category, int Quantity) {
      boolean flag = false;
      for (BookManagement i : book) {
         if (i.BookId == BookId) {
            i.setBookID(BookId);
            i.setBookName(BookName);
            i.setAuthorName(AuthorName);
            i.setCategory(Category);
            i.setQuantity(Quantity);
            flag = true;
         }
      }
      if (!flag) {
         System.err.println("Book not found");
      }
   }

}
