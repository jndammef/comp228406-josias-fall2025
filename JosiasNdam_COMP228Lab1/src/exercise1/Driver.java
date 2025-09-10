package exercise1;

public class Driver {
    public static void main(String[] args) {
        Singers singer1 = new Singers();

        singer1.displayInfo(); // this is going to use the non-parametrized constructor. we could have also choosen to
                                // display every instance variable individually using System.out.println.

        System.out.println();
        System.out.println("Displaying singer's info using all in one setters");
        System.out.println();

        singer1.setVariableValues(237, "Cysoul", "165 Rue Deido-Bassa, Douala", "15-October-1995", 25);
        singer1.displayInfo();

        System.out.println();
        System.out.println("Displaying singer's info using individual setters");
        System.out.println();

        singer1.setId(228);
        singer1.setName("Petit Pays");
        singer1.setAddress("237 Bomono Ranch, Douala");
        singer1.setDob("19-April-1957");
        singer1.setAlbumPub(40);

        //let's display all this
        System.out.println("The new singer ID is " + singer1.getId());
        System.out.println("The new singer name is " + singer1.getName());
        System.out.println("The new singer address is " + singer1.getAddress());
        System.out.println("The new singer date of birth is " + singer1.getDob());
        System.out.println("The new number of album released by " + singer1.getName() + " is " + singer1.getId());

    }
}
