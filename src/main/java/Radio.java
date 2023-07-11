public class Radio {
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;
    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation;

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }
    public int getMaxVolume() {
        return maxVolume;
    }
    public void setMinVolume(int maxVolume) {
        this.minVolume = minVolume;
    }
    public int getMinVolume() {
        return minVolume;
    }
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }
    public void pressPlusVolume() {
        setCurrentVolume(currentVolume + 10);
    }
    public void pressMinusVolume() {
        setCurrentVolume(currentVolume - 10);
    }
    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }
    public int getMaxStation() {
        return maxStation;
    }
    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }
    public int getMinStation() {
        return minStation;
    }
    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            currentStation = minStation;
        }
        if (currentStation < minStation) {
            currentStation = maxStation;
        }
        this.currentStation = currentStation;
    }
    public int getCurrentStation() {
        return currentStation;
    }
    public void pressNextStation() {
        setCurrentStation(currentStation + 1);
    }
    public void pressPrevStation() {
        setCurrentStation(currentStation - 1);
    }



    /*    private int maxVolume;
    private int minVolume;
    private int currentVolume;
    private int maxStation;
    private int minStation;
    private int currentStation;


    public int getCurrentVolume() {
        return currentVolume;
    }
    public int getMaxVolume() {
        return maxVolume;
    }
    public int getMinVolume() {
        return minVolume;
    }
    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }
    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }
    public void pressPlusVolume() {
        setCurrentVolume(currentVolume + 1);
    }
    public void pressMinusVolume() {
        setCurrentVolume(currentVolume - 1);
    }
    public int getCurrentStation() {
        return currentStation;
    }
    public int getMaxStation() {
        return maxStation;
    }
    public int getMinStation() {
        return minStation;
    }
    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }
    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }
    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            currentStation = minStation;
        }
        if (currentStation < minStation) {
            currentStation = maxStation;
        }
        this.currentStation = currentStation;
    }

    public void pressPlusStation() {
        setCurrentStation(currentStation + 1);
    }

    public void pressMinusStation() {
        setCurrentStation(currentStation - 1);
    }*/
}
