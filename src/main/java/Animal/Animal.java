package Animal;

public class Animal implements AnimalInterface{
    private String name;
    private String voice;

    public Animal(String name, String voice) {
        this.name = name;
        this.voice = voice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public String getName() {
        return name;
    }

    public String getVoice() {
        return voice;
    }
}
