package Dto;

public class InstallAccountDto extends AccountDto 
{
	private int period;
	private int amount;
	public InstallAccountDto()
	{
		super();
	}
	public InstallAccountDto(int accountSeq, String accountNumber, int balance, int userSeq
							,int period, int amount)
	{
		super(accountSeq, accountNumber, balance, userSeq);
		this.period = period;
		this.amount = amount;
				
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("InstallAccountDto [period=");
		builder.append(super.toString());
		builder.append(period);
		builder.append(", amount=");
		builder.append(amount);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
