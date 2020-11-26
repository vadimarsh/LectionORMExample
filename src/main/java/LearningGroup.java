import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "stgroups")
public class LearningGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String title;
    @OneToMany(mappedBy = "group",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Student> students;

    public LearningGroup(){

    }

    public LearningGroup(String title) {
        this.title = title;
        this.students = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
