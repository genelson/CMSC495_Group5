
import java.util.Date;

/*
 * Rental
 * Represents a single rental transaction within the system.
 */

/*
REVISION TABLE:

--------------------------------------------------------------------------------
DATE                NAME                    CHANGE DESCRIPTION
--------------------------------------------------------------------------------
2/16/15             Georgia Nelson          File created.
2/23/15             Georgia Nelson          Fleshing out with details.
*/

public class Rental 
{
    public int m_id = 0;
    public int m_customerId = 0;
    public int m_movieId = 0;
    public int m_lateFeesPaid = 0;
    public Date m_dateOut = null;    
    
    public Rental(int id, int customerId, int movieId, int lateFeesPaid, Date dateOut)
    {
        m_id = id;
        m_customerId = customerId;
        m_movieId = movieId;
        m_lateFeesPaid = lateFeesPaid;
        m_dateOut = dateOut;
    }
}
