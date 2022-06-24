package wolox.training.models;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Book implements Serializable {

    static final String OBJECT_NULL_MESSAGE = "Please check Object supplied it's null %s ! ";
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String  genre;
    @Column(nullable = false)
    private String  author;
    @Column(nullable = false)
    private String  image;
    @Column(nullable = false)
    private String  title;
    @Column(nullable = false)
    private String  subtitle;
    @Column(nullable = false)
    private String  publisher;
    @Column(nullable = false)
    private String  year;
    @Column(nullable = false)
    private int pages;
    @Column(nullable = false)
    private String isbn;

    @ManyToOne()
    @JoinColumn(name = "fk_user_id")
    private User user;

    public Book() {
        //constructor necessary for JPA library
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        String nameParameter="genre";
        Preconditions.checkNotNull(genre,OBJECT_NULL_MESSAGE,nameParameter);
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        String nameParameter="author";
        Preconditions.checkNotNull(author,OBJECT_NULL_MESSAGE,nameParameter);
        this.author = author;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        String nameParameter="image";
        Preconditions.checkNotNull(image,OBJECT_NULL_MESSAGE,nameParameter);
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        String nameParameter="title";
        Preconditions.checkNotNull(title,OBJECT_NULL_MESSAGE,nameParameter);
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        String nameParameter="subtitle";
        Preconditions.checkNotNull(subtitle,OBJECT_NULL_MESSAGE,nameParameter);
        this.subtitle = subtitle;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        String nameParameter="publisher";
        Preconditions.checkNotNull(publisher,OBJECT_NULL_MESSAGE,nameParameter);
        this.publisher = publisher;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        String nameParameter="year";
        Preconditions.checkNotNull(year,OBJECT_NULL_MESSAGE,nameParameter);
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        String nameParameter="isbn";
        Preconditions.checkNotNull(isbn,OBJECT_NULL_MESSAGE,nameParameter);
        this.isbn = isbn;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        String nameParameter="user";
        Preconditions.checkNotNull(user,OBJECT_NULL_MESSAGE,nameParameter);
        this.user = user;
    }
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
    @Override
    public boolean equals (Object obj){
        Book book =(Book) obj;
        if (this == book){
            return true;
        }
        if(book == null) {
            return false;
        }
        if(this.getClass() != book.getClass()){
            return false;
        }
        return Objects.equals(getId(), book.getId());
    }
}
