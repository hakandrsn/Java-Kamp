package kodlama.io.devs.business.abstracts;

import java.util.List;

import kodlama.io.devs.entities.concretes.Language;

public interface LanguageService {
	List<Language> getAll() throws Exception;
	Language getOne(int langId) throws Exception;
	
	void addOne(Language language) throws Exception;
	
	void deleteOne(int langId) throws Exception;
	
	void updateOne(Language language) throws Exception;
}
