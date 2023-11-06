public abstract class Motor{
	protected Bateria bateria;
	Motor(Bateria bateria){
		this.bateria=bateria;
	}
	public abstract void combustion(int mezcla, boolean chispa);
}