package model;

public class Partition{
    private int localization;
    private int size;
    private boolean available;

    public int getLocalization() {
        return localization;
    }

    public void setLocalization(int localization) {
        this.localization = localization;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
