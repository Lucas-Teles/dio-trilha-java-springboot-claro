public class ComputadorPedrinho {
    public static void main(String[] args) {
        System.out.println("MSN");
        MSN msn = new MSN();
        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println("FACEBOOK");
        FacebookMessenger fcbk = new FacebookMessenger();
        fcbk.enviarMensagem();
        fcbk.receberMensagem();

        System.out.println("TELEGRAM");
        Telegram telegram = new Telegram();
        telegram.enviarMensagem();
        telegram.receberMensagem();
    }
}
