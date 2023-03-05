package kodlama.io.devs.webApi.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.devs.business.abstracts.SubProgrammingLanguageService;
import kodlama.io.devs.business.requests.CreateSubProgrammingLanguageRequest;
import kodlama.io.devs.business.requests.UpdateSubProgrammingLanguageRequest;
import kodlama.io.devs.business.responses.GetAllSubProgrammingLanguageReponse;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/subprogramminglanguages")
@AllArgsConstructor
public class SubProgrammingLanguagesController {
	private SubProgrammingLanguageService subProgrammingLanguageService;
	
	@GetMapping()
	public List<GetAllSubProgrammingLanguageReponse> getAll(){
		return subProgrammingLanguageService.getAll();
	}
	
	@PostMapping()
	@ResponseStatus(code=HttpStatus.CREATED)
	public void add(@RequestBody CreateSubProgrammingLanguageRequest createSubProgrammingLanguageRequest) {
		this.subProgrammingLanguageService.add(createSubProgrammingLanguageRequest);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		this.subProgrammingLanguageService.delete(id);
	}
	@PutMapping
	public void update(@RequestBody UpdateSubProgrammingLanguageRequest updateSubProgrammingLanguageRequest) {
		this.subProgrammingLanguageService.update(updateSubProgrammingLanguageRequest);
	}

}
