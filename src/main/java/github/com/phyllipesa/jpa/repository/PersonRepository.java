package github.com.phyllipesa.jpa.repository;

import github.com.phyllipesa.jpa.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {}
