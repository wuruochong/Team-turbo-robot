public class Gyarados extends Pokemon{
    public Gyarados(){
	_name = "Gyarados";
	Type1 = "Water";
	Type2 = "Flying";
	_exp = 0;
	_lvl = 50;
	_atkb = 125;
	_defb = 79;
	_spdb = 81;
	_spb = 100;
	_hitPtsb = 95;
	HealPP();
    }

    public int Bite(Pokemon a){
	int main =  damageCalc(a,60);
	double mod = Effective(a, "Normal");
	return (int)(main * mod);
    }

    public int Dragon_Rage(){
	return 40;
    }

    public int Hydro_Pump(Pokemon a){
	int main = damageCalcsp(a,120);
	double mod = 1.5 * Effective(a, "Water");
	return (int)(main * mod);
    }
    
    public int Hyper_Beam(Pokemon a){
	int main = damageCalc(a,150);
	double mod = Effective(a, "Normal");
	return (int)(main * mod);
    }

    public int ReadMove(int x,Pokemon a){
	if ( x == 1){
	    setPP1(getPP1()-1);
	    return Bite(a);
	}
	else if ( x == 2){
	    setPP2(getPP2()-1);
	    return Dragon_Rage();
	}
	else if (x == 3){
	    setPP3(getPP3()-1);
	    return Hydro_Pump(a);
	}
	else if (x == 4){
	    setPP4(getPP4()-1);
	    return Hyper_Beam(a);
	}
	else
	    return 0;
    }

    public String PrintMoves(){
	return ("1:Bite \t" + getPP1() + "\n" +
		"2:Dragon Rage \t" +getPP2() + "\n" +
		"3:Hydro Pump \t" + getPP3() + "\n" +
		"4:Hyper Beam \t" + getPP4() + "\n");
    }

    public void HealPP(){
	setPP1(25);
	setPP2(10);
	setPP3(5);
	setPP4(5);
    }
  
}
