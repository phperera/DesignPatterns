/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototype;

/**
 *
 * @author ASUS
 */
public class UniStudent extends Student {
    private String degree;
    private int year;

    public String getDegree() {
        return degree;
    }

    public int getYear() {
        return year;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "UniStudent{" + "degree=" + degree + ", year=" + year + '}';
    }
    
    
}
