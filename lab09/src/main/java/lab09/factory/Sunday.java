package lab09.factory;

/**
 * @author NK
 */

public class Sunday implements MessageFactory{
    @Override
    public String createIntroMessage() {
        return "Dzień dobry Niedziela.";
    }

    @Override
    public String createMainMessage() {
        return "Praca w niedziele? O nie nie!";
    }

    @Override
    public String createClosingMessage() {
        return "Siódmy dzień w tym tygodniu minął";
    }
}
