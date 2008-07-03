/**
 * @author Coleman And Jon
 *
 */
import java.net.Socket;

public class PortU	{

	public static void main ( String[] args )	{
		if ( args.length < 2 )	{
			System.out.println ( "usage: PortU <address> <port>" );
			System.exit ( 1 );
		}
		while ( true )	{
			try	{
				Socket mysocket = new Socket ( args[0], (new java.lang.Integer ( args[1] )).intValue() );
			}
			catch ( Exception exception )	{
				continue;
			}
			System.out.println ( "Finished server " + args[0] + " on port " + args[1] );
			break;
		}
	}
}
