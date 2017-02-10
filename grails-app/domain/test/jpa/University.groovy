package test.jpa

import javax.persistence.*

@Entity
@Table(name = "University")
class University{

    @Id
    Long id

    @Column(name = "UNIVERSITY_ID ")
    String universityId

    static constraints = {
    }
}
