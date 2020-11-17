# 1 Pattern Name and Classification:
    Padrão StateSample
    
# 2 Intent:
    Permite que um objeto altere seu comportamento quando seu estado interno muda.
# 3 Motivition:
    Permite o objeto ter diferentes estados a partir das suas informações contidas na instancia e retornar comportamentos diferentes com base nesse estado
# 4 Applicability:
 
    Quando necessita gerenciar comportamentos diferentes dependendo de um numero de estados diferents.
    Exemplo:
     - Maquina de estados de comunicação com um sistema. Dependendo do estado de comunicação, podem ter diferentes comandos trocados entre sistemas.
     - Controle de Estado de conexão com internet.
 
# 5 Structure:
![alt text](https://github.com/andrejanuario/imagens/blob/master/estrutura.png)

# 6 Participants:
  
  Context: Define a interface com o cliente e mantém a instancia de estado concreto o qual define o estado atual do objeto.
  
  State: Interface que permite encapsular as responsabilidades associadas ao estado particular de contexto.
  
  ConcreteState: Um ou mais estados concretos que implementam a interface estado.

