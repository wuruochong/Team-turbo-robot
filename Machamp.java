public class Machamp extends Pokemon{
    public Machamp(){
	_name = "Machamp";
	Type1 = "Fighting";
	Type2 = "none";
	_exp = 0;
	_lvl = 50;
	_atkb = 130;
	_defb = 80;
	_spdb = 55;
	_spb = 65;
	_hitPtsb = 90;
	HealPP();
    }

    public int Karate_Chop(Pokemon a){
	int main =  damageCalc(a,50);
	double mod = Effective(a, "Normal");
	return (int)(main * mod);
    }

    public int Low_Kick(Pokemon a){
	int main = damageCalc(a,50);
	double mod = 1.5 * Effective(a, "Fighting");
	return (int)(main * mod);
    }

    public int Seismic_Toss(){
	return 50;
    }
    
    public int Submission(Pokemon a){
	int main = damageCalc(a,80);
	double mod = 1.5 * Effective(a, "Fighting");
	return (int)(main * mod);
    }

    public int ReadMove(int x,Pokemon a){
	if ( x == 1){
	    setPP1(getPP1()-1);
	    return Karate_Chop(a);
	}
	else if ( x == 2){
	    setPP2(getPP2()-1);
	    return Low_Kick(a);
	}
	else if (x == 3){
	    setPP3(getPP3()-1);
	    return Seismic_Toss();
	}
	else if (x == 4){
	    setPP4(getPP4()-1);
	    return Submission(a);
	}
	else
	    return 0;
    }

    public String PrintMoves(){
	return ("1:Karate Chop \t" + getPP1() + "\n" +
		"2:Low Kick \t" +getPP2() + "\n" +
		"3:Seismic Toss \t" + getPP3() + "\n" +
		"4:Submission \t" + getPP4() + "\n");
    }

    public void HealPP(){
	setPP1(25);
	setPP2(20);
	setPP3(20);
	setPP4(25);
    }
  
}
