package kodlama.io.devs.business.requests;

import kodlama.io.devs.entities.concretes.ProgrammingLanguage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateSubProgrammingLanguageRequest {
	private int id;
	private String name;
	private ProgrammingLanguage programmingLanguage;

}
