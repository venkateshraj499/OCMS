package ocms.app;

public class OCMSAdminLoginPage extends javax.swing.JFrame {

    public OCMSAdminLoginPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JTaskbarPanel = new javax.swing.JPanel();
        JTitleLabel = new javax.swing.JLabel();
        JMinimizeLabel = new javax.swing.JLabel();
        JCloseLabel = new javax.swing.JLabel();
        JMainPanel = new javax.swing.JPanel();
        JHelloLabel = new javax.swing.JLabel();
        JLoginIconLabel = new javax.swing.JLabel();
        JPasswordLabel = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        JLoginButton = new javax.swing.JButton();
        JUserSwitchLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        JTaskbarPanel.setBackground(new java.awt.Color(255, 153, 0));
        JTaskbarPanel.setForeground(new java.awt.Color(255, 153, 0));

        JTitleLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JTitleLabel.setText("ADMIN LOGIN");

        JMinimizeLabel.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        JMinimizeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JMinimizeLabel.setText("-");
        JMinimizeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JMinimizeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMinimizeLabelMouseClicked(evt);
            }
        });

        JCloseLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        JCloseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JCloseLabel.setText("X");
        JCloseLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JCloseLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JCloseLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JTaskbarPanelLayout = new javax.swing.GroupLayout(JTaskbarPanel);
        JTaskbarPanel.setLayout(JTaskbarPanelLayout);
        JTaskbarPanelLayout.setHorizontalGroup(
            JTaskbarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JTaskbarPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(312, 312, 312)
                .addComponent(JMinimizeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JCloseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        JTaskbarPanelLayout.setVerticalGroup(
            JTaskbarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JCloseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JMinimizeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
            .addGroup(JTaskbarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        JMainPanel.setBackground(new java.awt.Color(102, 102, 102));

        JHelloLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JHelloLabel.setText("HELLO ADMIN ENTER THE PASSWORD PLEASE");

        JLoginIconLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Venkatesh\\Downloads\\course2.png")); // NOI18N

        JPasswordLabel.setText("PASSWORD");

        JLoginButton.setBackground(new java.awt.Color(0, 255, 0));
        JLoginButton.setText("LOGIN");
        JLoginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JLoginButtonActionPerformed(evt);
            }
        });

        JUserSwitchLabel.setText("GO BACK TO LOGIN PAGE");
        JUserSwitchLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JUserSwitchLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JUserSwitchLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JMainPanelLayout = new javax.swing.GroupLayout(JMainPanel);
        JMainPanel.setLayout(JMainPanelLayout);
        JMainPanelLayout.setHorizontalGroup(
            JMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JMainPanelLayout.createSequentialGroup()
                .addGroup(JMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JMainPanelLayout.createSequentialGroup()
                        .addGroup(JMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JMainPanelLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(JPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JMainPanelLayout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(JHelloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JMainPanelLayout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(JLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JMainPanelLayout.createSequentialGroup()
                        .addComponent(JUserSwitchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)))
                .addComponent(JLoginIconLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        JMainPanelLayout.setVerticalGroup(
            JMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JMainPanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(JHelloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(JMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(JLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(JUserSwitchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(JMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLoginIconLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTaskbarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(JTaskbarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JLoginButtonActionPerformed
        if (("iamadmin".equals(new String(password.getPassword())))) {
            new OCMSAdminMainPage().setVisible(true);
            this.dispose();
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "INCORRECT ADMIN PASSWORD", "", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JLoginButtonActionPerformed

    private void JUserSwitchLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JUserSwitchLabelMouseClicked
        new OCMSUserLoginPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JUserSwitchLabelMouseClicked

    private void JCloseLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JCloseLabelMouseClicked
        this.dispose();
    }//GEN-LAST:event_JCloseLabelMouseClicked

    private void JMinimizeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMinimizeLabelMouseClicked
        this.setState(javax.swing.JFrame.ICONIFIED);
    }//GEN-LAST:event_JMinimizeLabelMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JCloseLabel;
    private javax.swing.JLabel JHelloLabel;
    private javax.swing.JButton JLoginButton;
    private javax.swing.JLabel JLoginIconLabel;
    private javax.swing.JPanel JMainPanel;
    private javax.swing.JLabel JMinimizeLabel;
    private javax.swing.JLabel JPasswordLabel;
    private javax.swing.JPanel JTaskbarPanel;
    private javax.swing.JLabel JTitleLabel;
    private javax.swing.JLabel JUserSwitchLabel;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
