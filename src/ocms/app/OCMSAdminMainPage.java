package ocms.app;

public class OCMSAdminMainPage extends javax.swing.JFrame {

    public OCMSAdminMainPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JMainPanel = new javax.swing.JPanel();
        JTaskbarPanel = new javax.swing.JPanel();
        JTitleLabel = new javax.swing.JLabel();
        JMinimizeLabel = new javax.swing.JLabel();
        JCloseLabel = new javax.swing.JLabel();
        JMainTabPane = new javax.swing.JTabbedPane();
        JUpdatePanel = new javax.swing.JPanel();
        JLogoutButton = new javax.swing.JButton();
        JScheduleScrolPane = new javax.swing.JScrollPane();
        shedule = new javax.swing.JTextArea();
        JPostScheduleButton = new javax.swing.JButton();
        course = new javax.swing.JComboBox<>();
        topic = new javax.swing.JTextField();
        JTopicLabel = new javax.swing.JLabel();
        JContentLabel = new javax.swing.JLabel();
        JNoteLabel = new javax.swing.JLabel();
        JVideolinkLabel = new javax.swing.JLabel();
        videolink = new javax.swing.JTextField();
        JQuestionsPanel = new javax.swing.JPanel();
        JQuestionLabel = new javax.swing.JLabel();
        JQuestionScrolPane = new javax.swing.JScrollPane();
        question = new javax.swing.JTextArea();
        languagetype = new javax.swing.JComboBox<>();
        JNotificationPanel = new javax.swing.JPanel();
        JNotificationLabel = new javax.swing.JLabel();
        JNotifiactionScrolPane = new javax.swing.JScrollPane();
        notification = new javax.swing.JTextArea();
        JDoubtsPanel = new javax.swing.JPanel();
        JDoubtsScrolPane = new javax.swing.JScrollPane();
        doubts = new javax.swing.JTable();
        JGetdoubtsButton = new javax.swing.JButton();
        JPostDoubtButton = new javax.swing.JButton();
        JReviewsPanel = new javax.swing.JPanel();
        JReviewsLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        JTaskbarPanel.setBackground(new java.awt.Color(255, 153, 0));

        JTitleLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        JTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JTitleLabel.setText("XOX ACADEMY");

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
        JCloseLabel.setForeground(new java.awt.Color(0, 51, 51));
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
                .addContainerGap()
                .addComponent(JTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JMinimizeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JCloseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        JTaskbarPanelLayout.setVerticalGroup(
            JTaskbarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JCloseLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(JTaskbarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(JMinimizeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
        );

        JUpdatePanel.setBackground(new java.awt.Color(153, 153, 153));

        JLogoutButton.setBackground(new java.awt.Color(255, 51, 51));
        JLogoutButton.setText("LOGOUT");
        JLogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JLogoutButtonActionPerformed(evt);
            }
        });

        shedule.setColumns(20);
        shedule.setRows(5);
        JScheduleScrolPane.setViewportView(shedule);

