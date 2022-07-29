public class Student {
    private String name = "john";
    private String classes = "C02";

    public Student() {
    }

    private void setName() {
        this.name = name;
    }

    private void setClasses(String classes) {
        this.classes = classes;
    }
    public String disPlay(){
        return "ten la: "+name + " lop: "+classes;
    }


}
