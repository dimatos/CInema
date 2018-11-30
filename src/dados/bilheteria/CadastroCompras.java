package bilheteria;

	import bilheteria.RepositorioCompras;
	import bilheteria.RepositorioComprasArray;
	import bilheteria.RepositorioComprasLista;

	public class CadastroCompras {
		
		private RepositorioCompras repCompra;
		
		
		public CadastroCompras(int escolha) {
			if(escolha == 0) {
				repCompra = new RepositorioComprasLista();
			} else {
				repCompra = new RepositorioComprasArray(5);
			}
		}
		
		public void cadastrar(Compra c) throws BilheteExistenteException{
			repCompra.cadastrar(c);
		}
		
		public void atualizar(Compra c) throws CadastroNaoEncontradoException {
			repCompra.atualizar(c);
		}
		
		public void remover(int id) throws CadastroNaoEncontradoException {
			repCompra.remover(id);
		}
		
		public Compra procurar (int id) throws CadastroNaoEncontradoException {
			return repCompra.procurar(id);
		}
		
		public boolean existe (int id) {
			return repCompra.existe(id);
		}

	}
