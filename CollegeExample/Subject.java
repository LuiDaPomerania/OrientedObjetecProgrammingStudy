import java.util.ArrayList;
import java.util.List;
public class Subject {
    public String name;
    private int code;
    public Prof professor;
    public Subject prerequisite;
    public List<Subject> required;

    public Subject(String name, Prof professor, int code){
    this.name = name;
    this.professor = professor;
    this.code = code;
    this.required = new ArrayList<>();
    }

    public void setPreRequisite(Subject prerequisite) {
    this.prerequisite = prerequisite;
    }

    public void addRequired(Subject subject) {
    this.required.add(subject);
    }

    public int getCode(){
        return code;
    }

    public void showRequired() {
        for(Subject i: required) {
            System.out.println(i.name);
        }
    }
       
}
