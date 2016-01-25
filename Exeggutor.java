public class Exeggutor extends Pokemon{
    public Exeggutor(){
	_name = "Exeguttor";
	Type1 = "Grass";
	Type2 = "Psychic";
	_exp = 0;
	_lvl = 50;
	_atkb = 95;
	_defb = 85;
	_spdb = 55;
	_spb = 125;
	_hitPtsb = 95;
	HealPP();
    }

    public int Barrage(Pokemon a){
	int main = (int)(Math.random()*5+1) * damageCalc(a,15);
	double mod = Effective(a, "Normal");
	return (int)(main * mod);
    }
    public int Stomp(Pokemon a){
	int main = damageCalc(a,65);
	double mod = Effective(a, "Normal");
	return (int)(main * mod);
    }

    public int Psychic(Pokemon a){
	int main = damageCalcsp(a,90);
	double mod = 1.5 * Effective(a, "Psychic");
	return (int)(main * mod);
    }

    public int SolarBeam(Pokemon a){
	int main = damageCalcsp(a,120);
	double mod = 1.5 * Effective(a, "Grass");
	return (int)(main * mod);
    }

    public int ReadMove(int x,Pokemon a){
	if ( x == 1){
	    setPP1(getPP1()-1);
	    return Barrage(a);
	}
	else if ( x == 2){
	    setPP2(getPP2()-1);
	    return Stomp(a);
	}
	else if (x == 3){
	    setPP3(getPP3()-1);
	    return Psychic(a);
	}
	else if (x == 4){
	    setPP4(getPP4()-1);
	    return Solarbeam(a);
	}
	else
	    return 0;
    }

    public String PrintMoves(){
	return ("1:Barrage \t" + getPP1() + "\n" +
		"2:Stomp \t" +getPP2() + "\n" +
		"3:Psychic \t" + getPP3() + "\n" +
		"4:Solarbeam \t" + getPP4() + "\n");
    }

    public void HealPP(){
	setPP1(20);
	setPP2(20);
	setPP3(10);
	setPP4(10);
    }
  
}
