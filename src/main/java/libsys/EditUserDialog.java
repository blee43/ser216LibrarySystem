package libsys;

public class EditUserDialog extends javax.swing.JDialog {

    /**
     * Creates new form EditUserDialog
     */
    public EditUserDialog(java.awt.Frame parent, boolean modal, User user, BookFactory books) {
        super(parent, modal);
        this.user = user;
        this.books = books;
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLbl = new javax.swing.JLabel();
        idLbl = new javax.swing.JLabel();
        booksLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        limitTxtField = new javax.swing.JTextField();
        limitLbl = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        errorLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        titleLbl.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        titleLbl.setText("Edit User");

        idLbl.setText("ID :");

        booksLbl.setText("Books :");

        nameLbl.setText("Name :");

        limitLbl.setText("Limit :");

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        errorLbl.setVisible(false);
        errorLbl.setText("Limit must be a number!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nameTxtField))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(limitLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(limitTxtField))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(saveBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(cancelBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(booksLbl)
                            .addComponent(titleLbl)
                            .addComponent(idLbl)
                            .addComponent(errorLbl))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLbl)
                .addGap(18, 18, 18)
                .addComponent(idLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(booksLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLbl)
                    .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limitLbl)
                    .addComponent(limitTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(errorLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn)
                    .addComponent(cancelBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        doClose(true);
    }//GEN-LAST:event_saveBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        doClose(false);
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void init()
    {
        idLbl.setText("ID : " + (user.getId()));
        String bookString = "Books : ";
        int [] bookIds = user.bookStatus();
        for (int i = 0; i < bookIds.length; i++)
        {
            bookString += (books.getBook(bookIds[i]) + " ");
        }
        booksLbl.setText(bookString);
        limitTxtField.setText(String.valueOf(user.getLimit()));
        nameTxtField.setText(user.getName());
    }
    
    private void doClose(boolean toReturn)
    {
        if (toReturn)
        {
            try
            {
                newLimit = Integer.parseInt(limitTxtField.getText());
            }
            catch (Exception e)
            {
                errorLbl.setVisible(true);
                return;
            }
            returnStatus = toReturn;
            newName = nameTxtField.getText();
        }
        setVisible(false);
        dispose();
    }
    
    public boolean getReturnStatus()
    {
        return returnStatus;
    }
    
    public String getNewName()
    {
        return newName;
    }
    
    public int getNewLimit()
    {
        return newLimit;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel booksLbl;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel errorLbl;
    private javax.swing.JLabel idLbl;
    private javax.swing.JLabel limitLbl;
    private javax.swing.JTextField limitTxtField;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables

    private User user;
    private BookFactory books;
    private boolean returnStatus;
    private String newName;
    private int newLimit;
}
