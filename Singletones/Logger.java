
public class Logger {
	private int lastSerial;
	int sensorId;
	int value; 
	private static Logger sg;

	private Logger(){
		this.lastSerial = 100; 
	}

	public static Logger getGenerator(){
		if (sg==null){
			sg = new Logger();
			return sg;
		}else{
			return sg;
		}
	}

	public int NextSerial(){
		this.lastSerial++;
		return this.lastSerial;
	}

	public void setValue(int sensorId, int value){
		this.sensorId = sensorId;
		this.value = value;

		
		System.out.println(this.lastSerial + " " + sensorId + " " + value);
	}

	public static void main(String[]args){
		Logger s1 = Logger.getGenerator();
		s1.setValue(001, 300);
		s1.NextSerial();
		
		Logger s2 = Logger.getGenerator();
		s1.setValue(002, 400);
		s1.NextSerial();
		
		Logger s3 = Logger.getGenerator();
		s1.setValue(003, 500);
		s1.NextSerial();
	}
}
