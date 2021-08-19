package storage;

import objects.Meat;
import objects.Potato;
import objects.Product;
import objects.Tomato;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private Product[] products;
    private List<Product> purchases;
    private List<Product> sales;

        public Database(){
            products = new Product[3];
            Product potato = new Potato("Elodie");
            Product tomato = new Tomato("Cherry");
            Product meat = new Meat("Costilla");

            products[0] = potato;
            products[1] = tomato;
            products[2] = meat;

            purchases = new ArrayList<>();
            sales = new ArrayList<>();
        }

        public Product getByIndex(int i){
            if (i < 0 || i > 2){
                System.out.println("¡Indice no válido!");
                return null;
            }
            //En caso que "i" no fuera menor a cero o mayor a dos
            Product result = null;
            try {
                result = products[i].clone();
            } catch (CloneNotSupportedException error){
                System.out.println(error);
            }
            return result;
        }

        public Product[] getAll(){
            Product[] result = new Product[3];
            try {
                result[0] = products[0].clone();
                result[1] = products[1].clone();
                result[2] = products[2].clone();
            } catch (CloneNotSupportedException error){
                System.out.println(error);
            }
            return result;
        }

        public void buy(Product product){
            Product temp;
            switch (product.getClass().getSimpleName()){
                case "Potato":
                    temp = products[0];
                    break;
                case "Tomato":
                    temp = products[1];
                    break;
                case "Meat":
                    temp = products[2];
                    break;
                default:
                    System.out.println("No válido");
                    return;
            }

            temp.setAmount(temp.getAmount() + product.getAmount());
            temp.setPrice(product.getPrice());
            purchases.add(product); //Agregar la comopra realizada
        }

        public void sale(Product product){
        Product temp;
        switch (product.getClass().getSimpleName()){
            case "Potato":
                temp = products[0];
                break;
            case "Tomato":
                temp = products[1];
                break;
            case "Meat":
                temp = products[2];
                break;
            default:
                System.out.println("No válido");
                return;
        }

        temp.setAmount(temp.getAmount() - product.getAmount());
        product.setPrice(temp.getPrice() * 1.25);
        sales.add(product);
    }

    public List<Product> getPurchases(){
            return purchases;
    }

    public List<Product> getSales(){
            return sales;
    }
}

