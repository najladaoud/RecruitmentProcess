package tn.inetum.RecruitmentProcess.ImplServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.inetum.RecruitmentProcess.domain.Contrat;
import tn.inetum.RecruitmentProcess.repository.ContratRepository;
import tn.inetum.RecruitmentProcess.services.IcontratService;

@Service
public class ContratServiceImpl implements IcontratService {

	
	@Autowired
	ContratRepository contratRepository;
	@Override
	public List<Contrat> findAllcontrat() {
		
		return contratRepository.findAll();
	}

}
