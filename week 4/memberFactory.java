
package sec_5;

public class memberFactory 
{
    public staff getmember( String m_type )
    {
         m_type.toUpperCase();
        if ( m_type == "TEACHINGASS" )
        {
           return new TeachingAss();
        }
        else if ( m_type == "DOCTOR")
        {
           return new  DOCTOR();
        }
        else
            return null;
    }
    
}
