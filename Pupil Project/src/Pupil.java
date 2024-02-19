public class Pupil {

    private String name;
    private String lastName;
    private int age;
    private double score;

    @Override
    public String toString() {
        return "Pupil{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    public Pupil(String name, String lastName, int age, double score) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Pupil() {
    }
}
