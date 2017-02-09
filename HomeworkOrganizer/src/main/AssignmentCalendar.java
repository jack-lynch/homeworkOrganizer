package main;

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
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.border.LineBorder;
import java.awt.Color;

public class AssignmentCalendar extends JPanel {
	
	JLabel date1 = new JLabel();
	JLabel date2 = new JLabel();
	JLabel date3 = new JLabel();
	JLabel date4 = new JLabel();
	JLabel date5 = new JLabel();
	JLabel date6 = new JLabel();
	JLabel date7 = new JLabel();
	JLabel date8 = new JLabel();
	JLabel date9 = new JLabel();
	JLabel date10 = new JLabel();
	JLabel date11 = new JLabel();
	JLabel date12 = new JLabel();
	JLabel date13 = new JLabel();
	JLabel date14 = new JLabel();
	JLabel date15 = new JLabel();
	JLabel date16 = new JLabel();
	JLabel date17 = new JLabel();
	JLabel date18 = new JLabel();
	JLabel date19 = new JLabel();
	JLabel date20 = new JLabel();
	JLabel date21 = new JLabel();
	JLabel date22 = new JLabel();
	JLabel date23 = new JLabel();
	JLabel date24 = new JLabel();
	JLabel date25 = new JLabel();
	JLabel date26 = new JLabel();
	JLabel date27 = new JLabel();
	JLabel date28 = new JLabel();
	JLabel date29 = new JLabel();
	JLabel date30 = new JLabel();
	JLabel date31 = new JLabel();
	JLabel date32 = new JLabel();
	JLabel date33 = new JLabel();
	JLabel date34 = new JLabel();
	JLabel date35 = new JLabel();
	
	JLabel ass1 = new JLabel();
	JLabel ass2 = new JLabel();
	JLabel ass3 = new JLabel();
	JLabel ass4 = new JLabel();
	JLabel ass5 = new JLabel();
	JLabel ass6 = new JLabel();
	JLabel ass7 = new JLabel();
	JLabel ass8 = new JLabel();
	JLabel ass9 = new JLabel();
	JLabel ass10 = new JLabel();
	JLabel ass11 = new JLabel();
	JLabel ass12 = new JLabel();
	JLabel ass13 = new JLabel();
	JLabel ass14 = new JLabel();
	JLabel ass15 = new JLabel();
	JLabel ass16 = new JLabel();
	JLabel ass17 = new JLabel();
	JLabel ass18 = new JLabel();
	JLabel ass19 = new JLabel();
	JLabel ass20 = new JLabel();
	JLabel ass21 = new JLabel();
	JLabel ass22 = new JLabel();
	JLabel ass23 = new JLabel();
	JLabel ass24 = new JLabel();
	JLabel ass25 = new JLabel();
	JLabel ass26 = new JLabel();
	JLabel ass27 = new JLabel();
	JLabel ass28 = new JLabel();
	JLabel ass29 = new JLabel();
	JLabel ass30 = new JLabel();
	JLabel ass31 = new JLabel();
	JLabel ass32 = new JLabel();
	JLabel ass33 = new JLabel();
	JLabel ass34 = new JLabel();
	JLabel ass35 = new JLabel();
	
	
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();
	JPanel panel5 = new JPanel();
	JPanel panel6 = new JPanel();
	JPanel panel7 = new JPanel();
	JPanel panel8 = new JPanel();
	JPanel panel9 = new JPanel();
	JPanel panel10 = new JPanel();
	JPanel panel11 = new JPanel();
	JPanel panel12 = new JPanel();
	JPanel panel13 = new JPanel();
	JPanel panel14 = new JPanel();
	JPanel panel15 = new JPanel();
	JPanel panel16 = new JPanel();
	JPanel panel17 = new JPanel();
	JPanel panel18 = new JPanel();
	JPanel panel19 = new JPanel();
	JPanel panel20 = new JPanel();
	JPanel panel21 = new JPanel();
	JPanel panel22 = new JPanel();
	JPanel panel23 = new JPanel();
	JPanel panel24 = new JPanel();
	JPanel panel25 = new JPanel();
	JPanel panel26 = new JPanel();
	JPanel panel27 = new JPanel();
	JPanel panel28 = new JPanel();
	JPanel panel29 = new JPanel();
	JPanel panel30 = new JPanel();
	JPanel panel31 = new JPanel();
	JPanel panel32 = new JPanel();
	JPanel panel33 = new JPanel();
	JPanel panel34 = new JPanel();
	JPanel panel35 = new JPanel();
	
	

	
	/**
	 * Create the panel.
	 */
	@SuppressWarnings("deprecation")
	public AssignmentCalendar() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{1, 1, 1, 1, 1, 1, 1};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblS = new JLabel("S");
		GridBagConstraints gbc_lblS = new GridBagConstraints();
		gbc_lblS.insets = new Insets(0, 0, 5, 5);
		gbc_lblS.gridx = 0;
		gbc_lblS.gridy = 0;
		add(lblS, gbc_lblS);
		
