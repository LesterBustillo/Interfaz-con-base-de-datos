
package com.mbutgae.jf.chat;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public final class GUIServer extends javax.swing.JFrame implements WindowListener {

    private static final long serialVersionUID = 1L;
    private ServerJFrame server;

    int posX = 0, posY = 0;
    
    InetAddress ipAddr;

    
    public GUIServer() {
        initComponents();

        server = null;

        
        chat.setText("Chat \n");
       
        event.setText("Registro de Eventos \n");

       
        mulaiJam();

        
        
        
        
    }
    
    public String getIP(){
        try {
            ipAddr = InetAddress.getLocalHost();
            System.out.println(ipAddr.getHostAddress());
            
        } catch (UnknownHostException ex) {
        }
        return ipAddr.getHostAddress()+"";
    }
    
    public void startingServer(){
      
        if (server != null) {
            server.stop();
            server = null;
            tPortNumber.setEditable(true);
            stopStart.setText("START");
            return;
        }
       	
        int port;
        try {
            port = Integer.parseInt(tPortNumber.getText().trim());
        } catch (NumberFormatException er) {
            appendEvent("Numero de puerto invalido");
            return;
        }
       
        server = new ServerJFrame(port, this);
    
        new ServerRunning().start();
        stopStart.setText("Alto");
        tPortNumber.setEditable(false);
    }

    

    public Icon setIcon(String path, int size) {
        ImageIcon icon = new ImageIcon(path);
        Image img = icon.getImage();
        Image newimg = img.getScaledInstance(size, size, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(newimg);
        return icon;
    }

    
    void appendRoom(String str) {
        chat.append(str);
        chat.setCaretPosition(chat.getText().length() - 1);
    }

    void appendEvent(String str) {
        event.append(str);
        event.setCaretPosition(event.getText().length() - 1);

    }

  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InputPanel = new javax.swing.JPanel();
        tPortNumber = new javax.swing.JTextField();
        userLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        stopStart = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        chat = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        event = new javax.swing.JTextArea();
        userLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CHAT SERVER AND LOG");

        InputPanel.setBackground(new java.awt.Color(0, 102, 153));
        InputPanel.setName("j"); // NOI18N
        InputPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                InputPanelMousePressed(evt);
            }
        });

        tPortNumber.setBackground(new java.awt.Color(0, 102, 153));
        tPortNumber.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        tPortNumber.setForeground(new java.awt.Color(255, 255, 255));
        tPortNumber.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tPortNumber.setText("1000");
        tPortNumber.setAlignmentX(0.0F);
        tPortNumber.setAlignmentY(0.0F);
        tPortNumber.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 255, 204)));
        tPortNumber.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tPortNumber.setPreferredSize(new java.awt.Dimension(0, 25));
        tPortNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tPortNumberKeyPressed(evt);
            }
        });

        userLabel.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        userLabel.setForeground(new java.awt.Color(102, 255, 204));
        userLabel.setText("Puerto");

        timeLabel.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(102, 255, 204));
        timeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        timeLabel.setText("en linea");
        timeLabel.setAlignmentY(0.0F);
        timeLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 255, 204)));

        stopStart.setBackground(new java.awt.Color(0, 0, 0));
        stopStart.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        stopStart.setForeground(new java.awt.Color(102, 255, 204));
        stopStart.setText("Iniciar");
        stopStart.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 204)));
        stopStart.setContentAreaFilled(false);
        stopStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                stopStartMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                stopStartMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                stopStartMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                stopStartMouseReleased(evt);
            }
        });
        stopStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopStartActionPerformed(evt);
            }
        });

        chat.setColumns(20);
        chat.setRows(5);
        jScrollPane1.setViewportView(chat);

        event.setColumns(20);
        event.setRows(5);
        jScrollPane2.setViewportView(event);

        userLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        userLabel1.setForeground(new java.awt.Color(102, 255, 204));
        userLabel1.setText("Iniciar sesion");

        javax.swing.GroupLayout InputPanelLayout = new javax.swing.GroupLayout(InputPanel);
        InputPanel.setLayout(InputPanelLayout);
        InputPanelLayout.setHorizontalGroup(
            InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InputPanelLayout.createSequentialGroup()
                        .addComponent(userLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InputPanelLayout.createSequentialGroup()
                        .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InputPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(InputPanelLayout.createSequentialGroup()
                                .addComponent(userLabel)
                                .addGap(192, 192, 192)
                                .addComponent(tPortNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                .addComponent(stopStart, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(16, 16, 16))))
        );
        InputPanelLayout.setVerticalGroup(
            InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InputPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userLabel)
                    .addComponent(tPortNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stopStart, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(timeLabel)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(InputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(InputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tPortNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tPortNumberKeyPressed
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_ENTER) {
            startingServer();
        }
    }//GEN-LAST:event_tPortNumberKeyPressed

    private void stopStartMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopStartMouseEntered
        stopStart.setBackground(userLabel.getForeground());
        stopStart.setForeground(InputPanel.getBackground());
        stopStart.setOpaque(true);
    }//GEN-LAST:event_stopStartMouseEntered

    private void stopStartMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopStartMouseExited
        stopStart.setBackground(InputPanel.getBackground());
        stopStart.setForeground(userLabel.getForeground());
    }//GEN-LAST:event_stopStartMouseExited

    private void stopStartMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopStartMousePressed
        stopStart.setBackground(Color.GRAY);
        stopStart.setOpaque(true);
    }//GEN-LAST:event_stopStartMousePressed

    private void stopStartMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopStartMouseReleased
        stopStart.setBackground(InputPanel.getBackground());
        stopStart.setForeground(userLabel.getForeground());
    }//GEN-LAST:event_stopStartMouseReleased

    private void stopStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopStartActionPerformed
        startingServer();
    }//GEN-LAST:event_stopStartActionPerformed

    private void InputPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InputPanelMousePressed

    }//GEN-LAST:event_InputPanelMousePressed

   
    public static void main(String args[]) {
       
     
        java.awt.EventQueue.invokeLater(() -> {
            new GUIServer().setVisible(true);
        });
    }
    

    public void mulaiJam() {
        Date skrg = new Date();
        SimpleDateFormat tgl = new SimpleDateFormat("EEEE, dd MMM yyyy");
        SimpleDateFormat jam = new SimpleDateFormat("HH:mm");
        timeLabel.setText(jam.format(skrg)+" | "+tgl.format(skrg));
      
    }
    
    @Override
    public void windowClosing(WindowEvent e) {
       
        if (server != null) {
            try {
                server.stop();			
            } catch (Exception eClose) {
            }
            server = null;
        }
       
        dispose();
        System.exit(0);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        throw new UnsupportedOperationException("no soportado."); 
    }

    @Override
    public void windowClosed(WindowEvent e) {
        throw new UnsupportedOperationException("no soportado.");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        throw new UnsupportedOperationException("no soportado."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        throw new UnsupportedOperationException("no soportado."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent e) {
        throw new UnsupportedOperationException("no soportado."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        throw new UnsupportedOperationException("Aun no soportado."); 
    }

   
    class ServerRunning extends Thread {
        private SimpleDateFormat sdf;
        
        public void run() {
            server.start();        
            stopStart.setText("INICIAR");
            tPortNumber.setEditable(true);
            
            String time = sdf.format(new Date()) + " ";
            appendEvent(time + " Servidor destruido y cerrado\n");
            server = null;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel InputPanel;
    private javax.swing.JTextArea chat;
    private javax.swing.JTextArea event;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton stopStart;
    private javax.swing.JTextField tPortNumber;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JLabel userLabel;
    private javax.swing.JLabel userLabel1;
    // End of variables declaration//GEN-END:variables
}
