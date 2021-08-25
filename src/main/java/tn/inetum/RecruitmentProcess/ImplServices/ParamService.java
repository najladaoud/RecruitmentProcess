package tn.inetum.RecruitmentProcess.ImplServices;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import tn.inetum.RecruitmentProcess.Config;

@Service
@AllArgsConstructor
public class ParamService {

	private final Config properties;
	
	@Autowired
	public  ParamService(Config properties){
		this.properties=properties;
	}
	
	
	
	public List<String> getFamilySituationDeCandidat(){
		return properties.getFamilysituation();
	}
	
	public List<String> getDiplomeDeCandidat(){
		return properties.getDiplome();
	}
	public List<String> getEtatCandidature(){
		return properties.getEtat();
	}
	
	public List<String> getNiveau(){
		return properties.getNiveau();
	}
	public List<String> getNatureBesoin(){
		return properties.getNatureBesoin();
	}
	
	
	
	
@PostConstruct
public void openConnection(){
	
	System.out.println(properties);
}
}
