package business;
public abstract class BaseCreditManager implements CredictManager {
		public abstract void Calculate();
		public void Save() {
			System.out.println("kaydedildi valla");
		}
}
