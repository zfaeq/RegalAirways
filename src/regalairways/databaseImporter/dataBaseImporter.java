
package regalairways.databaseImporter;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import regalairways.Connect;
import regalairways.DeleteCustomer;

public class dataBaseImporter {
   

    public static void main(String args[]) 
{
     Connect conecct = new Connect();
    ResultSet rs;
    Statement statement;
    Connection con;
    String insertAircraft= "INSERT INTO aircraft VALUES (1,' Boeing 747',467,20,'22','8000'),(2,' Boeing 767',600,40,'24','8000'),(3,' Boeing 747',467,20,'22','8000'),(4,' Boeing 767',600,40,'24','8000'),(5,' Boeing 747',467,20,'22','8000'),(6,' Boeing 767',600,40,'24','8000'),(7,' Boeing 747',467,20,'22','8000'),(8,' Boeing 767',600,40,'24','8000'),(9,' Boeing 747',467,20,'22','8000'),(10,' Boeing 767',600,40,'24','8000')";
    String insertAirPort= "INSERT INTO airports VALUES (1,'USA','Detroit','DTW'),(2,'Thailand','Bangkok','BKK'),(3,'USA','Atlanta','ATL'),(4,'USA','Boston','BOS'),(5,'USA','New York','JFK'),(6,'USA','Chicago','ORD'),(7,'USA','Newark','EWR'),(8,'USA','Dulles','IAD'),(9,'Japan','Tokyo','HND'),(10,'USA','Dallas','DFW'),(11,'USA','Honolulu','HNL'),(12,'USA','Philadelphia','PHL'),(13,'France','Paris','CDG'),(14,'Hong Kong','Chek Lap Kok','HGK'),(15,'USA','Washington, D.C.','DCA'),(16,'USA','Chicago','MDW'),(17,'USA','Los Angeles','LAX'),(18,'China','Beijing','PEK'),(19,'USA','Denver','DEN'),(20,'UAE','Dubai','DXB')";
    String insertBills ="INSERT INTO bills VALUES (1,100,'cash',1,1,0),(2,950,'debit',2,2,0),(3,130,'cash',3,3,0),(4,85,'debit',4,4,0),(5,1000,'cash',5,5,0),(6,590,'debit',6,6,0),(7,557,'cash',7,7,0),(8,601,'debit',8,8,0),(9,537,'cash',9,9,0),(10,437,'debit',10,10,0)";
    String insertCancel="INSERT INTO cancel VALUES (1,'Bad Weather'),(2,'technical issues'),(3,'Bad Weather'),(4,'technical issues'),(5,'Bad Weather'),(6,'technical issues'),(7,'Bad Weather'),(8,'technical issues'),(9,'Bad Weather'),(10,'technical issues')";
    String insertCause="INSERT INTO cause VALUES (1,1),(2,2),(3,3),(4,4),(5,5),(6,6),(7,7),(8,8),(9,9),(10,10)";
    String insertCustomers="INSERT INTO customers VALUES (1,'John','Salley','3200','Troy','Michigan','48084','2482002001','jsal@oakland.edu','y'),(2,'Mike','Hamilton','2500','Sterling Heights','Michigan','48310','5869991325','mhamilton@gmail.com','n'),(3,'George','Washington','1625','Sterling Heights','Michigan','48310','5863629920','gwash@yahoo.com','y'),(4,'Bob','Jefferson','283','Atlanta','Georgia','30305','9298976666','bjef@gmail.com','y'),(5,'Billy','Silly','6500','Boston','Massachusetts','01841','5555551616','billsill@gmail.com','y'),(6,'Richard','Jackson','3029','Los Angeles','California','90001','1203331020','rjack@gmail.com','n'),(7,'Vince','Wayne','3802','Houston','Texas','77001','9991328850','vwayne@gmail.com','y'),(8,'Robert','Marsack','5148','Chicago','Illinois','60290','1011923000','robertm@gmail.com','y'),(9,'Zeyad','Faeq','1980','New York City','New York','10004','7475809874','zfae@yahoo.com','y'),(10,'Dimas','Moosa','1800','Seattle','Washington','98101','4106801250','dimo@yahoo.com','y'),(11,'Robert','Marsack','13050','warren','mi','48088','5863608757','rjmarsack','y')";
    String insertDelay="INSERT INTO delay VALUES (1,'2 hours'),(2,'4 hours'),(3,'2 hours'),(4,'6 hours'),(5,'2 hours'),(6,'2 hours'),(7,'8 hours'),(8,'2 hours'),(9,'2 hours'),(10,'2 hours')";
    String insertEmployee="INSERT INTO employee VALUES (1,'Mike','Smith','626 Sugar St ','Biloxi','Ms','39532','5865550169','emp1@RegalAirs.com','crew member'),(2,'Kian ','Spencer','803 South Railroad St','Elkridge','MD ','21075','5865550109','emp2@RegalAirs.com','crew member'),(3,'Anthony ','Hill','68 S. Hill St','East Brunswick','NJ ','08816','5865550109','emp3@RegalAirs.com','crew member'),(4,'Christopher ','Robertson','486 North St Margarets Street ','Wilmington','MA ','01887','5865550183','emp4@RegalAirs.com','crew member'),(5,'Reece ','Palmer','515 John Circle ','New Bern','NC ','28560','5865550140','emp5@RegalAirs.com','crew member'),(6,'Zak ','Booth','987 Shady Ave. ','Blackwood','NJ ','08012','5865550135','emp6@RegalAirs.com','Manager'),(7,'Cannon ','Chan','657 Sunnyslope St. ','Woodside','NY ','11377','5865550140','emp7@RegalAirs.com','Manager'),(8,'Alonzo ','Burnett','93 Gonzales Drive ','Cranberry Twp','PA ','16066','5865550141','emp8@RegalAirs.com','Manager'),(9,'Tobias ','Ingram','62 Pulaski Lane ','Xenia','OH ','45385','5865550142','emp9@RegalAirs.com','Manager')";
    String insertFlightReservations="INSERT INTO flightreservations VALUES (1,10,1,1,'12/15/2017','12/16/2017','1','National',0),(2,1,2,2,'12/16/2017','12/17/2017','1','National',0),(3,2,3,3,'12/17/2017','12/18/2017','1','International',1),(4,3,4,4,'12/18/2017','12/19/2017','1','International',1),(5,4,5,5,'12/19/2017','12/20/2017','1','National',0),(6,5,6,6,'12/20/2017','12/21/2017','1','National',0),(7,6,7,7,'12/21/2017','12/22/2017','1','International',0),(8,7,8,8,'12/22/2017','12/23/2017','1','National',0),(9,8,9,9,'12/23/2017','12/24/2017','1','National',1),(10,9,10,1,'12/24/2017','12/25/2017','1','National',0)";
    String insertFly="INSERT INTO fly VALUES (1,1),(2,2),(3,3),(4,4),(5,5),(6,6),(7,7),(8,8),(9,9),(10,10)";
    String insertFollow="INSERT INTO follow VALUES (1,1),(2,2),(3,3),(4,4),(5,5),(6,6),(7,7),(8,8),(9,9),(10,10)";
    String insertIssue="INSERT INTO issue VALUES (1,1),(2,2),(3,3),(4,4),(5,5),(6,6),(7,7),(8,8),(9,9),(10,10)";
    String insertPays="INSERT INTO pays VALUES (1,1),(2,2),(3,3),(4,4),(5,5),(6,6),(7,7),(8,8),(9,9),(10,10);";
    String insertRequest="INSERT INTO request VALUES (1,1),(2,2),(3,3),(4,4),(5,1),(6,2),(7,3),(8,4),(9,1)";
    String insertRoutes="INSERT INTO routes VALUES (1,1,4,531,100),(2,1,5,8512,950),(3,4,5,217,130),(4,6,10,775,85),(5,1,9,3001,1000),(6,10,12,6951,590),(7,4,18,6850,557),(8,5,12,5805,601),(9,19,2,7776,537),(10,12,13,7426,437)";
    String insertServices="INSERT INTO services VALUES (1,'WiFi',10),(2,'battery charger',5),(3,'seat warmer',10),(4,'Movies',10)";
    String insertTake="INSERT INTO take VALUES (1,1),(2,2),(3,3),(4,4),(5,5),(6,6),(7,7),(8,8),(9,9),(10,10)";
    String insertUse="INSERT INTO uses VALUES (1,1),(2,2),(3,3),(4,4),(5,5),(6,6),(7,7),(8,8),(9,9),(10,10)";
    String insertWorks="INSERT INTO works VALUES (1,1),(2,2),(3,3),(4,4),(5,5),(6,6),(7,7),(8,8),(9,9),(9,9)";
    String insertArray[]={insertCustomers,insertAircraft,insertAirPort,insertRoutes,insertEmployee,insertFlightReservations,insertBills,insertDelay,insertCancel,insertCause
    ,insertFly,insertFollow,insertIssue,insertPays,insertServices,insertRequest,insertTake,insertUse,insertWorks};
    try {
            con = new Connect().getConnection();
            statement = con.createStatement();
            // query the database for all customer information
            for(int count=0;count<insertArray.length;count++)
            statement.executeUpdate(insertArray[count]);
        } catch (Exception ex) {
            Logger.getLogger(DeleteCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    }
