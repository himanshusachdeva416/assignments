package ess.spring.boot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ess.spring.boot.entity.Coin;

@Repository
public interface CoinRepository extends JpaRepository<Coin, Integer>{
	
	public List<Coin> getByCountry(String country);
	
	public List<Coin> getByYearofminting(String yearofminting);
	
	public List<Coin> getByCurrentvalue(Integer currentvalue);
	
	public List<Coin> getByCountryAndDenomination(String country, Integer denomination);
	
	public List<Coin> getByCountryAndYearofminting(String country, String yearofminting);
	
	public List<Coin> getByCountryAndDenominationAndYearofminting(String country, Integer denomination, String yearofminting);
}
