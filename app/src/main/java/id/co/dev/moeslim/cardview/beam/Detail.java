package id.co.dev.moeslim.cardview.beam;

/**
 * Created by moeslim on 11/10/17.
 */

public class Detail {

    private String name;
    private String emailId;

    public Detail(String name, String emailId) {
        this.name = name;
        this.emailId = emailId;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmailId(){
        return emailId;
    }

    public void setEmailId(String emailId){
        this.emailId = emailId;
    }
}
