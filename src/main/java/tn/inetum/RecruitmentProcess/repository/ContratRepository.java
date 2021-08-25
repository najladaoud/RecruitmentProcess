package tn.inetum.RecruitmentProcess.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.inetum.RecruitmentProcess.domain.Contrat;

@Repository
public interface ContratRepository extends JpaRepository<Contrat,Long>{

}
