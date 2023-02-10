package org.example;

public class Main {
    public static void main(String[] args) {
//        Дан массив пар названий книг и авторов, необходимо привести каждую пару в строку вида: “Название книги” Имя Отчество Фамилия автора
        Book[]arr = {new Book("12343","5657"),new Book("fgdg","5t567")};
        for(int i =0; i <= arr.length-1; i++){
            System.out.println(arr[i]);
        }
    }

    static class Book{
        String name;
        String author;


        public Book(String name, String author) {
            this.name = name;
            this.author = author;
        }

        @Override
        public String toString() {
            return "\""+ name +"\""+ " "+ author;
        }
    }
}