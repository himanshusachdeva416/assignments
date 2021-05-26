package ess.boot.jpa.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ess.boot.jpa.entitty.City;

@Repository
public interface cityrepository extends JpaRepository<City, Integer>{
	
	@Query(value="select run.runname, run.rundistance, city.cityname, city.cityregion from run Inner JOIN city on city.cityid = run.cityid", nativeQuery = true)
	public Collection<City> findAllByCityAndRunner();
	
	@Query(value="Select sum(rundistance) from run where runname=?", nativeQuery = true)
	public List<Integer> findByRunname(String runname);

}
