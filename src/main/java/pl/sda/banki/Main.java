package pl.sda.banki;

public class Main {

    public static void main(String[] args) {
	User user1 = new User("Adam", "Stępień", 26);
	User user2 = new User("Dominika", "Cieś", 21);
	User user3 = new User("Daisy", "Dog", 12);
	User user4 = new User("Roman", "Romański", 44);

	BankAccount b1 = new BankAccount("BankDlaBogatych", 1, 5555, 6555);
	BankAccount b2 = new BankAccount("BankNowoczesny", 2, 3242, 2523);
	BankAccount b3 = new BankAccount("Bank", 3, 1005, 23);
	BankAccount b4 = new BankAccount("BigBank", 4, 3528, 624);

	user1.setBankAccount(b1);
	user2.setBankAccount(b2);
	user3.setBankAccount(b3);
	user4.setBankAccount(b4);

	user1.print();
	user2.print();
	user3.print();
	user4.print();
    }
}
