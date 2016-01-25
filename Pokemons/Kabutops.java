public class Kabutops extends Pokemon{
    public Kabutops(){
	_name = "Kabutops";
	Type1 = "Water";
	Type2 = "Rock";
	_exp = 0;
	_lvl = 50;
	_atkb = 115;
	_defb = 105;
	_spdb = 80;
	_spb = 70;
	_hitPtsb = 60;
	HealPP();
    }

    public int Double_Edge(Pokemon a){
	int main = damageCalc(a,100);
	double mod = Effective(a, "Normal");
	return (int)(main * mod);
    }

    public int Slash(Pokemon a){
	int main = damageCalc(a,70);
	double mod = Effective(a, "Normal");
	return (int)(main * mod);
   }

    public int Hydro_Pump(Pokemon a){
	int main = damageCalcsp(a,120);
	double mod = 1.5 * Effective(a, "Water");
	return (int)(main * mod);
    }
    
    public int Blizzard(Pokemon a){
	int main = damageCalcsp(a,120);
	double mod = Effective(a, "Ice");
	return (int)(main * mod);
    }

    public int ReadMove(int x,Pokemon a){
	if ( x == 1){
	    setPP1(getPP1()-1);
	    return Double_Edge(a);
	}
	else if ( x == 2){
	    setPP2(getPP2()-1);
	    return Slash(a);
	}
	else if (x == 3){
	    setPP3(getPP3()-1);
	    return Hydro_Pump(a);
	}
	else if (x == 4){
	    setPP4(getPP4()-1);
	    return Blizzard(a);
	}
	else
	    return 0;
    }

    public String PrintMoves(){
	return ("1:Double Edge \t" + getPP1() + "\n" +
		"2:Slash \t" +getPP2() + "\n" +
		"3:Hydro Pump \t" + getPP3() + "\n" +
		"4:Blizzard \t" + getPP4() + "\n");
    }

    public void HealPP(){
	setPP1(15);
	setPP2(20);
	setPP3(5);
	setPP4(5);
    }
  
}
