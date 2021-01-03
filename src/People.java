public class People {
    private String name;
    private String birthday;
    private String job;

    public People(String name, String birthday, String job) {
        this.name = name;
        this.birthday = birthday;
        this.job = job;
    }

    public String getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
