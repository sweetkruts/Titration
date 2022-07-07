
import java.awt.Color;
import java.awt.Graphics;

public class AcidBasePage extends javax.swing.JFrame {
		private int acidSelect=0;
		private int baseSelect=0;
		private int counter=0;
		private double acidConcentration;
		private double baseConcentration;
		private int labelAcid=0;
		private int labelBase=0;
		
	/**
	 * Creates new form simulation
	 */
	public AcidBasePage() {
		initComponents();
		baseVisible(false);
		acidVisible(false);
		buttonStart.setVisible(false);
		textInstruction.setLineWrap(true);
		setLocationRelativeTo(null);
	}	
	public void acidVisible(boolean visible){
		if (visible){
			buttonHcl.setVisible(true);
			buttonHcl.setEnabled(true);
			buttonHcn.setVisible(true);
			buttonHcn.setEnabled(true);
			buttonHf.setVisible(true);
			buttonHf.setEnabled(true);
			
		}
		else {
			buttonHcl.setVisible(false);
			buttonHcl.setEnabled(false);
			buttonHcn.setVisible(false);
			buttonHcn.setEnabled(false);
			buttonHf.setVisible(false);
			buttonHf.setEnabled(false);
		}
	}
	
	public void hideAll() {
			buttonHcl.setVisible(false);
			buttonHcn.setVisible(false);
			buttonHf.setVisible(false);
			buttonNaoh.setVisible(false);
			buttonNh3.setVisible(false);
			buttonCo3.setVisible(false);
			buttonStart.setVisible(true);
	}
			
	public void baseVisible(boolean visible){
		if (visible){
			buttonNaoh.setVisible(true);
			buttonNaoh.setEnabled(true);
			buttonNh3.setVisible(true);
			buttonNh3.setEnabled(true);
			buttonCo3.setVisible(true);
			buttonCo3.setEnabled(true);
		}
		else{
			buttonNaoh.setVisible(false);
			buttonNaoh.setEnabled(false);
			buttonNh3.setVisible(false);
			buttonNh3.setEnabled(false);
			buttonCo3.setVisible(false);
			buttonCo3.setEnabled(false);
		}
	}
	
	public void getAcidConcentration(){
		acidConcentration=UserInput.getDouble("Concentration");
		while (acidConcentration<1 || acidConcentration>5){
			acidConcentration=UserInput.getDouble("Please enter concentration between 1 and 5");
		}
		System.out.println("Acid Concentration: "+acidConcentration + "M");
	}
	
	public void getBaseConcentration(){
		baseConcentration=UserInput.getDouble("Concentration");
		while (baseConcentration<1 || baseConcentration>5){
			baseConcentration=UserInput.getDouble("Please enter concentration between 1 and 5");
		}
		System.out.println("Base Concentration: "+baseConcentration+"M");
	}
	
	
	
	

	@SuppressWarnings("unchecked")

