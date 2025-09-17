package exercise1;

public class Singers {
    private int id;
    private String name;
    private String address;
    private String dob;
    private int albumPub;

    public Singers () {
        this.id = 1;
        this.name = "Default Name";
        this.address = "Default Address";
        this.dob = "Default DOB";
        this.albumPub = 0;
    }

    public Singers(int id, String name, String address, String dob, int albumPub) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.albumPub = albumPub;
    }

    public void setId(int id){ this.id = id; }
    public void setName(String name){ this.name = name; }
    public void setAddress(String address) { this.address = address; }
    public void setDob(String dob) { this.dob = dob; }
    public void setAlbumPub(int albumPub) { this.albumPub = albumPub; }

    public String getName() { return name; }
    public int getId() { return id; }
    public int getAlbumPub() { return albumPub; }
    public String getAddress() { return address; }
    public String getDob() { return dob; }

    public void setVariableValues(int id, String name, String address, String dob, int albumPub) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.albumPub = albumPub;
    }// this method allows us to set all the values at once, I literally just copied the constructor.

    public void displayInfo() {
        System.out.println("The singer's ID is: " + id);
        System.out.println("The singer's Name is: " + name);
        System.out.println("The singer's address is: " + address);
        System.out.println("The singer's date of birth is: " + dob);
        System.out.println("The singer's has released " + albumPub + " albums");
    } //this method is optional we could have also chosen to println individual variables
}
