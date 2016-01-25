public class Dragonite extends Pokemon{
    public Dragonite(){
	_name = "Dragonite";
	Type1 = "Dragon";
	Type2 = "Flying";
	_exp = 0;
	_lvl = 50;
	_atkb = 134;
	_defb = 95;
	_spdb = 80;
	_spb = 100;
	_hitPtsb = 91;
	HealPP();
    }

    public int Wrap(Pokemon a){
	int main = damageCalc(a,15);
	double mod = Effective(a, "Normal");
	return (int)(main * mod);
    }
   
    public int Slam(Pokemon a){
	int main = damageCalc(a,80);
	double mod = Effective(a, "Normal");
	return (int)(main * mod);
    }

    public int Dragon_Rage(){
	return 40;
    }

    public int Hyper_Beam(Pokemon a){
	int main = damageCalc(a,150);
	double mod = Effective(a, "Normal");
	return (int)(main * mod);
    }

    public int ReadMove(int x,Pokemon a){
	if ( x == 1){
	    setPP1(getPP1()-1);
	    return Wrap(a);
	}
	else if ( x == 2){
	    setPP2(getPP2()-1);
	    return Slam(a);
	}
	else if (x == 3){
	    setPP3(getPP3()-1);
	    return Dragon_Rage();
	}
	else if (x == 4){
	    setPP4(getPP4()-1);
	    return Hyper_Beam(a);
	}
	else
	    return 0;
    }

    public String PrintMoves(){
	return ("1:Wrap \t" + getPP1() + "\n" +
		"2:Slam \t" +getPP2() + "\n" +
		"3:Dragon Rage \t" + getPP3() + "\n" +
		"4:Hyper Beam \t" + getPP4() + "\n");
    }

    public void HealPP(){
	setPP1(20);
	setPP2(20);
	setPP3(10);
	setPP4(5);
    }
  
}
