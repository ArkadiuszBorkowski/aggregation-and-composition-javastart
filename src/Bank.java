public class Bank {
    public static void main(String[] args) {
     Person person1 = new Person();
     person1.firstName = "Jan";
     person1.lastName = "Kowalski";
     person1.pesel = "0212414211221";

     //tworzymy adres

     Address address1 = new Address();
     address1.city = "Warszawa";
     address1.postalCode = "20-222";
     address1.street = "Woronicza";
     address1.home = 4;
     address1.flat = 25;

     person1.registeredAddress = address1;
     person1.lastName = address1;

     BankAccount account1 = new BankAccount();
     account1.owner = person1;
     account1.balance = 10_000;

     //druga osoba
     Person person2 = new Person();
     person2.firstName = "Marta";
     person2.lastName = "Kowalska";
     person2.pesel = "24552151252";
     person2.livingAddress = address1;
     person2.registeredAddress = new Address();
     


     Credit credit1 = new Credit();
     credit1.borrower = person1;
     credit1.cashBorrowed = 2000;
     credit1.interestRate = 0.05;
     credit1.termMounths = 12;

     System.out.println("Osoba:");
     System.out.println(person1.firstName + " " + person1.lastName + " " + person1.pesel);
     System.out.println("posiada konto bankowe z kwotą: " + account1.balance);
     System.out.println("oraz kredyt na kwotę: " + credit1.cashBorrowed);
    }
}

