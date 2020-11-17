# 1 Pattern Name and Classification:
    Padrão Comportamental Strategy
    Tambem camado como Policy
    
# 2 Intent:
      Delega responsabilidades, aumentando a coesão e aprimorando a comunicação entre objetos.
    Permite que o algoritmo varie independentemente dos clientes que o utilizam.
# 3 Motivation:
    Permite definir novos algoritmos sem alterar as classes dos quais opera. Facilitando a escolha dos algoritmos criados para uma determinada função
# 4 Applicability:
 
      Define uma família de algoritmos, encapsular cada uma delas e torná-las intercambiáveis. 
    Permitindo variações independente do cliente que o esta utilizando.
      Utilizado quando há necessidade de de variar (intercambiar) o algoritmo de acordo com as condições de chamada.
 
# 5 Structure:
![alt text](https://github.com/andrejanuario/imagens/blob/master/estrutura%20strategy.png)

# 6 Participants:
  
  Context: Define e mantém referencia para uma classe Stretegy especifica.
  
  Strategy: Interface (ou classe abstrata) comum a todos os algoritmos suportados.
  
  Concrete Strategy: Um ou mais algoritmos fornecidos para aplicação.

