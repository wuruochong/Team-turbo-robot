public class Butterfree extends Pokemon{
    public Butterfree(){
	_name = "Butterfree";
	Type1 = "Bug";
	Type2 = "Flying";
	_exp = 0;
	_lvl = 50;
	_atkb = 45;
	_defb = 50;
	_spdb = 70;
	_spb = 80;
	_hitPtsb = 60;
	HealPP();
    }

    public int Confusion(Pokemon a){
	int main = damageCalcsp(a,50);
	double mod =  Effective(a, "Psychic");
	return (int)(main * mod);
    }

    public int Gust(Pokemon a){
	int main = damageCalc(a,40);
	double mod = Effective(a, "Normal");
	return (int)(main * mod);
    }

    public int Psybeam(Pokemon a){
	int main = damageCalc(a,65);
	double mod = Effective(a, "Psychic");
	return (int)(main * mod);
    }

    public int SolarBeam(Pokemon a){
	int main = damageCalcsp(a,120);
	double mod = Effective(a, "Grass");
	return (int)(main * mod);
    }

    public int ReadMove(int x,Pokemon a){
	if ( x == 1){
	    setPP1(getPP1()-1);
	    return Confusion(a);
	}
	else if ( x == 2){
	    setPP2(getPP2()-1);
	    return Gust(a);
	}
	else if (x == 3){
	    setPP3(getPP3()-1);
	    return Psybeam(a);
	}
	else if (x == 4){
	    setPP4(getPP4()-1);
	    return SolarBeam(a);
	}
	else
	    return 0;
    }

    public String PrintMoves(){
	return ("1:Confusion \t" + getPP1() + "\n" +
		"2:Gust \t" +getPP2() + "\n" +
		"3:Psybeam \t" + getPP3() + "\n" +
		"4:SolarBeam \t" + getPP4() + "\n");
    }

    public void HealPP(){
	setPP1(25);
	setPP2(35);
	setPP3(20);
	setPP4(10);
    }
  
}
