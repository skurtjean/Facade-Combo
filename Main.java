import java.util.Scanner;

class Main {
  public static void main(String[] args) {
        System.out.println("Selecione seu compo"); 
        System.out.println("1. Combo Master"); 
        System.out.println("2. Super Combo"); 
        System.out.print("Sua escolha: "); 
 
        Scanner input = new Scanner(System.in); 
 
        int tipo = input.nextInt(); 
        Combo combo = new Combo(); 
        combo.CriarCombo(tipo); 
  }
}

class Produto {
  private String Descricao;
  private double Preco;
  
  public void setDescricao(String descricao){
    this.Descricao = descricao;
  }
  
  public void setPreco(double preco){
    this.Preco = preco;
  }
  
  public String getDescricao(){
    return this.Descricao;
  }
  
  public double getPreco(){
    return this.Preco;
  }
}

class Burguer extends Produto {
  private int Gramas;
  
  public void BurguerCombo(int Combo){
    if(Combo == 1){
      this.setDescricao("1 hamburguer, queijo, presunto e bacon");
      this.setPreco(22.90);
      this.setGramas(180);
    }
    else if(Combo == 2){
      this.setDescricao("2 hamburguers, queijo, bacon e molho especial");
      this.setPreco(25.90);
      this.setGramas(180);
    }
    System.out.println("Burguer: " + this.getDescricao()); 
    System.out.println("Preço: R$ " + this.getPreco()); 
    System.out.println("Gramas: " + this.getGramas()); 
  }
  
  public void setGramas(int gramas){
    this.Gramas = gramas;
  }
  public int getGramas(){
    return this.Gramas;
  }
}

class Sobremesa extends Produto {
  private String Tamanho;
  
  public void SobremesaCombo(int Combo){
    if(Combo == 1){
      this.setDescricao("Copo de 300 ml de sorvete de flocos");
      this.setPreco(11.90);
      this.setTamanho("300 ml");
    }
    else if(Combo == 2){
      this.setDescricao("Mini pudim");
      this.setPreco(8.50);
      this.setTamanho("100 g");
    }
    System.out.println("Sobremesa: " + this.getDescricao()); 
    System.out.println("Preço: R$ " + this.getPreco()); 
    System.out.println("Tamanho: " + this.getTamanho()); 
  }
  
  public void setTamanho(String tamanho){
    this.Tamanho = tamanho;
  }

  public String getTamanho(){
    return this.Tamanho;
  }
}

class Bebida extends Produto {
  private int Ml;
  
  public void BebidaCombo(int Combo){
    if(Combo == 1){
      this.setDescricao("Coca cola");
      this.setPreco(5.50);
      this.setMl(300);
    }
    else if(Combo == 2){
      this.setDescricao("Guaraná");
      this.setPreco(5.50);
      this.setMl(300);
    }
    System.out.println("Bebida: " + this.getDescricao()); 
    System.out.println("Preço: R$ " + this.getPreco()); 
    System.out.println("Quantidade: " + this.getMl()); 
  }
  
  public void setMl(int ml){
    this.Ml = ml;
  }

  public int getMl(){
    return this.Ml;
  }
}

class Combo {
  private Burguer burguer;
  private Sobremesa sobremesa;
  private Bebida bebida;
  
  public Combo(){
    burguer = new Burguer();
    sobremesa = new Sobremesa();
    bebida = new Bebida();
  }
  
  public void CriarCombo(int tipo){
    System.out.println("Pedido: \n"); 
    System.out.println("----  Burguer  ----"); 
    this.burguer.BurguerCombo(tipo);
    System.out.println("----  Sobremesa  ----"); 
    this.sobremesa.SobremesaCombo(tipo);
    System.out.println("----  Bebida  ----"); 
    this.bebida.BebidaCombo(tipo);
  }
}