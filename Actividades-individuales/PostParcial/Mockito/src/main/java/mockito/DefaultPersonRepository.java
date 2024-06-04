package mockito;
import java.util.Optional;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Collections;

public class DefaultPersonRepository implements PersonRepository {
    private Map<Integer, Person> people = new HashMap<>();

    public DefaultPersonRepository() {
        people.put(1, new Person("World"));
    }

    @Override
    public Person save(Person person) {
        return people.put(person.getId(), person);
    }

    @Override
    public Optional<Person> findById(int id) {
        return Optional.ofNullable(people.get(id));
    }

    @Override
    public List<Person> findAll() {
        return Collections.unmodifiableList((List<Person>) people.values());
    }

    @Override
    public long count() {
        return people.size();
    }

    @Override
    public void delete(Person person) {
        people.remove(person.getId());
    }
}

