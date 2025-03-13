package github.com.phyllipesa.jpa.services;

import github.com.phyllipesa.jpa.model.Person;
import github.com.phyllipesa.jpa.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;

@Service
public class PersonService {

    @Autowired
    PersonRepository repository;

    public Person findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceAccessException("No records found for this ID!"));
    }
}
