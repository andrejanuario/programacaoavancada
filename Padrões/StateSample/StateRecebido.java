public class StateRecebido extends PackageState {
  public StateRecebido(Package pkg) {
    super(pkg);
  }

  public void printStatus() {
    System.out.println("Pacote Recebido");
  }

  public void previousState() {
    System.out.println("Transicionado para o próximo estado");
    this.getPackage().setState(new StateEnviado(this.getPackage()));
  }

  public void nextState() {
     System.out.println("Já alcançoo o ultimo estado");
  }
}