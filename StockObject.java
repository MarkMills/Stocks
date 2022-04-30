//////////////////////////////////////////////////////////////////////////////
//MarkAlan Mills
// CSC 160 Computer Science I, section 680
// Apr 9, 2022
// Homework 9 - Programming Exercise 9.2 (page 363) Stock Object
//////////////////////////////////////////////////////////////////////////////
package Stocks;
public class StockObject {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;
    public void Stock(String symbol, String name, double previousClosingPrice, double currentPrice) {
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
        System.out.println("-----\n$"+this.symbol+"\n"+this.name+"\nprevious closing price: "+this.previousClosingPrice+"\nCurrent price: "+this.currentPrice);
    }
    public double getChangePercent() {
        double changed = ((this.currentPrice - this.previousClosingPrice) / (this.previousClosingPrice) * 100);
        return changed;
    }
}

