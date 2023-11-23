import java.util.*;

class Arrays {
    private String[] dataObject;

    public Arrays(int size) {
        this.dataObject = new String[size];
    }

    public int count() {
        return this.dataObject.length;
    }

    public void set(int place, String value) {
        this.dataObject[place] = value;
    }

    public String get(int place) {
        return this.dataObject[place];
    }

    public void delete(int place) {
        this.dataObject[place] = null;
    }
}
