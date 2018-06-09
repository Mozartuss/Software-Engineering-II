public class Launcher {
    public static void main(String[] args) {
        BookSearch.BookSearchBuilder builder = new BookSearch.BookSearchBuilder("keyword");
        BookSearch bookSearch = builder
                .author("author")
                .publicationYear(2018)
                .build();

        System.out.println(bookSearch.getKeyword() + " " + bookSearch.getAuthor() + " " + bookSearch.getPublicationYear());


    }
}


