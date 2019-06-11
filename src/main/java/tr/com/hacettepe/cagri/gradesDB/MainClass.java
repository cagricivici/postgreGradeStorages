package tr.com.hacettepe.cagri.gradesDB;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;

@Entity
@Table(name = "GradeTable_FallSemester")

public class MainClass {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @SequenceGenerator(
            name = "GradeTable_generator",
            sequenceName = "GradeTable_seq"
    )
    private long id;

    @Column(columnDefinition = "character varying(250)", name = "lesson_name", nullable = false)
    @Getter(AccessLevel.PUBLIC)
    @Setter(AccessLevel.PUBLIC)
    private String lessonName; //lesson full name

    @Column(columnDefinition = "integer", name = "midterm1", nullable = false)
    @Getter
    @Setter
    private int mid1Value; //midterm1 grades ex. 75

    @Column(columnDefinition = "integer", name = "midterm2", nullable = false)
    @Getter
    @Setter
    private int mid2Value;  //midterm2 grades ex. 75

    @Column(columnDefinition = "integer", name = "final", nullable = false)
    @Getter
    @Setter
    private int finalValue; //final grades ex. 75

    @Column(columnDefinition = "boolean", name = "lesson_pass", nullable = false)
    @Getter
    @Setter
    private boolean lessonPass; //pass->true , fail->false
}
