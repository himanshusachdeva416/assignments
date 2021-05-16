package ess.spring.boot.coininterface;

import java.util.List;
import java.util.Optional;

import ess.spring.boot.entity.Coin;

public interface CoinRepo {
	
	public List<Coin> getBycountry(String country);
	
	public Optional<Coin> getYearofmintingById(int denomination);
	
	public void getCurrentvalueById();

}
