public class test{
    private int num;
    private String name;
    private String color;
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String JDBCToString() {
        return String.format("(\"%s\", \"%s\")", getName(), getColor());
    }  
}
