package com.github.imcemjava.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class IMCcomTela {

	private JFrame tela;
	private JTextField txtAltura, txtPeso;
	private JLabel lblAltura, lblPeso, lblResultado;
	private JButton btnOk, btnLimpar;

	public IMCcomTela() {
		inicializarComponentes();
		inicializarLogica();
	}

	private void inicializarComponentes() {
		//
		// Componentes de Tela
		//
		tela = new JFrame();
		txtAltura = new JTextField();
		txtPeso = new JTextField();
		lblAltura = new JLabel("Altura: ");
		lblPeso = new JLabel("Peso: ");
		btnOk = new JButton("OK");
		btnLimpar = new JButton("C");
		lblResultado = new JLabel("");

		//
		// Ajustes dos componentes de Tela
		//
		lblAltura.setBounds(10, 10, 90, 10);
		txtAltura.setBounds(60, 10, 90, 18);
		lblPeso.setBounds(10, 50, 90, 10);
		txtPeso.setBounds(60, 50, 90, 18);
		btnOk.setBounds(10, 80, 55, 20);
		btnLimpar.setBounds(95, 80, 55, 20);
		lblResultado.setBounds(10, 105, 140, 20);

		//
		// Adicionando os componentes na Tela
		//
		tela.add(lblAltura);
		tela.add(lblPeso);
		tela.add(txtAltura);
		tela.add(txtPeso);
		tela.add(btnOk);
		tela.add(btnLimpar);
		tela.add(lblResultado);

		//
		// Ajustes do JFrame
		//
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setSize(180, 180);
		tela.setLocationRelativeTo(null);
		tela.setTitle("IMC v1.0");
		tela.setResizable(false);
		tela.setLayout(null);
		tela.setVisible(true);
	}

	public void inicializarLogica() {

		btnOk.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				try {
					int altura;
					double peso, imc;

					altura = Integer.parseInt(txtAltura.getText());
					peso = Double.parseDouble(txtPeso.getText());

					imc = peso / (altura * altura) * 10000;
					String r = (String.format("%.2f", imc).toString());
					lblResultado.setText(r);
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Operação inválida");
				}

			}
		});

		btnLimpar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				txtAltura.setText("");
				txtPeso.setText("");
				lblResultado.setText("");
			}
		});
	}
}