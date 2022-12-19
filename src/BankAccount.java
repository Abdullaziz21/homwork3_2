public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum){
        amount+=sum;
        System.out.println("Вы внесли в счет: "+ sum);
    }
    public void withDraw(Double sum) throws LimitException{
        if (sum>amount){
            throw new LimitException("Ошибка...У вас на счету недостаточно средств для запрашиваемой вами суммы!" +
                    "У вас на счету: ", amount);
        }else {
            System.out.println("Вы можете снять со счета: "+ sum);
            amount-= sum;
            System.out.println("Вы сняли со счета: " + sum);
        }
    }
}