    private void initComponents() {

        buttonAcid = new javax.swing.JButton();
        buttonBase = new javax.swing.JButton();
        buttonHcl = new javax.swing.JButton();
        buttonHcn = new javax.swing.JButton();
        buttonHf = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textInstruction = new javax.swing.JTextArea();
        buttonNaoh = new javax.swing.JButton();
        buttonNh3 = new javax.swing.JButton();
        buttonCo3 = new javax.swing.JButton();
        panelDraw = new javax.swing.JPanel();
        buttonStart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonAcid.setText("Acid");
        buttonAcid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAcidActionPerformed(evt);
            }
        });

        buttonBase.setText("Base");
        buttonBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBaseActionPerformed(evt);
            }
        });

        buttonHcl.setText("HCl");
        buttonHcl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHclActionPerformed(evt);
            }
        });

        buttonHcn.setText("HCN");
        buttonHcn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHcnActionPerformed(evt);
            }
        });

        buttonHf.setText("HF");
        buttonHf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHfActionPerformed(evt);
            }
        });

        textInstruction.setEditable(false);
        textInstruction.setColumns(20);
        textInstruction.setRows(5);
        textInstruction.setText("Select Acid or Base.\nMaximum concentration\nof the reagents is 5M\n");
        jScrollPane2.setViewportView(textInstruction);

        buttonNaoh.setText("NaOH");
        buttonNaoh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNaohActionPerformed(evt);
            }
        });

        buttonNh3.setText("NH₃");
        buttonNh3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNh3ActionPerformed(evt);
            }
        });

        buttonCo3.setText("CO₃²⁻");
        buttonCo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCo3ActionPerformed(evt);
            }
        });

        buttonStart.setText("Start Titration!");
        buttonStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonStartActionPerformed(evt);
            }
        });


    private void buttonAcidActionPerformed(java.awt.event.ActionEvent evt) {

		if (counter==0){
			acidVisible(true);
			buttonAcid.setEnabled(false);
			buttonBase.setEnabled(false);
		}
		else if (counter==1){
			acidVisible(true);
			baseVisible(false);
			buttonAcid.setEnabled(false);
			buttonBase.setEnabled(false);
			
		}
		else {
			buttonAcid.setEnabled(false);
			buttonBase.setEnabled(false);
		}
		
	
		
    }
    private void buttonBaseActionPerformed(java.awt.event.ActionEvent evt) {
   
		if (counter==0){
			baseVisible(true);
			buttonAcid.setEnabled(false);
			buttonBase.setEnabled(false);
		}
		else if (counter==1){
			baseVisible(true);
			acidVisible(false);
			buttonBase.setEnabled(false);
		}
		else {
			buttonAcid.setEnabled(false);
			buttonBase.setEnabled(false);
		}
		
		
		
    }

    private void buttonHclActionPerformed(java.awt.event.ActionEvent evt) {
      
		counter++;
		System.out.println("Acid: HCl");
		getAcidConcentration();
		if (counter==1){
			buttonBase.setEnabled(true);
		}
		else if (counter==2) {
			buttonBase.setEnabled(false);
			buttonAcid.setEnabled(false);
			hideAll();
		}
		acidVisible(false);
		
		labelAcid=1;
    }
	
    private void buttonHcnActionPerformed(java.awt.event.ActionEvent evt) {

		System.out.println("Acid: HCN");
		getAcidConcentration();
		counter++;
		if (counter==1){
			buttonBase.setEnabled(true);
		}
		else if (counter==2) {
			buttonBase.setEnabled(false);
			buttonAcid.setEnabled(false);
			hideAll();
		}
		acidVisible(false);
		labelAcid=2;
	
    }

    private void buttonHfActionPerformed(java.awt.event.ActionEvent evt) {
		counter++;
		System.out.println("Acid: HF");
		getAcidConcentration();
		if (counter==1){
			buttonBase.setEnabled(true);
		}
		else if (counter==2){
			buttonBase.setEnabled(false);
			buttonAcid.setEnabled(false);
			hideAll();
		}
		acidVisible(false);
		
		labelAcid=3;
    }

    private void buttonNaohActionPerformed(java.awt.event.ActionEvent evt) {
		counter++;
		System.out.println("Base: NaOH");
		getBaseConcentration();
		if (counter==1){
			buttonAcid.setEnabled(true);
		}
		else if (counter==2){
			buttonAcid.setEnabled(false);
			buttonBase.setEnabled(false);
			hideAll();
		}
		baseVisible(false);
		
		labelBase=1;
		
    }

    private void buttonNh3ActionPerformed(java.awt.event.ActionEvent evt) {
		counter++;
		System.out.println("Base: NH3");
		getBaseConcentration();
		if (counter==1){
			buttonAcid.setEnabled(true);
		}
		else if (counter==2){
			buttonAcid.setEnabled(false);
			buttonBase.setEnabled(false);
			hideAll();
		}
		baseVisible(false);
		labelBase=2;
			
    }

    private void buttonCo3ActionPerformed(java.awt.event.ActionEvent evt) {
		counter++;
		System.out.println("Base: Co3 2-");
		getBaseConcentration();
		if (counter==1){
			buttonAcid.setEnabled(true);
		}
		else if (counter==2){
			buttonAcid.setEnabled(false);
			buttonBase.setEnabled(false);
			hideAll();
		}
		baseVisible(false);
		
		labelBase=3;
		

    }

    private void buttonStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonStartActionPerformed
        TitrationInfo info = new TitrationInfo(acidConcentration, baseConcentration,labelAcid,labelBase);
		Simulation s = new Simulation(info);
		s.setVisible(true); 
		dispose();
    }
	public static void main(String args[]) {
		
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(AcidBasePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(AcidBasePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(AcidBasePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(AcidBasePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
	
		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new AcidBasePage().setVisible(true);
			}
		});
	}

    private javax.swing.JButton buttonAcid;
    private javax.swing.JButton buttonBase;
    private javax.swing.JButton buttonCo3;
    private javax.swing.JButton buttonHcl;
    private javax.swing.JButton buttonHcn;
    private javax.swing.JButton buttonHf;
    private javax.swing.JButton buttonNaoh;
    private javax.swing.JButton buttonNh3;
    private javax.swing.JButton buttonStart;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelDraw;
    private javax.swing.JTextArea textInstruction;
    // End of variables declaration//GEN-END:variables
}
