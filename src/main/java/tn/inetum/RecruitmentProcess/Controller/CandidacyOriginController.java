package tn.inetum.RecruitmentProcess.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.inetum.RecruitmentProcess.ImplServices.CandidacyOriginServiceImpl;
import tn.inetum.RecruitmentProcess.domain.CandidacyOrigin;


@RestController
public class CandidacyOriginController {

	@Autowired
	private CandidacyOriginServiceImpl candidacyOriginServiceImpl;
	
	@GetMapping("/candidacyOrigin")
	public List<CandidacyOrigin> getCandidacyOrigin(){
		return candidacyOriginServiceImpl.findAllCandidacyOrigin();
	}

}
