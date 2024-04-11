import java.util.ArrayList;
import java.util.List;

public class Prof extends Person{
    private int code;
    public List<Subject> Subjects;
    
    public Prof(String name, int code, String email, int id){
        super(name, email, id);
        this.name = name;
        this.code = code;
        this.email = email;
        setId(id);
        this.Subjects = new ArrayList<>(); 
    }

    public void addSubjectProf(Subject subject) {
        this.Subjects.add(subject);
        }

    public void showSubjects() {
        for(Subject subject : Subjects) {
            System.out.println(subject.name);
        }
    }
    

    public int getCode(){
        return code;
    }
}
