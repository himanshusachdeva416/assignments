package ess.jdbc.ass;

import org.springframework.jdbc.core.JdbcTemplate;

public class AccountDBImpl implements AccountDao {
	
	String query;
	
	JdbcTemplate jdbctemplate;
	
	
	  public JdbcTemplate getJdbctemplate() { return jdbctemplate; }
	 

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	@Override
	public void getAll(Account account) {
		
		/*
		 * query="insert into account (accId, accName, accBalance) values('"+account.
		 * getAccId()+"', '"+account.getAccName()+"', '"+account.getAccBalance()+"')";
		 * jdbctemplate.update(query);
		 */
		
		
		  query="insert into account (accId, accName, accBalance) values (?,?,?)";
		  Object[] data = {account.getAccId(), account.getAccName(),account.getAccBalance()}; 
		  getJdbctemplate().update(query, data);
		 
	}

}
