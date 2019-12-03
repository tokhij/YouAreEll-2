package models;

/* 
 * POJO for an Id object
 */
public class Id {

    public String userid;
    public String name;
    public String github;

    public Id(String name, String github) {
        this.name = name;
        this.github = github;
    }

    @Override
    public String toString() {
        return "UserId: " + userid + " Name: " + name + " Github: " + github;
    }

    public void setName(String name) {
        this.name = name;
    }
}