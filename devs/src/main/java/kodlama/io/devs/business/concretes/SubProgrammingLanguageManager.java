package kodlama.io.devs.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import kodlama.io.devs.business.abstracts.SubProgrammingLanguageService;
import kodlama.io.devs.business.requests.CreateSubProgrammingLanguageRequest;
import kodlama.io.devs.business.requests.UpdateSubProgrammingLanguageRequest;
import kodlama.io.devs.business.responses.GetAllSubProgrammingLanguageReponse;
import kodlama.io.devs.core.utilities.mappers.ModelMapperService;
import kodlama.io.devs.dataAccess.abstracts.SubProgrammingLanguageRepository;
import kodlama.io.devs.entities.concretes.SubProgrammingLanguage;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SubProgrammingLanguageManager implements SubProgrammingLanguageService{
	
	private SubProgrammingLanguageRepository subProgrammingLanguageRepository;
	private ModelMapperService modelMapperService;

	@Override
	public List<GetAllSubProgrammingLanguageReponse> getAll() {
		List<SubProgrammingLanguage> subProgrammingLanguages = this.subProgrammingLanguageRepository.findAll();
		List<GetAllSubProgrammingLanguageReponse> subProgrammingLanguageReponse = subProgrammingLanguages.stream()
				.map(subProgrammingLanguage->this.modelMapperService.forResponse()
						.map(subProgrammingLanguage, GetAllSubProgrammingLanguageReponse.class))
				.collect(Collectors.toList());
		
		return subProgrammingLanguageReponse;
	}

	@Override
	public void add(CreateSubProgrammingLanguageRequest createSubProgrammingLanguageRequest) {
		SubProgrammingLanguage subProgrammingLanguage = this.modelMapperService
				.forRequest().map(createSubProgrammingLanguageRequest, SubProgrammingLanguage.class);
		this.subProgrammingLanguageRepository.save(subProgrammingLanguage);
		
	}

	@Override
	public void delete(int id) {
		this.subProgrammingLanguageRepository.deleteById(id);
		
	}

	@Override
	public void update(UpdateSubProgrammingLanguageRequest updateSubProgrammingLanguageRequest) {
		SubProgrammingLanguage subProgrammingLanguage = this.modelMapperService
				.forRequest().map(updateSubProgrammingLanguageRequest, SubProgrammingLanguage.class);
		this.subProgrammingLanguageRepository.save(subProgrammingLanguage);
		
	}

	

}
