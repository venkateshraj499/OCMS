package ocms;

public class OCMS {

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException e) {
            System.out.println(e);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ocms.app.OCMSUserLoginPage().setVisible(true);
            }
        });
    }

}