		JLabel lblM = new JLabel("M");
		GridBagConstraints gbc_lblM = new GridBagConstraints();
		gbc_lblM.insets = new Insets(0, 0, 5, 5);
		gbc_lblM.gridx = 1;
		gbc_lblM.gridy = 0;
		add(lblM, gbc_lblM);
		
		JLabel lblT = new JLabel("T");
		GridBagConstraints gbc_lblT = new GridBagConstraints();
		gbc_lblT.insets = new Insets(0, 0, 5, 5);
		gbc_lblT.gridx = 2;
		gbc_lblT.gridy = 0;
		add(lblT, gbc_lblT);
		
		JLabel lblW = new JLabel("W");
		GridBagConstraints gbc_lblW = new GridBagConstraints();
		gbc_lblW.insets = new Insets(0, 0, 5, 5);
		gbc_lblW.gridx = 3;
		gbc_lblW.gridy = 0;
		add(lblW, gbc_lblW);
		
		JLabel lblTH = new JLabel("TH");
		GridBagConstraints gbc_lblTH = new GridBagConstraints();
		gbc_lblTH.insets = new Insets(0, 0, 5, 5);
		gbc_lblTH.gridx = 4;
		gbc_lblTH.gridy = 0;
		add(lblTH, gbc_lblTH);
		
		JLabel lblF = new JLabel("F");
		GridBagConstraints gbc_lblF = new GridBagConstraints();
		gbc_lblF.insets = new Insets(0, 0, 5, 5);
		gbc_lblF.gridx = 5;
		gbc_lblF.gridy = 0;
		add(lblF, gbc_lblF);
		
		JLabel lblSA = new JLabel("S");
		GridBagConstraints gbc_lblSA = new GridBagConstraints();
		gbc_lblSA.insets = new Insets(0, 0, 5, 0);
		gbc_lblSA.gridx = 6;
		gbc_lblSA.gridy = 0;
		add(lblSA, gbc_lblSA);
		
		
		
		JPanel[] panels = {panel1, panel2, panel3, panel4, panel5, panel6, panel7, panel8, panel9, panel10,
					panel11, panel12, panel13, panel14, panel15,panel16, panel17, panel18, panel19, panel20,
					panel21, panel22, panel23, panel24, panel25,panel26, panel27, panel28, panel29, panel30,
					panel31, panel32, panel33, panel34, panel35};
		
		panel1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel_23 = new GridBagConstraints();
		gbc_panel_23.insets = new Insets(0, 0, 5, 5);
		gbc_panel_23.fill = GridBagConstraints.BOTH;
		gbc_panel_23.gridx = 0;
		gbc_panel_23.gridy = 1;
		add(panel1, gbc_panel_23);
		panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		
		panel2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel_22 = new GridBagConstraints();
		gbc_panel_22.insets = new Insets(0, 0, 5, 5);
		gbc_panel_22.fill = GridBagConstraints.BOTH;
		gbc_panel_22.gridx = 1;
		gbc_panel_22.gridy = 1;
		add(panel2, gbc_panel_22);
		
		
		panel3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel_26 = new GridBagConstraints();
		gbc_panel_26.insets = new Insets(0, 0, 5, 5);
		gbc_panel_26.fill = GridBagConstraints.BOTH;
		gbc_panel_26.gridx = 2;
		gbc_panel_26.gridy = 1;
		add(panel3, gbc_panel_26);
		
		
		panel4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel4 = new GridBagConstraints();
		gbc_panel4.insets = new Insets(0, 0, 5, 5);
		gbc_panel4.fill = GridBagConstraints.BOTH;
		gbc_panel4.gridx = 3;
		gbc_panel4.gridy = 1;
		add(panel4, gbc_panel4);
		
