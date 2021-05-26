package ess.spring.boot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ess.springboot.coinservice.CoinService;
import ess.springboot.entity.Coin;

@RestController
@RequestMapping(value="/coincollection")
public class CoinController {
	
	@Autowired
	CoinService coinservice;
	
	/* Insert coin data */
	@PostMapping(value="/insertcoin")
	public void insertCoin(@RequestBody Coin coin){
		coinservice.insertCoinService(coin);
	}
	
	/* Show coin data */
	@GetMapping(value="/getcoindata")
	public List<Coin> getCoinController(){
		return coinservice.getCoinService();
	}

}
