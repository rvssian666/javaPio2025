package interfaces;

public interface IAnimal {
	public abstract void doSound();

	public abstract void eat();

	public abstract void sleep();

	public abstract void toMove();

	public default void showInformation() {
		doSound();
		eat();
		sleep();
		toMove();

	}
}
