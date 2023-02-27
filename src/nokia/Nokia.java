package nokia;

public class Nokia {
    public String displayMenu(){
        return """
                Welcome!!!
                Enter 1 -> for phonebook
                2 -> for Messages
                3 -> for Call register
                4 -> for Settings
                5 -> for Games
                6 -> for Extras
                """;
    }
    public void messageMenu(){
        System.out.println("""
                1 -> Create message
                2 -> Inbox3
                3 -> Outbox
                4 -> Draft
                """);
    }
    public void callRegisterMenu(){
        System.out.println("""
                1 -> Dialed calls
                2 -> Missed Calls
                3 -> Received calls
                """);
    }
    public void settingsMenu(){
        System.out.println("""
                1 -> Tone settings
                2 -> Profile settings
                3 -> General settings
                """);
    }
}
