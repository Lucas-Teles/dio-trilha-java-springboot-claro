package equipamentos.digitalizadora;

public class Scanners implements Digitalizadora{
    @Override
    public void digitalizar() {
        System.out.println("IMPRIMINDO VIA EQUIPAMENTO SCANNER");
    }
}
