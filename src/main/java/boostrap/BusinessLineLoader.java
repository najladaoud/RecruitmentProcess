package boostrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import tn.inetum.RecruitmentProcess.domain.BusinessLine;
import tn.inetum.RecruitmentProcess.repository.BusinessLineRepository;

@RequiredArgsConstructor
@Component
public class BusinessLineLoader  implements CommandLineRunner{
	 private final BusinessLineRepository businessLineRepository;

	public BusinessLineLoader(BusinessLineRepository businessLineRepository) {
		super();
		this.businessLineRepository = businessLineRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		if(businessLineRepository.count() ==0)
		{
			loadBusinessLineLoader();
		}
		
	}

	private void loadBusinessLineLoader() {
		// TODO Auto-generated method stub
		BusinessLine bl1=new BusinessLine("Solutions Spécifique");
		BusinessLine bl2=new BusinessLine("Analyse fonctionnelle ");
		BusinessLine bl3=new BusinessLine("Architecture");
		BusinessLine bl4=new BusinessLine("BI, Big Data et Data science");
		businessLineRepository.save(bl1);
		businessLineRepository.save(bl2);
		
		
		
		
	}
	 
	

}
