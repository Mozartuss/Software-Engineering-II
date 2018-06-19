package Aufgabe7;

public class BookSearch {
  private final String keyword; //required
  private final String author; //optional default: null
  private final int publicationYear; //optional default: Integer.MAX_VALUE

  /**
   * The method can't be called from outside this class.
   *
   * @param builder BookSearchBuilder
   */

  private BookSearch(BookSearchBuilder builder) {
    this.keyword = builder.keyword;
    this.author = builder.author;
    this.publicationYear = builder.publicationYear;
  }

  /**
   * Every attribute get his getterMethod.
   *
   * @return the attribute
   */

  public String getKeyword() {
    return keyword;
  }

  public String getAuthor() {
    return author;
  }

  public int getPublicationYear() {
    return publicationYear;
  }

  /**
   * The builder constructor only receives the required attributes
   * and this attributes are the only ones that are defined “final” on the builder.
   * Here you can set the default values.
   */

  public static class BookSearchBuilder {
    private final String keyword;
    private String author = "null";
    private int publicationYear = Integer.MAX_VALUE;

    public BookSearchBuilder(String keyword) {
      this.keyword = keyword;
    }

    public BookSearchBuilder author(String author) {
      this.author = author;
      return this;
    }

    public BookSearchBuilder publicationYear(int publicationYear) {
      this.publicationYear = publicationYear;
      return this;
    }

    /**
     * By returning the builder each time, we can create a fluent interface.
     *
     * @return builder
     */

    public BookSearch build() {
      return new BookSearch(publicationYear,author,keyword);
    }
  }
}


