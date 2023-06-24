
package visao;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;


public abstract class FormPadraoConsulta extends JInternalFrame {
    public abstract void inicializarComponentes();
    public FormPadraoConsulta() {
        initComponents();
        inicializarComponentes();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Joseph Barbosa de Souza
        jpnFormulario = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();

        //======== this ========
        setVisible(true);
        setClosable(true);
        var contentPane = getContentPane();

        //======== jpnFormulario ========
        {
            jpnFormulario. addPropertyChangeListener(
            new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062order"
            .equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } );

            //---- label1 ----
            label1.setText("text");
            label1.setFont(new Font("Segoe UI", Font.PLAIN, 22));

            //---- label2 ----
            label2.setText("text");
            label2.setFont(new Font("Segoe UI", Font.PLAIN, 48));
            label2.setVisible(false);

            GroupLayout jpnFormularioLayout = new GroupLayout(jpnFormulario);
            jpnFormulario.setLayout(jpnFormularioLayout);
            jpnFormularioLayout.setHorizontalGroup(
                jpnFormularioLayout.createParallelGroup()
                    .addGroup(jpnFormularioLayout.createSequentialGroup()
                        .addGroup(jpnFormularioLayout.createParallelGroup()
                            .addGroup(jpnFormularioLayout.createSequentialGroup()
                                .addGap(211, 211, 211)
                                .addComponent(label2, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpnFormularioLayout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(label1)))
                        .addContainerGap(339, Short.MAX_VALUE))
            );
            jpnFormularioLayout.setVerticalGroup(
                jpnFormularioLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, jpnFormularioLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(label1)
                        .addGap(38, 38, 38)
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(256, Short.MAX_VALUE))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(jpnFormulario, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(jpnFormulario, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Joseph Barbosa de Souza
    protected JPanel jpnFormulario;
    protected JLabel label1;
    protected JLabel label2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
