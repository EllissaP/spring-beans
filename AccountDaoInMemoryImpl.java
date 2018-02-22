package Beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountDaoInMemoryImpl implements AccountDao
{
	private Map<Long,Account>accountsMap = new HashMap<Long,Account>();
	{
		Account account1 = new Account(1L, "Bill", 2);
		Account account2 = new Account(2L, "Nancy", 8);
		Account account3 = new Account(3L, "Steven", 1);
		
		accountsMap.put(account1.getId(), account1);
		accountsMap.put(account2.getId(), account2);	
		accountsMap.put(account3.getId(), account3);
	}
	
	public void insert(Account account)
	{
		accountsMap.put(account.getId(),account);
	}
	
	public void update(Account account)
	{
		accountsMap.put(account.getId(),account);
	}
	
	public void update(List<Account>accounts)
	{
		for(Account account:accounts)
		{
			update(account);
		}
	}
	
	public void delete(long accountId)
	{
		accountsMap.remove(accountId);
	}
	
	public Account find(long accountId)
	{
		return accountsMap.get(accountId);
	}
	
	public List<Account>find(List<Long>accountIds)
	{
		List<Account>accounts = new ArrayList<Account>();
		for(Long id: accountIds)
		{
			accounts.add(accountsMap.get(id));
		}
		return accounts;
	}
	
	public List<Account>find(String ownerName)
	{
		List<Account>accounts = new ArrayList<Account>();
		for(Account account: accountsMap.values()) 
		{
			if(ownerName.equals(account.getEmployeeName())) 
			{
				accounts.add(account);
			}
		}
		return accounts;
	}
}
