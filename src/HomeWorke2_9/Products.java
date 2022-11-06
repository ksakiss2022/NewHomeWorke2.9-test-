package HomeWorke2_9;

import java.util.Objects;

public class Products {

//Напишите простое приложение для формирования списка продуктов.
//
//Требования к приложению:
//
//Все товары в списке должны быть уникальными. При попытке добавить уже имеющийся продукт
// необходимо выбросить исключение. Например, если в списке уже есть бананы,
// то второй раз добавить их нельзя.
//Каждому продукту помимо названия можно добавить две характеристики: цена и необходимое
// количество, которое указывается в килограммах.
//Если какой-то из параметров не заполнен, то программа должна выдавать ошибку и сообщение
// «Заполните карточку товара полностью».
//В список продуктов можно добавить новый товар, отметить, что он уже куплен,
// или удалить его из списка.
//Названия всех продуктов должны быть на русском языке.

    private static final String PRODUCTS_SYMBOL = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ-";
    protected String product;
    protected float price;
    protected int quantity;

    public Products(String product, float price, int quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }

    public static boolean valiDateProduct(Products product) {
        try {
            chek(String.valueOf(product));
        } catch (ChekingProductExeption e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    private static void chek(String product)
            throws ChekingProductExeption {
        // if (product == null && product.isBlank() && product.isEmpty() && price <= 0 && quantity <= 0)

        if (!valiDate(product)) {
            throw new ChekingProductExeption("Не верно задан продукт" + product);
        }


    }

    private static boolean valiDate(String s) {
        if (s.length() < 3) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (!PRODUCTS_SYMBOL.contains(String.valueOf(s.charAt(i)))) {
                return false;
            }
        }
        return true;
    }


    public String getProduct() {
        return product;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
        return Float.compare(products.price, price) == 0 && quantity == products.quantity && product.equals(products.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, price, quantity);
    }
    public void printProducts() {
        System.out.println("Продукт- " + product + ",");
        System.out.println("стоимость - " + price + ", ");
        System.out.println("кол-во- " + quantity + ".");

    }


}



