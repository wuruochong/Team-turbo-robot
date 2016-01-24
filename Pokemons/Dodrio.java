public class Dodrio extends Pokemon{
    public Dodrio(){
	_name = "Dodrio";
	Type1 = "Normal";
	Type2 = "Flying";
	_exp = 0;
	_lvl = 50;
	_atkb = 110;
	_defb = 70;
	_spdb = 100;
	_spb = 60;
	_hitPtsb = 60;
	HealPP();
    }

    public int Peck(Pokemon a){
	int main = damageCalc(a,35);
	int mod = 1.5 * Effective(a, "Flying");
	return int(main * mod);
    }
   
    public int Drill_Peck(Pokemon a){
	int main = damageCalc(a,80);
	int mod = 1.5 * Effective(a, "Flying");
	return int(main * mod);
    }

    public int Fury_Attack(Pokemon a){
	int main = (int)(Math.random()*5+1) * damageCalc(a,15);
	int mod = 1.5 * Effective(a, "Normal");
	return int(main * mod);
    }

    public int Tri_Attack(Pokemon a){
	int main = damageCalc(a,80);
	int mod = 1.5 * Effective(a, "Normal");
	return int(main * mod);
    }

    public int ReadMove(int x,Pokemon a){
	if ( x == 1){
	    setPP1(getPP1()-1);
	    return Peck(a);
	}
	else if ( x == 2){
	    setPP2(getPP2()-1);
	    return Drill_Peck(a);
	}
	else if (x == 3){
	    setPP3(getPP3()-1);
	    return Fury_Attack(a);
	}
	else if (x == 4){
	    setPP4(getPP4()-1);
	    return Tri_Attack(a);
	}
	else
	    return 0;
    }

    public String PrintMoves(){
	return ("1:Peck \t" + getPP1() + "\n" +
		"2:Drill Peck \t" +getPP2() + "\n" +
		"3:Fury Attack \t" + getPP3() + "\n" +
		"4:Tri Attack \t" + getPP4() + "\n");
    }

    public void HealPP(){
	setPP1(35);
	setPP2(20);
	setPP3(20);
	setPP4(10);
    }
  
}
