public class Zapdos extends Pokemon{
    public Zapdos(){
	_name = "Zapdos";
	Type1 = "Flying";
	Type2 = "Electric";
	_exp = 0;
	_lvl = 50;
	_atkb = 90;
	_defb = 85;
	_spdb = 100;
	_spb = 125;
	_hitPtsb = 90;
	HealPP();
    }

    public int Thunderbolt(Pokemon a){
	int main =  damageCalcsp(a,95);
	double mod = 1.5 * Effective(a, "Electric");
	return (int)(main * mod);
    }

    public int Drill_Peck(Pokemon a){
	int main = damageCalc(a,80);
	double mod = 1.5 * Effective(a, "Flying");
	return (int)(main * mod);
   }

    public int Thunder(Pokemon a){
	int main = damageCalcsp(a,120);
	double mod = 1.5 * Effective(a, "Electric");
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
	    return Thunderbolt(a);
	}
	else if ( x == 2){
	    setPP2(getPP2()-1);
	    return Drill_Peck(a);
	}
	else if (x == 3){
	    setPP3(getPP3()-1);
	    return Thunder(a);
	}
	else if (x == 4){
	    setPP4(getPP4()-1);
	    return Sky_Attack(a);
	}
	else
	    return 0;
    }

    public String PrintMoves(){
	return ("1:Thunderbolt \t" + getPP1() + "\n" +
		"2:Drill Peck \t" +getPP2() + "\n" +
		"3:Thunder \t" + getPP3() + "\n" +
		"4:Sky Attack \t" + getPP4() + "\n");
    }

    public void HealPP(){
	setPP1(15);
	setPP2(20);
	setPP3(10);
	setPP4(5);
    }
  
}
