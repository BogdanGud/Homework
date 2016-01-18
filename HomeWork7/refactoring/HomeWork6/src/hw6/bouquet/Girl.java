package hw6.bouquet;


public class Girl {
    private String name;        //declared as private
    private boolean isGoodMood; //declared as private

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

    //renamed method
    public boolean getIsGoodMood() {
        return isGoodMood;
    }

    //renamed and changed method
    public void setMood(boolean Mood) {
        isGoodMood = Mood;
    }
}
