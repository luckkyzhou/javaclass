public class Book {
    private String title;
    private String author;
    private String size;
    private String color;
    private int publishedYear;
    private int numberOfPages;
    private boolean newOne;
    private boolean bookMark;

    public void isNewOne(){
        if (newOne){
            System.out.println(title + "is not read.");
        } else {
            System.out.println(title + "is not a new one.");
        }
    }

    public void publishAndPages(){
        System.out.println(title + "is published in " + publishedYear + " and has " + numberOfPages + " pages.");
    }

    public void nameAndAuthur(){
        System.out.println(author + " create " + title + ".");
    }

    public Book(String title, String color, String author, String size, int publishedYear, int numberOfPages, boolean newOne, boolean bookMark){
        this.title = title;
        this.color = color;
        this.author = author;
        this.size = size;
        this.publishedYear = publishedYear;
        this.numberOfPages = numberOfPages;
        this.newOne = newOne;
        this.bookMark = bookMark;
    }
}
