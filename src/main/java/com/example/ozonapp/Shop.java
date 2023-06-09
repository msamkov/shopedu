package com.example.ozonapp; //каталог


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; //библиотека для считывания

public class Shop { //создание класса озон


    private String shopName;


    private final int EXIT_SHOP = 3; //final - постоянная величина
    private final int AUTH_USER = 1;
    private final int PRODUCT_1 = 1;
    private final int PRODUCT_2 = 2;
    private final int PRODUCT_3 = 3;
    private final int PRODUCT_4 = 4;
    private final int EXIT_PRODUCTS = 5;
    private final int EXIT_PRODUCTS_LIST = 1;




    private List<UserApp> users = new ArrayList<>();
    private List<Product> products = new ArrayList<>();


    public void setShopName(String shopName) {
        this.shopName = shopName;
    }


    public void openShop() { //создание метода с названием старт
        System.out.println("Добро пожаловать в " + shopName);

        addUsers();


        while (true) {     //бесконечный цикл

            System.out.println("\n\n" +
                    "Введите: " + //вывести текст
                    "\n 1 авторизоваться" +
                    "\n 2 зарегестрироваться" +
                    "\n 3 выйти");
            Scanner scanner2 = new Scanner(System.in); //считать текст
            int inputMenu = scanner2.nextInt(); //создаем целочисленную переменную
            //и присваиваем ей значение которое считали из консоли
            if (inputMenu == AUTH_USER) {

                System.out.println("\n\n\n\n\n\n\n\n");
                Scanner scanner3 = new Scanner(System.in);
                System.out.println("Введите логин пользователя:");
                String login = scanner3.nextLine();
                System.out.println("Введите пароль пользователя:");
                String pass = scanner3.nextLine();

                UserApp userApp = getUserByLoginAndPass(login, pass);
                if (userApp != null) {
                    System.out.println("\n\n\n\n\n\n");
                    System.out.println("Добро пожаловать, " + userApp.getUsername());
                    products(userApp.getUsername());
                } else {
                    System.out.println("Неверный логин и пароль");
                }
            }

            if (inputMenu == EXIT_SHOP) {
                System.out.println("Выход выполнен");
                return;
            }
        }
    }

    private UserApp getUserByLoginAndPass(String login, String pass) { //метод поиска пользователя по логину и паролю
     for(int i = 0; i < users.size(); i++){
         UserApp findUser = users.get(i); //get - получить элемент под номером i
         if(findUser.getLogin().equals(login)
         && findUser.getPass().equals(pass)){
             return findUser;
         }
     }
        return null;
    }

    private void products(String username) { //создаём метод с продуктами и передаём переменную
                                             //username
        Product product1 = new Product();
        product1.namePoduct = "Вешалка";
        product1.producer = "Mercedes";
        product1.price = 430;

        Product product2 = new Product();
        product2.namePoduct = "Шампунь";
        product2.producer = "Shauma";
        product2.price = 700;


        int PRODUCT_LIST = 0;
        while (PRODUCT_LIST == 0) {
            System.out.println("Доступные товары: " +
                    "\n 1 Вешалка" +
                    "\n 2 Шампунь" +
                    "\n 3 Подкрадули змеиные" +
                    "\n 4 Телефон" +
                    "\n\n 5 Выйти");

            Scanner scanner2 = new Scanner(System.in);
            int inputMenu = scanner2.nextInt();


            if (inputMenu == PRODUCT_1) {
                System.out.println(product1);
                System.out.println("\n\n 0 Выйти");
                Scanner scanner3 = new Scanner(System.in);
                PRODUCT_LIST = scanner3.nextInt();
            }
            if (inputMenu == PRODUCT_2) {
                System.out.println(product2.toString());
                System.out.println("\n\n 0 Выйти");
                Scanner scanner3 = new Scanner(System.in);
                PRODUCT_LIST = scanner3.nextInt();
            }
            if (inputMenu == PRODUCT_3) {
                System.out.println("\n\n\n\n\n\n" +
                        " Подкрадули змеиные" +
                        "\n\n Производитель: GUCCI&PRADO&ADIDAS" +
                        "\n Цена: 9.999.999 рублей" +
                        "\n\n 0 Выйти");
                Scanner scanner3 = new Scanner(System.in);
                PRODUCT_LIST = scanner3.nextInt();
                System.out.println("\n\n\n\n\n\n");
            }
            if (inputMenu == PRODUCT_4) {
                System.out.println("\n\n\n\n\n\n" +
                        " Телефон" +
                        "\n\n Производитель: Apple" +
                        "\n Цена: 109.900 рублей" +
                        "\n\n 0 Выйти");
                Scanner scanner3 = new Scanner(System.in);
                PRODUCT_LIST = scanner3.nextInt();
                System.out.println("\n\n\n\n\n\n");
            }
            if (inputMenu == EXIT_PRODUCTS) {
                System.out.println("\n\n\n\n\n\n" +
                        "Всего хорошего, " + username);
                PRODUCT_LIST = EXIT_PRODUCTS_LIST;
            }
        } // while
    } // products



    private void addUsers() {
        UserApp user1 = new UserApp();

        user1.setLogin("bob1");
        user1.setPass("10000");

        user1.setUsername("Михаил");

        UserApp user2 = new UserApp();
        user2.setLogin("bob2");
        user2.setPass("20000");
        user2.setUsername("Олег");

UserApp user3 = new UserApp();
        user3.setLogin("bob3");
        user3.setPass("30000");
        user3.setUsername("Андрей");

        users.add(user1);
        users.add(user2);
        users.add(user3);
    } // addUsers





} // Ozon






/*
cоздать учётку github

в классе UserAPP сделать все члены приватными и добавить get и set

начать читать про классы

сделать телегу!!!

выписать вещи которые не понятн
 */