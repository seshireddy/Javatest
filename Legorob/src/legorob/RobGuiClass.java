
package legorob;
import ShefRobot.*;
import java.awt.event.KeyEvent;
import java.util.Arrays;
/**
 *
 * @author eia14hx Hao Xu
 */
public class RobGuiClass extends javax.swing.JFrame {

        Robot myRobot = new Robot();
       // Motor leftMotor = myRobot.getLargeMotor(Motor.Port.B);
       // Motor rightMotor = myRobot.getLargeMotor(Motor.Port.C);
       // Speaker speaker = myRobot.getSpeaker();
       // Motor rotor = myRobot.getLargeMotor(Motor.Port.D);
        Movement move = new Movement();
        Sensors sensor = new Sensors();
    public RobGuiClass() {
        initComponents();
        move.initial();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        welcomeText = new javax.swing.JLabel();
        ForwardButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        StopButton = new javax.swing.JButton();
        LeftButton = new javax.swing.JButton();
        RightButton = new javax.swing.JButton();
        RotorLeftButton = new javax.swing.JButton();
        RotorRightButton = new javax.swing.JButton();
        movingspeedText = new javax.swing.JTextField();
        MovingSpeedButton = new javax.swing.JButton();
        rotorspeedButton = new javax.swing.JButton();
        rotorspeedText = new javax.swing.JTextField();
        distanceinfoText = new javax.swing.JTextField();
        rangeButton = new javax.swing.JButton();
        autoButton = new javax.swing.JRadioButton();
        manualButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        welcomeText.setText("Welcome to the Lego EX3 control panel");

        ForwardButton.setText("Forward");
        ForwardButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ForwardButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ForwardButtonMouseReleased(evt);
            }
        });
        ForwardButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ForwardButtonKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ForwardButtonKeyReleased(evt);
            }
        });

        BackButton.setText("Backward");
        BackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BackButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BackButtonMouseReleased(evt);
            }
        });
        BackButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BackButtonKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BackButtonKeyReleased(evt);
            }
        });

        StopButton.setText("Stop");
        StopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StopButtonActionPerformed(evt);
            }
        });

        LeftButton.setText("Left");
        LeftButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LeftButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LeftButtonMouseReleased(evt);
            }
        });

        RightButton.setText("Right");
        RightButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RightButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                RightButtonMouseReleased(evt);
            }
        });

        RotorLeftButton.setText("LeftRotate");
        RotorLeftButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RotorLeftButtonActionPerformed(evt);
            }
        });

        RotorRightButton.setText("RightRotate");
        RotorRightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RotorRightButtonActionPerformed(evt);
            }
        });

        movingspeedText.setText("Speed type in here");

        MovingSpeedButton.setText("Change Moving Speed");
        MovingSpeedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MovingSpeedButtonActionPerformed(evt);
            }
        });

        rotorspeedButton.setText("Change Rotor Speed");
        rotorspeedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rotorspeedButtonActionPerformed(evt);
            }
        });

        rotorspeedText.setText("Speed type in here");

        distanceinfoText.setText("Distance");

        rangeButton.setText("Range finder");
        rangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rangeButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(autoButton);
        autoButton.setText("autodetection");
        autoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(manualButton);
        manualButton.setText("Manunal");
        manualButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manualButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(StopButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(BackButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(welcomeText)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(MovingSpeedButton)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(rangeButton)
                                                        .addGap(0, 0, Short.MAX_VALUE))
                                                    .addComponent(movingspeedText))))
                                        .addGap(100, 100, 100))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(distanceinfoText, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(129, 129, 129)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rotorspeedButton)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rotorspeedText)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(manualButton)
                                                    .addComponent(autoButton))
                                                .addGap(9, 9, 9)))))))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LeftButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RightButton)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ForwardButton)
                        .addGap(69, 69, 69)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RotorLeftButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RotorRightButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomeText)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MovingSpeedButton)
                    .addComponent(rotorspeedButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(movingspeedText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotorspeedText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rangeButton)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(distanceinfoText, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ForwardButton)
                            .addComponent(RotorLeftButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LeftButton)
                            .addComponent(RightButton)
                            .addComponent(RotorRightButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BackButton)
                        .addGap(38, 38, 38)
                        .addComponent(StopButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(autoButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(manualButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StopButtonActionPerformed
        if (StopButton.isEnabled()){
            move.stop();
        }
    }//GEN-LAST:event_StopButtonActionPerformed

    private void RotorLeftButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RotorLeftButtonActionPerformed
       
        if(RotorLeftButton.isEnabled()){
                
              move.rotorleft();
                
                
                
        }        // TODO add your handling code here:
    }//GEN-LAST:event_RotorLeftButtonActionPerformed

    private void RotorRightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RotorRightButtonActionPerformed
       if(RotorRightButton.isEnabled()){
                
          move.rotorright();
       }// TODO add your handling code here:
    }//GEN-LAST:event_RotorRightButtonActionPerformed

    private void ForwardButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForwardButtonMousePressed
            move.Forward(); 
        // TODO add your handling code here:
    }//GEN-LAST:event_ForwardButtonMousePressed

    private void ForwardButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForwardButtonMouseReleased
            move.stop();        // TODO add your handling code here:
    }//GEN-LAST:event_ForwardButtonMouseReleased

    private void MovingSpeedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MovingSpeedButtonActionPerformed
        if(MovingSpeedButton.isEnabled()){
            move.setMovingSpeed(Integer.valueOf(movingspeedText.getText()));
        }// TODO add your handling code here// TODO add your handling code here:
    }//GEN-LAST:event_MovingSpeedButtonActionPerformed

    private void rotorspeedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rotorspeedButtonActionPerformed
        if (rotorspeedButton.isEnabled()) {
            move.setRotorSpeed(Integer.valueOf(rotorspeedText.getText()));
            
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_rotorspeedButtonActionPerformed

    private void RightButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RightButtonMousePressed
        move.right();
    }//GEN-LAST:event_RightButtonMousePressed

    private void LeftButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeftButtonMousePressed
        move.left();// TODO add your handling code here:
    }//GEN-LAST:event_LeftButtonMousePressed

    private void LeftButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeftButtonMouseReleased
        move.stop();          // TODO add your handling code here:
    }//GEN-LAST:event_LeftButtonMouseReleased

    private void RightButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RightButtonMouseReleased
        move.stop();  // TODO add your handling code here:
    }//GEN-LAST:event_RightButtonMouseReleased

    private void BackButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMousePressed
        move.Backward();        // TODO add your handling code here:
    }//GEN-LAST:event_BackButtonMousePressed

    private void BackButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseReleased
        move.stop();  // TODO add your handling code here:
    }//GEN-LAST:event_BackButtonMouseReleased

    private void ForwardButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ForwardButtonKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_UP){
            move.Forward();
        }
    }//GEN-LAST:event_ForwardButtonKeyPressed

    private void ForwardButtonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ForwardButtonKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_UP){
            move.stop();
        }// TODO add your handling code here:
    }//GEN-LAST:event_ForwardButtonKeyReleased

    private void BackButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BackButtonKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_DOWN){
            move.Backward();
        }// TODO add your handling code here:
    }//GEN-LAST:event_BackButtonKeyPressed

    private void BackButtonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BackButtonKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_DOWN){
            move.stop();
        }// TODO add your handling code here:
    }//GEN-LAST:event_BackButtonKeyReleased

    private void rangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rangeButtonActionPerformed
        float[] distance = sensor.getRawSample();
            distanceinfoText.setText(Arrays.toString(distance));
            // TODO add your handling code here:
    }//GEN-LAST:event_rangeButtonActionPerformed

    private void autoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoButtonActionPerformed
        if(autoButton.isSelected()){

            float[] distance = sensor.getRawSample();
            for (float i :distance)
                if (i<0.1){
                    move.rotorautoright();
                }
                else{
                    move.rotorautoleft();
                }
        
        }
        
    }//GEN-LAST:event_autoButtonActionPerformed

    private void manualButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manualButtonActionPerformed
        if(manualButton.isSelected()){
            move.initial();
            myRobot.closeSensor(Sensor.Port.S1);
        }// TODO add your handling code here:
    }//GEN-LAST:event_manualButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RobGuiClass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton ForwardButton;
    private javax.swing.JButton LeftButton;
    private javax.swing.JButton MovingSpeedButton;
    private javax.swing.JButton RightButton;
    private javax.swing.JButton RotorLeftButton;
    private javax.swing.JButton RotorRightButton;
    private javax.swing.JButton StopButton;
    private javax.swing.JRadioButton autoButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField distanceinfoText;
    private javax.swing.JRadioButton manualButton;
    private javax.swing.JTextField movingspeedText;
    private javax.swing.JButton rangeButton;
    private javax.swing.JButton rotorspeedButton;
    private javax.swing.JTextField rotorspeedText;
    private javax.swing.JLabel welcomeText;
    // End of variables declaration//GEN-END:variables
}
