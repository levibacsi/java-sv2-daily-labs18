package day02;

public class Book {
    private Long id;
    private String writer;
    private String title;
    private int pieces;
    private int price;

    public Book(Long id, String writer, String title, int pieces, int price) {
        this.id = id;
        this.writer = writer;
        this.title = title;
        this.pieces = pieces;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getWriter() {
        return writer;
    }

    public String getTitle() {
        return title;
    }

    public int getPieces() {
        return pieces;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", writer='" + writer + '\'' +
                ", title='" + title + '\'' +
                ", pieces=" + pieces +
                ", price=" + price +
                '}';
    }
}


