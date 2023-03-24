package bean;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private int sId;
    @Column(name = "student_name")
    private String sName;
    @Column(name = "student_marks")
    private int sMarks;
    @OneToMany(mappedBy = "student_ref")
    private List<Laptop> laptops;

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getsMarks() {
        return sMarks;
    }

    public void setsMarks(int sMarks) {
        this.sMarks = sMarks;
    }

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }
   public void addLaptop(Laptop laptop){
        if (laptops==null){
            laptops=new ArrayList<>();
        }
        laptops.add(laptop);
        laptop.setStudent_ref(this);
    }
}
