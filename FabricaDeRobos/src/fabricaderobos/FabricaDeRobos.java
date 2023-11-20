package fabricaderobos;

public class FabricaDeRobos {

    public static void main(String[] args) {
        
        Robo robo1 = new Robo(false);
        
        Robo robo2 = new Robo(true);
        
        robo1.corpo.setTipo("Pernas");
        robo1.corpo.setCor("Branco");
        
        //robo1.process.setMarca("AMD");
        //robo1.process.setFrequenciaProcessamento(750);
        
        robo2.corpo.setTipo("Esférico");
        robo2.corpo.setCor("Laranja");
        
        robo2.process.setMarca("Intel");
        robo2.process.setFrequenciaProcessamento(500);
        
        robo1.mostraConfigRobo();
        robo2.mostraConfigRobo();
        
    }
    
}
