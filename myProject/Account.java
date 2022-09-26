public class Account {
	public static final int DEFAULT_BALANCE = 0;
	private String ID;
	private String Name;
	private int Balance;

	public Account(){
		this.Balance = DEFAULT_BALANCE;
	}
	
	public Account(String ID, String Name, int Balance) {
		this.ID= ID;
		this.Name= Name;
		this.Balance = Balance;
	}
	
	public String getID(){
		return this.ID;
	}
	
	public void setID(String ID) {
		this.ID = ID;
	}
	
	public String getName(){
		return this.Name;
	}
	
	public void setName(String Name) {
		this.Name = Name;
	}	
	
	public int getBalance(){
		return this.Balance;
	}
	
	public void setBalance(int Balance) {
		this.Balance = Balance;
	}
	
	public int credit(int amount) {
		return Balance = Balance + amount;
	}
	
	public int debit(int amount) {
		if (amount <= Balance) {
			Balance = Balance - amount;
		} else {
			System.out.println("Amount exceeded balance");
		}
		return Balance;
	}
	
	public int transferTo(Account another, int amount) {
		  if  (amount <= Balance) {
		  this.Balance -= amount;      // "this" instance of Account class
		  another.Balance += amount;
		  } else {
				System.out.println("Amount exceeded balance");
		  }
		  return Balance;
    }
	
	public String toString() {
	      return "Account[id=" + ID+ ",name=" +Name+ ",balance=" +Balance+ "]";
	}
}
