package ess.spring.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ess.spring.boot.entity.Developer;

@Repository
public interface DeveloperRepository extends JpaRepository<Developer, Integer> {

}
