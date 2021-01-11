package com.company;

@SuppressWarnings("checkstyle:RegexpSingleline")
public final class Book implements Cloneable, Comparable<Book>{

    private final int id;
    private final String title;
    private final String author;
    private final String genre;
    private final double rating;
    private final int yearOfPublishing;

    public Book(int id, String title, String author, String genre, double rating, int yearOfPublishing) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.rating = rating;
        this.yearOfPublishing = yearOfPublishing;
    }

    //Getters

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getGenre() { return genre; }
    public double getRating() { return rating; }
    public int getYearOfPublishing() { return yearOfPublishing; }

    //When cannot change immutable class so we will return new Object

    public Book instantiateNewWithId(int id) throws CloneNotSupportedException {

        return new Book(id, this.title, this.author, this.genre,
                this.rating, this.yearOfPublishing);
    }

    public Book instantiateNewWithTitle(String title){

        return new Book(this.id, title, this.author, this.genre,
                this.rating, this.yearOfPublishing);
    }

    public Book instantiateNewWithAuthor(String author){

        return new Book(this.id, this.title, author, this.genre,
                this.rating, this.yearOfPublishing);
    }

    public Book instantiateNewWithGenre(String genre){

        return new Book(this.id, this.title, this.author, genre,
                this.rating, this.yearOfPublishing);
    }

    public Book instantiateNewWithRating(double rating){

        return new Book(this.id, this.title, this.author, this.genre,
                rating, this.yearOfPublishing);
    }

    public Book instantiateNewWithYear(int year){

        return new Book(this.id, this.title, this.author, this.genre,
                this.rating, year);
    }


    //Method clone() of interface Cloneable

    @Override
    protected Book clone() throws CloneNotSupportedException {

        return new Book(this.id, this.title, this.author, this.genre,
                this.rating, this.yearOfPublishing);
    }

    //Method compareTo() of interface comparable
    //Id refers to unique book, so if id are same so books are same

    @Override
    public int compareTo(Book b) {

        if (this.id == b.id){
            return 0;
        }
        else if (this.id > b.id){
            return 1;
        }
        else{
            return -1;
        }

    }

    @SuppressWarnings("checkstyle:OperatorWrap")
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append(this.id + " " + this.title + " " + this.author + " " + this.genre
                + " " + this.rating + " " + this.yearOfPublishing);

        return sb.toString();
    }

    public boolean equals(final Book b) {

        if (this.id == b.id){
            return true;
        }

        return false;
    }
}
