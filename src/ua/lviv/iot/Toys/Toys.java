package ua.lviv.iot.Toys;

public abstract class Toys {
    protected int price;
    protected int amount;
    protected String size;

    protected Toys(int price, int amount, String size) {
        this.price = price;
        this.amount = amount;
        this.size = size;
    }

    protected Toys() {
    }

    public String getSize() {
        return size;
    }

    protected void setSize(String size) {
        this.size = size;
    }

    public int getPrice() {
        return this.price;
    }

    protected void setPrice(int price) {
        this.price = price;
    }

    protected void getAmount() {
        System.out.println(amount);
    }

    protected void setAmount(int amount) {
        this.amount = amount;
    }

//    public Toys sorted_toys_by_price(List<Toys> toy, ) {
//        for(List toy : toy) {
//
//        }
//
//    }


    public void getValues() {
        System.out.println(" " + "Amount: " + this.amount + ". Prise: " + this.price + " grn" + ". Size : " + this.size);
    }


}

