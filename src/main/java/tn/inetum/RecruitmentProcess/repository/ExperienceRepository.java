package tn.inetum.RecruitmentProcess.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.inetum.RecruitmentProcess.domain.Experience;

@Repository
public interface ExperienceRepository  extends JpaRepository<Experience,Long> {

}
