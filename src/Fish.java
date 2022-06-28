public class Fish {
    private String name;
    private int age;

    public Fish(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
            this.age = age;
    }
    @Override
    public String toString() {
        if (age<=0){
            return "Попугай " +
                    "name= " + name + '\'' +
                    "age = " + "не родился еще?";
        }else {
            return "Попугай " +
                    "name= " + name + '\'' +
                    "age= " + age;
        }
    }
}
