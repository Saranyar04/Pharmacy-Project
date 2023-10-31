//Package

package Pharmacy;

public class Stock {
    int stock_item_no;
    String stock_name;
    String location;
    int batch_no;

    public void addStock(int stock_item_no, String stock_name, String location, int batch_no){
        this.stock_item_no = stock_item_no;
        this.stock_name = stock_name;
        this.location = location;
        this.batch_no = batch_no;
    }
    public void getStocknumber() {}
}
