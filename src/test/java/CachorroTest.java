import org.example.Cachorro;
import org.junit.Assert;
import org.junit.Test;

public class CachorroTest {
    @Test
    public void deveLatirCorretamente(){
        System.out.println("Teste Equals");
        Cachorro cachorro = new Cachorro("Toto","Macho",2,5);
        Assert.assertEquals(cachorro.latir(),"Auau");
    }
    @Test
    public void  deveAumentarOPesoAoAlimentar(){
        System.out.println("Teste NotEquals");
        Cachorro cachorro = new Cachorro("Toto","Macho",2,5);
        double pesoAntigo = cachorro.getPeso();
        cachorro.alimentar();
        double pesoNovo = cachorro.getPeso();
        Assert.assertNotEquals(pesoAntigo, pesoNovo,0.01);
    }
    @Test
    public void deveTerPesoPositivoEAceitavel(){
        System.out.println("Teste True");
        Cachorro cachorro = new Cachorro("Toto","Macho",2,5);
        Assert.assertTrue(0<cachorro.getPeso() );
    }
    @Test
    public void deveSeAterAClassificacaoDePorte(){
        System.out.println("Teste Same");
        Cachorro cachorro = new Cachorro("Toto","Macho",2,5);

        Assert.assertSame("pequeno", cachorro.getPorte());
    }
    @Test
    public void deveVimAoSerChamado(){
        System.out.println("Teste NotNull");
        Cachorro cachorro = new Cachorro("Toto","Macho",2,5);
        Assert.assertNotNull(cachorro.chamar("Toto"));
    }
    @Test
    public void NaoDeveIniciarSentado(){
        System.out.println("Teste False");
        Cachorro cachorro = new Cachorro("Toto","Macho",2,5);
        Assert.assertFalse(cachorro.getSentado());

    }
    @Test
    public void deveSentarCorretamente(){
        System.out.println("Teste Doguinho Senta ");
        Cachorro cachorro = new Cachorro("Toto","Macho",2,5);
        cachorro.sentarLevantar();
        Assert.assertTrue(cachorro.getSentado());
    }
    @Test
    public void deveFugirCasoPassearSemColeira(){
        System.out.println("Teste Throws");
        Cachorro cachorro = new Cachorro("Toto","Macho",2,5);

        Throwable throwable =
                Assert.assertThrows(Exception.class, () -> cachorro.passear());
        Assert.assertEquals("O Cachorro fugiu",throwable.getMessage());
    }

}
