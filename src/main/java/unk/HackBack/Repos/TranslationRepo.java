package unk.HackBack.Repos;

import org.springframework.data.repository.CrudRepository;
import unk.HackBack.Entities.EmbeddedKeys.TranslationId;
import unk.HackBack.Entities.Translation;

public interface TranslationRepo extends CrudRepository<Translation, TranslationId> {
}
