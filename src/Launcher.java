public class Launcher {
    public static void main(String[] args) {
        BookSearch bs = new BookSearch.BookSearchBuilder("software engineering").build();


        System.out.println(bs.getKeyword() + " " + bs.getAuthor() + " " + bs.getPublicationYear());


    }
}


