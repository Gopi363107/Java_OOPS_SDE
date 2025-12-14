
/* PRACTICE TASK (IMPORTANT)
    Create a class Product with:

        private productId

        private productName

        private price

    Rules:

        price cannot be negative

        create getter & setter

        method displayProduct()

 */
public class encapsulation {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setProductName("Yeppiee Noodeles ");
        p1.setProductId("HD74D");
        p1.setPrice(973.87);
        p1.getProductId();
        p1.getProductName();
        p1.getPrice();

        Product p2 = new Product();
        p2.setProductName("Maggie Noodeles ");
        p2.setProductId("DH373");
        p2.setPrice(680.34);
        p2.getProductId();
        p2.getProductName();
        p2.getPrice();

        Product p3 = new Product();
        p3.setProductName(" Vennila ice cream ");
        p3.setProductId("GD73S");
        p3.setPrice(520.87);
        p3.getProductId();
        p3.getProductName();
        p3.getPrice();


        p1.displayProduct();
        p2.displayProduct();
        p3.displayProduct();

    }
}

class Product{
    //Attributes

    private String productId;
    private String productName;
    private double price;

    public void setProductId(String productId){
        this.productId = productId;
    }

    public String getProductId(){
        return productId;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    public String getProductName(){
        return productName;
    }

    public void setPrice(double price){
        if(price >= 0){
            this.price = price;
        }
        else{
            System.out.println("price cannot be negative.");
        }
    }

    public double getPrice(){
        return price;
    }

    public void displayProduct(){
        System.out.println("_______________Product________________");
        System.out.println("Product Name : "+productName);
        System.out.println("productId :  "+productId);
        System.out.println("price : "+ price);
        System.out.println("______________________________________");
    }

    
}


