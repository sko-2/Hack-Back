package unk.HackBack.Repos;

import org.springframework.data.repository.CrudRepository;
import unk.HackBack.Entities.Language;

public interface LanguageRepo extends CrudRepository<Language, String> {
}
