package kodlama.io.devs.business.abstracts;

import java.util.List;

import kodlama.io.devs.business.requests.CreateSubProgrammingLanguageRequest;
import kodlama.io.devs.business.requests.UpdateSubProgrammingLanguageRequest;
import kodlama.io.devs.business.responses.GetAllSubProgrammingLanguageReponse;

public interface SubProgrammingLanguageService {
	List<GetAllSubProgrammingLanguageReponse> getAll();
	void add(CreateSubProgrammingLanguageRequest createSubProgrammingLanguageRequest);
	void delete(int id);
	void update(UpdateSubProgrammingLanguageRequest updateSubProgrammingLanguageRequest);

}
