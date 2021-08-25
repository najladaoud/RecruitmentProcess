package tn.inetum.RecruitmentProcess.ImplServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.inetum.RecruitmentProcess.domain.BusinessLine;
import tn.inetum.RecruitmentProcess.repository.BusinessLineRepository;
import tn.inetum.RecruitmentProcess.services.IBusinessLineService;

@Service
public class BusinessLineServiceImpl implements IBusinessLineService{
    
	@Autowired
	BusinessLineRepository businessLineRepository; 
	@Override
	public List<BusinessLine> findAllBusinessLine() {
		
		return businessLineRepository.findAll();
	}

	
}
