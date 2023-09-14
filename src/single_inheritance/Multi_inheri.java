package single_inheritance;

public class Multi_inheri extends Single_inheri_driver {
	
	public void Ac() {
		System.out.println ("car should contain Ac in it ");
	}

	public static void main(String[] args) {
		
		Multi_inheri dri = new Multi_inheri();
		
		dri.Ac();
		dri.bike();
		dri.car();

	}

}
