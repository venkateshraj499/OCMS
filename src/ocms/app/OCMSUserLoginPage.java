package ocms.app;

public class OCMSUserLoginPage extends javax.swing.JFrame {

    public OCMSUserLoginPage() {
        initComponents();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JMainPanel = new javax.swing.JPanel();
        JUsernameLabel = new javax.swing.JLabel();
        JPasswordLabel = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        JLoginButton = new javax.swing.JButton();
        JTaskbarPanel = new javax.swing.JPanel();
        JTitleLabel = new javax.swing.JLabel();
        JCloseLabel = new javax.swing.JLabel();
        JMinimizeLabel = new javax.swing.JLabel();
        JRegisterLabel = new javax.swing.JLabel();
        JAdminSwitchLabel = new javax.swing.JLabel();
        JLoginIconLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        JMainPanel.setBackground(new java.awt.Color(102, 102, 102));

        JUsernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        JUsernameLabel.setText("USERNAME");

        JPasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        JPasswordLabel.setText("PASSWORD");

        username.setBackground(new java.awt.Color(255, 153, 0));

        password.setBackground(new java.awt.Color(255, 153, 0));

        JLoginButton.setBackground(new java.awt.Color(0, 204, 0));
        JLoginButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JLoginButton.setForeground(new java.awt.Color(255, 255, 255));
        JLoginButton.setText("LOGIN");
        JLoginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JLoginButtonActionPerformed(evt);
            }
        });

        JTaskbarPanel.setBackground(java.awt.Color.orange);

        JTitleLabel.setFont(new java.awt.Font("Sitka Subheading", 1, 24)); // NOI18N
        JTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JTitleLabel.setText("LOGIN FORM");

        JCloseLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        JCloseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JCloseLabel.setText("X");
        JCloseLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JCloseLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JCloseLabelMouseClicked(evt);
            }
        });

        JMinimizeLabel.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        JMinimizeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JMinimizeLabel.setText("-");
        JMinimizeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JMinimizeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMinimizeLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JTaskbarPanelLayout = new javax.swing.GroupLayout(JTaskbarPanel);
        JTaskbarPanel.setLayout(JTaskbarPanelLayout);
        JTaskbarPanelLayout.setHorizontalGroup(
            JTaskbarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JTaskbarPanelLayout.createSequentialGroup()
                .addContainerGap(344, Short.MAX_VALUE)
                .addComponent(JTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(342, 342, 342)
                .addComponent(JMinimizeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JCloseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        JTaskbarPanelLayout.setVerticalGroup(
            JTaskbarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JTaskbarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(JCloseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JMinimizeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        JRegisterLabel.setForeground(new java.awt.Color(255, 255, 255));
        JRegisterLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JRegisterLabel.setText("NEW USER ?.... REGISTER NOW....");
        JRegisterLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JRegisterLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JRegisterLabelMouseClicked(evt);
            }
        });

        JAdminSwitchLabel.setForeground(new java.awt.Color(255, 255, 255));
        JAdminSwitchLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JAdminSwitchLabel.setText("ADMIN CLICK HERE");
        JAdminSwitchLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JAdminSwitchLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JAdminSwitchLabelMouseClicked(evt);
            }
        });

        JLoginIconLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Venkatesh\\Downloads\\course2.png")); // NOI18N

        javax.swing.GroupLayout JMainPanelLayout = new javax.swing.GroupLayout(JMainPanel);
        JMainPanel.setLayout(JMainPanelLayout);
        JMainPanelLayout.setHorizontalGroup(
            JMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTaskbarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(JMainPanelLayout.createSequentialGroup()
                .addGroup(JMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JMainPanelLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(JMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JRegisterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JMainPanelLayout.createSequentialGroup()
                                .addGroup(JMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JUsernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JPasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                                .addGap(42, 42, 42)
                                .addGroup(JMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(username)
                                    .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))))
                    .addGroup(JMainPanelLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(JAdminSwitchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JMainPanelLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(JLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLoginIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        JMainPanelLayout.setVerticalGroup(
            JMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JMainPanelLayout.createSequentialGroup()
                .addComponent(JTaskbarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(JMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JMainPanelLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(JMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JUsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(JLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(JRegisterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JAdminSwitchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JMainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLoginIconLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JMainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JMainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JLoginButtonActionPerformed
        String query = "Select * from login where username = ? and password = ?";
        String [] values = new String[]{
            username.getText(), new String(password.getPassword())
        };
        try{
            ocms.db.DBAccessor dba = new ocms.db.DBAccessor();
            java.sql.ResultSet rs = dba.retrieve(query, values);
            if (rs.next()) {
                new OCMSUserMainPage(username.getText()).setVisible(true);
                this.dispose();
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Invalid USERNAME or PASSWORD!", "", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        } catch (java.sql.SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_JLoginButtonActionPerformed

    private void JCloseLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JCloseLabelMouseClicked
        this.dispose();
    }//GEN-LAST:event_JCloseLabelMouseClicked

    private void JRegisterLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JRegisterLabelMouseClicked
        new OCMSRegistrationPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JRegisterLabelMouseClicked

    private void JMinimizeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMinimizeLabelMouseClicked
        this.setState(OCMSUserLoginPage.ICONIFIED);
    }//GEN-LAST:event_JMinimizeLabelMouseClicked

    private void JAdminSwitchLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JAdminSwitchLabelMouseClicked
        new OCMSAdminLoginPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JAdminSwitchLabelMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JAdminSwitchLabel;
    private javax.swing.JLabel JCloseLabel;
    private javax.swing.JButton JLoginButton;
    private javax.swing.JLabel JLoginIconLabel;
    private javax.swing.JPanel JMainPanel;
    private javax.swing.JLabel JMinimizeLabel;
    private javax.swing.JLabel JPasswordLabel;
    private javax.swing.JLabel JRegisterLabel;
    private javax.swing.JPanel JTaskbarPanel;
    private javax.swing.JLabel JTitleLabel;
    private javax.swing.JLabel JUsernameLabel;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
