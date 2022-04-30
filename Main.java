//////////////////////////////////////////////////////////////////////////////
//MarkAlan Mills
// CSC 160 Computer Science I, section 680
// Apr 9, 2022
// Homework 9 - Programming Exercise 9.2 (page 363) Stock Object
//////////////////////////////////////////////////////////////////////////////
package Stocks;

public class Main {
    public static void main(String[] args) {
        StockObject ORCLStock = new StockObject();
        ORCLStock.Stock("ORCL", "Oracle Corporation", 34.5, 34.35);
        StockObject YAHOOStock = new StockObject();
        YAHOOStock.Stock("YAHOO", "Yahoo", 34.5, 34.35);
        System.out.println("The percent change is "+ ORCLStock.getChangePercent() + "%");
    }
}
