package test.jpa

import javax.persistence.*

@Entity
@Table(name = "Student")
class Student{

    @Id
    Long id

    @ManyToOne
    @JoinColumns([
            @JoinColumn(name="STU_UNIVERSITY_ID ", referencedColumnName=" UNIVERSITY_ID ")
    ])
    private University university

    static constraints = {
    }
}
