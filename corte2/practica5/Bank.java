public class Bank {
  private CheckingAccount accountOne;
  private CheckingAccount accountTwo;
  private CheckingAccount accountThree;
  private CheckingAccount accountFour;
  private CheckingAccount accountFive;

  public Bank() {
    accountOne = new CheckingAccount("Zeus", 100, "1");
    accountTwo = new CheckingAccount("Hades", 200, "2");
    accountThree = new CheckingAccount("Poseidon", 300, "3");
    accountFour = new CheckingAccount("Athena", 400, "4");
    accountFive = new CheckingAccount("Ares", 500, "5");
  }

  public static void main(String[] args) {
    Bank bankOfGods = new Bank();

    // Mostrar balances iniciales
    System.out.println("Zeus: " + bankOfGods.accountOne.getBalance());
    System.out.println("Hades: " + bankOfGods.accountTwo.getBalance());
    System.out.println("Poseidon: " + bankOfGods.accountThree.getBalance());
    System.out.println("Athena: " + bankOfGods.accountFour.getBalance());
    System.out.println("Ares: " + bankOfGods.accountFive.getBalance());

    // Modificar balance de Zeus
    bankOfGods.accountOne.setBalance(5000);

    System.out.println("\nNuevo balance de Zeus:");
    System.out.println("Zeus: " + bankOfGods.accountOne.getBalance());
  }
}
