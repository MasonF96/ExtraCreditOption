

/**
 *
 * @author mason
 */
public class Weapon {

    private String name;
    private String type;
    private int attack;
    private int cost;
  
    /**
     *
     * @return
     */
   public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }

   public String getType() {
       return type;
   }

   public void setType(String type) {
       this.type = type;
   }

   public int getAttack() {
       return attack;
   }

   public void setAttack(int attack) {
       this.attack = attack;
   }

   public int getCost() {
       return cost;
   }

   public void setCost(int cost) {
       this.cost = cost;
   }
  
   //Default COnstructor

   public Weapon() {
      
       name = "";
       type = "";
       attack = 0;
       cost = 0;
   }
  
   //Argument constructor
   public Weapon(String name, String type, int attack, int cost) {
       this.name = name;
       this.type = type;
       this.attack = attack;
       this.cost = cost;
   }
  
   //Sharpen your weapon and increase its attack to double
  
   public void doubleWeaponAttack()
   {
       attack = attack*2;
   }
  
}
