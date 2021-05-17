package ess.spring.boot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import ess.spring.boot.entity.Coin;
import ess.spring.boot.repository.CoinRepository;

@Service()
public class CoinService {
	
	@Autowired
	CoinRepository coinrepo;
	
	public List<Coin> getDataService(){
		List<Coin> list = coinrepo.findAll(); 
		return list;
	}
	
	public void insertCoinService(Coin coin) {
		System.out.println("inside the insert coin..!!");
		coinrepo.save(coin);
	}

	
	
	public List<String> getByCountry(String country){
	   return coinrepo.findAllByCountry(country);
	 }
	 
	
	public List<Coin> getByyearofminting(String yearofminting){
		List<Coin> result=coinrepo.getByYearofminting(yearofminting);
		return result;
	}
	
	public List<Coin> getBycurrentvalue(Integer currentvalue){
		List<Coin> result=coinrepo.getByCurrentvalue(currentvalue);
		return result;
	}
	
	public List<Coin> getByCountryAndDenomination(String country, Integer denomination){
		List<Coin> result=coinrepo.getByCountryAndDenomination(country, denomination);
		return result;
	}
	
	public List<Coin> getCountryAndYearofminting(String country, String yearofminting){
		return coinrepo.getByCountryAndYearofminting(country, yearofminting);
	}
	
	public List<Coin> getCountryAndDenominationAndYearofminting(String country, Integer denommination, String yearofminting){
		return coinrepo.getByCountryAndDenominationAndYearofminting(country, denommination, yearofminting);
	}

}
