package main.java.nju.linhao.enums;

public enum MessageType {
    CLIENT_READY("CLIENT_READY"),

    SERVER_ACK("SERVER_ACK"),

    TEAM_CREATE("TEAM_CREATE"),

    CREATURE_MOVE("CREATURE_MOVE"),
    CREATURE_ATTACK("CREATURE_ATTACK");

    private String description;

    MessageType(String description){
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}