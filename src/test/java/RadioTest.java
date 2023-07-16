import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio rad = new Radio(12);
    //Test changes of Volume
    @Test
    public void SetCurrentVolume() {
        rad.setCurrentVolume(50);
        int expected = 50;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setMaxVolume() {
        int expected = 100;
        int actual = rad.getMaxVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setMinVolume() {
        int expected = 0;
        int actual = rad.getMinVolume();
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
    public void pressPlusVolume() {
        rad.setCurrentVolume(100);
        rad.pressPlusVolume();
        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    //Test changes of Stations
    @Test
    public void setCurrentStation() {
        rad.setCurrentStation(7);
        int expected = 7;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
/*    @Test
    public void setMaxStation() {
        int expected = 9;
        int actual = rad.getMaxStation();
        Assertions.assertEquals(expected, actual);
    }*/
    @Test
    public void setMinStation() {
        int expected = 0;
        int actual = rad.getMinStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setMaxStation() {
        int expected = 11;
        int actual = rad.getMaxStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void pressPrevStation() {
        rad.setCurrentStation(0);
        rad.pressPrevStation();
        int expected = 11;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void pressNextStation() {
        rad.setCurrentStation(11);
        rad.pressNextStation();
        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
}