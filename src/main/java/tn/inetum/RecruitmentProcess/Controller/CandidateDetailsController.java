package tn.inetum.RecruitmentProcess.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidate")
public class CandidateDetailsController {

	@Value("#{'${server.family.situation}'.split(',')}")
	private List<String> Situationfamiliale;
	
	@GetMapping("/familySituation")
	public List<String> getFamilySituation(){
		return Situationfamiliale;
	}
}
