class Main {
  public static void main(String[] args) {
    Package pkg = new Package("Exemplo State");
    pkg.printStatus();
    
    pkg.previousState();
    pkg.printStatus();    

    pkg.nextState();
    pkg.printStatus();
    pkg.nextState();
    pkg.printStatus();
    pkg.nextState();
    pkg.printStatus();
    pkg.nextState();
    pkg.printStatus();
    pkg.nextState();
    pkg.printStatus();
    pkg.nextState();
    pkg.printStatus();
    
    pkg.previousState();
    pkg.printStatus();
    pkg.previousState();
    pkg.printStatus();
    pkg.previousState();
    pkg.printStatus();
    
  }
}