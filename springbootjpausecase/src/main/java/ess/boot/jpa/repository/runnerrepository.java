package ess.boot.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ess.boot.jpa.entitty.Runner;

@Repository
public interface runnerrepository extends JpaRepository<Runner, Integer> {

}
