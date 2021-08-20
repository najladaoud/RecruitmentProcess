package tn.inetum.RecruitmentProcess.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.inetum.RecruitmentProcess.domain.MeetingPreparation;

@Repository
public interface MeetingPreparationRepository extends JpaRepository<MeetingPreparation, Long> {

}
