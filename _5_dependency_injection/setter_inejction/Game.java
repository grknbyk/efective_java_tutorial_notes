package _5_dependency_injection.setter_inejction;

public class Game {
    private Character character;

    public void setCharacter(Character character) {
        this.character = character;
    }

    public void switchCharacter() {
        character.display();
    }

    public void useSpecialAbility() {
        character.useSpecialAbility();
    }
}
