public class Articuno extends Pokemon{
    public Articuno(){
	_name = "Articuno";
	Type1 = "Flying";
	Type2 = "Ice";
	_exp = 0;
	_lvl = 50;
	_atkb = 85;
	_defb = 100;
	_spdb = 85;
	_spb = 125;
	_hitPtsb = 90;
	HealPP();
    }

    public int Peck(Pokemon a){
	int main = damageCalc(a,35);
	double mod = 1.5 * Effective(a, "Flying");
	return (int)(main * mod);
    }

    public int Ice_Beam(Pokemon a){
	int main = damageCalcsp(a,95);
	double mod = 1.5 * Effective(a, "Ice");
	return (int)(main * mod);
    }

    public int Blizzard(Pokemon a){
	int main = damageCalcsp(a,120);
	double mod = 1.5 * Effective(a, "Ice");
	return (int)(main * mod);
    }

    public int Sky_Attack(Pokemon a){
	int main = damageCalc(a,140);
	double mod = 1.5 * Effective(a, "Flying");
	return (int)(main * mod);
    }

    public int ReadMove(int x,Pokemon a){
	if ( x == 1){
	    setPP1(getPP1()-1);
	    return Peck(a);
	}
	else if ( x == 2){
	    setPP2(getPP2()-1);
	    return Ice_Beam(a);
	}
	else if (x == 3){
	    setPP3(getPP3()-1);
	    return Blizzard(a);
	}
	else if (x == 4){
	    setPP4(getPP4()-1);
	    return Sky_Attack(a);
	}
	else
	    return 0;
    }

    public String PrintMoves(){
	return ("1:Peck \t" + getPP1() + "\n" +
		"2:Ice Beam \t" +getPP2() + "\n" +
		"3:Blizzard \t" + getPP3() + "\n" +
		"4:Sky Attack \t" + getPP4() + "\n");
    }

    public void HealPP(){
	setPP1(35);
	setPP2(10);
	setPP3(5);
	setPP4(5);
    }
  
}
