import java.util.*;

public class main {
    public static void main(String args[]) {
        LibraryManagement lib = new LibraryManagement();
        Scanner sc = new Scanner(System.in);
        System.out.println("------- LIBRARY MANAGEMENT SYSTEM -------\n");
        while (true) {
            System.out.println(
                    "1.Add Book\n2.Add Member\n3.View All Books\n4.View Members\n5.Search Book\n6.Issue Book\n7.Return Book\n8.Renew Book\n9.Remove Book\n10.Update Book\n11.Exit");
            System.out.printf("\nEnter Your Choice   :  ");
            int ch = sc.nextInt();
            System.out.println();
            sc.nextLine();
            switch (ch) {
                case 1:
                    System.out.println("Enter the following Details : ");
                    System.out.printf("%-15s", "BookID");
                    int BookId = sc.nextInt();
                    sc.nextLine();
                    System.out.printf("%-15s", "BookName");
                    String BookName = sc.nextLine();
                    System.out.printf("%-15s", "AuthorName");
                    String AuthorName = sc.nextLine();
                    System.out.printf("%-15s", "Category");
                    String Category = sc.nextLine();
                    System.out.printf("%-15s", "Quantity");
                    int Quantity = sc.nextInt();
                    BookManagement obj = new BookManagement(BookId, BookName, AuthorName, Category, Quantity);
                    lib.AddBook(obj);
                    System.out.println();
                    System.out.print("----- Book Added Successfully -----\n");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Enter the following details : ");
                    System.out.printf("%-15s", "Member ID      :   ");
                    int memID = sc.nextInt();
                    sc.nextLine();
                    System.out.printf("%-15s", "Member Name    :   ");
                    String memName = sc.nextLine();
                    System.out.printf("%-15s", "Phone Number   :   ");
                    long phNo = sc.nextLong();
                    Members m = new Members(memID, memName, phNo);
                    lib.AddMember(m);
                    System.out.println();
                    System.out.println("----------- Member registered successfully -----------");
                    System.out.println();
                    break;
                case 3:
                    lib.viewBooks();
                    break;
                case 4:
                    lib.viewMembers();
                    break;
                case 5:
                    System.out.print("Enter BookID   :   ");
                    int bookID = sc.nextInt();
                    lib.SearchBook(bookID);
                    break;
                case 6:
                    System.out.println("Enter the following details : ");
                    System.out.print("BookID      :   ");
                    int BookID = sc.nextInt();
                    System.out.print("MemberID    :   ");
                    int MemberID = sc.nextInt();
                    lib.SearchMember(MemberID);
                    System.out.print("Issue Date  :   ");
                    int date = sc.nextInt();
                    int duedate = date + 15;
                    if (duedate > 30) {
                        duedate = 30 - date;
                        duedate = 15 - duedate;
                    }
                    System.out.println("Book issued successfully");
                    System.out.printf("Due date  :  %d/10/2026", duedate);
                    System.out.println();
                    BookIssue i = new BookIssue(BookID, MemberID, date, duedate);
                    lib.BookIssue(i);
                    break;
                case 7:
                    System.out.println("Enter the following details : ");
                    System.out.print("BookID       :   ");
                    int bookId = sc.nextInt();
                    System.out.print("MemberID     :   ");
                    int memberID = sc.nextInt();
                    lib.SearchMember(memberID);
                    System.out.print("Return Date  :   ");
                    int Date = sc.nextInt();
                    lib.CalculateFine(bookId, memberID, Date);
                    System.out.println("Book Returned Susscessfully");
                    System.out.printf("Fine        :      %d   ", lib.CalculateFine(bookId, memberID, Date));
                    System.out.println();
                    break;
                case 8:
                    System.out.println("Enter the following details  :  ");
                    System.out.print("\nBookID      :   ");
                    int bookid = sc.nextInt();
                    System.out.println();
                    System.out.print("\nMemberID    :   ");
                    int memid = sc.nextInt();
                    System.out.print("\nDate        :   ");
                    int DAte = sc.nextInt();
                    System.out.println("\nBook renewed Succesfully");
                    System.out.printf("\nNewReturnDate :   %d", lib.renewBook(bookid, memid, DAte));
                    break;
                case 9:
                    System.out.println("Enter BookId :    ");
                    int booKId = sc.nextInt();
                    lib.removeBook(booKId);
                    System.out.println("Book removed Successfully");
                    break;
                case 10:
                    System.out.println("Enter the following details : ");
                    System.out.printf("%-15s", "BookID");
                    int BoOkId = sc.nextInt();
                    sc.nextLine();
                    System.out.printf("%-15s", "Updated BookName");
                    String BookNAme = sc.nextLine();
                    System.out.printf("%-15s", "Updated AuthorName");
                    String authorName = sc.nextLine();
                    System.out.printf("%-15s", "Updated Category");
                    String category = sc.nextLine();
                    System.out.printf("%-15s", "Updated Quantity");
                    int quantity = sc.nextInt();
                    lib.updatebook(BoOkId, BookNAme, authorName, category, quantity);
                    break;
                case 11:
                    System.out.println("Thankyou ! \nExisting Library Management System");
                    System.exit(0);

            }

        }
    }
}