		panel5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel5 = new GridBagConstraints();
		gbc_panel5.insets = new Insets(0, 0, 5, 5);
		gbc_panel5.fill = GridBagConstraints.BOTH;
		gbc_panel5.gridx = 4;
		gbc_panel5.gridy = 1;
		add(panel5, gbc_panel5);
		
		panel6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel6 = new GridBagConstraints();
		gbc_panel6.insets = new Insets(0, 0, 5, 5);
		gbc_panel6.fill = GridBagConstraints.BOTH;
		gbc_panel6.gridx = 5;
		gbc_panel6.gridy = 1;
		add(panel6, gbc_panel6);
		
		panel7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel7 = new GridBagConstraints();
		gbc_panel7.insets = new Insets(0, 0, 5, 0);
		gbc_panel7.fill = GridBagConstraints.BOTH;
		gbc_panel7.gridx = 6;
		gbc_panel7.gridy = 1;
		add(panel7, gbc_panel7);
		
		panel8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel8 = new GridBagConstraints();
		gbc_panel8.insets = new Insets(0, 0, 5, 5);
		gbc_panel8.fill = GridBagConstraints.BOTH;
		gbc_panel8.gridx = 0;
		gbc_panel8.gridy = 2;
		add(panel8, gbc_panel8);
		
		panel9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel9 = new GridBagConstraints();
		gbc_panel9.insets = new Insets(0, 0, 5, 5);
		gbc_panel9.fill = GridBagConstraints.BOTH;
		gbc_panel9.gridx = 1;
		gbc_panel9.gridy = 2;
		add(panel9, gbc_panel9);
		
		panel10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel10 = new GridBagConstraints();
		gbc_panel10.insets = new Insets(0, 0, 5, 5);
		gbc_panel10.fill = GridBagConstraints.BOTH;
		gbc_panel10.gridx = 2;
		gbc_panel10.gridy = 2;
		add(panel10, gbc_panel10);
		
		panel11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel11 = new GridBagConstraints();
		gbc_panel11.insets = new Insets(0, 0, 5, 5);
		gbc_panel11.fill = GridBagConstraints.BOTH;
		gbc_panel11.gridx = 3;
		gbc_panel11.gridy = 2;
		add(panel11, gbc_panel11);
		
		panel12.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel12 = new GridBagConstraints();
		gbc_panel12.insets = new Insets(0, 0, 5, 5);
		gbc_panel12.fill = GridBagConstraints.BOTH;
		gbc_panel12.gridx = 4;
		gbc_panel12.gridy = 2;
		add(panel12, gbc_panel12);
		
		
		panel13.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel13 = new GridBagConstraints();
		gbc_panel13.insets = new Insets(0, 0, 5, 5);
		gbc_panel13.fill = GridBagConstraints.BOTH;
		gbc_panel13.gridx = 5;
		gbc_panel13.gridy = 2;
		add(panel13, gbc_panel13);
		

		panel14.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel14 = new GridBagConstraints();
		gbc_panel14.insets = new Insets(0, 0, 5, 0);
		gbc_panel14.fill = GridBagConstraints.BOTH;
		gbc_panel14.gridx = 6;
		gbc_panel14.gridy = 2;
		add(panel14, gbc_panel14);
		
		panel15.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel15 = new GridBagConstraints();
		gbc_panel15.insets = new Insets(0, 0, 5, 5);
		gbc_panel15.fill = GridBagConstraints.BOTH;
		gbc_panel15.gridx = 0;
		gbc_panel15.gridy = 3;
		add(panel15, gbc_panel15);
		
		panel16.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel16 = new GridBagConstraints();
		gbc_panel16.insets = new Insets(0, 0, 5, 5);
		gbc_panel16.fill = GridBagConstraints.BOTH;
		gbc_panel16.gridx = 1;
		gbc_panel16.gridy = 3;
		add(panel16, gbc_panel16);
		
		panel17.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel17 = new GridBagConstraints();
		gbc_panel17.insets = new Insets(0, 0, 5, 5);
		gbc_panel17.fill = GridBagConstraints.BOTH;
		gbc_panel17.gridx = 2;
		gbc_panel17.gridy = 3;
		add(panel17, gbc_panel17);
		
