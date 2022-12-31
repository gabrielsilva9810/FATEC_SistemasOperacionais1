package json;

public class DadosBrutos {
	
	public String name;
    public String unit;
    public Double value;
    public String type;
     
    //-------------------------NAME------------------------------//
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //--------------------------------------------------------//
    //----------------------------UNIT---------------------------//
    
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
    //--------------------------------------------------------//
    //----------------------------VALUE---------------------------//

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
    //--------------------------------------------------------//
    //----------------------------TYPE---------------------------//
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    //--------------------------------------------------------//
	@Override
	public String toString() {
		return "dadosBrutos"
				+ "[name=" + name 
				+ ", unit=" + unit 
				+ ", value=" + value 
				+ ", type=" + type 
				+ "]";
	}
    
}
