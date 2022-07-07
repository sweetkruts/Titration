import java.lang.Math;
import java.awt.Color;
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 897034
 */
public class Simulation extends javax.swing.JFrame {
	TitrationInfo info;
	private double concentration = 0;
	
	
	
	
	public Simulation(TitrationInfo info) {
		this.info = info;
		
		initComponents();
		setLocationRelativeTo(null);
		buttonRestart.setVisible(false);
		buttonRestart.setEnabled(false);
		buttonStir.setEnabled(false);
	}
	
	public void titrate(double drop){
		
		Color c = new Color(255,255,255);
		Graphics g = panelGlass.getGraphics();
		g.setColor(c);
		g.fillRect(0,0,panelGlass.getWidth(), panelGlass.getHeight());
		
		concentration+=drop;
		System.out.println("Current mL added: "+concentration);
		
		buttonStir.setEnabled(true);
		buttonAcid1.setEnabled(false);
		buttonAcid2.setEnabled(false);
		buttonAcid3.setEnabled(false);
		
		
	/*	Color d = new Color(216,191,216);
		
		Graphics f = panelTitrate.getGraphics();
		f.setColor(d);
		f.fillRect(0,0,panelTitrate.getWidth(), panelTitrate.getHeight());
		
		if (concentration-geteqPoint()<=1){
			Color l = new Color(218,112,214);
			Graphics m = panelTitrate.getGraphics();
			m.setColor(l);
			m.fillRect(0,0,panelTitrate.getWidth(), panelTitrate.getHeight());
			buttonAcid1.setEnabled(false);
			buttonAcid2.setEnabled(false);
			buttonAcid3.setEnabled(false);
		}
		
	
	*/
		if (concentration==geteqPoint()) {
			System.out.println("Equivalence Point Reached!");
			Color h = new Color(238,130,238);
			Graphics p = panelTitrate.getGraphics();
			p.setColor(h);
			p.fillRect(0,0,panelTitrate.getWidth(), panelTitrate.getHeight());
			buttonStir.setEnabled(false);
		}
		
		else if (concentration>geteqPoint()) {
			System.out.println("You went over the equivalence point. Restart the titration. You ended at: " + concentration +"mL");
			Color h = new Color(75,0,130);
			Graphics p = panelTitrate.getGraphics();
			p.setColor(h);
			p.fillRect(0,0,panelTitrate.getWidth(), panelTitrate.getHeight());
			buttonStir.setEnabled(false);
			buttonRestart.setVisible(true);
			buttonRestart.setEnabled(true);
		}
		
		
	}
	
