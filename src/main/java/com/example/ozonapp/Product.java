package com.example.ozonapp;

public class Product {

    // Наименование продукта
    public String namePoduct;

    // Производитель
    public String producer;

    // Цена
    public int price;


    // Кол-во товара отсалось
    public int count;

    @Override
    public String toString() {
        return "Товар: " + namePoduct + "\n" +
                "Производитель:" + producer + "\n" +
                "Цена:" +  price + "\n" +
                "Кол-во:" + count;
    }
}
