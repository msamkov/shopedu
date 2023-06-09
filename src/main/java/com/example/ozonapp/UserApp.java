package com.example.ozonapp;

public class UserApp { //создаём класс покупателя или админа
    private String login;
    private String pass;
    private String username;

    private Bucket bucket;

    public void setPass(String pass) { //метод установки пароля
        if (pass.length() < 5) {
            System.out.println("Пароль слишком короткий");
            System.exit(1);
        }
        this.pass = pass; //this нужен для того чтобы изменить пароль вне метода
    }

    public String getPass() { //метод, который возвращает пароль в ozon
        return pass;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    public String getLogin(){
        return login;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername(){
        return username;
    }
}



