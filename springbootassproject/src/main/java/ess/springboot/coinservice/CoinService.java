package ess.springboot.coinservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ess.springboot.coinrepository.CoinRepository;
import ess.springboot.entity.Coin;

@Service
public class CoinService {
	
	@Autowired
	CoinRepository coinrepo;
	
	/* Insert coin data */
	public void insertCoinService(Coin coin) {
		coinrepo.save(coin);
	}
	
	/* Get coin data */
	public List<Coin> getCoinService(){
		List<Coin> coindata=coinrepo.findAll();
		return coindata;
	}

}
