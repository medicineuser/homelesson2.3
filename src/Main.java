// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BankAccount wallet1 = new BankAccount(0);
        wallet1.deposit(15000);
        System.out.println( "Остаток денег " + wallet1.getAmount());

        while (true){
            try {
                wallet1.withDraw(6000);
                System.out.println("Остаток на счету: "+ wallet1.getAmount());
            }catch (LimitException le){
                System.out.println(le.getMessage() + le.getRemainingAmount());
                break;
            }
        }
    }
}