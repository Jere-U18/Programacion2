package com.uce.objetos;

import com.uce.funciones.ClaseEstatica;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Getter
    @Setter
    private String title;
    @Getter
    @Setter
    private String author;
    @Getter
    @Setter
    private float price;
    @Getter
    @Setter
    private String editorial;
    @Getter
    @Setter
    private int pages;
    @Getter
    @Setter
    private int year;
    @Getter
    @Setter
    private String edition;
    

    @Override
    public String toString() {
        String est =  "Book{" + "title=" + title + ", author=" + author + ", price=" + price + ", editorial=" + editorial + ", pages=" + pages + ", year=" + year + ", edition=" + edition + '}';
        System.out.println(est); 
        return est;
    }

}
