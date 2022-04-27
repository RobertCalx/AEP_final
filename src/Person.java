//Understands person as a class

public class Person {

    public Person (){
    }

    public String accessBuilding(Building building) {
        if ( building.getBuildingRestrictionStatus().equals(BuildingRestrictionStatus.OPENTOTHEPUBLIC))
        {return "Success";}
        return "Denied";
    }


}
