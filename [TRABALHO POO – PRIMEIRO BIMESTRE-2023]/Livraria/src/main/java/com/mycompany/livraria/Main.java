/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.livraria;

import com.mycompany.livraria.model.Cliente;
import com.mycompany.livraria.model.Endereco;
import com.mycompany.livraria.model.FormaPagamento;
import com.mycompany.livraria.model.Livraria;
import com.mycompany.livraria.model.Livro;
import com.mycompany.livraria.model.LivroPedido;
import com.mycompany.livraria.model.Pedido;
import java.util.ArrayList;

/**
 *
 * @author yuriz
 */
public class Main {

    public static void main(String[] args) {
        
        FormaPagamento dinheiro = new FormaPagamento(1,
                "DINHEIRO");
        
        FormaPagamento pix = new FormaPagamento(1,
                "PIX");
        
        
        Livro livro1 = new Livro();
        
        livro1.setAnoLancamento(2007);
        livro1.setNomeLivro("Cidade dos Ossos");
        livro1.setEditoraLivro("Galera");
        livro1.setAutorLivro("Cassandra Clare");
        livro1.setResenha("Um mundo oculto está prestes a ser revelado... Quando Clary decide ir a "
                + "Nova York se divertir numa discoteca, nunca poderia imaginar que testemunharia um "
                + "assassinato - muito menos um assassinato cometido por três adolescentes cobertos "
                + "por tatuagens enigmáticas e brandindo armas bizarras. Clary sabe que deve chamar a "
                + "polícia, mas é difícil explicar um assassinato quando o corpo desaparece e os assassinos "
                + "são invisíveis para todos, menos para ela. Tão surpresa quanto assustada, Clary aceita ouvir "
                + "o que os jovens têm a dizer... Uma tribo de guerreiros secreta dedicada a libertar a terra "
                + "de demônios, os Caçadores das Sombras têm uma missão em nosso mundo, e Clary pode já "
                + "estar mais envolvida na história do que gostaria.");
        ArrayList<String> genero = new ArrayList<String>();
        genero.add("Fantasia");
        genero.add("Ficção");
        livro1.setGeneroLivro(genero);
        livro1.setIdLivro(1);
        livro1.setPreco(49.90);
        livro1.setQtdEstoque(8);
        livro1.setNumeroPaginas(462);
        
      Livro livro2 = new Livro();
      
      livro2.setAnoLancamento(2008);
        livro2.setNomeLivro("Cidade das cinzas");
        livro2.setEditoraLivro("Galera");
        livro2.setAutorLivro("Cassandra Clare");
        livro2.setResenha("Clary Fray só queria que sua vida voltasse ao normal. Mas o que é \"\"normal\"\" quando você é uma Caçadora de "
                + "Sombras assassina de demônios, sua mãe está em um coma magicamente induzido e você de repente descobre que "
                + "criaturas como lobisomens, vampiros e fadas realmente existem? Se Clary deixasse o mundo dos Caçadores de"
                + "Sombras para trás, isso significaria mais tempo com o melhor amigo, Simon, que está se tornando mais do "
                + "que só isso. Mas o mundo dos Caçadores não está disposto a abrir mão de Clary - especialmente o belo e "
                + "irritante Jace, que por acaso ela descobriu ser seu irmão. E a única chance de salvar a mãe dos dois "
                + "parece ser encontrar o perverso ex-Caçador de Sombras Valentim, que além de perverso e insano, é "
                + "também o pai de Clary e Jace.");
              
        livro2.setGeneroLivro(genero);
        livro2.setIdLivro(2);
        livro2.setPreco(49.90);
        livro2.setQtdEstoque(13);
        livro2.setNumeroPaginas(448);
        
      Livro livro3 = new Livro(); 
      
      livro3.setAnoLancamento(2009);
        livro3.setNomeLivro("Cidade de Vidro");
        livro3.setEditoraLivro("Galera");
        livro3.setAutorLivro("Cassandra Clare");
        livro3.setResenha("Para salvar a vida de sua mãe, Clary deve viajar até a Cidade de Vidro, lar ancestral dos Caçadores de Sombras - podemos "
                + "pular a regra quediz que entrar em Alicante sem permissão é contra a lei e ir contra a lei pode significar a morte? E "
                + "também que chegar lá, criando um Portal sozinha, só mostra o quanto os poderes de Clary são "
                + "sofisticados e como isso é perigoso? Para complicar ainda mais, quando chega à cidade, "
                + "ela logo descobre que Jace não a quer por perto (o que não se aplica a outras "
                + "meninas...) e Simon, que nem queria estar ali, está sendo investigado "
                + "por ser um vampiro que pode suportar a luz do sol.");
        livro3.setGeneroLivro(genero);
        livro3.setIdLivro(3);
        livro3.setPreco(49.90);
        livro3.setQtdEstoque(150);
        livro3.setNumeroPaginas(476);
       
      Livro livro4 = new Livro();
        
      livro3.setAnoLancamento(2011);
        livro4.setNomeLivro("Cidade dos anjos caidos");
        livro4.setEditoraLivro("Galera");
        livro4.setAutorLivro("Cassandra Clare");
        livro4.setResenha("\"O quarto volume da série Os Instrumentos Mortais, "
                + "fenômeno mundial de vendas   Amor. Sangue. Traição. Vingança. "
                + "As apostas e os riscos são mais altos que nunca na Cidade dos Anjos Caídos."
                + "   Neste imperdível volume da série Os instrumentos Mortais, acompanhamos os últimos"
                + " meses na vida de Clary. Demônios, um ex-caçador de sombras com jeito de supervilão - detalhe:"
                + " seu pai -, um triângulo amoroso com o melhor amigo (a quem pode inadvertidamente ter ajudado"
                + " a transformar em vampiro) e um conflito entre dimensões. Mas agora a guerra chegou ao fim,"
                + " e a garota voltou a Nova York para aperfeiçoar seus poderes e assistir ao casamento da mãe."
                + "  O melhor: finalmente pode chamar Jace de seu. Sem fantasmas, sem incertezas e sem dúvidas."
                + " Seria esse o tão sonhado paraíso?");
        livro4.setGeneroLivro(genero);
        livro4.setIdLivro(4);
        livro4.setPreco(49.90);
        livro4.setQtdEstoque(22);
        livro4.setNumeroPaginas(364);
       
      Livro livro5 = new Livro();
      
      livro5.setAnoLancamento(2012);
        livro5.setNomeLivro("Cidade das almas perdidas");
        livro5.setEditoraLivro("Galera");
        livro5.setAutorLivro("Cassandra Clare");
        livro5.setResenha("Quando Jace e Clary voltam a se encontrar, ela fica horrorizada ao descobrir que a magia "
                + "da demônio Lilith ligou Jace a Sebastian. O perverso irmão de Clary transformou Jace em "
                + "um servo do mal. A dupla ameaça faz com que a Clave decida destruir Sebastian a "
                + "todo custo... Mas não há maneira de matar um sem aniquilar o outro.");
        livro5.setGeneroLivro(genero);
        livro5.setIdLivro(5);
        livro5.setPreco(49.90);
        livro5.setQtdEstoque(32);
        livro5.setNumeroPaginas(434);
        
      Livro livro6 = new Livro();
      
      livro6.setAnoLancamento(2014);
        livro6.setNomeLivro("Cidade do fogo celestial");
        livro6.setEditoraLivro("Galera");
        livro6.setAutorLivro("Cassandra Clare");
        livro6.setResenha("Caçador de Sombras contra Caçador de Sombras. Irmão contra irmã. Alianças quebradas. Morte, sangue, "
                + "icor demoníaco. Sebastian Morgenstern espalha o terror pelo universo dos Nephilim e, ainda, "
                + "pelo Submundo. Nada parece segurar sua sede de poder.");
        livro6.setGeneroLivro(genero);
        livro6.setIdLivro(6);
        livro6.setPreco(49.90);
        livro6.setQtdEstoque(12);
        livro6.setNumeroPaginas(434);
        
      
        Cliente cliente1 = new Cliente();
        
        cliente1.setCpf("350.251.260-45");
        Endereco endereco = new Endereco();
        
        endereco.setBairro("Recanto das Emas");
        endereco.setCep("72610-600");
        endereco.setDsComplemento("Perto da escola");
        endereco.setNomeRua("Rua Jesus");
        endereco.setNumeroCasa(33);
        endereco.setSigla_estado("AC");
        
        cliente1.setEndereco(endereco);
        cliente1.setNome("Zanalis");
        
        Pedido pedido = new Pedido();
        
        pedido.setCliente(cliente1);
        pedido.setNrPedido(123);
        
        LivroPedido livroPedido1 = new LivroPedido();
        livroPedido1.setLivro(livro1);
        livroPedido1.setQtdVenda(9);
        livroPedido1.setVlPrecoUnitario(livro1.getPreco());
        
        pedido.getListaLivro().add(livroPedido1);
        
        LivroPedido livroPedido2 = new LivroPedido();
        livroPedido2.setLivro(livro4);
        livroPedido2.setQtdVenda(12);
        livroPedido2.setVlPrecoUnitario(livro4.getPreco());
        
        pedido.getListaLivro().add(livroPedido2);
        
        LivroPedido livroPedido3 = new LivroPedido();
        livroPedido3.setLivro(livro5);
        livroPedido3.setQtdVenda(12);
        livroPedido3.setVlPrecoUnitario(livro5.getPreco());
        
        pedido.getListaLivro().add(livroPedido3);
        
        pedido.getFormasPagto().add(dinheiro);
        pedido.getFormasPagto().add(pix);
        
        Livraria livrariaMagica = new Livraria();
        livrariaMagica.setCnpj("88.740.130/0001-01");
        livrariaMagica.getListaLivro().add(pedido);
        livrariaMagica.setNmFantasia("Livraria Magia: onde seus seus sonhos se tornam realidade");
        
        pedido.atualizarEstoque(pedido);       
       
        System.out.println(livroPedido1.toString());
        System.out.println(livroPedido2.toString());
        System.out.println(livroPedido3.toString());
        
        
        System.out.println("Livro 1: \n" + livro1.toString());
        System.out.println("Livro 2: " + livro2.toString());
        System.out.println("Livro 3: " + livro3.toString());
        System.out.println("Livro 4: " + livro4.toString());
        System.out.println("Livro 5: " + livro5.toString());
        System.out.println("Livro 6: " + livro6.toString());
    }
}
