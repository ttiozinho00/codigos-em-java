package br.com.wizardbattle;

import br.com.wizardbattle.visao.*;
import br.com.wizardbattle.modelo.*;
import javax.swing.JFrame;

public class Principal extends JFrame implements Comuns
{
    
    public Principal ()
    {
        add(new Tela());

        setTitle("Wizard Battle");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setSize(LARGURA, ALTURA);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }

    public static void main(String[] args)
    {
        Principal principal = new Principal();
    }
    
}