package co.edu.ufps.util;


import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import co.edu.ufps.model.Candidato;
import co.edu.ufps.model.Eleccion;
import co.edu.ufps.model.Estamento;
import co.edu.ufps.model.TipoDocumento;
import co.edu.ufps.model.Votante;
import co.edu.ufps.model.Voto;
import co.ufps.edu.dao.CandidatoDao;
import co.ufps.edu.dao.EleccionDao;
import co.ufps.edu.dao.EstamentoDao;
import co.ufps.edu.dao.TipoDocumentoDao;
import co.ufps.edu.dao.VotanteDao;


public class JPAUtil {
	
	

	public JPAUtil() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static EntityManager getEm() {
		
		// Create our entity manager
		EntityManagerFactory emf = 
		Persistence.createEntityManagerFactory("Elecciones-Ufps");
		EntityManager em = emf.createEntityManager();
		return em;
		
	}
	

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		 
        Candidato can = new Candidato();
        can.setId(10);
        can.setNombre("Horacio");
        can.setApellido("Jimenez");
        can.setDocumento("6636636");
        can.setNumero(9);
        can.setEleccion(1);
        
        CandidatoDao cd=new CandidatoDao();
        
        cd.insertar(new Candidato(2,"16616185858","Horacio","Jimenez",2,15));
        cd.buscar(2);
        cd.insertar(new Candidato(3,"16616185860","Ricardo","Marquez",2,20));
        cd.eliminar(2);
        cd.buscar(3);
        
        
        Votante vot = new Votante();
        vot.setId(5);
        vot.setNombre("Horacio");
        vot.setTipoDocumento(1);
        vot.setDocumento("10907737");
        vot.setEmail("Horacio@gmail.com");
        vot.setEleccion(1);
      
        VotanteDao vd=new VotanteDao();
        
        vd.insertar(new Votante(5,"19399393","Horacio","Horacio@gmail.com",1,1));
        vd.buscar(5);
        vd.insertar(new Votante(4,"62663363","Ricardo","Richard@gmail.com",2,2));
        vd.eliminar(4);
        vd.buscar(4);
        
        TipoDocumento td = new TipoDocumento();
        
        td.setId(1);
        td.setDescripcion("cedula");
        td.setId(2);
        td.setDescripcion("tarjeta de identidad");
        td.setId(3);
        td.setDescripcion("cedula de extranjeria");
        
        TipoDocumentoDao tdd=new TipoDocumentoDao();
        
        tdd.insertar(new TipoDocumento(1,"Cedula"));
        tdd.insertar(new TipoDocumento(2,"tarjeta de identidad"));
        tdd.insertar(new TipoDocumento(3,"cedula de extranjeria"));
        tdd.buscar(2);
        tdd.eliminar(1);
        
        Estamento es=new Estamento();
        
        es.setId(1);
        es.setDescripcion("eleccion para rector");
        es.setEleccion(2021);
        
        EstamentoDao esd=new EstamentoDao();
        
        esd.insertar(new Estamento(1,2021,"eleccion para rector"));
        esd.buscar(1);
        
        Eleccion el=new Eleccion();
        
        el.setId(1);
        el.setNombre("eleccion de rector");
       
       
        EleccionDao eld=new EleccionDao();
        
        //eld.insertar(new Eleccion(1,"eleccion de rector","04-06-2021","05-06-2021","administrativo"));
        
        Voto v=new Voto();
        
        v.setCandidato(2);
        v.setEstamento(1);
        v.setEstamento(1);
        v.setVotante(5);
        v.setEnlace("hhdhdhhdhd7");
        
     
        
        
        
        
        
	}

}
