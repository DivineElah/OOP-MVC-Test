package model;

public abstract class Cat implements Meow{
    protected int id;
    protected String name;
    protected byte age;
    protected String gender;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void inThongTin() {
        System.out.println("Thông tin con mèo:");
        System.out.println("ID: " + getId() + ".");
        System.out.println("Tên: " + getName() + ".");
        System.out.println("Tuổi: " + getAge() + ".");
        System.out.println("Giới tính: " + getGender() + ".");
    }
//    public void Meow(){
//        System.out.println("Meow!");
//    };
}
