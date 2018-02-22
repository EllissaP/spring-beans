package Beans;

public class AccountServiceImpl implements AccountService
{
	private AccountDao accountDao;
	
	public AccountServiceImpl(AccountDao accountDao)
	{
		this.accountDao = accountDao;
	}
	
	public AccountDao getAccountDao()
	{
		return accountDao;
	}
	
	public void setAccountDao(AccountDao accountDao)
	{
		this.accountDao = accountDao;
	}
	
	public void addYear(long id)
	{
		Account employee = accountDao.find(id);
		
		employee.setYearsOfExperience(employee.getYearsOfExperience() + 1);
		
		accountDao.update(employee);
	}
	
	public Account getAccount(long accountId)
	{
		return accountDao.find(accountId);
	}
}
