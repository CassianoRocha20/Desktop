JFrame frame = new JFrame(" CRUD :: Acesso ao sistema ");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	JPanel panel = new JPanel();
	panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

	JLabel lblUsuario = new JLabel(" usuário ");
	JTextField txtUsuario = new JTextField(20);
	txtUsuario.setToolTipText(" Informe seu usuário de acesso... ");

	JLabel lblSenha = new JLabel(" Senha: ");
	JPasswordField txtSenha = new JPasswordField(20);
	txtSenha.setToolTipText(" Informe sua senha de acesso... ");

	JButton btnLogin = new JButton(" Login ");

	btnLogin.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (txtUsuario.getText().equals(USER) && new String(txtSenha.getPassword()).equals(PASS)) {
				JOptionPane.showMessageDialog(frame, " Acesso autorizado ");
			}else {
				JOptionPane.showMessageDialog(frame, " Acesso negado ");

			}
		}

	});

	panel.add(lblUsuario);
	panel.add(txtUsuario);

	panel.add(lblSenha);
	panel.add(txtSenha);

	panel.add(btnLogin);

	frame.setContentPane(panel);
	frame.pack();
	frame.setVisible(true);

}