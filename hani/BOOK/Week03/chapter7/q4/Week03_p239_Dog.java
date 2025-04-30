package chapter7.q4;

public class Week03_p239_Dog {
    private String name;
    private String type;
    public Week03_p239_Dog(String name, String type) {
        this.name = name;
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String showDogInfo() {
        return name + ", " + type;
    }
}
