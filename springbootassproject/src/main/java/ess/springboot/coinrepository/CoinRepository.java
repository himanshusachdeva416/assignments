package ess.springboot.coinrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ess.springboot.entity.Coin;

@Repository
public interface CoinRepository extends JpaRepository<Coin, String>  {

}
