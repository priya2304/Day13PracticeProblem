import org.junit.Test;
import org.junit.Assert;

public class MaximumTest {
    @Test
    public void intMax() {
        int actualValue = Maximum.testMaximum(9, 4, 1);
        Assert.assertEquals(9, actualValue);
    }

    @Test
    public void floatMax() {
        float actualValue = Maximum.testMaximum(1.5f,9.1f,4.4f);
        Assert.assertEquals(9.1f,actualValue,0);
    }

    @Test
    public void stringMax() {
        String actualValue = Maximum.testMaximum("red","yellow","green");
        Assert.assertEquals("yellow",actualValue);
    }
    @Test
    public void givenStringValues_WhenGetMaximum_ShouldReturnCorrectValue() {
        String actualResult = Maximum.testMaximum("Red", "Yellow", "Green", "Black","Pink");
        Assert.assertEquals("Pink", actualResult);
    }
}
