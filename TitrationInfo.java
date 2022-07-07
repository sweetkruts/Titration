
public class TitrationInfo {
	private double acidConcentration;
	private double baseConcentration;
	private int labelAcid;
	private int labelBase;
	
	public TitrationInfo(double acidConcentration, double baseConcentration, int labelAcid, int labelBase){
		this.acidConcentration=acidConcentration;
		this.baseConcentration=baseConcentration;
		this.labelAcid=labelAcid;
		this.labelBase=labelBase;
	}
	
	
	public double acidConc(){
		return acidConcentration;
	}
	public double baseConc() {
		return baseConcentration;
	}
	
	public int getLabelA(){
		return labelAcid;
	}
	
	public int getLabelB(){
		return labelBase;
	}
	
	
}
