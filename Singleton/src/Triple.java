
public class Triple {

	private static Triple triple[] = {new Triple(), new Triple(), new Triple()};
	private Triple() {
		// pass.
	}
	public static Triple getInstance(int id) {
		
		if (0 > id || 2 < id) {
			System.out.println("id‚ª”ÍˆÍŠO‚Å‚·B");
			return null;
		}
		else {
			return triple[id];
		}
	}
}
