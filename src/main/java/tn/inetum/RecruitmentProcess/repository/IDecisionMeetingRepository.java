package tn.inetum.RecruitmentProcess.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.inetum.RecruitmentProcess.domain.DecisionMeeting;

@Repository
public interface IDecisionMeetingRepository  extends JpaRepository<DecisionMeeting,Long>{

}