        JPostScheduleButton.setText("POST");
        JPostScheduleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPostScheduleButtonActionPerformed(evt);
            }
        });

        course.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECT-", "C", "C++", "VB", "JAVA" }));

        JTopicLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JTopicLabel.setText("TOPIC  :");

        JContentLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JContentLabel.setText("CONTENT   :");

        JNoteLabel.setText("(NOTE : POST YOUR SHEDULE QUESTIONS AND NOTIFICATIN HERE)");

        JVideolinkLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JVideolinkLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JVideolinkLabel.setText("VIDEO LINK");

        javax.swing.GroupLayout JUpdatePanelLayout = new javax.swing.GroupLayout(JUpdatePanel);
        JUpdatePanel.setLayout(JUpdatePanelLayout);
        JUpdatePanelLayout.setHorizontalGroup(
            JUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JUpdatePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTopicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JContentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JVideolinkLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(JUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JUpdatePanelLayout.createSequentialGroup()
                            .addGroup(JUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(JUpdatePanelLayout.createSequentialGroup()
                                    .addComponent(JPostScheduleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(237, 237, 237))
                                .addGroup(JUpdatePanelLayout.createSequentialGroup()
                                    .addComponent(JNoteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(82, 82, 82)))
                            .addComponent(JLogoutButton)
                            .addGap(54, 54, 54))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JUpdatePanelLayout.createSequentialGroup()
                            .addComponent(topic, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(42, 42, 42)))
                    .addGroup(JUpdatePanelLayout.createSequentialGroup()
                        .addGroup(JUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JScheduleScrolPane, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(videolink, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))))
        );
        JUpdatePanelLayout.setVerticalGroup(
            JUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JUpdatePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(topic, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(JTopicLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17)
                .addGroup(JUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JContentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JScheduleScrolPane, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(JUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JVideolinkLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(videolink, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(JUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JUpdatePanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(JPostScheduleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JNoteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        JMainTabPane.addTab("UPDATE SHEDULE", JUpdatePanel);

        JQuestionsPanel.setBackground(new java.awt.Color(153, 153, 153));

        JQuestionLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JQuestionLabel.setText("QUESTION  :");

        question.setColumns(20);
        question.setRows(5);
        JQuestionScrolPane.setViewportView(question);

        languagetype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECT-", "C ", "C++", "JAVA", "VB" }));

        javax.swing.GroupLayout JQuestionsPanelLayout = new javax.swing.GroupLayout(JQuestionsPanel);
        JQuestionsPanel.setLayout(JQuestionsPanelLayout);
        JQuestionsPanelLayout.setHorizontalGroup(
            JQuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JQuestionsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JQuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(languagetype, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JQuestionsPanelLayout.createSequentialGroup()
                        .addComponent(JQuestionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JQuestionScrolPane, javax.swing.GroupLayout.PREFERRED_SIZE, 863, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        JQuestionsPanelLayout.setVerticalGroup(
            JQuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JQuestionsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(languagetype, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JQuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JQuestionScrolPane, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JQuestionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(488, Short.MAX_VALUE))
        );

        JMainTabPane.addTab("ASK QUESTIONS", JQuestionsPanel);

        JNotificationPanel.setBackground(new java.awt.Color(153, 153, 153));
        JNotificationPanel.setForeground(new java.awt.Color(102, 102, 102));

        JNotificationLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JNotificationLabel.setText("NOTIFICATION  :");

        notification.setColumns(20);
        notification.setRows(5);
        JNotifiactionScrolPane.setViewportView(notification);

        javax.swing.GroupLayout JNotificationPanelLayout = new javax.swing.GroupLayout(JNotificationPanel);
        JNotificationPanel.setLayout(JNotificationPanelLayout);
        JNotificationPanelLayout.setHorizontalGroup(
            JNotificationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JNotificationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JNotificationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JNotifiactionScrolPane, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
                .addContainerGap())
        );
        JNotificationPanelLayout.setVerticalGroup(
            JNotificationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JNotificationPanelLayout.createSequentialGroup()
                .addGroup(JNotificationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JNotificationPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(JNotificationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JNotificationPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JNotifiactionScrolPane, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(419, Short.MAX_VALUE))
        );

        JMainTabPane.addTab("NOTIFICATION", JNotificationPanel);

        JDoubtsPanel.setBackground(new java.awt.Color(153, 153, 153));

        doubts.setEnabled(false);
        JDoubtsScrolPane.setViewportView(doubts);

        JGetdoubtsButton.setText("GET DOUBTS");
        JGetdoubtsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JGetdoubtsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JGetdoubtsButtonActionPerformed(evt);
            }
        });

        JPostDoubtButton.setText("POST");
        JPostDoubtButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout JDoubtsPanelLayout = new javax.swing.GroupLayout(JDoubtsPanel);
        JDoubtsPanel.setLayout(JDoubtsPanelLayout);
        JDoubtsPanelLayout.setHorizontalGroup(
            JDoubtsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JDoubtsPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(JDoubtsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JDoubtsScrolPane, javax.swing.GroupLayout.PREFERRED_SIZE, 874, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JDoubtsPanelLayout.createSequentialGroup()
                        .addComponent(JGetdoubtsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(303, 303, 303)
                        .addComponent(JPostDoubtButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        JDoubtsPanelLayout.setVerticalGroup(
            JDoubtsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDoubtsPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(JDoubtsScrolPane, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(JDoubtsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JGetdoubtsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(JPostDoubtButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(336, Short.MAX_VALUE))
        );

        JMainTabPane.addTab("RESPOND TO DOUBTS", JDoubtsPanel);

        JReviewsPanel.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout JReviewsPanelLayout = new javax.swing.GroupLayout(JReviewsPanel);
        JReviewsPanel.setLayout(JReviewsPanelLayout);
        JReviewsPanelLayout.setHorizontalGroup(
            JReviewsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JReviewsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JReviewsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 1014, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        JReviewsPanelLayout.setVerticalGroup(
            JReviewsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JReviewsPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(JReviewsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(425, Short.MAX_VALUE))
        );

        JMainTabPane.addTab("VIEW REVIEWS", JReviewsPanel);

        javax.swing.GroupLayout JMainPanelLayout = new javax.swing.GroupLayout(JMainPanel);
        JMainPanel.setLayout(JMainPanelLayout);
        JMainPanelLayout.setHorizontalGroup(
            JMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JMainTabPane, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JMainPanelLayout.createSequentialGroup()
                .addComponent(JTaskbarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        JMainPanelLayout.setVerticalGroup(
            JMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JMainPanelLayout.createSequentialGroup()
                .addComponent(JTaskbarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JMainTabPane, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JGetdoubtsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JGetdoubtsButtonActionPerformed
        if(!doubts.isEnabled()) {
            doubts.setEnabled(true);
        }
        javax.swing.table.DefaultTableModel doubts_model = new javax.swing.table.DefaultTableModel(new Object[]{"name", "doubts", "clarify"}, 0);
        doubts_model.addTableModelListener(new javax.swing.event.TableModelListener() {
            @Override
            public void tableChanged(javax.swing.event.TableModelEvent e) {
                System.out.println("Not implemented");
            }
        });
        doubts.setModel(doubts_model);
        String query = "SELECT name, doubts, clarify FROM student";
        try{
            ocms.db.DBAccessor dba = new ocms.db.DBAccessor();
            java.sql.ResultSet rs = dba.retrieve(query, null);
            while(rs.next()) {
                doubts_model.addRow(new Object[]{
                    rs.getString("name"), rs.getString("doubts"), rs.getString("clarify")
                });
            }
        } catch (java.sql.SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_JGetdoubtsButtonActionPerformed

    private void JCloseLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JCloseLabelMouseClicked
        this.dispose();
    }//GEN-LAST:event_JCloseLabelMouseClicked

    private void JLogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JLogoutButtonActionPerformed
        new OCMSUserLoginPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JLogoutButtonActionPerformed

    private void JMinimizeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMinimizeLabelMouseClicked
        this.setState(javax.swing.JFrame.ICONIFIED);
    }//GEN-LAST:event_JMinimizeLabelMouseClicked

    private void JPostScheduleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPostScheduleButtonActionPerformed
        String crse = (String) course.getSelectedItem();
        String tablename = "";
        if ("C".equals(crse)) {
            tablename = "adminc";
        } else if ("C++".equals(crse)) {
            tablename = "admincpp";
        } else if ("JAVA".equals(crse)) {
            tablename = "adminjava";
        } else if ("VB".equals(crse)) {
            tablename = "adminvb";
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "SELECT THE COURSE", "", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        String query = "INSERT INTO " + tablename + " (topic,shedule,notification,question,link) VALUES(?,?,?,?,?)";
        String[] values = new String[]{
            topic.getText(), shedule.getText(), notification.getText(), question.getText(), videolink.getText()
        };
        try {
            ocms.db.DBAccessor dba = new ocms.db.DBAccessor();
            dba.execute(query, values);
            javax.swing.JOptionPane.showMessageDialog(this, "POSTED SUCCESSFULLY", "", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } catch (java.sql.SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_JPostScheduleButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JCloseLabel;
    private javax.swing.JLabel JContentLabel;
    private javax.swing.JPanel JDoubtsPanel;
    private javax.swing.JScrollPane JDoubtsScrolPane;
    private javax.swing.JButton JGetdoubtsButton;
    private javax.swing.JButton JLogoutButton;
    private javax.swing.JPanel JMainPanel;
    private javax.swing.JTabbedPane JMainTabPane;
    private javax.swing.JLabel JMinimizeLabel;
    private javax.swing.JLabel JNoteLabel;
    private javax.swing.JScrollPane JNotifiactionScrolPane;
    private javax.swing.JLabel JNotificationLabel;
    private javax.swing.JPanel JNotificationPanel;
    private javax.swing.JButton JPostDoubtButton;
    private javax.swing.JButton JPostScheduleButton;
    private javax.swing.JLabel JQuestionLabel;
    private javax.swing.JScrollPane JQuestionScrolPane;
    private javax.swing.JPanel JQuestionsPanel;
    private javax.swing.JLabel JReviewsLabel;
    private javax.swing.JPanel JReviewsPanel;
    private javax.swing.JScrollPane JScheduleScrolPane;
    private javax.swing.JPanel JTaskbarPanel;
    private javax.swing.JLabel JTitleLabel;
    private javax.swing.JLabel JTopicLabel;
    private javax.swing.JPanel JUpdatePanel;
    private javax.swing.JLabel JVideolinkLabel;
    private javax.swing.JComboBox<String> course;
    private javax.swing.JTable doubts;
    private javax.swing.JComboBox<String> languagetype;
    private javax.swing.JTextArea notification;
    private javax.swing.JTextArea question;
    private javax.swing.JTextArea shedule;
    private javax.swing.JTextField topic;
    private javax.swing.JTextField videolink;
    // End of variables declaration//GEN-END:variables
}
