package urjc.isi.dao.interfaces;

import urjc.isi.entidades.Personas;
import java.util.List;
//Con esta interfaz obligamos a que se implmenten
//ciertos métodos exclusivos de Personas
public interface PersonasDAO extends GenericDAO<Personas>{
	
	public String table = "(idpersona text, fullnombre text, fnacimiento text, fmuerte text, PRIMARY KEY (idpersona))";
	
	/**
	 * Selecciona el registro de una persona utilizando su nombre
	 * @param Nombre de la persona a la que se desea buscar
	 * @return
	 */
	public Personas selectByName(String name);
	public List<Personas> selectPerByFechaNac (String fecha);
	public List<Personas> selectPerMuertas ();
	public List<Personas> selectPerByIntervaloNac (String fechaIn, String FehcaFin);
}
