package ocms.app;

public class OCMSRegistrationPage extends javax.swing.JFrame {

    public OCMSRegistrationPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JGenderButtongroup = new javax.swing.ButtonGroup();
        JMainPanel = new javax.swing.JPanel();
        JFullnameLabel = new javax.swing.JLabel();
        JAgeLabel = new javax.swing.JLabel();
        JGenderLabel = new javax.swing.JLabel();
        JCourseLabel = new javax.swing.JLabel();
        JUsernameLabel = new javax.swing.JLabel();
        JPasswordLabel = new javax.swing.JLabel();
        fullname = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        course = new javax.swing.JComboBox<>();
        JSubmitButton = new javax.swing.JButton();
        JLoginSwitchLabel = new javax.swing.JLabel();
        picture = new javax.swing.JLabel();
        JRegisterIconLabel = new javax.swing.JLabel();
        picture_path = new javax.swing.JTextField();
        JPictureLabel = new javax.swing.JLabel();
        JBrowseButton = new javax.swing.JButton();
        JTaskbarPanel = new javax.swing.JPanel();
        JTitleLabel = new javax.swing.JLabel();
        JCloseLabel = new javax.swing.JLabel();
        JMinimizeLabel = new javax.swing.JLabel();
        JPictureToglButton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        JMainPanel.setBackground(new java.awt.Color(102, 102, 102));
        JMainPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        JFullnameLabel.setText("FULLNAME");

        JAgeLabel.setText("AGE");

        JGenderLabel.setText("GENDER");

        JCourseLabel.setText("COURSE");

        JUsernameLabel.setText("USERNAME");

        JPasswordLabel.setText("PASSWORD");

        fullname.setBackground(new java.awt.Color(255, 153, 51));

        age.setBackground(new java.awt.Color(255, 153, 51));

        username.setBackground(new java.awt.Color(255, 153, 51));

        password.setBackground(new java.awt.Color(255, 153, 51));

        male.setBackground(new java.awt.Color(255, 153, 51));
        JGenderButtongroup.add(male);
        male.setText("MALE");

        female.setBackground(new java.awt.Color(255, 153, 51));
        JGenderButtongroup.add(female);
        female.setText("FEMALE");

        course.setBackground(new java.awt.Color(255, 153, 51));
        course.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECT-", "C", "C++", "JAVA", "VB" }));

