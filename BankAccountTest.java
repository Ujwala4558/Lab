public class BankAccountTest

{

   public static void main(String[] args)

   {

      SavingsAccount mySavings

         = new SavingsAccount(0.5);

 

      CheckingAccount myChecking

         = new CheckingAccount(0);

 

      test(mySavings);

      test(myChecking);

   }

 

   public static void test(BankAccount account)

   {

      Random generator = new Random();

 

      for (int i = 1; i <= 5; i++)

      {

         double amount = generator.nextInt(1000);

         if (generator.nextBoolean())

            account.deposit(amount);

         else

            account.withdraw(amount);

      }

 

      System.out.println("Before endOfMonth, the balance is $"

         + account.getBalance());

 

      account.endOfMonth();

      System.out.println("After endOfMonth, the balance is $"

         + account.getBalance());

     

   }

}