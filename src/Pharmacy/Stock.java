//Package

package Pharmacy;

public class Stock {

    int stockItemNo;
    String stockName;
    String location;
    int batchNo;
    public Stock(int stockItemNo, String stockName, String location, int batchNo){
        this.stockItemNo = stockItemNo;
        this.stockName = stockName;
        this.location = location;
        this.batchNo = batchNo;
    }

    @Override
    public String toString () {
        return "Stock Item No : " + this.stockItemNo +
                ", Stock Name : " + this.stockName +
                ", Location : " + this.location +
                ", Batch Number : " + this.batchNo;
    }
}