        JSubmitButton.setBackground(new java.awt.Color(0, 204, 204));
        JSubmitButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JSubmitButton.setText("SUBMIT");
        JSubmitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JSubmitButtonActionPerformed(evt);
            }
        });

        JLoginSwitchLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLoginSwitchLabel.setText("CLICK HERE TO GO BACK TO LOGIN PAGE");
        JLoginSwitchLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JLoginSwitchLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLoginSwitchLabelMouseClicked(evt);
            }
        });

        picture.setBackground(new java.awt.Color(153, 204, 0));
        picture.setForeground(new java.awt.Color(51, 255, 51));
        picture.setIcon(new javax.swing.ImageIcon("C:\\Users\\Venkatesh\\Downloads\\ICONS\\Popular Cute Color Icons_files\\user-male.png")); // NOI18N
        picture.setEnabled(false);

        JRegisterIconLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Venkatesh\\Downloads\\course2.png")); // NOI18N

        picture_path.setBackground(new java.awt.Color(255, 153, 51));
        picture_path.setEnabled(false);

        JPictureLabel.setText("PICTURE (passport size)");

        JBrowseButton.setBackground(new java.awt.Color(255, 102, 102));
        JBrowseButton.setText("BROWSE");
        JBrowseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBrowseButton.setEnabled(false);
        JBrowseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBrowseButtonActionPerformed(evt);
            }
        });

        JTaskbarPanel.setBackground(java.awt.Color.orange);

        JTitleLabel.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        JTitleLabel.setText("REGISTRATION FORM");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(428, 428, 428)
                .addComponent(JMinimizeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JCloseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        JTaskbarPanelLayout.setVerticalGroup(
            JTaskbarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JCloseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JMinimizeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JTaskbarPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JTitleLabel)
                .addContainerGap())
        );

        JPictureToglButton.setText("Click to set picture");
        JPictureToglButton.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                JPictureToglButtonStateChanged(evt);
            }
        });

        javax.swing.GroupLayout JMainPanelLayout = new javax.swing.GroupLayout(JMainPanel);
        JMainPanel.setLayout(JMainPanelLayout);
        JMainPanelLayout.setHorizontalGroup(
            JMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTaskbarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(JMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JMainPanelLayout.createSequentialGroup()
                        .addGap(490, 490, 490)
                        .addComponent(JSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JMainPanelLayout.createSequentialGroup()
                        .addGap(414, 414, 414)
                        .addComponent(JLoginSwitchLabel))
                    .addGroup(JMainPanelLayout.createSequentialGroup()
                        .addGroup(JMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JMainPanelLayout.createSequentialGroup()
                                .addGroup(JMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JFullnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JAgeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JGenderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(JMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(JPasswordLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                        .addComponent(JUsernameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(JCourseLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(JPictureLabel))
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JMainPanelLayout.createSequentialGroup()
                                .addComponent(JPictureToglButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(JMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(fullname)
                                .addComponent(age)
                                .addComponent(username)
                                .addComponent(password)
                                .addGroup(JMainPanelLayout.createSequentialGroup()
                                    .addComponent(male, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(female, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                                .addComponent(course, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(picture_path, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(picture, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBrowseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(JRegisterIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        JMainPanelLayout.setVerticalGroup(
            JMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JMainPanelLayout.createSequentialGroup()
                .addComponent(JTaskbarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(JMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JMainPanelLayout.createSequentialGroup()
                        .addGroup(JMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JMainPanelLayout.createSequentialGroup()
                                .addGroup(JMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JMainPanelLayout.createSequentialGroup()
                                        .addGap(417, 417, 417)
                                        .addComponent(JBrowseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(JMainPanelLayout.createSequentialGroup()
                                        .addGap(362, 362, 362)
                                        .addComponent(picture, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addGroup(JMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(picture_path, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JPictureToglButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(JMainPanelLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(JRegisterIconLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(73, 73, 73)))
                        .addComponent(JSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(JLoginSwitchLabel)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JMainPanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(JMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JFullnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(age, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(JAgeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(JMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JGenderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(male)
                            .addComponent(female))
                        .addGap(26, 26, 26)
                        .addGroup(JMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JCourseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(course, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                        .addGroup(JMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JMainPanelLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(JUsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JMainPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(JPasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(73, 73, 73)
                        .addComponent(JPictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JSubmitButtonActionPerformed
        String query;
        String[] values;
        if ("".equals(picture_path.getText())) {
            query = "INSERT INTO login (username,password,fullname,age,course,gender) VALUES(?,?,?,?,?,?)";
            values = new String[]{
                username.getText(),
                new String(password.getPassword()),
                fullname.getText(),
                age.getText(),
                String.valueOf(course.getSelectedItem()),
                JGenderButtongroup.getSelection().getActionCommand()
            };
        } else {
            query = "INSERT INTO login (username,password,fullname,age,course,gender,picture) VALUES(?,?,?,?,?,?,?)";
            values = new String[]{
                username.getText(),
                new String(password.getPassword()),
                fullname.getText(),
                age.getText(),
                String.valueOf(course.getSelectedItem()),
                JGenderButtongroup.getSelection().getActionCommand(),
                picture_path.getText()
            };
        }
        try {
            ocms.db.DBAccessor dba = new ocms.db.DBAccessor();
            dba.execute(query, values);
            javax.swing.JOptionPane.showMessageDialog(this, "YOUR REGISTRATION IS SUCCESSFULLY DONE", "", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } catch (java.sql.SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_JSubmitButtonActionPerformed

    private void JCloseLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JCloseLabelMouseClicked
        this.dispose();
    }//GEN-LAST:event_JCloseLabelMouseClicked

    private void JMinimizeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMinimizeLabelMouseClicked
        this.setState(javax.swing.JFrame.ICONIFIED);
    }//GEN-LAST:event_JMinimizeLabelMouseClicked

    private void JLoginSwitchLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLoginSwitchLabelMouseClicked
        new OCMSUserLoginPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JLoginSwitchLabelMouseClicked

    private void JBrowseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBrowseButtonActionPerformed
        javax.swing.JFileChooser chooser = new javax.swing.JFileChooser();
        chooser.showOpenDialog(this);
        String filepath = chooser.getSelectedFile().getAbsolutePath();
        picture_path.setText(filepath);
        javax.swing.ImageIcon icon = new javax.swing.ImageIcon(new javax.swing.ImageIcon(filepath).getImage().getScaledInstance(picture.getWidth(), picture.getHeight(), java.awt.Image.SCALE_SMOOTH));
        picture.setIcon(icon);
    }//GEN-LAST:event_JBrowseButtonActionPerformed

    private void JPictureToglButtonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_JPictureToglButtonStateChanged
        boolean on_off = JPictureToglButton.isSelected();
        if (on_off) {
            JPictureToglButton.setText("Click to not set picture");
        } else {
            JPictureToglButton.setText("Click to set picture");
        }
        picture.setIcon(new javax.swing.ImageIcon("C:\\Users\\Venkatesh\\Downloads\\ICONS\\Popular Cute Color Icons_files\\user-male.png"));
        picture_path.setText("");
        picture.setEnabled(on_off);
        picture_path.setEnabled(on_off);
        JBrowseButton.setEnabled(on_off);
    }//GEN-LAST:event_JPictureToglButtonStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JAgeLabel;
    private javax.swing.JButton JBrowseButton;
    private javax.swing.JLabel JCloseLabel;
    private javax.swing.JLabel JCourseLabel;
    private javax.swing.JLabel JFullnameLabel;
    private javax.swing.ButtonGroup JGenderButtongroup;
    private javax.swing.JLabel JGenderLabel;
    private javax.swing.JLabel JLoginSwitchLabel;
    private javax.swing.JPanel JMainPanel;
    private javax.swing.JLabel JMinimizeLabel;
    private javax.swing.JLabel JPasswordLabel;
    private javax.swing.JLabel JPictureLabel;
    private javax.swing.JToggleButton JPictureToglButton;
    private javax.swing.JLabel JRegisterIconLabel;
    private javax.swing.JButton JSubmitButton;
    private javax.swing.JPanel JTaskbarPanel;
    private javax.swing.JLabel JTitleLabel;
    private javax.swing.JLabel JUsernameLabel;
    private javax.swing.JTextField age;
    private javax.swing.JComboBox<String> course;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField fullname;
    private javax.swing.JRadioButton male;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel picture;
    private javax.swing.JTextField picture_path;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
