package mockito;

import java.util.*;

public class HelloMockito {

        private String greeting = "Hello, %s, from Mockito!";
        // Dependencies
        private PersonRepository personRepository;
        private TranslationService translationService;

        // Constructor to inject the dependencies
        public HelloMockito(PersonRepository personRepository,
                            TranslationService translationService) {
            this.personRepository = personRepository;
            this.translationService = translationService;
        }

        // Constructor por defecto
        public HelloMockito() {
            this(new DefaultPersonRepository(), new DefaultTranslationService());
        }

        // Method we want to test
        public String greet(int id, String sourceLang, String targetLang) {
            Optional<Person> person = personRepository.findById(id);
            String name = person.map(Person::getFirst).orElse("World").toString();
            return translationService.translate(
                    String.format(greeting, name), sourceLang, targetLang);
        }

}
