package Program;

import entities.Bicicleta;
import entities.Carro;
import entities.Veiculo;

public class ProgramVeiculo {
    public static void main(String[] args) {
      Veiculo[] veiculo ={new Carro(), new Bicicleta()};

       for (Veiculo veiculos: veiculo){
           veiculos.mover();
       }


    }
}
