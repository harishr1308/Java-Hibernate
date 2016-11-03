/**
 * Created by harish on 28/10/16.
 */
import org.hibernate.SessionFactory;
import utilities.Log;
import database.tables.NewHibernateUtil;
import database.services.ManageEmployee;

public class AccessDatabase {
    public static void main(String[] args) {
//        try{
//            factory = new Configuration().configure().buildSessionFactory();
//        }catch (Exception ex) {
//            Log.logger.error("Failed to create sessionFactory object." + ex);
//            Log.logger.error(ex.getMessage());
//            throw new ExceptionInInitializerError(ex);
//        }
        ManageEmployee ME = new ManageEmployee();

      /* Add few employee records in database */
        Integer empID1 = ME.addEmployee("Zara", "Ali", 1000);
        Log.logger.debug("Employee : "+"Zara "+ " Ali "+ 1000);
        Integer empID2 = ME.addEmployee("Daisy", "Das", 5000);
        Log.logger.debug("Employee : "+"Daisy"+ "Das"+ 5000);
        Integer empID3 = ME.addEmployee("John", "Paul", 10000);
        Log.logger.debug("Employee : "+"John"+ "Paul"+ 10000);
        Log.logger.info("3 Employees are added");
      /* List down all the employees */
        ME.listEmployees();
        Log.logger.info("Employees Listed");
      /* Update employee's records */
        ME.updateEmployee(empID1, 5000);
        Log.logger.info("Employee with empID1 " + empID1 + 5000 + "is updated");

      /* Delete an employee from the database */
        ME.deleteEmployee(empID2);
        Log.logger.info("Employee with empID1 " + empID2 + "is deleted");
      /* List down new list of the employees */
        ME.listEmployees();
        Log.logger.info("Employees Listed");
    }
}