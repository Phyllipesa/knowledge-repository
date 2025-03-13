package github.com.phyllipesa.dto;

import java.io.Serializable;

public class PersonDto implements Serializable {

    private static final long serialVersionUID =1L;
    private Long id;
    private String name;
    private Long age;

    public PersonDto() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }
}
