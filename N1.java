class Student {
    private String name;
    private String post;

    public Student(String name, String post) {
        this.name = name;
        this.post = post;
    }

    public String getName() {
        return name;
    }

    public String getPost() {
        return post;
    }
}

class Election {
    public String date;
    public String name;

    public Election(String datel, String cnamel) {
        this.date = datel;
        this.name = cnamel;
    }
}

public class N1{
    public static void main(String[] args) {
        System.out.println("Main");

        Student anurag = new Student("Anurag Rastogi", "President");
        Student udupa = new Student("Amarendra Udupa", "Tech Secretary");

        Election el = new Election("2024", "VITH");

        System.out.println(anurag.getName() + " has applied for " + anurag.getPost() + ":");
    }
}