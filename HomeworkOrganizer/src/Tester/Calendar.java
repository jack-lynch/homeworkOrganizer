package Tester;

import javax.swing.JPanel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JTable;
import java.awt.GridLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class Calendar extends JPanel {
	private JPanel panel32;

	/**
	 * Create the panel.
	 */
	public Calendar() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{1, 1, 1, 1, 1, 1, 1};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblM = new JLabel("M");
		GridBagConstraints gbc_lblM = new GridBagConstraints();
		gbc_lblM.insets = new Insets(0, 0, 5, 5);
		gbc_lblM.gridx = 0;
		gbc_lblM.gridy = 0;
		add(lblM, gbc_lblM);
		
		JLabel lblT = new JLabel("T");
		GridBagConstraints gbc_lblT = new GridBagConstraints();
		gbc_lblT.insets = new Insets(0, 0, 5, 5);
		gbc_lblT.gridx = 1;
		gbc_lblT.gridy = 0;
		add(lblT, gbc_lblT);
		
		JLabel lblW = new JLabel("W");
		GridBagConstraints gbc_lblW = new GridBagConstraints();
		gbc_lblW.insets = new Insets(0, 0, 5, 5);
		gbc_lblW.gridx = 2;
		gbc_lblW.gridy = 0;
		add(lblW, gbc_lblW);
		
		JLabel lblTh = new JLabel("Th");
		GridBagConstraints gbc_lblTh = new GridBagConstraints();
		gbc_lblTh.insets = new Insets(0, 0, 5, 5);
		gbc_lblTh.gridx = 3;
		gbc_lblTh.gridy = 0;
		add(lblTh, gbc_lblTh);
		
		JLabel lblF = new JLabel("F");
		GridBagConstraints gbc_lblF = new GridBagConstraints();
		gbc_lblF.insets = new Insets(0, 0, 5, 5);
		gbc_lblF.gridx = 4;
		gbc_lblF.gridy = 0;
		add(lblF, gbc_lblF);
		
		JLabel lblS = new JLabel("S");
		GridBagConstraints gbc_lblS = new GridBagConstraints();
		gbc_lblS.insets = new Insets(0, 0, 5, 5);
		gbc_lblS.gridx = 5;
		gbc_lblS.gridy = 0;
		add(lblS, gbc_lblS);
		
		JLabel lblSu = new JLabel("Su");
		GridBagConstraints gbc_lblSu = new GridBagConstraints();
		gbc_lblSu.insets = new Insets(0, 0, 5, 0);
		gbc_lblSu.gridx = 6;
		gbc_lblSu.gridy = 0;
		add(lblSu, gbc_lblSu);
		
		JPanel panel1 = new JPanel();
		panel1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel_23 = new GridBagConstraints();
		gbc_panel_23.insets = new Insets(0, 0, 5, 5);
		gbc_panel_23.fill = GridBagConstraints.BOTH;
		gbc_panel_23.gridx = 0;
		gbc_panel_23.gridy = 1;
		add(panel1, gbc_panel_23);
		
		JPanel panel2 = new JPanel();
		panel2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel_22 = new GridBagConstraints();
		gbc_panel_22.insets = new Insets(0, 0, 5, 5);
		gbc_panel_22.fill = GridBagConstraints.BOTH;
		gbc_panel_22.gridx = 1;
		gbc_panel_22.gridy = 1;
		add(panel2, gbc_panel_22);
		
		JPanel panel3 = new JPanel();
		panel3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel_26 = new GridBagConstraints();
		gbc_panel_26.insets = new Insets(0, 0, 5, 5);
		gbc_panel_26.fill = GridBagConstraints.BOTH;
		gbc_panel_26.gridx = 2;
		gbc_panel_26.gridy = 1;
		add(panel3, gbc_panel_26);
		
		JPanel panel4 = new JPanel();
		panel4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel4 = new GridBagConstraints();
		gbc_panel4.insets = new Insets(0, 0, 5, 5);
		gbc_panel4.fill = GridBagConstraints.BOTH;
		gbc_panel4.gridx = 3;
		gbc_panel4.gridy = 1;
		add(panel4, gbc_panel4);
		
		JPanel panel5 = new JPanel();
		panel5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel5 = new GridBagConstraints();
		gbc_panel5.insets = new Insets(0, 0, 5, 5);
		gbc_panel5.fill = GridBagConstraints.BOTH;
		gbc_panel5.gridx = 4;
		gbc_panel5.gridy = 1;
		add(panel5, gbc_panel5);
		
		JPanel panel6 = new JPanel();
		panel6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel6 = new GridBagConstraints();
		gbc_panel6.insets = new Insets(0, 0, 5, 5);
		gbc_panel6.fill = GridBagConstraints.BOTH;
		gbc_panel6.gridx = 5;
		gbc_panel6.gridy = 1;
		add(panel6, gbc_panel6);
		
		JPanel panel7 = new JPanel();
		panel7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel7 = new GridBagConstraints();
		gbc_panel7.insets = new Insets(0, 0, 5, 0);
		gbc_panel7.fill = GridBagConstraints.BOTH;
		gbc_panel7.gridx = 6;
		gbc_panel7.gridy = 1;
		add(panel7, gbc_panel7);
		
		JPanel panel8 = new JPanel();
		panel8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel8 = new GridBagConstraints();
		gbc_panel8.insets = new Insets(0, 0, 5, 5);
		gbc_panel8.fill = GridBagConstraints.BOTH;
		gbc_panel8.gridx = 0;
		gbc_panel8.gridy = 2;
		add(panel8, gbc_panel8);
		
		JPanel panel9 = new JPanel();
		panel9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel9 = new GridBagConstraints();
		gbc_panel9.insets = new Insets(0, 0, 5, 5);
		gbc_panel9.fill = GridBagConstraints.BOTH;
		gbc_panel9.gridx = 1;
		gbc_panel9.gridy = 2;
		add(panel9, gbc_panel9);
		
		JPanel panel10 = new JPanel();
		panel10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel10 = new GridBagConstraints();
		gbc_panel10.insets = new Insets(0, 0, 5, 5);
		gbc_panel10.fill = GridBagConstraints.BOTH;
		gbc_panel10.gridx = 2;
		gbc_panel10.gridy = 2;
		add(panel10, gbc_panel10);
		
		JPanel panel11 = new JPanel();
		panel11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel11 = new GridBagConstraints();
		gbc_panel11.insets = new Insets(0, 0, 5, 5);
		gbc_panel11.fill = GridBagConstraints.BOTH;
		gbc_panel11.gridx = 3;
		gbc_panel11.gridy = 2;
		add(panel11, gbc_panel11);
		
		JPanel panel12 = new JPanel();
		panel12.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel12 = new GridBagConstraints();
		gbc_panel12.insets = new Insets(0, 0, 5, 5);
		gbc_panel12.fill = GridBagConstraints.BOTH;
		gbc_panel12.gridx = 4;
		gbc_panel12.gridy = 2;
		add(panel12, gbc_panel12);
		
		JPanel panel13 = new JPanel();
		panel13.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel13 = new GridBagConstraints();
		gbc_panel13.insets = new Insets(0, 0, 5, 5);
		gbc_panel13.fill = GridBagConstraints.BOTH;
		gbc_panel13.gridx = 5;
		gbc_panel13.gridy = 2;
		add(panel13, gbc_panel13);
		
		JPanel panel14 = new JPanel();
		panel14.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel14 = new GridBagConstraints();
		gbc_panel14.insets = new Insets(0, 0, 5, 0);
		gbc_panel14.fill = GridBagConstraints.BOTH;
		gbc_panel14.gridx = 6;
		gbc_panel14.gridy = 2;
		add(panel14, gbc_panel14);
		
		JPanel panel15 = new JPanel();
		panel15.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel15 = new GridBagConstraints();
		gbc_panel15.insets = new Insets(0, 0, 5, 5);
		gbc_panel15.fill = GridBagConstraints.BOTH;
		gbc_panel15.gridx = 0;
		gbc_panel15.gridy = 3;
		add(panel15, gbc_panel15);
		
		JPanel panel16 = new JPanel();
		panel16.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel16 = new GridBagConstraints();
		gbc_panel16.insets = new Insets(0, 0, 5, 5);
		gbc_panel16.fill = GridBagConstraints.BOTH;
		gbc_panel16.gridx = 1;
		gbc_panel16.gridy = 3;
		add(panel16, gbc_panel16);
		
		JPanel panel17 = new JPanel();
		panel17.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel17 = new GridBagConstraints();
		gbc_panel17.insets = new Insets(0, 0, 5, 5);
		gbc_panel17.fill = GridBagConstraints.BOTH;
		gbc_panel17.gridx = 2;
		gbc_panel17.gridy = 3;
		add(panel17, gbc_panel17);
		
		JPanel panel18 = new JPanel();
		panel18.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel18 = new GridBagConstraints();
		gbc_panel18.insets = new Insets(0, 0, 5, 5);
		gbc_panel18.fill = GridBagConstraints.BOTH;
		gbc_panel18.gridx = 3;
		gbc_panel18.gridy = 3;
		add(panel18, gbc_panel18);
		
		JPanel panel19 = new JPanel();
		panel19.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel19 = new GridBagConstraints();
		gbc_panel19.insets = new Insets(0, 0, 5, 5);
		gbc_panel19.fill = GridBagConstraints.BOTH;
		gbc_panel19.gridx = 4;
		gbc_panel19.gridy = 3;
		add(panel19, gbc_panel19);
		
		JPanel panel20 = new JPanel();
		panel20.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel20 = new GridBagConstraints();
		gbc_panel20.insets = new Insets(0, 0, 5, 5);
		gbc_panel20.fill = GridBagConstraints.BOTH;
		gbc_panel20.gridx = 5;
		gbc_panel20.gridy = 3;
		add(panel20, gbc_panel20);
		
		JPanel panel21 = new JPanel();
		panel21.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel21 = new GridBagConstraints();
		gbc_panel21.insets = new Insets(0, 0, 5, 0);
		gbc_panel21.fill = GridBagConstraints.BOTH;
		gbc_panel21.gridx = 6;
		gbc_panel21.gridy = 3;
		add(panel21, gbc_panel21);
		
		JPanel panel22 = new JPanel();
		panel22.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel22 = new GridBagConstraints();
		gbc_panel22.insets = new Insets(0, 0, 5, 5);
		gbc_panel22.fill = GridBagConstraints.BOTH;
		gbc_panel22.gridx = 0;
		gbc_panel22.gridy = 4;
		add(panel22, gbc_panel22);
		
		JPanel panel23 = new JPanel();
		panel23.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel23 = new GridBagConstraints();
		gbc_panel23.insets = new Insets(0, 0, 5, 5);
		gbc_panel23.fill = GridBagConstraints.BOTH;
		gbc_panel23.gridx = 1;
		gbc_panel23.gridy = 4;
		add(panel23, gbc_panel23);
		
		JPanel panel24 = new JPanel();
		panel24.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel24 = new GridBagConstraints();
		gbc_panel24.insets = new Insets(0, 0, 5, 5);
		gbc_panel24.fill = GridBagConstraints.BOTH;
		gbc_panel24.gridx = 2;
		gbc_panel24.gridy = 4;
		add(panel24, gbc_panel24);
		
		JPanel panel25 = new JPanel();
		panel25.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel25 = new GridBagConstraints();
		gbc_panel25.insets = new Insets(0, 0, 5, 5);
		gbc_panel25.fill = GridBagConstraints.BOTH;
		gbc_panel25.gridx = 3;
		gbc_panel25.gridy = 4;
		add(panel25, gbc_panel25);
		
		JPanel panel26 = new JPanel();
		panel26.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel26 = new GridBagConstraints();
		gbc_panel26.insets = new Insets(0, 0, 5, 5);
		gbc_panel26.fill = GridBagConstraints.BOTH;
		gbc_panel26.gridx = 4;
		gbc_panel26.gridy = 4;
		add(panel26, gbc_panel26);
		
		JPanel panel27 = new JPanel();
		panel27.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel27 = new GridBagConstraints();
		gbc_panel27.insets = new Insets(0, 0, 5, 5);
		gbc_panel27.fill = GridBagConstraints.BOTH;
		gbc_panel27.gridx = 5;
		gbc_panel27.gridy = 4;
		add(panel27, gbc_panel27);
		
		JPanel panel28 = new JPanel();
		panel28.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel28 = new GridBagConstraints();
		gbc_panel28.insets = new Insets(0, 0, 5, 0);
		gbc_panel28.fill = GridBagConstraints.BOTH;
		gbc_panel28.gridx = 6;
		gbc_panel28.gridy = 4;
		add(panel28, gbc_panel28);
		
		JPanel panel29 = new JPanel();
		panel29.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel29 = new GridBagConstraints();
		gbc_panel29.insets = new Insets(0, 0, 0, 5);
		gbc_panel29.fill = GridBagConstraints.BOTH;
		gbc_panel29.gridx = 0;
		gbc_panel29.gridy = 5;
		add(panel29, gbc_panel29);
		
		JPanel panel30 = new JPanel();
		panel30.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel30 = new GridBagConstraints();
		gbc_panel30.insets = new Insets(0, 0, 0, 5);
		gbc_panel30.fill = GridBagConstraints.BOTH;
		gbc_panel30.gridx = 1;
		gbc_panel30.gridy = 5;
		add(panel30, gbc_panel30);
		
		JPanel panel31 = new JPanel();
		panel31.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel31 = new GridBagConstraints();
		gbc_panel31.insets = new Insets(0, 0, 0, 5);
		gbc_panel31.fill = GridBagConstraints.BOTH;
		gbc_panel31.gridx = 2;
		gbc_panel31.gridy = 5;
		add(panel31, gbc_panel31);
		
		panel32 = new JPanel();
		panel32.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel32 = new GridBagConstraints();
		gbc_panel32.insets = new Insets(0, 0, 0, 5);
		gbc_panel32.fill = GridBagConstraints.BOTH;
		gbc_panel32.gridx = 3;
		gbc_panel32.gridy = 5;
		add(panel32, gbc_panel32);
		
		JPanel panel33 = new JPanel();
		panel33.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel33 = new GridBagConstraints();
		gbc_panel33.insets = new Insets(0, 0, 0, 5);
		gbc_panel33.fill = GridBagConstraints.BOTH;
		gbc_panel33.gridx = 4;
		gbc_panel33.gridy = 5;
		add(panel33, gbc_panel33);
		
		JPanel panel34 = new JPanel();
		panel34.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel34 = new GridBagConstraints();
		gbc_panel34.insets = new Insets(0, 0, 0, 5);
		gbc_panel34.fill = GridBagConstraints.BOTH;
		gbc_panel34.gridx = 5;
		gbc_panel34.gridy = 5;
		add(panel34, gbc_panel34);
		
		JPanel panel35 = new JPanel();
		panel35.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel35 = new GridBagConstraints();
		gbc_panel35.fill = GridBagConstraints.BOTH;
		gbc_panel35.gridx = 6;
		gbc_panel35.gridy = 5;
		add(panel35, gbc_panel35);

	}

}
