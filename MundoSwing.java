import javax.swing.JFrame;
import java.util.*; 

public class MundoSwing extends JFrame 
{
	private static final long serialVersionUID = 1;

    public MundoSwing() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() 
    {

        lblMensagem = new javax.swing.JLabel();
        btnClick = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMensagem.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblMensagem.setForeground(new java.awt.Color(0, 0, 153));
        lblMensagem.setText("Mensagem");

        btnClick.setBackground(new java.awt.Color(255, 255, 255));
        btnClick.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnClick.setForeground(new java.awt.Color(0, 51, 0));
        btnClick.setText("Aperte");
        btnClick.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnClick.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                btnClickActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addComponent(lblMensagem)
                .addGap(143, 143, 143))
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(btnClick)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblMensagem)
                .addGap(18, 18, 18)
                .addComponent(btnClick)
                .addContainerGap(189, Short.MAX_VALUE))
        );

        pack();
    }

    private void btnClickActionPerformed(java.awt.event.ActionEvent evt) 
    {
        lblMensagem.setText("Olá, Mundo! ");
    }

    public static void main(String args[]) 
    {
     	cls();
        java.awt.EventQueue.invokeLater(() -> {
            new MundoSwing().setVisible(true);
        });
    }

    public static void cls() 
	{
		try 
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		}

		catch (final Exception E) 
		{
			System.out.println(E);
		}
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClick;
    private javax.swing.JLabel lblMensagem;
    // End of variables declaration//GEN-END:variables
}
