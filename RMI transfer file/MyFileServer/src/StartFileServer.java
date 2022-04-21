import java.rmi.Naming;
 
public class StartFileServer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			
			java.rmi.registry.LocateRegistry.createRegistry(1111);
			
			FileServer fs=new FileServer();
			fs.setFile("Subscribe.mp4");	
                        
			Naming.rebind("rmi://10.194.119.102/abc", fs);
			System.out.println("File Server is Ready");
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}	
}