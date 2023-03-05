package kodlama.io.devs.business.responses;

import kodlama.io.devs.entities.concretes.ProgrammingLanguage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllSubProgrammingLanguageReponse {
	private int id;
	private String Name;
	private ProgrammingLanguage programmingLanguage;

}
