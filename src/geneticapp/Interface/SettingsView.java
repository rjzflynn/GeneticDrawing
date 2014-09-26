
package geneticapp.Interface;


import geneticapp.GeneticAlgo;
import geneticapp.SettingsManager;
import javax.swing.JFrame;


public class SettingsView extends javax.swing.JFrame {
    
    private GeneticAlgo app;
    private JFrame parent;
    
    public SettingsView(GeneticAlgo app, JFrame parent) {
        initComponents();
        this.setSize(500, 240);
        this.setLocationRelativeTo(parent);
        this.app = app;
        this.parent = parent;
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        System.out.println("constructor called");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        initilizeDNAColor = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lablePointsInPolygon = new javax.swing.JLabel();
        numPolygonsLabel = new javax.swing.JLabel();
        polyPlus1 = new javax.swing.JButton();
        polyMinus1 = new javax.swing.JButton();
        polyPlus10 = new javax.swing.JButton();
        polyMinus10 = new javax.swing.JButton();
        label_numOfPolygons = new javax.swing.JLabel();
        pointsInPolygonLabel = new javax.swing.JLabel();
        pointsPlus1 = new javax.swing.JButton();
        pointsMinus1 = new javax.swing.JButton();
        pointsPlus10 = new javax.swing.JButton();
        pointsMinus10 = new javax.swing.JButton();
        labelInitilizeDNA = new javax.swing.JLabel();
        white = new javax.swing.JRadioButton();
        black = new javax.swing.JRadioButton();
        color = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Settings");

        lablePointsInPolygon.setFont(new java.awt.Font("Rod", 0, 14)); // NOI18N
        lablePointsInPolygon.setText("Points in Polygon:");

        numPolygonsLabel.setFont(new java.awt.Font("Rod", 0, 18)); // NOI18N
        numPolygonsLabel.setText("50");

        polyPlus1.setText("+1");
        polyPlus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                polyPlus1ActionPerformed(evt);
            }
        });

        polyMinus1.setText("-1");
        polyMinus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                polyMinus1ActionPerformed(evt);
            }
        });

        polyPlus10.setText("+10");
        polyPlus10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                polyPlus10ActionPerformed(evt);
            }
        });

        polyMinus10.setText("-10");
        polyMinus10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                polyMinus10ActionPerformed(evt);
            }
        });

        label_numOfPolygons.setFont(new java.awt.Font("Rod", 0, 14)); // NOI18N
        label_numOfPolygons.setText("Number of Polygons:");

        pointsInPolygonLabel.setFont(new java.awt.Font("Rod", 0, 18)); // NOI18N
        pointsInPolygonLabel.setText("3");

        pointsPlus1.setText("+1");
        pointsPlus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointsPlus1ActionPerformed(evt);
            }
        });

        pointsMinus1.setText("-1");
        pointsMinus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointsMinus1ActionPerformed(evt);
            }
        });

        pointsPlus10.setText("+10");
        pointsPlus10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointsPlus10ActionPerformed(evt);
            }
        });

        pointsMinus10.setText("-10");
        pointsMinus10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointsMinus10ActionPerformed(evt);
            }
        });

        labelInitilizeDNA.setFont(new java.awt.Font("Rod", 0, 14)); // NOI18N
        labelInitilizeDNA.setText("Initilize DNA:");

        initilizeDNAColor.add(white);
        white.setFont(new java.awt.Font("Rod", 0, 14)); // NOI18N
        white.setText("White");
        white.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whiteActionPerformed(evt);
            }
        });

        initilizeDNAColor.add(black);
        black.setFont(new java.awt.Font("Rod", 0, 14)); // NOI18N
        black.setSelected(true);
        black.setText("Black");
        black.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blackActionPerformed(evt);
            }
        });

        initilizeDNAColor.add(color);
        color.setFont(new java.awt.Font("Rod", 0, 14)); // NOI18N
        color.setText("Color");
        color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(label_numOfPolygons, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numPolygonsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lablePointsInPolygon, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pointsInPolygonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pointsPlus1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pointsMinus1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pointsPlus10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pointsMinus10, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(polyPlus1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(polyMinus1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(polyPlus10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(polyMinus10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelInitilizeDNA)
                        .addGap(56, 56, 56)
                        .addComponent(white)
                        .addGap(18, 18, 18)
                        .addComponent(black)
                        .addGap(18, 18, 18)
                        .addComponent(color)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numPolygonsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(polyMinus1)
                    .addComponent(polyPlus10)
                    .addComponent(polyMinus10)
                    .addComponent(label_numOfPolygons, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(polyPlus1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lablePointsInPolygon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pointsInPolygonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pointsMinus1)
                    .addComponent(pointsPlus10)
                    .addComponent(pointsMinus10)
                    .addComponent(pointsPlus1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelInitilizeDNA, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(black)
                        .addComponent(color))
                    .addComponent(white))
                .addContainerGap(154, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    //All methods are for updateing the SettingsManager class and also uppdate the text of the SettingsView
    private void polyMinus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_polyMinus1ActionPerformed
        if (app.getConfig().getNumOfPolygons() > 0) {
            app.getConfig().setNumOfPolygons(app.getConfig().getNumOfPolygons() - 1);
             update();
        }
        
    }//GEN-LAST:event_polyMinus1ActionPerformed

    private void polyPlus10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_polyPlus10ActionPerformed
        if (app.getConfig().getNumOfPolygons() < 250) {
            app.getConfig().setNumOfPolygons(app.getConfig().getNumOfPolygons()+ 10);
             update();
        }      
    }//GEN-LAST:event_polyPlus10ActionPerformed

    private void pointsMinus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointsMinus1ActionPerformed
        if (app.getConfig().getPointsInPolygon() > 3) {
            app.getConfig().setPointsInPolygon(app.getConfig().getPointsInPolygon()- 1);
            update();
        }     
    }//GEN-LAST:event_pointsMinus1ActionPerformed

    private void pointsPlus10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointsPlus10ActionPerformed
        if (app.getConfig().getPointsInPolygon() < 50) {
            app.getConfig().setPointsInPolygon(app.getConfig().getPointsInPolygon()+ 10);
            update();
        }      
    }//GEN-LAST:event_pointsPlus10ActionPerformed

    private void whiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whiteActionPerformed
        app.getConfig().setInitialDNA(SettingsManager.WHITE);
    }//GEN-LAST:event_whiteActionPerformed

    private void polyPlus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_polyPlus1ActionPerformed
        if (app.getConfig().getNumOfPolygons() < 250) {
            app.getConfig().setNumOfPolygons(app.getConfig().getNumOfPolygons() + 1);
            update();
        }     
    }//GEN-LAST:event_polyPlus1ActionPerformed

    private void pointsPlus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointsPlus1ActionPerformed
        if (app.getConfig().getPointsInPolygon() < 50) {
            app.getConfig().setPointsInPolygon(app.getConfig().getPointsInPolygon() + 1);
            update();
        }    
    }//GEN-LAST:event_pointsPlus1ActionPerformed

    private void pointsMinus10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointsMinus10ActionPerformed
        if (app.getConfig().getPointsInPolygon() > 13) {
            app.getConfig().setPointsInPolygon(app.getConfig().getPointsInPolygon() - 10);
            update();
        }
    }//GEN-LAST:event_pointsMinus10ActionPerformed

    private void polyMinus10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_polyMinus10ActionPerformed
        if (app.getConfig().getNumOfPolygons() > 10) {
            app.getConfig().setNumOfPolygons(app.getConfig().getNumOfPolygons() - 10);
            update();
        }      
    }//GEN-LAST:event_polyMinus10ActionPerformed

    private void blackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blackActionPerformed
        app.getConfig().setInitialDNA(SettingsManager.BLACK);
    }//GEN-LAST:event_blackActionPerformed

    private void colorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorActionPerformed
       app.getConfig().setInitialDNA(SettingsManager.COLOR);
    }//GEN-LAST:event_colorActionPerformed

   private void update(){
       numPolygonsLabel.setText(String.valueOf(app.getConfig().getNumOfPolygons()));
       pointsInPolygonLabel.setText(String.valueOf(app.getConfig().getPointsInPolygon()));       
   }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton black;
    private javax.swing.JRadioButton color;
    private javax.swing.ButtonGroup initilizeDNAColor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelInitilizeDNA;
    private javax.swing.JLabel label_numOfPolygons;
    private javax.swing.JLabel lablePointsInPolygon;
    private javax.swing.JLabel numPolygonsLabel;
    private javax.swing.JLabel pointsInPolygonLabel;
    private javax.swing.JButton pointsMinus1;
    private javax.swing.JButton pointsMinus10;
    private javax.swing.JButton pointsPlus1;
    private javax.swing.JButton pointsPlus10;
    private javax.swing.JButton polyMinus1;
    private javax.swing.JButton polyMinus10;
    private javax.swing.JButton polyPlus1;
    private javax.swing.JButton polyPlus10;
    private javax.swing.JRadioButton white;
    // End of variables declaration//GEN-END:variables
}
