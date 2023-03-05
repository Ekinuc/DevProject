package kodlama.io.devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.devs.entities.concretes.SubProgrammingLanguage;

public interface SubProgrammingLanguageRepository extends JpaRepository<SubProgrammingLanguage, Integer> {

}
