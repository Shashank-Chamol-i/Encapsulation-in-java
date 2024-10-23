
class Student{
    private String name;
    public String get(){
        return name;
    }
    public void  set(String name){
        this.name = name;
    }
}
public class Program01 {
    public static void main(String[] args) {
        Student s = new Student();
        s.set("Shavalya");
        System.out.println(s.get());
    }

}
