public abstract class Bateria{
	private boolean esCargada;
	Bateria(boolean esCargada){
		this.esCargada=esCargada;
	}
	public boolean getEsCargada(){
		return esCargada;
	}
}