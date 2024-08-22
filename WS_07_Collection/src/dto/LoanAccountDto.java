package dto;

public class LoanAccountDto extends AccountDto 
{
	private String mortgage;
	
	public LoanAccountDto() {}

	public LoanAccountDto(int accountSeq, String accountNumber, int balance, int userSeq, String mortgage)
	{
		super(accountSeq, accountNumber, balance, userSeq);
		this.mortgage = mortgage;
	}

	public String getMortgage() {
		return mortgage;
	}

	public void setMortgage(String mortgage) {
		this.mortgage = mortgage;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" | ");
		builder.append(mortgage);
		return builder.toString();
	}
	
	
	
	
	
	
	
}
