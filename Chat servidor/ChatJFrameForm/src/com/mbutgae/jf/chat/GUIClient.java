
package com.mbutgae.jf.chat;

import com.mbutgae.misc.Clock;
import java.awt.Image;
import java.net.InetAddress;
import java.net.UnknownHostException;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public final class GUIClient extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    private boolean connected;

    private Client client;
  
    private final int defaultPort;
    private final String defaultHost;
    
    InetAddress ipAddr;

   
    
    public GUIClient(String host, int port) {
        initComponents();
        
        
        defaultPort = port;
        defaultHost = host;
        tfServer.setEditable(true);
        tfPort.setEditable(true);
        tfServer.setEnabled(true);
        tfPort.setEnabled(true);
        tfPort.requestFocus();
        logout.setEnabled(false);
        
        tf.setText(getIP());
        
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
    
    private void mulaiJam(){
        Clock c1 = new Clock(timeLabel);
        Thread t1 = new Thread(c1);
        t1.start();
    }

   
    void append(String str) {
        ta.append(str);
        ta.setCaretPosition(ta.getText().length() - 1);
    }
   

    void connectionFailed() {
        login.setEnabled(true);
        logout.setEnabled(false);
        whoIsIn.setEnabled(false);
        label.setText("Ingrese nombre de usuario");
        tf.setText(getIP());
     
        tfPort.setText("" + defaultPort);
        tfServer.setText(defaultHost);
        
        tfServer.setEditable(true);
        tfPort.setEditable(true);
        tfPort.requestFocus();

     
        connected = false;

    }

    public Icon setIcon(String path, int size) {
        ImageIcon icon = new ImageIcon(path);
        Image img = icon.getImage();
        Image newimg = img.getScaledInstance(size, size, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(newimg);
        return icon;
    }

    
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InputPanel = new javax.swing.JPanel();
        tfServer = new javax.swing.JTextField();
        userLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        whoIsIn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        userLabel1 = new javax.swing.JLabel();
        tf = new javax.swing.JTextField();
        tfPort = new javax.swing.JTextField();
        login = new javax.swing.JButton();
        label = new javax.swing.JLabel();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Client Chat");
        setResizable(false);

        InputPanel.setBackground(new java.awt.Color(0, 0, 153));
        InputPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                InputPanelMousePressed(evt);
            }
        });

        tfServer.setBackground(new java.awt.Color(0, 0, 153));
        tfServer.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        tfServer.setForeground(new java.awt.Color(255, 255, 255));
        tfServer.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfServer.setText("localhost");
        tfServer.setAlignmentX(0.0F);
        tfServer.setAlignmentY(0.0F);
        tfServer.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 255, 204)));
        tfServer.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tfServer.setPreferredSize(new java.awt.Dimension(0, 25));

        userLabel.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        userLabel.setForeground(new java.awt.Color(102, 255, 204));
        userLabel.setText("Direccion del Servidor");

        timeLabel.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(102, 255, 204));
        timeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        timeLabel.setText("En Linea");
        timeLabel.setAlignmentY(0.0F);
        timeLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 255, 204)));

        whoIsIn.setBackground(new java.awt.Color(0, 0, 153));
        whoIsIn.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        whoIsIn.setText("En Linea");
        whoIsIn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 204)));
        whoIsIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whoIsInActionPerformed(evt);
            }
        });

        ta.setBackground(new java.awt.Color(102, 102, 102));
        ta.setColumns(20);
        ta.setForeground(new java.awt.Color(255, 255, 255));
        ta.setRows(5);
        ta.setCaretColor(new java.awt.Color(102, 255, 204));
        ta.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        ta.setEnabled(false);
        jScrollPane1.setViewportView(ta);

        userLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        userLabel1.setForeground(new java.awt.Color(102, 255, 204));
        userLabel1.setText("Puerto");

        tf.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        tf.setAlignmentX(0.0F);
        tf.setAlignmentY(0.0F);
        tf.setBorder(null);
        tf.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tf.setPreferredSize(new java.awt.Dimension(0, 25));
        tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfActionPerformed(evt);
            }
        });

        tfPort.setBackground(new java.awt.Color(0, 0, 153));
        tfPort.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        tfPort.setForeground(new java.awt.Color(255, 255, 255));
        tfPort.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfPort.setText("1000");
        tfPort.setAlignmentX(0.0F);
        tfPort.setAlignmentY(0.0F);
        tfPort.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 255, 204)));
        tfPort.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tfPort.setPreferredSize(new java.awt.Dimension(0, 25));

        login.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        login.setText("Acceso");
        login.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        label.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        label.setForeground(new java.awt.Color(102, 255, 204));
        label.setText("Nombre de Usuario");

        logout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logout.setText("Cerrar sesion");
        logout.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InputPanelLayout = new javax.swing.GroupLayout(InputPanel);
        InputPanel.setLayout(InputPanelLayout);
        InputPanelLayout.setHorizontalGroup(
            InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InputPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, InputPanelLayout.createSequentialGroup()
                        .addComponent(whoIsIn, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(InputPanelLayout.createSequentialGroup()
                        .addComponent(label)
                        .addGap(110, 110, 110))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, InputPanelLayout.createSequentialGroup()
                        .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userLabel)
                            .addComponent(userLabel1))
                        .addGap(34, 34, 34)
                        .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfPort, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfServer, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        InputPanelLayout.setVerticalGroup(
            InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InputPanelLayout.createSequentialGroup()
                        .addComponent(userLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userLabel1))
                    .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(InputPanelLayout.createSequentialGroup()
                            .addComponent(tfServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(3, 3, 3))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timeLabel)
                    .addComponent(whoIsIn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
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

    private void whoIsInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whoIsInActionPerformed
        client.sendMessage(new ChatMessage(ChatMessage.WHOISIN, ""));
    }//GEN-LAST:event_whoIsInActionPerformed

    private void InputPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InputPanelMousePressed

    }//GEN-LAST:event_InputPanelMousePressed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
       
        String username = tf.getText().trim();
        
        if (username.length() == 0) {
            return;
        }
       
        String server = tfServer.getText().trim();
        if (server.length() == 0) {
            return;
        }
        
        String portNumber = tfPort.getText().trim();
        if (portNumber.length() == 0) {
            return;
        }
        int port = 0;
        try {
            port = Integer.parseInt(portNumber);
        } catch (NumberFormatException en) {
            return;  
        }

       
        client = new Client(server, port, username, this);
        
        if (!client.start()) {
            return;
        }
        tf.setText("");
        label.setText("Ingrese su Mensaje");
        connected = true;

        
        login.setEnabled(false);

        
        logout.setEnabled(true);
        whoIsIn.setEnabled(true);
     
        tfServer.setEditable(false);
        tfPort.setEditable(false);

        
    }//GEN-LAST:event_loginActionPerformed

    private void tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfActionPerformed
     
        if (connected) {
            
            client.sendMessage(new com.mbutgae.jf.chat.ChatMessage(com.mbutgae.jf.chat.ChatMessage.MESSAGE, tf.getText()));
            tf.setText("");
        }
    }//GEN-LAST:event_tfActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        System.out.println("Estado de la coneccion :" + connected);
        client.sendMessage(new ChatMessage(ChatMessage.LOGOUT, ""));
        tfServer.setEditable(true);
        tfPort.setEditable(true);
        tfServer.setEnabled(connected);
        tfPort.setEnabled(connected);
        
        tf.setText("(IP) "+getIP());
    }//GEN-LAST:event_logoutActionPerformed

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        tfServer.setEditable(true);
        tfPort.setEditable(true);
    }//GEN-LAST:event_logoutMouseClicked

  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new GUIClient("localhost", 1000).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel InputPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label;
    private javax.swing.JButton login;
    private javax.swing.JButton logout;
    private javax.swing.JTextArea ta;
    private javax.swing.JTextField tf;
    private javax.swing.JTextField tfPort;
    private javax.swing.JTextField tfServer;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JLabel userLabel;
    private javax.swing.JLabel userLabel1;
    private javax.swing.JButton whoIsIn;
    // End of variables declaration//GEN-END:variables
}
