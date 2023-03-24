package bean;

import javax.persistence.*;

@Entity
@Table(name = "laptop")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="laptop_id")
    private int lId;
    @Column(name = "laptop_name")
    private String lName;
    @ManyToOne
    @JoinColumn(name = "student_ref")
    private Student student_ref;

    public int getlId() {
        return lId;
    }

    public void setlId(int lId) {
        this.lId = lId;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Student getStudent_ref() {
        return student_ref;
    }

    public void setStudent_ref(Student student_ref) {
        this.student_ref = student_ref;
    }
}
