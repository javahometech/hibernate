package in.javahome.hibernate.mappings;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.javahome.hibernate.MyHibUtil;
import in.javahome.hibernate.entity.Owner;
import in.javahome.hibernate.entity.Vehicle;

public class SaveOneToMany {
	public static void main(String[] args) {
		try(Session session = MyHibUtil.getSession()){
			Transaction tx = session.beginTransaction();
			Vehicle v1 = new Vehicle();
			v1.setVehicleId(1111);
			v1.setName("BMW");
			v1.setCost(4000000.0);
			
			Vehicle v2 = new Vehicle();
			v2.setVehicleId(2222);
			v2.setName("Audi");
			v2.setCost(6000000.0);
			
			Owner o1 = new Owner();
			o1.setOwnerId(1);
			o1.setName("Babu");
			o1.setMobile("9999999999");
			
			v1.setOwner(o1);
			v2.setOwner(o1);
			
			session.save(o1);
			session.save(v1);
			session.save(v2);
			
			tx.commit();
		}
	}
}
