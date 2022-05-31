package eu.knitter.kolokwium7012019;

//Create application in Spring, which has class entity called "Rectangle". The Class must have the following fields: id, height, width (1 point)

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rectangle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int height;
    private int width;

    public Rectangle() {
    }

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "id=" + id +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}


