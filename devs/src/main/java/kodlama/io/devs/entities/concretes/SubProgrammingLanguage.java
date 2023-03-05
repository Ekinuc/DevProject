package kodlama.io.devs.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="subProgrammingLanguages")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubProgrammingLanguage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@NotBlank
	@NotNull
	@Column(name="name")
	private String name;
	
	@NotBlank
	@NotNull
	@ManyToOne
	@JoinColumn(name="programming_language_id", nullable = false)
	private ProgrammingLanguage programmingLanguage;

}