		panel18.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel18 = new GridBagConstraints();
		gbc_panel18.insets = new Insets(0, 0, 5, 5);
		gbc_panel18.fill = GridBagConstraints.BOTH;
		gbc_panel18.gridx = 3;
		gbc_panel18.gridy = 3;
		add(panel18, gbc_panel18);
		
		panel19.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel19 = new GridBagConstraints();
		gbc_panel19.insets = new Insets(0, 0, 5, 5);
		gbc_panel19.fill = GridBagConstraints.BOTH;
		gbc_panel19.gridx = 4;
		gbc_panel19.gridy = 3;
		add(panel19, gbc_panel19);
		
		panel20.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel20 = new GridBagConstraints();
		gbc_panel20.insets = new Insets(0, 0, 5, 5);
		gbc_panel20.fill = GridBagConstraints.BOTH;
		gbc_panel20.gridx = 5;
		gbc_panel20.gridy = 3;
		add(panel20, gbc_panel20);
		
		panel21.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel21 = new GridBagConstraints();
		gbc_panel21.insets = new Insets(0, 0, 5, 0);
		gbc_panel21.fill = GridBagConstraints.BOTH;
		gbc_panel21.gridx = 6;
		gbc_panel21.gridy = 3;
		add(panel21, gbc_panel21);
		
		panel22.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel22 = new GridBagConstraints();
		gbc_panel22.insets = new Insets(0, 0, 5, 5);
		gbc_panel22.fill = GridBagConstraints.BOTH;
		gbc_panel22.gridx = 0;
		gbc_panel22.gridy = 4;
		add(panel22, gbc_panel22);
		
		panel23.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel23 = new GridBagConstraints();
		gbc_panel23.insets = new Insets(0, 0, 5, 5);
		gbc_panel23.fill = GridBagConstraints.BOTH;
		gbc_panel23.gridx = 1;
		gbc_panel23.gridy = 4;
		add(panel23, gbc_panel23);
		
		panel24.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel24 = new GridBagConstraints();
		gbc_panel24.insets = new Insets(0, 0, 5, 5);
		gbc_panel24.fill = GridBagConstraints.BOTH;
		gbc_panel24.gridx = 2;
		gbc_panel24.gridy = 4;
		add(panel24, gbc_panel24);
		
		panel25.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel25 = new GridBagConstraints();
		gbc_panel25.insets = new Insets(0, 0, 5, 5);
		gbc_panel25.fill = GridBagConstraints.BOTH;
		gbc_panel25.gridx = 3;
		gbc_panel25.gridy = 4;
		add(panel25, gbc_panel25);
		
		panel26.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel26 = new GridBagConstraints();
		gbc_panel26.insets = new Insets(0, 0, 5, 5);
		gbc_panel26.fill = GridBagConstraints.BOTH;
		gbc_panel26.gridx = 4;
		gbc_panel26.gridy = 4;
		add(panel26, gbc_panel26);
		
		panel27.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel27 = new GridBagConstraints();
		gbc_panel27.insets = new Insets(0, 0, 5, 5);
		gbc_panel27.fill = GridBagConstraints.BOTH;
		gbc_panel27.gridx = 5;
		gbc_panel27.gridy = 4;
		add(panel27, gbc_panel27);
		
		panel28.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel28 = new GridBagConstraints();
		gbc_panel28.insets = new Insets(0, 0, 5, 0);
		gbc_panel28.fill = GridBagConstraints.BOTH;
		gbc_panel28.gridx = 6;
		gbc_panel28.gridy = 4;
		add(panel28, gbc_panel28);
		
		panel29.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel29 = new GridBagConstraints();
		gbc_panel29.insets = new Insets(0, 0, 0, 5);
		gbc_panel29.fill = GridBagConstraints.BOTH;
		gbc_panel29.gridx = 0;
		gbc_panel29.gridy = 5;
		add(panel29, gbc_panel29);
		
		panel30.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel30 = new GridBagConstraints();
		gbc_panel30.insets = new Insets(0, 0, 0, 5);
		gbc_panel30.fill = GridBagConstraints.BOTH;
		gbc_panel30.gridx = 1;
		gbc_panel30.gridy = 5;
		add(panel30, gbc_panel30);
		
