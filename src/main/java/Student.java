import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String lastname;
    @Column
    private String name;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id")
    private LearningGroup group;

    public Student(){

    }

    public Student(String lastname, String name, LearningGroup group) {
        this.lastname = lastname;
        this.name = name;
        this.group = group;
    }

    @Override
    public String toString() {
        return "lastname='" + lastname + '\'' +
                ", name='" + name + '\'' +
                ", group='" + group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LearningGroup getGroup() {
        return group;
    }

    public void setGroup(LearningGroup group) {
        this.group = group;
    }
}
