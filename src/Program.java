public class Program {
    public static void main(String[] args){
        Medicine med = new Medicine();
        med.accept();
        med.iNcreaseQuantity(50);
        System.out.println("First method");
        med.printAll();
        System.out.println("Second method");
        med.printCodeAndQuantity();
        System.out.println("Third method");
        med.printOther();
    }



}
