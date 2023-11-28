public class RatingnCommenting{
  public static void main(String[] args){

    //below, I created instances of my books class adding 5 books in total to the book store
    Books bookN1 = new Books("Introductory to Python");
    bookN1.calculateBookRating(4.5);
    bookN1.bookComment("Great resource to use if you're new to programming");
    bookN1.addDateStamp(new Date());

    Books bookN2 = new Book("What is Data Science?");
    bookN2.calculateBookRating(4);
    bookN2.bookComment("I enjoyed reading this book.");
    bookN2.addDateStamp(new Date());

    Books bookN3 = new Book("Fundamentals of Database Design.");
    bookN3.calculateBookRating(4.8);
    bookN3.bookComment("Learned a lot of good information from this book. Would recommend to anyone new to relational databases.");
    bookN3.addDateStamp(new Date());

    Books bookN4 = new Book("Software Engineering for Data Science.");
    bookN4.calculateBookRating(5);
    bookN4.bookComment("It's amazing to see how the two topics connect to each other.");
    bookN4.addDateStamp(new Date());

    Books bookN5 = new Book("Data Warehousing & ETL Pipelines.");
    bookN5.calculateBookRating(5);
    bookN5.bookComment("Great book!.");
    bookN5.addDateStamp(new Date());

    List<Book> bookItems = new ArrayList<>();
    bookItems.add(bookN1);
    bookItems.add(bookN2);
    bookItems.add(bookN3);
    bookItems.add(bookN4);
    bookItems.add(bookN5); //this list of books is to store every book from the book store.

   Collections.sort(bookItems, new Comparator<Book>(){
      @Override
      public int compare(Books n1, Books n2){
        return Double.compare(n2.getRating(), n1.getRating()); //this allows the books to be sorted based on its rating.
      }
    });

    for(Books books : bookItems) {
      System.out.println(books); //this code displays the details of each book to a user
    };

    double bookOverallRating = 0;
    for(Books books : bookItems) {
      bookOverallRating += books.getRating();
    }

    double rating = bookOverallRating / bookItems.size();
    System.out.println("Rating: " + rating); //calculating the average rating of a book
  }
}