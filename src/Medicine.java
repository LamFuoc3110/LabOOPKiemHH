import java.sql.SQLOutput;
import java.util.Scanner;

public class Medicine {
    private String code;
    private String name;
    private String manuFacturer;
    private Double price;
    private Integer quantity;
    private String date;
    private String expDate;
    private Integer batchNumber;

    public Medicine(String code, String name, String manuFacturer, Double price, Integer quantity, String date, String expDate, Integer batchNumber) {
        this.code = code;
        this.name = name;
        this.manuFacturer = manuFacturer;
        this.price = price;
        this.quantity = quantity;
        this.date = date;
        this.expDate = expDate;
        this.batchNumber = batchNumber;
    }
    public Medicine(){
        code = null;
        name = null;
        manuFacturer = null;
        price = 0.0;
        quantity = 0;
        date = null;
        expDate = null;
        batchNumber = 0;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManuFacturer() {
        return manuFacturer;
    }

    public void setManuFacturer(String manuFacturer) {
        this.manuFacturer = manuFacturer;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public Integer getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(Integer batchNumber) {
        this.batchNumber = batchNumber;
    }

    public void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter medicine code: ");
        code = sc.nextLine();
        System.out.print("Enter medicine name: ");
         name = sc.nextLine();
        System.out.print("Enter medicine manufacturer: ");
         manuFacturer = sc.nextLine();
        System.out.print("Enter medicine price: ");
         price = sc.nextDouble();
        System.out.print("Enter medicine quantity: ");
         quantity = sc.nextInt();
        System.out.print("Enter medicine date: "+sc.nextLine());
         date = sc.nextLine();
        System.out.print("Enter medicine expire date: ");
         expDate = sc.nextLine();
        System.out.print("Enter medicine batch number: ");
         batchNumber = sc.nextInt();
    }


    public String printAll() {
        return "Medicine{" +
                "Medicine Code: " + code + '\'' +
                "Medicine Name: " + name + '\'' +
                "Manufacturer Name: " + manuFacturer + '\'' +
                "The unit Price: " + price +
                "The quantity on hand : " + quantity +
                "The manufactured date: " + date + '\'' +
                "The expiry date: " + expDate + '\'' +
                "The batch number: " + batchNumber +
                '}';
    }
    public void iNcreaseQuantity(int number){
        quantity += number;
    }
    public void printCodeAndQuantity(){
        System.out.println("Medicine Code: "+getCode());
        System.out.println("Medicine Quantity: "+getQuantity());
    }
    public void printOther(){
        System.out.println("The medicine code: "+getCode());
        System.out.println("The medicine name: "+getName());
        System.out.println("The expiry date: "+getExpDate());
        System.out.println("The manufactured date: "+getDate());
    }

}