	public int geteqPoint() {
		
		double acid = info.acidConc();
		double base = info.acidConc();
		
		if (info.getLabelA()==1 || info.getLabelB()==1){
			return 1;
			
		}
		
		if (info.getLabelA()==2) {
			return -(int)((Math.log10(6.2*(Math.pow(10,-12))))*info.baseConc()*2);
		}
		
		if (info.getLabelA()==3) {
			return -(int)((Math.log10(6.6*(Math.pow(10,-4))))*info.baseConc()*2);
		}
		
		else return 1;
	}
	
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonAcid1 = new javax.swing.JButton();
        panelGlass = new javax.swing.JPanel();
        panelTitrate = new javax.swing.JPanel();
        buttonAcid2 = new javax.swing.JButton();
        buttonAcid3 = new javax.swing.JButton();
        buttonStir = new javax.swing.JButton();
        buttonRestart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonAcid1.setText("Add 1.0 mL Acid");
        buttonAcid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAcid1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTitrateLayout = new javax.swing.GroupLayout(panelTitrate);
        panelTitrate.setLayout(panelTitrateLayout);
        panelTitrateLayout.setHorizontalGroup(
            panelTitrateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelTitrateLayout.setVerticalGroup(
            panelTitrateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelGlassLayout = new javax.swing.GroupLayout(panelGlass);
        panelGlass.setLayout(panelGlassLayout);
        panelGlassLayout.setHorizontalGroup(
            panelGlassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlassLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelTitrate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelGlassLayout.setVerticalGroup(
            panelGlassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlassLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(panelTitrate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonAcid2.setText("Add 5.0 mL Acid");
        buttonAcid2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAcid2ActionPerformed(evt);
            }
        });

        buttonAcid3.setText("Add 10.0 mL Acid");
        buttonAcid3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAcid3ActionPerformed(evt);
            }
        });

        buttonStir.setText("STIR");
        buttonStir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonStirActionPerformed(evt);
            }
        });

        buttonRestart.setText("Restart");
        buttonRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRestartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonStir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAcid2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAcid1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelGlass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAcid3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(138, 138, 138))
            .addGroup(layout.createSequentialGroup()
                .addComponent(buttonRestart)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelGlass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(buttonAcid1)
                .addGap(18, 18, 18)
                .addComponent(buttonAcid2)
                .addGap(18, 18, 18)
                .addComponent(buttonAcid3)
                .addGap(18, 18, 18)
                .addComponent(buttonStir)
                .addGap(7, 7, 7)
                .addComponent(buttonRestart)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAcid1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAcid1ActionPerformed
		System.out.println("+1mL");
		buttonStir.setEnabled(true);
		titrate(1);
		

		Color d = new Color(221, 160, 221);

		Graphics f = panelTitrate.getGraphics();
		f.setColor(d);
		f.fillRect(0, 0, panelTitrate.getWidth(), panelTitrate.getHeight());
    }//GEN-LAST:event_buttonAcid1ActionPerformed

    private void buttonAcid2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAcid2ActionPerformed
		System.out.println("+5mL");
		buttonStir.setEnabled(true);
		titrate(5);
		

		Color d = new Color(255, 0, 255);

		Graphics f = panelTitrate.getGraphics();
		f.setColor(d);
		f.fillRect(0, 0, panelTitrate.getWidth(), panelTitrate.getHeight());


    }//GEN-LAST:event_buttonAcid2ActionPerformed

    private void buttonAcid3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAcid3ActionPerformed
        System.out.println("+10mL");
		buttonStir.setEnabled(true);
		titrate(10);
		
		
		Color d = new Color(148,0,211);
		
		Graphics f = panelTitrate.getGraphics();
		f.setColor(d);
		f.fillRect(0,0,panelTitrate.getWidth(), panelTitrate.getHeight());
    }//GEN-LAST:event_buttonAcid3ActionPerformed

    private void buttonStirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonStirActionPerformed
        Color d = new Color(216,191,216);
		Graphics f = panelTitrate.getGraphics();
		f.setColor(d);
		f.fillRect(0,0,panelTitrate.getWidth(), panelTitrate.getHeight());
		buttonStir.setEnabled(false);
		buttonAcid1.setEnabled(true);
		buttonAcid2.setEnabled(true);
		buttonAcid3.setEnabled(true);

    }//GEN-LAST:event_buttonStirActionPerformed

    private void buttonRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRestartActionPerformed
        // TODO add your handling code here:
		System.out.println("You have restarted. Current mL of acid added: 0mL");
		concentration=0;
		
		Color c = new Color(255,255,255);
		Graphics g = panelGlass.getGraphics();
		g.setColor(c);
		g.fillRect(0,0,panelGlass.getWidth(), panelGlass.getHeight());
		Color d = new Color(255,255,255);
		Graphics f = panelTitrate.getGraphics();
		f.setColor(d);
		f.fillRect(0,0,panelTitrate.getWidth(), panelTitrate.getHeight());
		buttonRestart.setEnabled(false);
		buttonAcid1.setEnabled(true);
		buttonAcid2.setEnabled(true);
		buttonAcid3.setEnabled(true);
		
    }//GEN-LAST:event_buttonRestartActionPerformed

	/**
	 * @param args the command line arguments
	 */
	

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAcid1;
    private javax.swing.JButton buttonAcid2;
    private javax.swing.JButton buttonAcid3;
    private javax.swing.JButton buttonRestart;
    private javax.swing.JButton buttonStir;
    private javax.swing.JPanel panelGlass;
    private javax.swing.JPanel panelTitrate;
    // End of variables declaration//GEN-END:variables
}
