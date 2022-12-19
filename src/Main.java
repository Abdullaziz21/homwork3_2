public class Main {
    public static void main(String[] args) {
        BankAccount mbank = new BankAccount();
        mbank.deposit(20000.00);
        while (true) {
            try {
                mbank.withDraw(6000.00);
            } catch (LimitException e) {
                try {
                    mbank.withDraw((Double) e.getRemainingAmount());
                } catch (LimitException ex) {
                    ex.printStackTrace();
                }break;
            }
        }

    }
}