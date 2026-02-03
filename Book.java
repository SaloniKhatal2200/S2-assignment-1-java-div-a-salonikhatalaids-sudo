import java.util.Scanner;
class Book {
    String title;

    String author;

    int isbn;

    double price;

    int stock;

    Book(String title, String author, int isbn, double price, int stock) {

        this.title = title;

        this.author = author;

        this.isbn = isbn;

        this.price = price;

        this.stock = stock;

    }


    void displayInfo() {

        System.out.println("===== Book Details =====");

        System.out.println("Title : " + title);

        System.out.println("Author : " + author);

        System.out.println("ISBN : " + isbn);

        System.out.println("Price : ₹" + price);

        System.out.println("Stock : " + stock);

    }


    void applyDiscount(double percent) {

        price = price - (price * percent / 100);

        System.out.println("Price after " + percent + "% discount: ₹" + price);

    }


    void addStock(int quantity) {

        stock += quantity;

        System.out.println("Stock increased. New stock: " + stock);

    }


    void checkAvailability() {

        if (stock > 0) {

            System.out.println("Book is available for purchase.");

        } else {

            System.out.println("Book is out of stock.");

        }

    }






    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        Book book1 = new Book(

                "Harry Potter",

                "J.K. Rowling",

                1111,

                499,

                10

        );


        Book book2 = new Book(

                "Data Structures",

                "Mark Allen Weiss",

                2222,

                799,

                0

        );


        book1.displayInfo();

        book1.applyDiscount(10);

        book1.addStock(5);

        book1.checkAvailability();


        System.out.println();


        book2.displayInfo();

        book2.applyDiscount(15);

        book2.addStock(20);

        book2.checkAvailability();


        sc.close();

    }

}