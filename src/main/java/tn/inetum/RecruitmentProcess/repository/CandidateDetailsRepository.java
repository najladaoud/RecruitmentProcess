package tn.inetum.RecruitmentProcess.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.inetum.RecruitmentProcess.domain.CandidateDetails;

@Repository
public interface CandidateDetailsRepository extends JpaRepository<CandidateDetails,Long> {

}
