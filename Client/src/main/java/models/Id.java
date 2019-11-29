package models;

/* 
 * POJO for an Id object
 */
public class Id{

    public String userid;
    public String name;
    public String github;

    @Override
    public String toString(){
        return "UserId: " + userid + " Name: " + name + " Github: " + github;
    }

}