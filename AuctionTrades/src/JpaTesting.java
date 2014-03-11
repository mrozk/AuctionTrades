import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.aplant.auction.ws.dto.Lots;
import com.aplant.auction.ws.dto.Users;



public class JpaTesting {
	
	private static Logger logger = LogManager.getLogger("JpaTesting");
	
	private static final String PERSISTENCE_UNIT_NAME = "todos";
	private EntityManagerFactory emf ;
	private EntityManager em ;
	
	public static void main(String[] args) {
		JpaTesting main = new JpaTesting();
		
		
		main.initEntityManager();
		main.createAndRead();
	}
	
	private void createAndRead() {
		
		em.getTransaction().begin();
		
		Users users = new Users();
		users.setLogin("Mrozy");
		em.persist(users);
		
		
		Lots lot = new Lots();
		lot.setName("hello");
		lot.setDescription("OZK"); 
		lot.setUser(users);
		
		
		em.persist(lot);
		
		em.getTransaction().commit();
		
	}
	
	private void initEntityManager() {
		emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		em = emf.createEntityManager();
	}
}
