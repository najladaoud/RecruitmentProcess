package tn.inetum.RecruitmentProcess.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.inetum.RecruitmentProcess.domain.ProfilSkills;

@Repository
public interface ProfilSkillsRepository extends JpaRepository<ProfilSkills,Long> {
	

}
