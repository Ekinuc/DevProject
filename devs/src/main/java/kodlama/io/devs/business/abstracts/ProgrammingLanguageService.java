package kodlama.io.devs.business.abstracts;

import java.util.List;

import kodlama.io.devs.business.requests.CreateProgrammingLanguageRequest;
import kodlama.io.devs.business.requests.UpdateProgrammingLanguageRequest;
import kodlama.io.devs.business.responses.GetAllProgrammingLanguageResponse;

public interface ProgrammingLanguageService {
	List<GetAllProgrammingLanguageResponse> getAll();
	void add(CreateProgrammingLanguageRequest CreateProgrammingLanguage) throws Exception  ;
	void delete(int id);
	void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest);

}
