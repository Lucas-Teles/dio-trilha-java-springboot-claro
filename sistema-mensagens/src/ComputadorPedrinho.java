public class ComputadorPedrinho {
    public static void main(String[] args) {

        ServicoMensagemInstantanea smi = null;

        String appEscolhido = "msn";

        if (appEscolhido.equals("msn")){
            smi = new MSN();
        } else if (appEscolhido.equals("facebook")) {
            smi = new FacebookMessenger();
        } else if (appEscolhido.equals("telegram")) {
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
