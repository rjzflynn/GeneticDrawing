
package geneticapp.Interface;

import geneticapp.GeneticAlgo;
import geneticapp.Interface.ImagePanel;
import geneticapp.Interface.SettingsView;
import geneticapp.SVGGenerator;
import geneticapp.SettingsManager;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;


public class GUI extends javax.swing.JFrame {

    private SettingsView settingsWindow;
    private GeneticAlgo app;
    private NumberFormat formatter;
    private boolean running;
    private SVGGenerator svgGenerator;
    private FileFilter imageFilter;
    
    public GUI(GeneticAlgo app) {
        initComponents();
        this.app = app;
        this.setSize(915, 500);
        this.setLocationRelativeTo(null);      
        settingsWindow = new SettingsView(app, this);             
        formatter = new DecimalFormat("#0.00");
        svgGenerator = new SVGGenerator();
        imageFilter = new FileNameExtensionFilter("Image files", ImageIO.getReaderFileSuffixes());
        fileChooser.setDialogTitle("If pic is larger than 200*200 px  it is automatically downsized");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mutationGroup = new javax.swing.ButtonGroup();
        fileChooser = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sourceImagePanel = new ImagePanel();
        generatedImagePanel = new CanvasPanel();
        pauseStart = new javax.swing.JButton();
        mutateHard = new javax.swing.JRadioButton();
        mutateMedium = new javax.swing.JRadioButton();
        mutateSoft = new javax.swing.JRadioButton();
        sidePanel = new javax.swing.JPanel();
        fitnessLabel = new javax.swing.JLabel();
        mutationsLabel1 = new javax.swing.JLabel();
        benefitialMutationsLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        Open = new javax.swing.JMenuItem();
        export = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();
        Settings = new javax.swing.JMenu();
        viewSettings = new javax.swing.JMenuItem();

        fileChooser.setDialogTitle("This is my open dialog");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EvoLisa");

        jLabel1.setFont(new java.awt.Font("Rod", 0, 12)); // NOI18N
        jLabel1.setText("Source image");

        jLabel2.setFont(new java.awt.Font("Rod", 0, 12)); // NOI18N
        jLabel2.setText("Generated image");

        sourceImagePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        sourceImagePanel.setPreferredSize(new java.awt.Dimension(200, 200));

        javax.swing.GroupLayout sourceImagePanelLayout = new javax.swing.GroupLayout(sourceImagePanel);
        sourceImagePanel.setLayout(sourceImagePanelLayout);
        sourceImagePanelLayout.setHorizontalGroup(
            sourceImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 196, Short.MAX_VALUE)
        );
        sourceImagePanelLayout.setVerticalGroup(
            sourceImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 196, Short.MAX_VALUE)
        );

        generatedImagePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        generatedImagePanel.setPreferredSize(new java.awt.Dimension(400, 400));

        javax.swing.GroupLayout generatedImagePanelLayout = new javax.swing.GroupLayout(generatedImagePanel);
        generatedImagePanel.setLayout(generatedImagePanelLayout);
        generatedImagePanelLayout.setHorizontalGroup(
            generatedImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );
        generatedImagePanelLayout.setVerticalGroup(
            generatedImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        pauseStart.setFont(new java.awt.Font("Rod", 0, 18)); // NOI18N
        pauseStart.setText("Start/Pause");
        pauseStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseStartActionPerformed(evt);
            }
        });

        mutationGroup.add(mutateHard);
        mutateHard.setFont(new java.awt.Font("Rod", 0, 18)); // NOI18N
        mutateHard.setText("Mutate Hard");
        mutateHard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mutateHardActionPerformed(evt);
            }
        });

        mutationGroup.add(mutateMedium);
        mutateMedium.setFont(new java.awt.Font("Rod", 0, 18)); // NOI18N
        mutateMedium.setSelected(true);
        mutateMedium.setText("Mutate Medium");
        mutateMedium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mutateMediumActionPerformed(evt);
            }
        });

        mutationGroup.add(mutateSoft);
        mutateSoft.setFont(new java.awt.Font("Rod", 0, 18)); // NOI18N
        mutateSoft.setText("Mutate Soft");
        mutateSoft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mutateSoftActionPerformed(evt);
            }
        });

        sidePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        fitnessLabel.setFont(new java.awt.Font("Rod", 0, 16)); // NOI18N

        mutationsLabel1.setFont(new java.awt.Font("Rod", 0, 16)); // NOI18N

        benefitialMutationsLabel1.setFont(new java.awt.Font("Rod", 0, 16)); // NOI18N

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fitnessLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(benefitialMutationsLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mutationsLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addComponent(mutationsLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(benefitialMutationsLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fitnessLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        File.setText("File");
        File.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileActionPerformed(evt);
            }
        });

        Open.setText(" Open");
        Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenActionPerformed(evt);
            }
        });
        File.add(Open);

        export.setText("ExportSVG");
        export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportActionPerformed(evt);
            }
        });
        File.add(export);

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        File.add(Exit);

        jMenuBar1.add(File);

        Settings.setText("Settings");
        Settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SettingsActionPerformed(evt);
            }
        });

        viewSettings.setText("View");
        viewSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewSettingsActionPerformed(evt);
            }
        });
        Settings.add(viewSettings);

        jMenuBar1.add(Settings);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sourceImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pauseStart, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mutateSoft)
                    .addComponent(mutateHard, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mutateMedium))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(generatedImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sourceImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mutateHard)
                        .addGap(18, 18, 18)
                        .addComponent(mutateMedium)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(mutateSoft)
                        .addGap(18, 18, 18)
                        .addComponent(pauseStart, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(generatedImagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

     public void updateGeneratedImage(){
        CanvasPanel diaplayPanel = (CanvasPanel)generatedImagePanel;
        diaplayPanel.setCurrentDNA(app.getCurrentDNAStr());
        diaplayPanel.repaint();
    }
     
     public void updateStats(){
         mutationsLabel1.setText("Mutations: " + String.valueOf(app.getMutations()));
         benefitialMutationsLabel1.setText("Benefitial: " + String.valueOf(app.getBenefitialMutations()));
         fitnessLabel.setText(String.valueOf("Fitness: " + formatter.format(app.getFitnessPercent())) + " %");
     }
     
    
    
    private void pauseStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseStartActionPerformed
        if (app.getFitnessCalc().getSourceImage() != null) {
            if (!running) {
                app.start();
                running = true;
            } else {
                if (!app.isPaused()) {
                    app.setPaused(true);
                } else {
                    app.setPaused(false);
                }
            }
        }
        
    }//GEN-LAST:event_pauseStartActionPerformed

    private void mutateSoftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mutateSoftActionPerformed
        app.getConfig().setMutationStratagy(SettingsManager.SOFT);
    }//GEN-LAST:event_mutateSoftActionPerformed

    private void mutateMediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mutateMediumActionPerformed
        app.getConfig().setMutationStratagy(SettingsManager.MEDIUM);
    }//GEN-LAST:event_mutateMediumActionPerformed

    private void OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenActionPerformed
        fileChooser.setFileFilter(imageFilter);
        int returnVal = fileChooser.showOpenDialog(this);
        
        if (returnVal == JFileChooser.APPROVE_OPTION) {         
            File file = fileChooser.getSelectedFile(); 
            
            //if the selected image is larger than 200 * 200 px, it is downsized to 200 * 200
            BufferedImage img = loadImage(file);
            if (img.getWidth() > 200 || img.getHeight() > 200) {
                img = resizeImage(img, 200, 200);
                app.getFitnessCalc().setSourceImage(img);
            } else {
                app.getFitnessCalc().setSourceImage(loadImage(file));
            }                                  
        }
        
        //set the image to the sourceImage panel of the GUI
        ImagePanel p = (ImagePanel)sourceImagePanel;
        p.setImage(app.getFitnessCalc().getSourceImage());
        p.repaint();
        
        if (running) {
            app.reset(); 
            app.start();                    
        }
        
    }//GEN-LAST:event_OpenActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
         System.exit(0); 
    }//GEN-LAST:event_ExitActionPerformed

    private void SettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingsActionPerformed
        
    }//GEN-LAST:event_SettingsActionPerformed

    private void viewSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewSettingsActionPerformed
        settingsWindow.setLocationRelativeTo(this);
        settingsWindow.setVisible(true);
    }//GEN-LAST:event_viewSettingsActionPerformed

    private void mutateHardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mutateHardActionPerformed
        app.getConfig().setMutationStratagy(SettingsManager.HARD);
    }//GEN-LAST:event_mutateHardActionPerformed

    private void FileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileActionPerformed
    }//GEN-LAST:event_FileActionPerformed

    private void exportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportActionPerformed
        int returnVal = fileChooser.showSaveDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {

            String s = fileChooser.getSelectedFile().getAbsolutePath() + ".svg";

            try {
                OutputStream output = new FileOutputStream(s);
                svgGenerator.generateSVG((CanvasPanel) generatedImagePanel, output);

            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
    }//GEN-LAST:event_exportActionPerformed
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenu File;
    private javax.swing.JMenuItem Open;
    private javax.swing.JMenu Settings;
    private javax.swing.JLabel benefitialMutationsLabel1;
    private javax.swing.JMenuItem export;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLabel fitnessLabel;
    private javax.swing.JPanel generatedImagePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButton mutateHard;
    private javax.swing.JRadioButton mutateMedium;
    private javax.swing.JRadioButton mutateSoft;
    private javax.swing.ButtonGroup mutationGroup;
    private javax.swing.JLabel mutationsLabel1;
    private javax.swing.JButton pauseStart;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JPanel sourceImagePanel;
    private javax.swing.JMenuItem viewSettings;
    // End of variables declaration//GEN-END:variables
    
 BufferedImage resizeImage(BufferedImage original, int newWidth, int newHeight){
         BufferedImage resized = new BufferedImage(newWidth,
                 newHeight, original.getType());
         Graphics2D g = resized.createGraphics();
         
         g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
         g.drawImage(original, 0, 0, newWidth, newHeight,
                 0, 0, original.getWidth(), original.getHeight(), null);
         g.dispose();
         return resized;
     }   
 
  BufferedImage loadImage(File f) {
        BufferedImage in = null;
        try {
            in = ImageIO.read(f);
        } catch (IOException ex) {
            System.err.println("File problem");
        }

        return in;
    }



}
