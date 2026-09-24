package Exception;

// 1. You must explicitly define your custom exception and extend Exception
class AccountNotException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AccountNotException(String message) {
        super(message);
    }
}

class Account {
    public String accno = "100";
    
    public void checkAccount(String accno) {
        try {
            if (accno.equals(this.accno)) {
                System.out.println("ACCOUNT EXISTS");
            } else {
                // 2. Pass a meaningful error message to your exception
                AccountNotException ac = new AccountNotException("Account number " + accno + " not found!");
                throw ac;
            }
        } catch (AccountNotException ae) {
            ae.printStackTrace();
        }
    }
}

public class CustomException {
    public static void main(String[] args) {
        Account acn = new Account();
        acn.checkAccount("101"); // This will now properly throw and catch the exception
    }
}
