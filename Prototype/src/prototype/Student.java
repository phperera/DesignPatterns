/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototype;

/**
 *
 * @author ASUS
 */
public abstract class Student implements Cloneable {
    private String sId;
    private String name;
    private int age;

    public String getsId() {
        return sId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    @Override
    public Object clone() throws CloneNotSupportedException{
    return super.clone();
    }
}
