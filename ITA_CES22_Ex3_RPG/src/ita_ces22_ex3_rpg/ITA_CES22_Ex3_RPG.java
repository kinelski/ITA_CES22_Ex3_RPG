package ita_ces22_ex3_rpg;

abstract class Monster{
    protected int ATK;
    protected int HP;
    
    public Monster (int ATK, int HP){
        this.ATK = ATK;
        this.HP = HP;
    }
    
    //Retorna o dano causado pelo monstro
    public int attack (){
        return ATK;
    }

    //Dá dano ao monstro. Retorna true se ele morreu.
    public boolean damage(int DMG){
        HP -= DMG;
        return (HP <= 0);
    }
    
    //Retorna o dano causado pelo especial e aplica seus efeitos
    public abstract int special();
}

class Pirate extends Monster{
    public Pirate (int ATK, int HP){
        super(ATK, HP);
    }
    
    public int special(){
        System.out.println ("O pirata dobrou seu ataque!");
        return 2*ATK;
    }
}

class Nessie extends Monster{
    public Nessie (int ATK, int HP){
        super(ATK, HP);
    }
    
    public int special(){
        System.out.println ("Nessie dobrou sua quantidade de HP!");
        HP *= 2;
        return 0;
    }
}

public class ITA_CES22_Ex3_RPG {

    public static void main(String[] args) {
        
        Monster pirate = new Pirate (20, 150);
        Monster nessie = new Nessie (15, 200);
        
        pirate.special();
        nessie.special();
        
    }
    
}
