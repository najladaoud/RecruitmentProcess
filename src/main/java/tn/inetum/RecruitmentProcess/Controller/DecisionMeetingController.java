package tn.inetum.RecruitmentProcess.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.inetum.RecruitmentProcess.ImplServices.DecisionMeetingServiceImpl;
import tn.inetum.RecruitmentProcess.ImplServices.ParamService;
import tn.inetum.RecruitmentProcess.domain.DecisionMeeting;


@RestController
public class DecisionMeetingController {

	
	@Autowired
	 private ParamService paramService;
	@Autowired 
	private DecisionMeetingServiceImpl decisionMeetingServiceImpl ;
	
	
	
	
	
	@PostMapping("/AddDecision")
	@ResponseBody
	public String ajouterLaDecision(@RequestBody DecisionMeeting decisionMeeting){
		return decisionMeetingServiceImpl.ajouterDecisionMeeting(decisionMeeting);
	}
	@GetMapping("/getDecisionById/{id}")
	public DecisionMeeting getDecisionMeetingById(@PathVariable("id") long id){
		return decisionMeetingServiceImpl.getDecisionMeetingById(id);
		}
	
	
	@GetMapping("/getAllDecision")
	@ResponseBody
    public List<DecisionMeeting> getAllDecision(){
		return decisionMeetingServiceImpl.getAllDecisionMeeting();
		}
	
	@PostMapping("/AffecterDecision/{CId}/{DId}")
	@ResponseBody
	public String affecterDecisionACandidat(@PathVariable("CId") long CId,@PathVariable("DId")long DId)
	{ decisionMeetingServiceImpl.affecterDecisionACandidat(CId, DId);
		return "Décision est affecter ";
	}
		
	
	@GetMapping("/NatureBesoin")
	public List<String> getNatureBesoin(){
		return paramService.getNatureBesoin();
	}
	
	@GetMapping("/Etat")
	public List<String> getEtatCandidature(){
		return paramService.getEtatCandidature();
	}
	
	@GetMapping("/Niveau")
	public List<String> getNiveau(){
		return paramService.getNiveau();
	}
	
}
