package tn.inetum.RecruitmentProcess.services;

import java.util.List;

import tn.inetum.RecruitmentProcess.domain.BusinessLine;

public interface IBusinessLineService {
	
	public List<BusinessLine> findAllBusinessLine();
}
