import org.junit.Test;

import static org.junit.Assert.assertEquals;

// This test failed before
public class Person_Test {
    @Test
    public  void studentAccessToLibraryShouldBeSuccesful(){
        Building doe = new Building("doe", BuildingRestrictionStatus.RESTRICTEDTOUNIVERSITYMEMBERS);
        Person jansMum = new Person();
        assertEquals("Denied", jansMum.accessBuilding(doe));
    }
}
