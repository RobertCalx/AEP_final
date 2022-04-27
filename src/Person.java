//Understands person as an abstract class

public class Person {
    private String name;

    public void accessBuilding(Building building) {
        if ( building.getBuildingRestrictionStatus().equals(BuildingRestrictionStatus.OPENTOTHEPUBLIC)){
            System.out.println("Success");
        }
        else  System.out.println("Denied");
    }
}
