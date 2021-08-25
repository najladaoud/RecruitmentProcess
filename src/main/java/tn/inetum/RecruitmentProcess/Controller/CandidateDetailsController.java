package tn.inetum.RecruitmentProcess.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import tn.inetum.RecruitmentProcess.ImplServices.CandidateDetailsServiceImpl;
import tn.inetum.RecruitmentProcess.ImplServices.ParamService;
import tn.inetum.RecruitmentProcess.domain.CandidateDetails;

@RestController
@RequestMapping("/candidate")
public class CandidateDetailsController {

	@Autowired
	 private ParamService paramService;
	@Autowired
	CandidateDetailsServiceImpl candidateDetailsServiceImpl;

	
	
	@GetMapping("/familySituation")
	public List<String> getFamily(){
		return paramService.getFamilySituationDeCandidat();
	}
	@GetMapping("/Diplome")
	public List<String> getDiplome(){
		return paramService.getDiplomeDeCandidat();
	}
		
	@PostMapping("/AddCandidat")
	@ResponseBody
	public String ajouterCandidat(@RequestBody CandidateDetails candidateDetails){
		return candidateDetailsServiceImpl.ajouterCandidat(candidateDetails);
	}
		
	@GetMapping("/getCandById/{id}")
	@ResponseBody
    public CandidateDetails getCandidaById(@PathVariable("id") long id){
		return candidateDetailsServiceImpl.getCandidatById(id);
		}
	
	
	@GetMapping("/getAllCand")
	@ResponseBody
    public List<CandidateDetails> getAllCandidat(){
		return candidateDetailsServiceImpl.getAllCandidat();
		}
	
	@PostMapping("/AffecterCM/{MId}/{CId}")
	@ResponseBody
	public String affecterCandidatAEntretien(@PathVariable("CId") long CId,@PathVariable("MId")long MId)
	{ candidateDetailsServiceImpl.affecterCandidatAEntretien(CId, MId);
		return "candidat est affecter ";
	}
	
	
	
	//@Value("#{'${param.familysituation}'.split(',')}")
		//private List<String> Situationfamiliale;	


}

