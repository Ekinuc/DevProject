package kodlama.io.devs.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import kodlama.io.devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.devs.business.requests.CreateProgrammingLanguageRequest;
import kodlama.io.devs.business.requests.UpdateProgrammingLanguageRequest;
import kodlama.io.devs.business.responses.GetAllProgrammingLanguageResponse;
import kodlama.io.devs.core.utilities.mappers.ModelMapperService;
import kodlama.io.devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProgrammingLanguageManager implements ProgrammingLanguageService{
	
	private ProgrammingLanguageRepository programmingLanguageRepository;
	private ModelMapperService moddelMapperService;
	

	@Override
	public List<GetAllProgrammingLanguageResponse> getAll() {
		List<ProgrammingLanguage> programmingLanguages = programmingLanguageRepository.findAll();
		List<GetAllProgrammingLanguageResponse> programmingLanguagesResponse = programmingLanguages.stream()
				.map(programmingLanguage->this.moddelMapperService.forResponse()
						.map(programmingLanguage, GetAllProgrammingLanguageResponse.class))
				.collect(Collectors.toList());
		
		return programmingLanguagesResponse;
	}

	@Override
	public void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) throws Exception {
		if (createProgrammingLanguageRequest.getName().isEmpty() || createProgrammingLanguageRequest.getName().isBlank()) {
			throw new Exception("Name can not be blank");
		}
		
		for (ProgrammingLanguage language : programmingLanguageRepository.findAll()) {
			if (createProgrammingLanguageRequest.getName().equals(language.getName())) {
				throw new Exception("Names can not be same");
			}
			
		}
		ProgrammingLanguage programmingLanguage = this.moddelMapperService
				.forRequest()
				.map(createProgrammingLanguageRequest, ProgrammingLanguage.class);
		
		this.programmingLanguageRepository.save(programmingLanguage);
	}

	@Override
	public void delete(int id) {
		programmingLanguageRepository.deleteById(id);
		
	}

	@Override
	public void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest) {
		ProgrammingLanguage programmingLanguage = this.moddelMapperService.forRequest()
				.map(updateProgrammingLanguageRequest, ProgrammingLanguage.class);
		this.programmingLanguageRepository.save(programmingLanguage);
		
	}

	

}
