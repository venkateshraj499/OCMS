package ocms.app;

public class OCMSUserMainPage extends javax.swing.JFrame {

    public OCMSUserMainPage(String uname) {

        initComponents();
        name.setText(uname.toUpperCase());
        String query = "SELECT * FROM login WHERE username = ?";
        String[] values = new String[]{
            uname
        };
        try {
            ocms.db.DBAccessor dba = new ocms.db.DBAccessor();
            java.sql.ResultSet rs = dba.retrieve(query, values);
            if (rs.next()) {
                String image_path = rs.getString("picture");
                if (image_path == null) {
                    image_path = "C:\\Users\\Venkatesh\\Downloads\\ICONS\\Popular Cute Color Icons_files\\user-male.png";
                }
                javax.swing.ImageIcon raw_img = new javax.swing.ImageIcon(image_path);
                java.awt.Image resized_img = raw_img.getImage().getScaledInstance(photo.getWidth(), photo.getHeight(), java.awt.Image.SCALE_SMOOTH);
                javax.swing.ImageIcon icon = new javax.swing.ImageIcon(resized_img);
                String path = "C:\\Users\\Venkatesh\\Downloads\\71vyKbDPH0L._SY355_.jpg";
                javax.swing.ImageIcon lg = new javax.swing.ImageIcon(path);
                java.awt.Image re = lg.getImage().getScaledInstance(logout.getWidth(), logout.getHeight(), java.awt.Image.SCALE_SMOOTH);
                javax.swing.ImageIcon log = new javax.swing.ImageIcon(re);
                logout.setIcon(log);
                photo.setIcon(icon);
                course.setText(rs.getString("course"));
                age.setText(rs.getString("age"));
                gender.setText(rs.getString("gender").toUpperCase());
            }
        } catch (java.sql.SQLException e) {
            System.err.println(e);
        }
        String filepath = "C:\\Users\\Venkatesh\\Downloads\\71vyKbDPH0L._SY355_.jpg";
        javax.swing.ImageIcon icon = new javax.swing.ImageIcon(new javax.swing.ImageIcon(filepath).getImage().getScaledInstance(logout.getWidth(), logout.getHeight(), java.awt.Image.SCALE_SMOOTH));
        logout.setIcon(icon);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JTaskbarPanel = new javax.swing.JPanel();
        JCloseLabel = new javax.swing.JLabel();
        JMinimizeLabel = new javax.swing.JLabel();
        JTitleLabel = new javax.swing.JLabel();
        JMainTabPane = new javax.swing.JTabbedPane();
        JSchedulePanel = new javax.swing.JPanel();
        topic = new javax.swing.JLabel();
        JScheduleScrolPane = new javax.swing.JScrollPane();
        shedule = new javax.swing.JTextArea();
        hyperlink = new javax.swing.JLabel();
        JVideolinkLabel = new javax.swing.JLabel();
        JUpdateButton = new javax.swing.JButton();
        JDoubtsPanel = new javax.swing.JPanel();
        JDoubtScrolPane = new javax.swing.JScrollPane();
        doubt = new javax.swing.JTextArea();
        JPostLabel = new javax.swing.JLabel();
        JReviewPanel = new javax.swing.JPanel();
        JReviewScrolPane = new javax.swing.JScrollPane();
        review = new javax.swing.JTextArea();
        JPostButton = new javax.swing.JButton();
        JQuestionPanel = new javax.swing.JPanel();
        JAnswertfquestionLabel = new javax.swing.JLabel();
        question = new javax.swing.JLabel();
        JAnswerScrolPane = new javax.swing.JScrollPane();
        answer = new javax.swing.JTextArea();
        JNotificationPanel = new javax.swing.JPanel();
        JDetailsPanel = new javax.swing.JPanel();
        JCourseLabel = new javax.swing.JLabel();
        course = new javax.swing.JLabel();
        JAgeLabel = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        JGenderLabel = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        JNameLabel = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        photo = new javax.swing.JLabel();
        JWelcomeLabel = new javax.swing.JLabel();
        JAboutUsPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        JTaskbarPanel.setBackground(new java.awt.Color(255, 153, 51));

        JCloseLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JCloseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JCloseLabel.setText("X");
        JCloseLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JCloseLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JCloseLabelMouseClicked(evt);
            }
        });

        JMinimizeLabel.setBackground(new java.awt.Color(255, 51, 51));
        JMinimizeLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        JMinimizeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JMinimizeLabel.setText("-");
        JMinimizeLabel.setToolTipText("");
        JMinimizeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMinimizeLabelMouseClicked(evt);
            }
        });

        JTitleLabel.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        JTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        JTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JTitleLabel.setText("0CMS");

        javax.swing.GroupLayout JTaskbarPanelLayout = new javax.swing.GroupLayout(JTaskbarPanel);
        JTaskbarPanel.setLayout(JTaskbarPanelLayout);
        JTaskbarPanelLayout.setHorizontalGroup(
            JTaskbarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JTaskbarPanelLayout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(JTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 1330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(JMinimizeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JCloseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JTaskbarPanelLayout.setVerticalGroup(
            JTaskbarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JTaskbarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(JTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                .addComponent(JMinimizeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(JTaskbarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JCloseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        JMainTabPane.setBackground(new java.awt.Color(255, 51, 204));
        JMainTabPane.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        JSchedulePanel.setBackground(new java.awt.Color(102, 102, 102));

        topic.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        topic.setForeground(new java.awt.Color(255, 255, 255));
        topic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        shedule.setEditable(false);
        shedule.setColumns(20);
        shedule.setRows(5);
        shedule.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        JScheduleScrolPane.setViewportView(shedule);

        hyperlink.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        hyperlink.setForeground(new java.awt.Color(51, 153, 255));
        hyperlink.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hyperlink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hyperlinkMouseClicked(evt);
            }
        });

        JVideolinkLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JVideolinkLabel.setForeground(new java.awt.Color(255, 255, 255));
        JVideolinkLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JVideolinkLabel.setText("VIDEO LINK");

        JUpdateButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JUpdateButton.setText("UPDATE SHEDULE");
        JUpdateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JUpdateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JSchedulePanelLayout = new javax.swing.GroupLayout(JSchedulePanel);
        JSchedulePanel.setLayout(JSchedulePanelLayout);
        JSchedulePanelLayout.setHorizontalGroup(
            JSchedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JSchedulePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(218, 218, 218)
                .addComponent(topic, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(594, Short.MAX_VALUE))
            .addGroup(JSchedulePanelLayout.createSequentialGroup()
                .addGroup(JSchedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JSchedulePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JScheduleScrolPane))
                    .addGroup(JSchedulePanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(JVideolinkLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hyperlink, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        JSchedulePanelLayout.setVerticalGroup(
            JSchedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JSchedulePanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(JSchedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JUpdateButton, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(topic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(53, 53, 53)
                .addGroup(JSchedulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JVideolinkLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(hyperlink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(JScheduleScrolPane, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        JMainTabPane.addTab("SCHEDULE", JSchedulePanel);

        JDoubtsPanel.setBackground(new java.awt.Color(102, 102, 102));

        doubt.setBackground(new java.awt.Color(204, 204, 204));
        doubt.setColumns(20);
        doubt.setRows(5);
        doubt.setText("LEAVE YOUR DOUBT HERE PLEASE...........................................");
        doubt.setEnabled(false);
        doubt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                doubtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                doubtMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                doubtMousePressed(evt);
            }
        });
        JDoubtScrolPane.setViewportView(doubt);

        JPostLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JPostLabel.setText("POST YOUR DOUBTS ON REVIEW TAB");

        javax.swing.GroupLayout JDoubtsPanelLayout = new javax.swing.GroupLayout(JDoubtsPanel);
        JDoubtsPanel.setLayout(JDoubtsPanelLayout);
        JDoubtsPanelLayout.setHorizontalGroup(
            JDoubtsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JDoubtsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JDoubtsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JDoubtsPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(JPostLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JDoubtScrolPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1669, Short.MAX_VALUE))
                .addContainerGap())
        );
        JDoubtsPanelLayout.setVerticalGroup(
            JDoubtsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDoubtsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JDoubtScrolPane, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPostLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(516, Short.MAX_VALUE))
        );

        JMainTabPane.addTab("DOUBTS", JDoubtsPanel);

        JReviewPanel.setBackground(new java.awt.Color(102, 102, 102));

        review.setBackground(new java.awt.Color(204, 204, 204));
        review.setColumns(20);
        review.setRows(5);
        review.setText("ANY KIND OF REVIIEW IS WELCOMED..................");
        review.setEnabled(false);
        review.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reviewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reviewMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                reviewMousePressed(evt);
            }
        });
        JReviewScrolPane.setViewportView(review);

        JPostButton.setText("POST");
        JPostButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPostButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPostButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JReviewPanelLayout = new javax.swing.GroupLayout(JReviewPanel);
        JReviewPanel.setLayout(JReviewPanelLayout);
        JReviewPanelLayout.setHorizontalGroup(
            JReviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JReviewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JReviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JReviewScrolPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1669, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JReviewPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(JPostButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        JReviewPanelLayout.setVerticalGroup(
            JReviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JReviewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JReviewScrolPane, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JPostButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(457, Short.MAX_VALUE))
        );

        JMainTabPane.addTab("REVIEW", JReviewPanel);

        JQuestionPanel.setBackground(new java.awt.Color(102, 102, 102));

        JAnswertfquestionLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JAnswertfquestionLabel.setText("ANSWER THE FOLLOWING QUESTION  :");

        answer.setColumns(20);
        answer.setRows(5);
        JAnswerScrolPane.setViewportView(answer);

        javax.swing.GroupLayout JQuestionPanelLayout = new javax.swing.GroupLayout(JQuestionPanel);
        JQuestionPanel.setLayout(JQuestionPanelLayout);
        JQuestionPanelLayout.setHorizontalGroup(
            JQuestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JQuestionPanelLayout.createSequentialGroup()
                .addGroup(JQuestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JQuestionPanelLayout.createSequentialGroup()
                        .addGap(591, 591, 591)
                        .addComponent(JAnswertfquestionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JQuestionPanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(question, javax.swing.GroupLayout.PREFERRED_SIZE, 1556, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(98, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JQuestionPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JAnswerScrolPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        JQuestionPanelLayout.setVerticalGroup(
            JQuestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JQuestionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JAnswertfquestionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(question, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(JAnswerScrolPane, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(249, Short.MAX_VALUE))
        );

        JMainTabPane.addTab("QUESTIONS", JQuestionPanel);

        JNotificationPanel.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout JNotificationPanelLayout = new javax.swing.GroupLayout(JNotificationPanel);
        JNotificationPanel.setLayout(JNotificationPanelLayout);
        JNotificationPanelLayout.setHorizontalGroup(
            JNotificationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1693, Short.MAX_VALUE)
        );
        JNotificationPanelLayout.setVerticalGroup(
            JNotificationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 766, Short.MAX_VALUE)
        );

        JMainTabPane.addTab("NOTIFICATION", JNotificationPanel);

        JDetailsPanel.setBackground(new java.awt.Color(102, 102, 102));

        JCourseLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JCourseLabel.setText("COURSE :");

        JAgeLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JAgeLabel.setText("AGE        :");

        JGenderLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JGenderLabel.setText("GENDER :");

        JNameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JNameLabel.setText("NAME      :");

        name.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        name.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        JWelcomeLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        JWelcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JWelcomeLabel.setText("WELCOME");

        javax.swing.GroupLayout JDetailsPanelLayout = new javax.swing.GroupLayout(JDetailsPanel);
        JDetailsPanel.setLayout(JDetailsPanelLayout);
        JDetailsPanelLayout.setHorizontalGroup(
            JDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDetailsPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(JDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JAgeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCourseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(JNameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JGenderLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)))
                .addGroup(JDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JDetailsPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JWelcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149))
                    .addGroup(JDetailsPanelLayout.createSequentialGroup()
                        .addGroup(JDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JDetailsPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1086, Short.MAX_VALUE)
                        .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))))
        );
        JDetailsPanelLayout.setVerticalGroup(
            JDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDetailsPanelLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(JDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JCourseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JWelcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(course, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JDetailsPanelLayout.createSequentialGroup()
                        .addGroup(JDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JDetailsPanelLayout.createSequentialGroup()
                                .addComponent(JAgeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JDetailsPanelLayout.createSequentialGroup()
                                .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(JDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JGenderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(480, Short.MAX_VALUE))
                    .addGroup(JDetailsPanelLayout.createSequentialGroup()
                        .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        JMainTabPane.addTab("YOUR DETAILS", JDetailsPanel);

        JAboutUsPanel.setBackground(new java.awt.Color(102, 102, 102));
        JAboutUsPanel.setForeground(new java.awt.Color(255, 51, 153));

        javax.swing.GroupLayout JAboutUsPanelLayout = new javax.swing.GroupLayout(JAboutUsPanel);
        JAboutUsPanel.setLayout(JAboutUsPanelLayout);
        JAboutUsPanelLayout.setHorizontalGroup(
            JAboutUsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1693, Short.MAX_VALUE)
        );
        JAboutUsPanelLayout.setVerticalGroup(
            JAboutUsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 766, Short.MAX_VALUE)
        );

        JMainTabPane.addTab("ABOUT US", JAboutUsPanel);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText(" LOGOUT :");

        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("THANK YOU FOR CHOOSING OCMS  (NOTE : ALL YOUR INFORMATIONS AND CONTACT DETAILS SUBMITTED ARE HIGHLY PRIVATE AND FOR VERIFICATION ONLY)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTaskbarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JMainTabPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JTaskbarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JMainTabPane, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JCloseLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JCloseLabelMouseClicked
        this.dispose();
    }//GEN-LAST:event_JCloseLabelMouseClicked

    private void JMinimizeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMinimizeLabelMouseClicked
        this.setState(javax.swing.JFrame.ICONIFIED);
    }//GEN-LAST:event_JMinimizeLabelMouseClicked

    private void JPostButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPostButtonActionPerformed
        String dbt = null;
        if (!"LEAVE YOUR DOUBT HERE PLEASE...........................................".equals(doubt.getText())) {
            dbt = doubt.getText();
        }
        String rvw = null;
        if (!"ANY KIND OF REVIIEW IS WELCOMED..................".equals(review.getText())) {
            rvw = review.getText();
        }

        String query;
        String[] values;
        if (dbt != null && rvw != null) {
            query = "INSERT INTO student (doubts,reviews,name) VALUES (?,?,?)";
            values = new String[]{
                dbt,
                rvw,
                name.getText()
            };
        } else if (dbt == null && rvw != null) {
            query = "INSERT INTO student (reviews,name) VALUES (?,?)";
            values = new String[]{
                rvw,
                name.getText()
            };
        } else if (dbt != null && rvw == null) {
            query = "INSERT INTO student (doubts,name) VALUES (?,?)";
            values = new String[]{
                dbt,
                name.getText()
            };
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "No doubt or review is provided!", "", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        try {
            ocms.db.DBAccessor dba = new ocms.db.DBAccessor();
            dba.execute(query, values);
            javax.swing.JOptionPane.showMessageDialog(this, "POSTED YOUR DOUBT AND REVIEW", "", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } catch (java.sql.SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_JPostButtonActionPerformed

    private void JUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JUpdateButtonActionPerformed
        String tablename = "";
        if ("C".equals(course.getText())) {
            tablename = "adminc";
        }
        else if ("C++".equals(course.getText())) {
            tablename = "admincpp";
        }
        else if ("JAVA".equals(course.getText())) {
            tablename = "adminjava";
        }
        else if ("VB".equals(course.getText())) {
            tablename = "adminvb";
        }
        else {
            System.out.println("Not Supported Course Value");
            return;
        }
        String query = "select top 1 * from " + tablename;

        try {
            ocms.db.DBAccessor dba = new ocms.db.DBAccessor();
            java.sql.ResultSet rs = dba.retrieve(query, null);
            while(rs.next()){
                topic.setText(rs.getString("topic"));
                shedule.setText(rs.getString("shedule"));
                question.setText(rs.getString("question"));
                hyperlink.setText(rs.getString("link"));
            }


        } catch (java.sql.SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_JUpdateButtonActionPerformed

    private void hyperlinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hyperlinkMouseClicked
        try {
            java.awt.Desktop.getDesktop().browse(new java.net.URI(hyperlink.getText()));
        } catch (java.io.IOException | java.net.URISyntaxException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_hyperlinkMouseClicked

    private void doubtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doubtMousePressed
        doubt.setText("");
    }//GEN-LAST:event_doubtMousePressed

    private void reviewMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reviewMousePressed
        review.setText("");
    }//GEN-LAST:event_reviewMousePressed

    private void reviewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reviewMouseEntered
        review.setEnabled(true);
    }//GEN-LAST:event_reviewMouseEntered

    private void reviewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reviewMouseExited
        if ("".equals(review.getText())) {
            review.setText("ANY KIND OF REVIIEW IS WELCOMED..................");
        }
        review.setEnabled(false);
    }//GEN-LAST:event_reviewMouseExited

    private void doubtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doubtMouseEntered
        doubt.setEnabled(true);
    }//GEN-LAST:event_doubtMouseEntered

    private void doubtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doubtMouseExited
        if("".equals(doubt.getText())) {
            doubt.setText("LEAVE YOUR DOUBT HERE PLEASE...........................................");
        }
        doubt.setEnabled(false);
    }//GEN-LAST:event_doubtMouseExited

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
       new OCMSUserLoginPage().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JAboutUsPanel;
    private javax.swing.JLabel JAgeLabel;
    private javax.swing.JScrollPane JAnswerScrolPane;
    private javax.swing.JLabel JAnswertfquestionLabel;
    private javax.swing.JLabel JCloseLabel;
    private javax.swing.JLabel JCourseLabel;
    private javax.swing.JPanel JDetailsPanel;
    private javax.swing.JScrollPane JDoubtScrolPane;
    private javax.swing.JPanel JDoubtsPanel;
    private javax.swing.JLabel JGenderLabel;
    private javax.swing.JTabbedPane JMainTabPane;
    private javax.swing.JLabel JMinimizeLabel;
    private javax.swing.JLabel JNameLabel;
    private javax.swing.JPanel JNotificationPanel;
    private javax.swing.JButton JPostButton;
    private javax.swing.JLabel JPostLabel;
    private javax.swing.JPanel JQuestionPanel;
    private javax.swing.JPanel JReviewPanel;
    private javax.swing.JScrollPane JReviewScrolPane;
    private javax.swing.JPanel JSchedulePanel;
    private javax.swing.JScrollPane JScheduleScrolPane;
    private javax.swing.JPanel JTaskbarPanel;
    private javax.swing.JLabel JTitleLabel;
    private javax.swing.JButton JUpdateButton;
    private javax.swing.JLabel JVideolinkLabel;
    private javax.swing.JLabel JWelcomeLabel;
    private javax.swing.JLabel age;
    private javax.swing.JTextArea answer;
    private javax.swing.JLabel course;
    private javax.swing.JTextArea doubt;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel hyperlink;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton logout;
    private javax.swing.JLabel name;
    private javax.swing.JLabel photo;
    private javax.swing.JLabel question;
    private javax.swing.JTextArea review;
    private javax.swing.JTextArea shedule;
    private javax.swing.JLabel topic;
    // End of variables declaration//GEN-END:variables
}
