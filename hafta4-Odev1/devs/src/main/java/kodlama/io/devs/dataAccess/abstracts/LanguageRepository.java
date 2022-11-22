package kodlama.io.devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.devs.entities.concretes.Language;

public interface LanguageRepository {
	List<Language> getAll();

	Language getOne(int langId);
	
	void addOne(Language language);
	
	void deleteOne(int langId);
	
	void updateOne(Language language);
}
