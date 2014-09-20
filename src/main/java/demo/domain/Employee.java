package demo.domain;

import org.springframework.data.annotation.Id;

/**
 * Created with IntelliJ IDEA.
 * User: akang
 * Date: 9/18/14
 * Time: 10:45 AM
 * To change this template use File | Settings | File Templates.
 */
public class Employee {
    @Id
    private String id;
    private String name;
    private String title;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}