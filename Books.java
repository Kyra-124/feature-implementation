import java.util.*;

//initializing my variables below for the book store
  class Books{
  private String bookName;
  private String bookComment;
  private double bookRating;
  private Date dateStamp;

  public Books(String bookName){
    this.bookName = bookName ;
  }

  public void calculateBookRating(double bookRating){
    this.bookRating = bookRating; //method for calculating the rating of a book.
  }

  public void bookComment(String bookComment){
    this.bookComment = bookComment; //method for adding a comment to a book.
  }

  public void addDateStamp(Date dateStamp){
    this.dateStamp = dateStamp; //method for adding a date stamp to a book comment
  }

  public double getRating(){
    return bookRating; //method for getting the rating of a book
  }

  public String getBookComment(){
    return bookComment; //method for getting the comment of a book
  }

  public Date getDateStamp(){
    return dateStamp; //method for getting the date stamp of a book comment
  }

  public String toString(){
    return "Book name: " + bookName + " rating: " + bookRating + " book comment: " + bookComment + " date stamp: " + dateStamp;       //this method displays details of each book...(its name, rating, comment and the date which the comment/review was made)
  }
}
