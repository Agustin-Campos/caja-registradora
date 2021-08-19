package objects;

public abstract class Product implements Cloneable {
    private String name;
    private int amount;
    private double price;

    public Product(){}

    public Product(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        if (amount < 0){
            System.out.println("La cantidad no puede tener un número en negativo");
            return;
        }

        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0){
            System.out.println("El precio no puede ser negativo");
            return;
        }

        this.price = price;
    }

    @Override
    public String toString(){
        return this.name + " : " + this.amount + " : " + this.price;
    }

    public Product clone() throws CloneNotSupportedException{
        return (Product) super.clone();
    }
}
