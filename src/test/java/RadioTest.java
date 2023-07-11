import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio rad = new Radio();

    @Test
    public void testGetMaxVolume(){
        int expected = 100;
        int actual = rad.getMaxVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSetMaxVolume(){
        rad.setMaxVolume(100);
        int expected = 100;
        int actual = rad.getMaxVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testGetMinVolume(){
        int expected = 0;
        int actual = rad.getMinVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSetMinVolumee(){
        rad.setMinVolume(0);
        int expected = 0;
        int actual = rad.getMinVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSetCurrentVolume(){
        rad.setCurrentVolume(100);
        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void pressPlusVolume() {
        rad.setCurrentVolume(100);
        rad.pressPlusVolume();
        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void pressMinusVolume() {
        rad.setCurrentVolume(0);
        rad.pressMinusVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSetMaxStation(){
        rad.setMaxStation(10);
        int expected = 10;
        int actual = rad.getMaxStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testGetMaxStation(){
        int expected = 9;
        int actual = rad.getMaxStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSetMinStation(){
        rad.setMinStation(1);
        int expected = 1;
        int actual = rad.getMinStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testGetMinStation(){
        int expected = 0;
        int actual = rad.getMinStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSetCurrentStation(){
        rad.setCurrentStation(5);
        int expected = 5;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void pressPrevStation() {
        rad.setCurrentStation(0);
        rad.pressPrevStation();
        int expected = 9;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void pressNextStation() {
        rad.setCurrentStation(9);
        rad.pressNextStation();
        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
}