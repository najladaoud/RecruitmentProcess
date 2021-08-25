package tn.inetum.RecruitmentProcess.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.inetum.RecruitmentProcess.ImplServices.BusinessLineServiceImpl;
import tn.inetum.RecruitmentProcess.domain.BusinessLine;

@RestController
public class BusinessLineController {

	@Autowired
	private BusinessLineServiceImpl businessLineServiceImpl;
 
	@GetMapping("/businessLine")
	public List<BusinessLine> getBusinessLine(){
		return businessLineServiceImpl.findAllBusinessLine();
	}

	

}
