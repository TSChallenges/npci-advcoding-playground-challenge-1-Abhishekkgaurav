class StockPortfolio {
    // TODO: Add necessary fields for stock details
    private String symbol;
    private int quantity;
    private double buyingPrice;
    private double currentPrice;
    private double highestPrice;

    // TODO: Initialize stock details
    public StockPortfolio(String symbol, int quantity, double buyingPrice) {
        // TODO
        this.symbol=symbol;
        this.currentPrice=buyingPrice;
        this.buyingPrice=buyingPrice;
        this.quantity=quantity;
        this.highestPrice=buyingPrice;
    }

    // TODO: Update current market price
    public void updatePrice(double newPrice) {
        // TODO
        if(newPrice>0){
        this.currentPrice=newPrice;
        if(newPrice-this.highestPrice>0){
            this.highestPrice=newPrice;
        }
    }
    }

    // TODO: Calculate total profit or loss
    public double calculateProfit() {
        // TODO
        double profitOrLoss= (this.currentPrice-this.buyingPrice)*quantity;
        return profitOrLoss;
    }

    // TODO: Calculate current total value of holdings
    public double getCurrentValue() {
        // TODO

        return (this.currentPrice*quantity);
    }
}
