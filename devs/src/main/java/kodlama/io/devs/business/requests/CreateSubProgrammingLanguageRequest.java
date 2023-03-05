package kodlama.io.devs.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateSubProgrammingLanguageRequest {
	private String name;
	private int programmingLanguageId;

}
