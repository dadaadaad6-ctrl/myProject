public class OmegaValidator {
	public static void main(String[] args) {
		if ((args.length != 2)) {
			System.out.println("Error: Invalid Arguments");
			return;
		}
		int securityCode = Integer.parseInt(args[0]);
		int powerLevel = Integer.parseInt(args[1]);
		boolean isAdmin = false;
		if (securityCode == 1234 || isAdmin) {
			if (powerLevel > 0 && powerLevel <= 100) {
				double drift = Math.random();
				int finalDrift = (int) (drift*10);
				long totalEnergy = (long) (powerLevel * finalDrift);
				float efficiency = 0.85f;
				String systemName = "Omega_System";
				System.out.println(systemName.toUpperCase());
				String result = ((totalEnergy > 20) ? "STABLE" : "UNSTABLE");
				int i = 3;
				while(i > 0) {
					System.out.println("Initializing...");
					i--;
				}
				for (int j = 0; j < 5; j++) {
					System.out.println("Scanning Sector: " + j);
				}
					for (int k = 10; k < 5; k++) {
						System.out.println("This will never show");
					}
					switch (result) {
					case "STABLE": 
						System.out.println("System fully operational!");
						break;
					case "UNSTABLE":
						System.out.println("Emergency Shutdown!");
						break;

					}

				

			} else {
				System.out.println("Cheater! Invalid power level!");
			}
		} else {
			System.out.println("Access Denied!");
		}

	}
}

