package estabelecimento;

import equipamentos.Multifucional;
import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.Laserjet;

public class Loja {
    public static void main(String[] args) {
        Multifucional em = new Multifucional();
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        em.imprimir();
        em.copiar();
        em.digitalizar();
    }
}
