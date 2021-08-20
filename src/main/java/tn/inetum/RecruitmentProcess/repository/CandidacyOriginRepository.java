package tn.inetum.RecruitmentProcess.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.inetum.RecruitmentProcess.domain.CandidacyOrigin;

@Repository
public interface CandidacyOriginRepository extends JpaRepository<CandidacyOrigin,Long>{

}
