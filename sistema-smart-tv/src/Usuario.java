public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        // Ligando TV
        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada? : " + smartTv.ligada);

        // Diminuindo e aumentando volume da TV
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        // Verificando canal Atual e mudando 
        System.out.println("Canal Atual ? : " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal Atual ? : " + smartTv.canal);

        // Verificando informações da TV
        System.out.println("Volume Atual: " + smartTv.volume);
        System.out.println("TV Ligada ? : " + smartTv.ligada);
        System.out.println("Canal Atual ? : " + smartTv.canal);

        // Desligando TV
        smartTv.desligar();
        System.out.println("Novo Status -> TV Ligada? : " + smartTv.ligada);
    }
}
