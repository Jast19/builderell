package co.jast.builderell.exception;

public class BuilderellException extends Exception {

    private final BuilderellType type;

    public BuilderellException(BuilderellType type) {
        super();
        this.type = type;
    }

    public BuilderellException(BuilderellType type, String message) {
        super(message);
        this.type = type;
    }

    public BuilderellException(BuilderellType type, String message, Throwable cause) {
        super(message, cause);
        this.type = type;
    }

    public BuilderellType getType() {
        return type;
    }

}
