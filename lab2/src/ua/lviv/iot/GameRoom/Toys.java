package ua.lviv.iot.GameRoom;

public class Toys
{
    private int price;
    private int amount;
    private String size;

    protected Toys(int price, int amount, String size){
        this.price = price;
        this.amount = amount;
        this.size = size;
    }
    protected Toys(){}

    protected void getSize() {
        System.out.println(size);
    }

    protected void setSize(String size) {
        this.size = size;
    }

    protected void getPrice() {
        System.out.println(price);
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

    public void getValues(){
        System.out.println(getClass().getName() +" " + "Amount: " + this.amount  + ". Prise: " + this.price + " grn" + ". Size : " + this.size );
    }


}


