package com.company;

public class Main {

    public static void main(String[] args) {

        Book b = new Book(1, "Physics", "Aristotle", "Philosophy",
                4.31, 2005);

        System.out.println("Before changing : " + b.hashCode());

        Book c = b.instantiateNewWithRating(4.56);

        System.out.println("After changing : " + c.hashCode());

    }
}
