package tacos;

/*import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor*/
public class Ingredient {
	
	private final String id;
	private final String name;
	private final Type type;
	
	public static enum Type {
		WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
	}
	
	public Ingredient(String id, String name, Type type) {
		this.id = id;
		this.name = name;
		this.type = type;
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public Type getType() {
		return type;
	}
		
	@Override
	public boolean equals(Object o) {
		if(o == this) {
			return true;
		}
		
		if(o == null) {
			return false;
		}
		
		if(!(o instanceof Ingredient)) {
			return false;
		}
		
		Ingredient tmp = (Ingredient)o;
		
		return name.equals(tmp.name) && id.equals(tmp.id) && type.equals(tmp.type);
	}
	
	@Override
	public int hashCode() {
		return id.hashCode();
	}

}
