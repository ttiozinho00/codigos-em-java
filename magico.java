package face;

import java.awt.Toolkit;
import javax.swing.JFrame;

public class magico 
{
	public magico() 
	{
    	initComponents();
    	setIcon();
	}
	@SuppressWarnings("unchecked")

	private void initComponents() 
	{

    	jLabel1 = new javax.swing.JLabel();
    	jLabel2 = new javax.swing.JLabel();
    	check_1 = new javax.swing.JCheckBox();
    	botao = new javax.swing.JToggleButton();
    	caixa_resultado = new javax.swing.JTextField();
    	check_2 = new javax.swing.JCheckBox();
    	check_4 = new javax.swing.JCheckBox();
    	check_8 = new javax.swing.JCheckBox();
    	check_16 = new javax.swing.JCheckBox();
    	check_32 = new javax.swing.JCheckBox();
    	quadrado_magico_imagem = new javax.swing.JLabel();

	    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	    jLabel1.setFont(new java.awt.Font("Script MT Bold", 0, 48)); // NOI18N
	    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	    jLabel1.setText("Quadrados Mágicos");

	    jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
	    jLabel2.setText("Pense em um número de 1 ao 60. Selecione 1 ou mais quadrados onde estão o seu número:");

	    check_1.setText("Verde");

	    botao.setText("Adivinhar");
	    botao.addActionListener(new java.awt.event.ActionListener() 
	    {
	        public void actionPerformed(java.awt.event.ActionEvent evt) 
	        {
	            botaoActionPerformed(evt);
	        }
	    });

	    check_2.setText("Vermelho");

	    check_4.setText("Azul");

	    check_8.setText("Amarelo");

	    check_16.setText("Marrom");

	    check_32.setText("Roxo"); // NOI18N

	    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	    getContentPane().setLayout(layout);
	    layout.setHorizontalGroup(
	        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	        .addGroup(layout.createSequentialGroup()
	            .addContainerGap()
	            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addComponent(jLabel2)
	                .addGroup(layout.createSequentialGroup()
	                    .addGap(10, 10, 10)
	                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                        .addGroup(layout.createSequentialGroup()
	                            .addGap(81, 81, 81)
	                            .addComponent(check_8)
	                            .addGap(174, 174, 174)
	                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addComponent(caixa_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addComponent(botao))
	                                .addGroup(layout.createSequentialGroup()
	                                    .addComponent(check_16)
	                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                    .addComponent(check_32)
	                                    .addGap(115, 115, 115))))
	                        .addGroup(layout.createSequentialGroup()
	                            .addComponent(quadrado_magico_imagem)
	                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                        .addGroup(layout.createSequentialGroup()
	                            .addGap(92, 92, 92)
	                            .addComponent(check_1)
	                            .addGap(181, 181, 181)
	                            .addComponent(check_2)
	                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                            .addComponent(check_4)
	                            .addGap(107, 107, 107)))))
	            .addContainerGap())
	    );

	    layout.setVerticalGroup(
	        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	        .addGroup(layout.createSequentialGroup()
	            .addContainerGap()
	            .addComponent(jLabel1)
	            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	            .addComponent(jLabel2)
	            .addGap(10, 10, 10)
	            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                .addComponent(check_1)
	                .addComponent(check_2)
	                .addComponent(check_4))
	            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	            .addComponent(quadrado_magico_imagem)
	            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                .addGroup(layout.createSequentialGroup()
	                    .addGap(41, 41, 41)
	                    .addComponent(botao))
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(check_8)
	                    .addComponent(check_16)
	                    .addComponent(check_32)))
	            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	            .addComponent(caixa_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
	            .addContainerGap())
	    );

    	pack();
	}// </editor-fold>                        

	private void botaoActionPerformed(java.awt.event.ActionEvent evt) 
	{                                      
	    
	    int soma = 0;
	    
	    if (check_1.isSelected()) {
	        soma =+ 1;
	    }
	    
	    if (check_2.isSelected()) {
	        soma =+ 2;
	    }
	    
	    if (check_4.isSelected()) {
	        soma =+ 4;
	    }
	    
	    if (check_8.isSelected()) {
	        soma =+ 8;
	    }
	    
	    if (check_16.isSelected()) {
	        soma =+ 16;
	    }
	    
	    if (check_32.isSelected()) {
	        soma =+ 32;
	    }
	    
	    String mostrar = Integer.toString(soma);
	    
	    caixa_resultado.setText(mostrar);
	    
	}                                     

	public static void main(String args[]) 
	{
	    
	    java.awt.EventQueue.invokeLater(new Runnable() 
	    {
	        public void run() 
	        {
	            new magico().setVisible(true);
	        }
	    });
	}

	// Variables declaration - do not modify                     
	private javax.swing.JToggleButton botao;
	private javax.swing.JTextField caixa_resultado;
	private javax.swing.JCheckBox check_1;
	private javax.swing.JCheckBox check_16;
	private javax.swing.JCheckBox check_2;
	private javax.swing.JCheckBox check_32;
	private javax.swing.JCheckBox check_4;
	private javax.swing.JCheckBox check_8;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel quadrado_magico_imagem;
	// End of variables declaration                   

	private void setIcon() 
	{
	    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("quadrados_magicos.png")));
	}
}