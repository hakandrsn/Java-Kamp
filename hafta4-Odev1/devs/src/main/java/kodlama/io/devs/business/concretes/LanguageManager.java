package kodlama.io.devs.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.devs.business.abstracts.LanguageService;
import kodlama.io.devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {
	private LanguageRepository languageRepository;

	public LanguageManager(LanguageRepository languageRepository) {
		super();
		this.languageRepository = languageRepository;
	}

	@Override
	public List<Language> getAll() throws Exception {
		// kurallarımız olacak 
		return languageRepository.getAll();
	}

	@Override
	public Language getOne(int langId) throws Exception {
		// TODO Auto-generated method stub
		return languageRepository.getOne(langId);
	}

	@Override
	public void addOne(Language language) throws Exception {
		if(language.getLanguage().isEmpty()) {
			throw new Exception("İsim kısmı boş olamaz");
		}
		for(Language lang:getAll()) {
			if(lang.getLanguage().equals(language.getLanguage())) {
				throw new Exception("Mevcut");
			}
		}
		languageRepository.addOne(language);
	}

	@Override
	public void deleteOne(int langId)  throws Exception{
		for(Language lang : getAll()) {
			if(lang.getId()==langId) {
				languageRepository.deleteOne(langId);
			}else throw new Exception("Böyle bir id yok");
		}
	}

	@Override
	public void updateOne(Language language) throws Exception {
		for(Language lang : getAll()) {
			if(lang.getId()==language.getId()) {
				languageRepository.updateOne(language);
			}else throw new Exception("Böyle bir veri yok");
		}
		
	}


}
