package hw6.bouquet;


public class Girl {
    String name;
    boolean isGoodMood;

    public Girl(String name, boolean isGoodMood) {
        this.name = name;
        this.isGoodMood = isGoodMood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGoodMood() {
        return isGoodMood;
    }

    public void setGoodMood(boolean goodMood) {
        isGoodMood = goodMood;
    }
}
