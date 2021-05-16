package ess.spring.boot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ess.spring.boot.entity.Coin;
import ess.spring.boot.service.CoinService;

@RestController
@RequestMapping(value="/coin")
public class CoinController {
	
	@Autowired
	CoinService coinservice;
	
	@GetMapping(value="/getcoin")
	public List<Coin> getCoinController(){
		return coinservice.getDataService();
	}
	
	@PostMapping(value="/insertcoin")
	public int inserCoinController(@RequestBody Coin coin) {
		coinservice.insertCoinService(coin);
		return coin.getDenomination();
	}
	
	@GetMapping(value="/country")
	public List<Coin> getCountryController(String country) {
		System.out.println(coinservice.getBycountry(country));
		return coinservice.getBycountry(country);
	}
	
	@GetMapping(value="/minting")
	public List<Coin> getMintingController(String yearofminting) {
		return coinservice.getByyearofminting(yearofminting);
	}
	
	@GetMapping(value="/current")
	public List<Coin> getCurrentController(Integer currentvalue) {
		return coinservice.getBycurrentvalue(currentvalue);
	}
	
	@GetMapping(value="/countryanddenomination")
	public List<Coin> getCountryAndDenomination(String country, Integer denomination) {
		return coinservice.getByCountryAndDenomination(country, denomination);
	}
	
	@GetMapping(value="/countryandyearofminting")
	public List<Coin> getCountryAndYearOfMintin(String country, String yearofminting) {
		return coinservice.getCountryAndYearofminting(country, yearofminting);
	}
	
	@GetMapping(value="/countryanddenominationandyearofminting")
	public List<Coin> getCountryAndDenominationAndYearOfMintin(String country, Integer denomination, String yearofminting) {
		return coinservice.getCountryAndDenominationAndYearofminting(country, denomination, yearofminting);
	}	 
}
