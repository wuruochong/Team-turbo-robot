public class Golbat extends Pokemon{
    public Golbat(){
	_name = "Golbat";
	Type1 = "Flying";
	Type2 = "Poison";
	_exp = 0;
	_lvl = 50;
	_atkb = 80;
	_defb = 70;
	_spdb = 90;
	_spb = 75;
	_hitPtsb = 75;
	HealPP();
    }

    public int Wing_Attack(Pokemon a){
	int main =  damageCalc(a,35);
	double mod = 1.5 * Effective(a, "Flying");
	return (int)(main * mod);
    }

    public int Bite(Pokemon a){
	int main = damageCalc(a,60);
	double mod = Effective(a, "Normal");
	return (int)(main * mod);
    }

    public int Razor_Wind(Pokemon a){
	int main = damageCalcsp(a,80);
	double mod = Effective(a, "Normal");
	return (int)(main * mod);
    }
    
    public int Double_Edge(Pokemon a){
	int main = damageCalc(a,100);
	double mod = Effective(a, "Normal");
	return (int)(main * mod);
    }

    public int ReadMove(int x,Pokemon a){
	if ( x == 1){
	    setPP1(getPP1()-1);
	    return Wing_Attack(a);
	}
	else if ( x == 2){
	    setPP2(getPP2()-1);
	    return Bite(a);
	}
	else if (x == 3){
	    setPP3(getPP3()-1);
	    return Razor_Wind(a);
	}
	else if (x == 4){
	    setPP4(getPP4()-1);
	    return Double_Edge(a);
	}
	else
	    return 0;
    }

    public String PrintMoves(){
	return ("1:Wing Attack \t" + getPP1() + "\n" +
		"2:Bite \t" +getPP2() + "\n" +
		"3:Razor Wind \t" + getPP3() + "\n" +
		"4:Double Edge \t" + getPP4() + "\n");
    }

    public void HealPP(){
	setPP1(35);
	setPP2(25);
	setPP3(10);
	setPP4(15);
    }
  
}
