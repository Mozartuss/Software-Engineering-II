class BookSearch {
    private final String keyword;
    private final String author;
    private final int publicationYear;

    BookSearch(BookSearchBuilder builder) {
        this.keyword = builder.keyword;
        this.author = builder.author;
        this.publicationYear = builder.publicationYear;
    }

    String getKeyword() {
        return keyword;
    }

    String getAuthor() {
        return author;
    }

    int getPublicationYear() {
        return publicationYear;
    }

    static class BookSearchBuilder {
        private final String keyword;
        private String author = "null";
        private int publicationYear = Integer.MAX_VALUE;

        BookSearchBuilder(String keyword) {
            this.keyword = keyword;
        }

        BookSearchBuilder author(String author) {
            this.author = author;
            return this;
        }

        BookSearchBuilder publicationYear(int publicationYear) {
            this.publicationYear = publicationYear;

            return this;
        }

        BookSearch build() {
            return new BookSearch(this);
        }
    }
}


