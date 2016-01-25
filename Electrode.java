public class Electrode extends Pokemon{
    public Electrode(){
	_name = "Electrode";
	Type1 = "Electric";
	Type2 = "none";
	_exp = 0;
	_lvl = 50;
	_atkb = 50;
	_defb = 70;
	_spdb = 140;
	_spb = 80;
	_hitPtsb = 60;
	HealPP();
    }

    public int Tackle(Pokemon a){
	int main = damageCalc(a,35);
	double mod =  Effective(a, "Normal");
	return (int)(main*mod);
    }
   
    public int Selfdestruct(Pokemon a){
	int main = damageCalcsp(a,130);
	double mod = Effective(a, "Normal");
	setHP(0);
	return (int)(main * mod);
    }

    public int Swift(Pokemon a){
	int main = damageCalcsp(a,60);
	double mod = Effective(a, "Normal");
	return (int)(main * mod);
    }

    public int Explosion(Pokemon a){
	int main = damageCalcsp(a,170);
	double mod = Effective(a, "Normal");
	setHP(0);
	return (int)(main * mod);
    }

    public int ReadMove(int x,Pokemon a){
	if ( x == 1){
	    setPP1(getPP1()-1);
	    return Tackle(a);
	}
	else if ( x == 2){
	    setPP2(getPP2()-1);
	    return Selfdestruct(a);
	}
	else if (x == 3){
	    setPP3(getPP3()-1);
	    return Swift(a);
	}
	else if (x == 4){
	    setPP4(getPP4()-1);
	    return Explosion(a);
	}
	else
	    return 0;
    }

    public String PrintMoves(){
	return ("1:Tackle \t" + getPP1() + "\n" +
		"2:Selfdestruct \t" +getPP2() + "\n" +
		"3:Swift \t" + getPP3() + "\n" +
		"4:Explosion \t" + getPP4() + "\n");
    }

    public void HealPP(){
	setPP1(35);
	setPP2(5);
	setPP3(20);
	setPP4(5);
    }
  
}