		panel31.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel31 = new GridBagConstraints();
		gbc_panel31.insets = new Insets(0, 0, 0, 5);
		gbc_panel31.fill = GridBagConstraints.BOTH;
		gbc_panel31.gridx = 2;
		gbc_panel31.gridy = 5;
		add(panel31, gbc_panel31);
		
		panel32.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel32 = new GridBagConstraints();
		gbc_panel32.insets = new Insets(0, 0, 0, 5);
		gbc_panel32.fill = GridBagConstraints.BOTH;
		gbc_panel32.gridx = 3;
		gbc_panel32.gridy = 5;
		add(panel32, gbc_panel32);
		
		panel33.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel33 = new GridBagConstraints();
		gbc_panel33.insets = new Insets(0, 0, 0, 5);
		gbc_panel33.fill = GridBagConstraints.BOTH;
		gbc_panel33.gridx = 4;
		gbc_panel33.gridy = 5;
		add(panel33, gbc_panel33);
		
		panel34.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel34 = new GridBagConstraints();
		gbc_panel34.insets = new Insets(0, 0, 0, 5);
		gbc_panel34.fill = GridBagConstraints.BOTH;
		gbc_panel34.gridx = 5;
		gbc_panel34.gridy = 5;
		add(panel34, gbc_panel34);
		
		panel35.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		GridBagConstraints gbc_panel35 = new GridBagConstraints();
		gbc_panel35.fill = GridBagConstraints.BOTH;
		gbc_panel35.gridx = 6;
		gbc_panel35.gridy = 5;
		add(panel35, gbc_panel35);
		
		
		
		JLabel[] dates = {date1, date2, date3, date4, date5, date6, date7, date8, date9, date10,
						date11, date12, date13, date14, date15, date16, date17, date18, date19, date20,
						date21, date22, date23, date24, date25, date26, date27, date28, date29, date30,
						date31, date32, date33, date34, date35};
		
		JLabel[] assignmentLbls = {ass1, ass2, ass3, ass4, ass5, ass6, ass7, ass8, ass9, ass10,
				ass11, ass12, ass13, ass14, ass15, ass16, ass17, ass18, ass19, ass20,
				ass21, ass22, ass23, ass24, ass25, ass26, ass27, ass28, ass29, ass30,
				ass31, ass32, ass33, ass34, ass35};
		
		int[] numbers = {29, 30 , 31, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 1, 2, 3, 4};
		Calendar cal = Calendar.getInstance();
		int firstDay = cal.DAY_OF_WEEK;
		int date = cal.DAY_OF_MONTH;
		
		
		for(int i = 0; i < panels.length; i++){
			
			panels[i].setLayout(new BorderLayout(0, 0));
			//dates[i].setText("s");
			
			panels[i].add(dates[i], BorderLayout.EAST);
			
		}
		
		
		for(int i = 0; i < dates.length; i++){
			for(int k = 0; k < HomeworkOrganizer.assignments.size(); k++){
				Assignment a = HomeworkOrganizer.assignments.get(k);
				if(a.getDueDate().getDay() == numbers[i]){
					assignmentLbls[i].setText(a.title);
				}
			}
			String day = Integer.toString(numbers[i]);
			dates[i].setText(day);
			
		}
		
		 setCalendar();

	}

	public void setCalendar(){
		
		JPanel[] panels = {panel1, panel2, panel3, panel4, panel5, panel6, panel7, panel8, panel9, panel10,
				panel11, panel12, panel13, panel14, panel15,panel16, panel17, panel18, panel19, panel20,
				panel21, panel22, panel23, panel24, panel25,panel26, panel27, panel28, panel29, panel30,
				panel31, panel32, panel33, panel34, panel35};
		
		JLabel[] lbl = {ass1, ass2, ass3, ass4, ass5, ass6, ass7, ass8, ass9, ass10};
		
		for(int z = 0; z < HomeworkOrganizer.assignments.size(); z++){
			
			Assignment assignment = HomeworkOrganizer.assignments.get(z);
			panels[z].add(lbl[z], BorderLayout.WEST);
			lbl[z].setText(assignment.title);
			
		}
	}
	
	public void refreshDate(){
		
	}
	
}
