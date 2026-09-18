import java.util.ArrayList;
import java.util.Scanner;

class Stock{
    String symbol;
    double price;

    Stock(String symbol, double price){
        this.symbol = symbol;
        this.price = price;
    }
    public void display(){
        System.out.println(symbol + " - $" + price);
    }
}

public class Main {
    static void main(String[] args) {
        ArrayList<Stock> stocks = new ArrayList<>();

        stocks.add(new Stock("MSFT", 510.20));
        stocks.add(new Stock("AAPL", 230.50));
        stocks.add(new Stock("NVDA", 178.30));

        Scanner input = new Scanner(System.in);
        System.out.println("Enter symbol: ");
        String symbol = input.nextLine();

        System.out.println("Stock Pulse");
        System.out.println("---------------");
        for (Stock stock : stocks) {
            if (symbol.equals(stock.symbol)) {
                stock.display();
                return;
            }
        }
        System.out.println("Stock not found :(");
    }
}
