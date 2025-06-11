package ch5;

public class Man {
    private String name;
    private int age;
    private Boolean isMarried;
    private int numChildren;

    public Man(String name, int age, Boolean isMarried, int numChildren) {
        setName(name);
        setIsMarried(isMarried);
        setAge(age);
        setNumChildren(numChildren);
    }
    public void setName(String name){
        this.name = name;
    }
    public void setIsMarried(Boolean isMarried){
        this.isMarried = isMarried;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setNumChildren(int numChildren){
        this.numChildren = numChildren;
    }
    public String getName() {
        return name;
    }
    public Boolean getIsMarried() {
        return isMarried;
    }
    public int getAge() {
        return age;
    }
    public int getNumChildren() {
        return numChildren;
    }

    public static void main(String[] args) {
        Man James = new Man("James", 35, true, 5);
        System.out.println("이름: " + James.getName());
        System.out.println("나이: " + James.getAge());
        System.out.println("결혼 여부: " + James.getIsMarried());
        System.out.println("자녀 수: " + James.getNumChildren());
    }
}
