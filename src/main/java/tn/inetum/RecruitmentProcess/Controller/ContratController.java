package tn.inetum.RecruitmentProcess.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.inetum.RecruitmentProcess.ImplServices.ContratServiceImpl;

import tn.inetum.RecruitmentProcess.domain.Contrat;


@RestController
public class ContratController {

	 @Autowired
	 ContratServiceImpl contratServiceImpl;
	 
	 @GetMapping("/Contrat")
		public List<Contrat> getContrat(){
			return  contratServiceImpl.findAllcontrat();
		}

}
