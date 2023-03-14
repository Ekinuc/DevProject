package kodlama.io.devs.business.rules;

import org.springframework.stereotype.Service;

import kodlama.io.devs.core.utilities.exceptions.BusinessException;
import kodlama.io.devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ProgrammingLanguageBusinessRules {
	private ProgrammingLanguageRepository programmingLanguageRepository;
	
	public void checkIfProgrammingLanguageNameExists(String name) {
		if (programmingLanguageRepository.existsByName(name)) {
			throw new BusinessException("Brand name already exists");
		}
	}

}
