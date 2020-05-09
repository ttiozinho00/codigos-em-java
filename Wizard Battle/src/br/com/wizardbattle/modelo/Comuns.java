package br.com.wizardbattle.modelo;

public interface Comuns 
{
    
    public enum TIPO_CARTAS { ataque , defesa };
    
    public static final int MAXIMO_NIVEL = 5;
    public static final int MAXIMA_FORCA = 100;
    public static final int MAXIMA_VIDA  = 2000;
    public static final int MAXIMO_PODER = 500;
    
    public static final boolean FIM_JOGO           = false;
    public static final boolean CARREGAMENTO_PODER = false;
    
    public static final int ALTURA = 810;
    public static final int LARGURA = 1226;
    
    public static final String CAMINHO_GRAFICOS = "/sprites/";
    
    public static final int DELAY = 17;

}
