package Aufgabe7;

public class Launcher {

  /**
   * Now we can call the BookSearch over a fluent interface so it is more readable.
   *
   * @param args -args
   */

  public static void main(String[] args) {

    BookSearch bs = new BookSearch.BookSearchBuilder("software engineering")

        //here you can call the attributes in any order you want.

        .publicationYear(2017)

        //but .build() is always the end of your call.

        .build();

    System.out.println(bs.getKeyword() + " " + bs.getAuthor() + " " + bs.getPublicationYear());

  }
}


