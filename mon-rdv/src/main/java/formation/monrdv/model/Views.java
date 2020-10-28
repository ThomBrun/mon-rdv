package formation.monrdv.model;

public class Views {
	
	public static class ViewCommon {}
	
	public static class ViewUtilisateur extends ViewCommon {}

	public static class ViewAdministrateur extends ViewUtilisateur {}
	
	public static class ViewPatient extends ViewUtilisateur {}

	public static class ViewPraticien extends ViewUtilisateur {}




}
