import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Student_Test {

    @Test
    public void studentShouldBeABusinessInformaticsMajor(){
        Student jan = new Student();
        assertEquals(jan.getMajor(), "BusinessInformatics");
    }
}
