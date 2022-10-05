/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21oopproba;

import myclasses.Author;
import myclasses.Book;

/**
 *
 * @author pupil
 */
public class JPTV21OOPproba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Author author1 = new Author();
        author1.setFirstname("Aleksandr");
        author1.setLastname("Pushkin"); 
        Book book = new Book();
        Author[]  authors = new Author[1];
        authors[0] = author1;
        book.setAuthors(authors);
         System.out.println(book.toString());
        
        Book book2 = new Book();
        book2.setCaption("Zolotoy telyonok");
        Author author2 = new Author();
        author2.setFirstname("Ilja");
        author2.setLastname("Ilf");
        Author author3 = new Author();
        author3.setFirstname("Evgeny");
        author3.setLastname("Petrov");
        Author[] authors2 = new Author[2];
        authors2[0] = author2;
        authors2[1] = author3;
        book.setAuthors(authors2);
        System.out.println(book.toString());
        System.out.println("+++++++++++++++++");
        Book book3 =new Book();
        book3.setCaption("kniga");
        book3.addAuthor(author1);
        book3.addAuthor(author2);
        book3.addAuthor(author3);
        System.out.println(book3.toString());
    }
    
}
