public class Product
{
    String Name;
    int price;
    int quantity;
    public Product()
    {
        Name="";
        price=0;
        quantity=0;
    }

    public Product(String Name, int price, int quantity) 
    {
        this.Name = Name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
