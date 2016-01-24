public class Trainer {
    protected Pokemon[] pokemonHolder;
    protected String _name;

    public Trainer(){
	_name = "Trainer";
	pokemonHolder = new Pokemon[6];
    }

    public Trainer(String name){
	_name = name;
	pokemonHolder = new Pokemon[6];
    }

    public String getName(){
	return _name;
    }

    public void setPokemon(int index, Pokemon p){
	pokemonHolder[index] = p;
    }

    public String toString(){
	String res = _name +"\n";
        for (int count = 0 ; count < pokemonHolder.length ; count++){
	    res += "Slot " + count + ": ";
	    if (pokemonHolder[count] == null){
		res += "Empty \n";
	    }
	    else {
		res += (pokemonHolder[count]).toString();
	    }
	}
	return res;
    }

    public Pokemon getPokemon(int x){
	return pokemonHolder[x-1];
    }
}