package Beans;

import java.util.List;

import org.springframework.context.annotation.Bean;

public class AccountDaoJdbcImpl implements AccountDao
{

	public void insert(Account account) {
		// TODO Auto-generated method stub
		
	}

	public void update(Account account) {
		// TODO Auto-generated method stub
		
	}

	public void update(List<Account> accounts) {
		// TODO Auto-generated method stub
		
	}

	public void delete(long accountId) {
		// TODO Auto-generated method stub
		
	}

	public Account find(long accountId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Account> find(List<Long> accountIds) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Account> find(String employeeName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Bean
	public AccountDao accountDaoJdbc()
	{
		AccountDaoJdbcImpl bean = new AccountDaoJdbcImpl();
		return bean;
	}
}
