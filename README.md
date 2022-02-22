# Desktop
public static void main(String[] args) {
		final String USER = " Cassiano ";
		final String PASS = " senha123 ";

		JFrame frame = new JFrame(" CRUD :: Acesso ao sistema ");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

		JLabel lblUsuario = new JLabel(" usuário ");
		JTextField txtUsuario = new JTextField(20);
		txtUsuario.setToolTipText(" Informe seu usuáio de acesso... ");

		JLabel lblSenha = new JLabel(" Senha: ");
		JPasswordField txtSenha = new JPasswordField(20);
		txtSenha.setToolTipText(" Informe sua senha de acesso... ");

		JButton btnLogin = new JButton(" Login ");

		panel.add(lblUsuario);
		panel.add(txtUsuario);

		panel.add(lblSenha);
		panel.add(txtSenha);

		panel.add(btnLogin);

		frame.setContentPane(panel);
		frame.pack();
		frame.setVisible(true);
	}
}
