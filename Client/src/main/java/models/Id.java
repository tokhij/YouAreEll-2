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

    public String getUserid() {
        return userid;
    }

    public String getName() {
        return name;
    }

    public String getGithub() {
        return github;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserId: " + userid + " Name: " + name + " Github: " + github;
    }
}