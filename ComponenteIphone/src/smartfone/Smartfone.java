package smartfone;

import aparelhotelefonico.AparelhoTelefonico;
import navegadorinternet.NavegadorInternet;
import reprodutormusical.ReprodutorMusical;

public class Smartfone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void atender() {
        System.out.println("atendo smartfone");
        
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("correio smartfone");
        
    }

    @Override
    public void ligar(String numero) {
        System.out.println("ligando smartfone");
        
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("pag smartfone");
        throw new UnsupportedOperationException("Unimplemented method 'exibirPagina'");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("novaaba smartfone");
        throw new UnsupportedOperationException("Unimplemented method 'adicionarNovaAba'");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("atualizapagina smartfone");
        throw new UnsupportedOperationException("Unimplemented method 'atualizarPagina'");
    }

    @Override
    public void tocar() {
        System.out.println("tocar smartfone");
    }

    @Override
    public void pausar() {
        System.out.println("tocar smartfone");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("selecionar musica"+musica +"smartfone");
     }

    
} 
