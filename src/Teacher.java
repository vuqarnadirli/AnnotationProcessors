
import bean.WritingStyle;
import lombok.Data;
import lombok.SneakyThrows;

@Data
public class Teacher {
    @WritingStyle
    private String tName;
    private String teacherSurname;
    private int teacherAge;
    private double salary;

    @SneakyThrows //Exception-nin qarsisini aldi.
    public void foo(int a){
        if (a>9){
            throw new Exception();
        }
    }

}
