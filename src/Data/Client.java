package Data;

/**
 * Created by Agus on 23/10/2016.
 */
public class Client {
    private String ID;
    private String Name;
    private String Mobile;

    public Client(String name){
        this.Name=name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String toString(){
        return "Nombre: "+ this.Name+ " ID: "+ this.ID+ " Telefono: "+this.Mobile;
    }

}
