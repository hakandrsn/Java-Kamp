package kodlama.io.devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.devs.entities.concretes.Language;

@Repository
public class inMemoryLanguageRepository implements LanguageRepository {

	List<Language> languages;
	
	public inMemoryLanguageRepository() {
		//elimizde boş bir array var
		languages = new ArrayList<Language>();
		
		languages.add(new Language(1,"c#"));
		languages.add(new Language(2,"C++"));
		languages.add(new Language(3,"JS"));
		languages.add(new Language(4,"GO"));
		languages.add(new Language(5,"PHP"));
	}

	@Override
	public List<Language> getAll() {
		return languages;
	}

	@Override
	public Language getOne(int langId) {
			for(Language language:getAll()) {
				if(language.getId()==langId){
					return language;
				}
			}
			return null;
	}

	@Override
	public void addOne(Language language) {
		languages.add(language);
	}

	@Override
	public void deleteOne(int langId) {
		languages.remove(getOne(langId));
	}

	@Override
	public void updateOne(Language language) {
		for(Language lang:getAll()) {
			if(lang.getId()==language.getId()) {
				languages.remove(lang);
				languages.add(language);
			}
		}
	}
}
