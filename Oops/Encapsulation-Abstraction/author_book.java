class Author {
    private String name;
    private String email;
    private char gender;
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
}

class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQtyInStock() {
        return qtyInStock;
    }
    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
}

public class author_book {
    public static void main(String[] args) {

        Author author = new Author(
                "Lakshmi Tejaswini",
                "tejaswini@gmail.com",
                'F');

        Book book = new Book(
                "Java Programming",
                author,
                599.99,
                50);

        System.out.println("Book Details");
        System.out.println("------------");
        System.out.println("Book Name      : " + book.getName());
        System.out.println("Price          : " + book.getPrice());
        System.out.println("Quantity Stock : " + book.getQtyInStock());

        System.out.println("\nAuthor Details");
        System.out.println("--------------");
        System.out.println("Author Name : " + book.getAuthor().getName());
        System.out.println("Email       : " + book.getAuthor().getEmail());
        System.out.println("Gender      : " + book.getAuthor().getGender());
    }
}