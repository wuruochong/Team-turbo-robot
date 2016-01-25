public class Blastoise extends Pokemon{
    public Blastoise(){
	_name = "Blastoise";
	Type1 = "Water";
	Type2 = "none";
	_exp = 0;
	_lvl = 50;
	_atkb = 83;
	_defb = 100;
	_spdb = 78;
	_spb = 85;
	_hitPtsb = 79;
	HealPP();
    }

    public int Water_Gun(Pokemon a){
	int main = damageCalcsp(a,40);
	double mod = 1.5 * Effective(a, "Water");
	return (int)(main * mod);
    }

    public int Bite(Pokemon a){
	int main = damageCalc(a,60);
	double mod = Effective(a, "Normal");
	return (int)(main * mod);
    }

    public int Skull_Bash(Pokemon a){
	int main = damageCalc(a,100);
	double mod = Effective(a, "Normal");
	return (int)(main * mod);
    }

    public int Hydro_Pump(Pokemon a){
	int main = damageCalcsp(a,120);
	double mod = 1.5 * Effective(a, "Water");
	return (int)(main * mod);
    }

    public int ReadMove(int x,Pokemon a){
	if ( x == 1){
	    setPP1(getPP1()-1);
	    return Water_Gun(a);
	}
	else if ( x == 2){
	    setPP2(getPP2()-1);
	    return Bite(a);
	}
	else if (x == 3){
	    setPP3(getPP3()-1);
	    return Skull_Bash(a);
	}
	else if (x == 4){
	    setPP4(getPP4()-1);
	    return Hydro_Pump(a);
	}
	else
	    return 0;
    }

    public String PrintMoves(){
	return ("1:Water Gun \t" + getPP1() + "\n" +
		"2:Bite \t" +getPP2() + "\n" +
		"3:Skull Bash \t" + getPP3() + "\n" +
		"4:Hydro Pump \t" + getPP4() + "\n");
    }

    public void HealPP(){
	setPP1(25);
	setPP2(25);
	setPP3(15);
	setPP4(5);
    }
  
}
