package mockito;

public class DefaultTranslationService implements TranslationService {
    @Override
    public String translate(String text, String sourceLang, String targetLang) {
        return text;
    }
}
