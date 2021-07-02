public abstract interface Autenticavel{
	/**
	 * em uma interface nao pode ter nada concreto, apenas abstrato 
	 */
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);
}
