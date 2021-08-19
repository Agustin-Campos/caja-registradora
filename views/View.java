package views;

import objects.Product;

import java.util.List;
import java.util.Scanner;

public class View {
    public static void showHeaderPrincipal(){
        System.out.println("\t******************************************************");
        System.out.println("\t**        BIENVENIDO A LA CAJA REGISTRADORA         **");
        System.out.println("\t******************************************************");    }

    public static void showMenuPrincipal(){
        System.out.println("\t1 - Comprar");
        System.out.println("\t2 - Vender");
        System.out.println("\t3 - Inventario");
        System.out.println("\t4 - Compras");
        System.out.println("\t5 - Ventas");
        System.out.println("\t6 - Salir");
    }

    public static void showGetOption(){
        System.out.print("\tEliga una opción:");
    }

    public static void showGetAmount(){
        System.out.print("\tIndique la cantidad: ");
    }

    public static void showGetPrice(){
        System.out.print("\tIndique el precio: ");
    }

    public static int getOption() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    public static int getAmount(){
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    public static double getPrice(){
        Scanner teclado = new Scanner(System.in);
        return teclado.nextDouble();
    }

    public static void showBuyHeader(){
        System.out.println("\t******************************************************");
        System.out.println("\t**                 MENU DE COMPRAS                  **");
        System.out.println("\t******************************************************");
        showItemsMenuProducts();
    }

    public static void showSaleHeader(){
        System.out.println("\t******************************************************");
        System.out.println("\t**                  MENU DE VENTAS                  **");
        System.out.println("\t******************************************************");
        showItemsMenuProducts();
    }

    public static void showItemsHeader(){
        System.out.println("\t------------------------------------------------------");
        System.out.println("\t** PRODUCTO\t| CANTIDAD\t| Vr UNITARIO\t| Vr TOTAL\t**");
        System.out.println("\t------------------------------------------------------");
    }

    public static void showStockHeader(){
        System.out.println("\t******************************************************");
        System.out.println("\t**                    INVENTARIO                    **");
        System.out.println("\t******************************************************");
        showItemsHeader();
    }

    public static void showBuyListHeader(){
        System.out.println("\t******************************************************");
        System.out.println("\t**                      COMPRAS                     **");
        System.out.println("\t******************************************************");
        showItemsHeader();
    }

    public static void showSaleListHeader(){
        System.out.println("\t******************************************************");
        System.out.println("\t**                      VENTAS                      **");
        System.out.println("\t******************************************************");
        showItemsHeader();
    }

    public static void showItemsMenuProducts(){
        System.out.println("\t1 - Papas");
        System.out.println("\t2 - Tomates");
        System.out.println("\t3 - Carne");
        System.out.println("\t4 - Volver");
    }

    public static void showEnd(){
        System.out.println("\tCaja Registradora finalizó");
    }

    public static void showInvalidOption(){
        System.out.println("\tOpción no válida.");
    }

    public static void showGetExitModule(String name){
        System.out.println("\tSaliendo del módulo " + name);
    }

    public static void showAnyKey(){
        System.out.print("Indique cualquier número para continuar: ");
    }

    public static void showItemsStock(Product[] products){
        for (Product p : products){
            System.out.println("\t** "+p.getName()+"\t| "+p.getAmount()+"\t\t | "+p.getPrice()+"\t\t | "+p.getAmount()*p.getPrice()+"\t\t**");
        }
    }

    public static void showInvalidAmount(){
        System.out.println("La cantidad no es válida");
    }

    public static void showPurchases(List<Product> listado){
        for (Product p : listado){
            System.out.println("\t** "+p.getName()+"\t| "+p.getAmount()+"\t\t | "+p.getPrice()+"\t\t | "+p.getAmount()*p.getPrice()+"\t\t**");
        }
    }

    public static void showSales(List<Product> listado){
        for (Product p : listado){
            System.out.println("\t** "+p.getName()+"\t| "+p.getAmount()+"\t\t | "+p.getPrice()+"\t\t | "+p.getAmount()*p.getPrice()*1.25+"\t\t**");
        }
    }

}
