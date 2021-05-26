package ess.springboot.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoinController {

	@Autowired
	CoinService coinservice;

	/*
	 * Insert coin data
	 * 
	 * @PostMapping(value="/insertcoin") public void insertCoin(@RequestBody Coin
	 * coin){ coinservice.insertCoinService(coin); }
	 */

	/* Show coin data */
	@RequestMapping(value="/coin", method=RequestMethod.GET)
	public List<Coin> getCoinController() {
		return coinservice.getCoinService();
	}
}
